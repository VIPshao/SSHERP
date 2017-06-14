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
	 * ɾ��������û�н���������ɾ��������ʱis_delete�ֶ�Ϊ0���͸��²�������
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
	 * ���²�������ִ�д˷���ǰ��ִ��findBybuyId()������ѯ��Ҫ���µ��ֶ�
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
	 * ���ݲɹ�Ա���Ʋ�ѯ
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
	 * ���ݲɹ�����Ų�ѯ����������Ϊ��ʱ��ѯ���вɹ����б���ʾ
	 * ��������ʱ����Ų�ѯ��Ҳ�����˷�ҳ
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
	 * ����Ų�ѯ�ɹ�����������������ҳʹ��
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
	 * ���ݲɹ�����Ų�ѯ�����������������ǰ����
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
	 * �г�Ա����Ϣ��id�����������������ɹ���ʱѡ��ɹ�Ա
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
