package org.erp.dao.impl;

import java.util.List;

import org.erp.dao.UserinfoDAO;
import org.erp.pojo.Dept;
import org.erp.pojo.Userinfo;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

public class UserinfoDAOImpl implements UserinfoDAO {
	SessionFactory sessionFactoy;   
    public SessionFactory getSessionFactoy() {  
        return sessionFactoy;  
    }  
  
    public void setSessionFactoy(SessionFactory sessionFactoy) {  
        this.sessionFactoy = sessionFactoy;  
    } 
	@Override
	public boolean doIns(Userinfo pojo) {
		boolean bool = false;  
        try {  
            this.sessionFactoy.getCurrentSession().save(pojo);  
            bool = true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
  
        return bool; 
	}

	@Override
	public boolean doDel(Integer bId) {
		boolean bool = false;  
        try {  
        	Userinfo pojo = (Userinfo) this.sessionFactoy.getCurrentSession()  
                    .get(Userinfo.class,bId);
            System.out.println(pojo.getUserId());
            pojo.setIsDelete(0);  
            bool = true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return bool;  
	}

	@Override
	public boolean doUpd(Userinfo pojo) {
		boolean bool = false;  
		try {  
            Userinfo user = (Userinfo) this.sessionFactoy.getCurrentSession()  
                    .get(Userinfo.class, pojo.getUserId()); 
            user.setDept(pojo.getDept());
            user.setUserNum(pojo.getUserNum());
            user.setUserPass(pojo.getUserPass());
            user.setUserName(pojo.getUserName());
            bool = true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return bool;  
	}

	@Override
	public Userinfo findById(int sId) {
		Userinfo user = null;  
        try {  
            user = (Userinfo) this.sessionFactoy.getCurrentSession().get(  
                    Userinfo.class, sId);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return user;
	}

	@Override
	public List<Userinfo> findByUserName(String userName, int currentPage, int pageSize) {
		List<Userinfo> list = null;  
        String hql = "from Userinfo where userName like '%" + userName + "%' and isDelete=1";  
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

	@Override
	public int findCountByUserName(String userName) {
		int count = 0;  
        String hql = "select count(userId) from Userinfo where userName like '%"  
                + userName + "%' and isDelete=1";  
        try {  
            Query query = this.sessionFactoy.getCurrentSession().createQuery(  
                    hql);  
            count = Integer.parseInt(query.list().get(0).toString());  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return count;
	}

	@Override
	public List<Dept> findByDid() {
		List<Dept> list = null;
		String hql = "from Dept";
		Query query = this.sessionFactoy.getCurrentSession().createQuery(  
				hql);  
		list = query.list();
		return list;
	}

}
