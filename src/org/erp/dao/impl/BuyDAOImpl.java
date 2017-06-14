package org.erp.dao.impl;



import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.erp.dao.BuyDAO;
import org.erp.pojo.Buy;
import org.erp.pojo.BuyDetail;
import org.erp.pojo.Userinfo;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

public class BuyDAOImpl implements BuyDAO {
	SessionFactory sessionFactoy;   
    public SessionFactory getSessionFactoy() {  
        return sessionFactoy;  
    }  
  
    public void setSessionFactoy(SessionFactory sessionFactoy) {  
        this.sessionFactoy = sessionFactoy;  
    } 
    
	/* (non-Javadoc)
	 * @see org.erp.dao.BuyDAO#doIns(org.erp.pojo.Buy)
	 * 
	 */
	@Override
	public boolean doIns(Buy pojo) {
		boolean bool = false;  
        try {  
            this.sessionFactoy.getCurrentSession().save(pojo);  
            bool = true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
  
        return bool; 
	}

	/* (non-Javadoc)
	 * @see org.erp.dao.BuyDAO#doDel(Integer)
	 * 删除操作，没有进行真正的删除，而是时is_delete字段为0，和更新操作相似
	 */
	@Override
	public boolean doDel(Integer bId) {  
        boolean bool = false;  
        try {  
            Buy buy = (Buy) this.sessionFactoy.getCurrentSession()  
                    .get(Buy.class,bId);
            buy.setIsDelete(0);  
            bool = true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
  
        return bool;  
    }  

	/* (non-Javadoc)
	 * @see org.erp.dao.BuyDAO#doUpd(org.erp.pojo.Buy)
	 * 更新操作，在执行此方法前先执行findBybuyId()方法查询出要更新的字段
	 */
	@Override
	public boolean doUpd(Buy pojo) {
		boolean bool = false;  
		try {  
            Buy buy = (Buy) this.sessionFactoy.getCurrentSession()  
                    .get(Buy.class, pojo.getBuyId()); 
            buy.setUserinfo(pojo.getUserinfo());
            buy.setBuyDate(pojo.getBuyDate());
            bool = true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return bool;  
	}

	/* (non-Javadoc)
	 * @see org.erp.dao.BuyDAO#findByUsername(java.lang.String)
	 * 根据采购员名称查询
	 */
	@Override
	public Buy findByUsername(String username) {
		// TODO Auto-generated method stub
		Buy buy = null;
		try {  
            buy = (Buy) this.sessionFactoy.getCurrentSession().get(  
                    Buy.class, username);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return buy;
	}

	/* (non-Javadoc)
	 * @see org.erp.dao.BuyDAO#findById(Integer, int, int)
	 * 根据采购单编号查询，输入内容为空时查询所有采购单列表显示
	 * 有输入编号时按编号查询，也进行了分页
	 */
	@Override
	public List<Buy> findById(Integer bId,String username, int currentPage, int pageSize) {
		List<Buy> list = null;
		String hql = null;
		if(bId==null||bId==0){
			hql = "from Buy b where isDelete=1 and b.userinfo.userName like '%" + username + "%'";
		}
		else{
			hql = "from Buy b where b.buyId='"+bId+"' and isDelete=1 and b.userinfo.userName like '%" + username + "%'";  
		}
			try {  
				Query query = this.sessionFactoy.getCurrentSession().createQuery(  
						hql);  
				query.setFirstResult((currentPage - 1) * pageSize);  
				query.setMaxResults(pageSize);  
				list = query.list();  
			} catch (Exception e) {  
				e.printStackTrace();  
			} 
        return list;  
	}

	/* (non-Javadoc)
	 * @see org.erp.dao.BuyDAO#findCountById(Integer)
	 * 按编号查询采购单数量，这里做分页使用
	 */
	@Override
	public int findCountById(Integer bId,String username) {
		int count = 0;  
		String hql = null;
		if(bId == null || bId == 0){
			hql = "select count(buyId) from Buy b where isDelete=1 and b.userinfo.userName like '%" + username + "%'";
		}else{
			hql = "select count(buyId) from Buy b where buyId='"+bId+"' and isDelete=1 and b.userinfo.userName like '%" + username + "%'";
		}
        try {  
            Query query = this.sessionFactoy.getCurrentSession().createQuery(  
                    hql);  
            count = Integer.parseInt(query.list().get(0).toString());  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return count; 
	}

	/* (non-Javadoc)
	 * @see org.erp.dao.BuyDAO#findByBuyId(java.lang.Integer)
	 * 根据采购单编号查询，这个方法用作更新前线索
	 */
	@Override
	public Buy findByBuyId(Integer bid) {
		Buy buy = null;  
        try {  
            buy = (Buy) this.sessionFactoy.getCurrentSession().get(  
                    Buy.class, bid);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
       /* System.out.println(buy.getBuyDetails());
        Set<BuyDetail> bd =  (HashSet<BuyDetail>) buy.getBuyDetails();
        Iterator<BuyDetail> iterator=bd.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}*/
        return buy;  
	}

	/* (non-Javadoc)
	 * @see org.erp.dao.BuyDAO#findByUid()
	 * 列出员工信息，id和姓名，用于新增采购单时选择采购员
	 */
	@Override
	public List<Userinfo> findByUid() {
		// TODO Auto-generated method stub
		List<Userinfo> list = null;
		String hql = "from Userinfo u where isDelete = 1";
		Query query = this.sessionFactoy.getCurrentSession().createQuery(  
				hql);  
		list = query.list();
		return list;
	}

	
}
