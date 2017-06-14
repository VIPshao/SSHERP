package org.erp.services.impl;

import java.util.List;

import org.erp.dao.BuyDetailDAO;
import org.erp.pojo.Buy;
import org.erp.pojo.BuyDetail;
import org.erp.pojo.DetailBuyView;
import org.erp.pojo.Pro;
import org.erp.services.BuyDetailServices;

public class BuyDetailServicesImpl implements BuyDetailServices {
	BuyDetailDAO dao = null;
	
	public BuyDetailDAO getDao() {
		return dao;
	}

	public void setDao(BuyDetailDAO dao) {
		this.dao = dao;
	}

	/* (non-Javadoc)
	 * @see org.erp.services.BuyDetailServices#doIns(org.erp.pojo.BuyDetail)
	 */
	@Override
	public boolean doIns(BuyDetail pojo) {
		// TODO Auto-generated method stub
		return this.dao.doIns(pojo);
	}

	/* (non-Javadoc)
	 * @see org.erp.services.BuyDetailServices#doDel(java.lang.Integer)
	 */
	@Override
	public boolean doDel(Integer bId) {
		// TODO Auto-generated method stub
		return this.dao.doDel(bId);
	}

	/* (non-Javadoc)
	 * @see org.erp.services.BuyDetailServices#doUpd(org.erp.pojo.BuyDetail)
	 */
	@Override
	public boolean doUpd(BuyDetail pojo) {
		// TODO Auto-generated method stub
		return this.dao.doUpd(pojo);
	}

	/* (non-Javadoc)
	 * @see org.erp.services.BuyDetailServices#findById(java.lang.Integer, int, int)
	 */
	@Override
	public List<DetailBuyView> findById(Integer bId, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return this.dao.findById(bId, currentPage, pageSize);
	}

	/* (non-Javadoc)
	 * @see org.erp.services.BuyDetailServices#findCountById(java.lang.Integer)
	 */
	@Override
	public int findCountById(Integer bId) {
		// TODO Auto-generated method stub
		return this.dao.findCountById(bId);
	}

	@Override
	public List<Buy> findByBuyId() {
		// TODO Auto-generated method stub
		return this.dao.findByBuyId();
	}

	@Override
	public List<Pro> findByProId() {
		// TODO Auto-generated method stub
		return this.dao.findByProId();
	}

	@Override
	public BuyDetail findByBuyDetailId(Integer bid) {
		// TODO Auto-generated method stub
		return this.dao.findByBuyDetailId(bid);
	}

}
