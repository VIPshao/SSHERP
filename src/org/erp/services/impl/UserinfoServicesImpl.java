package org.erp.services.impl;

import java.util.List;

import org.erp.dao.UserinfoDAO;
import org.erp.pojo.Dept;
import org.erp.pojo.Userinfo;
import org.erp.services.UserinfoServices;

public class UserinfoServicesImpl implements UserinfoServices {
	UserinfoDAO dao = null;
	
	public UserinfoDAO getDao() {
		return dao;
	}

	public void setDao(UserinfoDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean doIns(Userinfo pojo) {
		// TODO Auto-generated method stub
		return this.dao.doIns(pojo);
	}

	@Override
	public boolean doDel(Integer bId) {
		// TODO Auto-generated method stub
		return this.dao.doDel(bId);
	}

	@Override
	public boolean doUpd(Userinfo pojo) {
		// TODO Auto-generated method stub
		return this.dao.doUpd(pojo);
	}

	@Override
	public Userinfo findById(int uId) {
		// TODO Auto-generated method stub
		return this.dao.findById(uId);
	}

	@Override
	public List<Userinfo> findByUserName(String userName, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return this.dao.findByUserName(userName, currentPage, pageSize);
	}

	@Override
	public int findCountByUserName(String userName) {
		// TODO Auto-generated method stub
		return this.dao.findCountByUserName(userName);
	}

	@Override
	public List<Dept> findByDid() {
		// TODO Auto-generated method stub
		return this.dao.findByDid();
	}



}
