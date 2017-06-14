package org.erp.dao.impl;

import java.util.List;

import org.erp.dao.BuyDetailDAO;
import org.erp.pojo.Buy;
import org.erp.pojo.BuyDetail;
import org.erp.pojo.DetailBuyView;
import org.erp.pojo.Pro;
import org.erp.pojo.Userinfo;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

public class BuyDetailDAOImpl implements BuyDetailDAO {
	SessionFactory sessionFactoy;   
    public SessionFactory getSessionFactoy() {  
        return sessionFactoy;  
    }  
  
    public void setSessionFactoy(SessionFactory sessionFactoy) {  
        this.sessionFactoy = sessionFactoy;  
    } 
	/* (non-Javadoc)
	 * @see org.erp.dao.BuyDetailDAO#doIns(org.erp.pojo.Buy)
	 */
	@Override
	public boolean doIns(BuyDetail pojo) {
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
	 * @see org.erp.dao.BuyDetailDAO#doDel(java.lang.Integer)
	 */
	@Override
	public boolean doDel(Integer bId) {
		 boolean bool = false;  
	        try {  
	            BuyDetail buy = (BuyDetail) this.sessionFactoy.getCurrentSession()  
	                    .get(BuyDetail.class,bId);
	            System.out.println(buy.getBuyDetailId());
	            buy.setIsDelete(0);  
	            bool = true;  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	  
	        return bool;  
	}

	/* (non-Javadoc)
	 * @see org.erp.dao.BuyDetailDAO#doUpd(org.erp.pojo.BuyDetail)
	 */
	@Override
	public boolean doUpd(BuyDetail pojo) {
		boolean bool = false;  
		try {  
			BuyDetail buy = (BuyDetail) this.sessionFactoy.getCurrentSession()  
                    .get(BuyDetail.class, pojo.getBuyDetailId()); 
            buy.setBuy(pojo.getBuy());
            buy.setBuyNum(pojo.getBuyNum());
            buy.setBuyPrice(pojo.getBuyPrice());
            buy.setPro(pojo.getPro());
            bool = true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return bool;  
	}

	/* (non-Javadoc)
	 * @see org.erp.dao.BuyDetailDAO#findById(java.lang.Integer, int, int)
	 */
	@Override
	public List<DetailBuyView> findById(Integer bId, int currentPage, int pageSize) {
		List<DetailBuyView> list = null;
		String hql = null;
		if(bId==null||bId==0){
			hql = "from DetailBuyView";
		}
		else{
			hql = "from DetailBuyView d where d.id.buyId='"+bId+"'";  
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
	 * @see org.erp.dao.BuyDetailDAO#findCountById(java.lang.Integer)
	 */
	@Override
	public int findCountById(Integer bId) {
		int count = 0;  
		String hql = null;
		if(bId == null || bId == 0){
			hql = "select count(d.id.buyDetailId) from DetailBuyView d ";
		}else{
			System.out.println(bId);
			hql = "select count(d.id.buyDetailId) from DetailBuyView d where buy_detail_id='"+bId+"'";
		}
        try {  
            Query query = this.sessionFactoy.getCurrentSession().createQuery(  
                    hql);  
            count = Integer.parseInt(query.list().get(0).toString());  
            System.out.println(count);
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return count; 
	}

	@Override
	public List<Buy> findByBuyId() {
		List<Buy> list = null;
		String hql = "from Buy u where isDelete = 1";
		Query query = this.sessionFactoy.getCurrentSession().createQuery(  
				hql);  
		list = query.list();
		return list;
	}

	@Override
	public List<Pro> findByProId() {
		List<Pro> list = null;
		String hql = "from Pro u where isDelete = 1";
		Query query = this.sessionFactoy.getCurrentSession().createQuery(  
				hql);  
		list = query.list();
		return list;
	}

	@Override
	public BuyDetail findByBuyDetailId(Integer bid) {
		BuyDetail buy = null;  
        try {  
            buy = (BuyDetail) this.sessionFactoy.getCurrentSession().get(  
            		BuyDetail.class, bid);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
        return buy;  
	}

}
