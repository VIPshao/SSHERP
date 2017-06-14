package org.erp.services.impl;

import java.util.List;

import org.erp.dao.BuyDAO;
import org.erp.pojo.Buy;
import org.erp.pojo.Userinfo;
import org.erp.services.BuyServices;

public class BuyServicesImpl implements BuyServices {
	BuyDAO dao = null;
	public BuyDAO getDao() {
		return dao;
	}

	public void setDao(BuyDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean doIns(Buy pojo) {
		// TODO Auto-generated method stub
		return this.dao.doIns(pojo);
	}

	@Override
	public boolean doDel(Integer bId) {
		// TODO Auto-generated method stub
		return this.dao.doDel(bId);
	}

	@Override
	public boolean doUpd(Buy pojo) {
		// TODO Auto-generated method stub
		return this.dao.doUpd(pojo);
	}

	@Override
	public Buy findByUsername(String username) {
		// TODO Auto-generated method stub
		return this.dao.findByUsername(username);
	}

	@Override
	public List<Buy> findById(Integer bId,String username, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return this.dao.findById(bId,username, currentPage, pageSize);
	}

	@Override
	public int findCountById(Integer bId,String username) {
		// TODO Auto-generated method stub
		return this.dao.findCountById(bId,username);
	}

	@Override
	public Buy findByBuyId(Integer bid) {
		// TODO Auto-generated method stub
		return this.dao.findByBuyId(bid);
	}

	@Override
	public List<Userinfo> findByUid() {
		// TODO Auto-generated method stub
		return this.dao.findByUid();
	}

	
}
