package org.erp.dao;

import java.util.List;

import org.erp.pojo.Buy;
import org.erp.pojo.BuyDetail;
import org.erp.pojo.DetailBuyView;
import org.erp.pojo.Pro;

public interface BuyDetailDAO {
	
	
	/**
     * 添加采购单明细
     * @param pojo
     * @return
     */
    public boolean doIns(BuyDetail pojo);  
    
    /**
     * 删除采购单明细
     * @param bId
     * @return
     */
    public boolean doDel(Integer bId); 
  
    /**
     * 修改采购单明细
     * @param pojo
     * @return
     */
    public boolean doUpd(BuyDetail pojo);  
   
    /**
     * 根据采购单编号查询采购单明细
     * @param bId
     * @param currentPage
     * @param pageSize
     * @return
     */
    public List<DetailBuyView> findById(Integer bId,int currentPage,  
            int pageSize);  
  
    /**
     * 统计采购明细单数量，用于分页查询
     * @param bId
     * @return
     */
    public int findCountById(Integer bId);
    /**
	 * @return
	 * 列出采购单信息
	 */
	public List<Buy> findByBuyId();
	/**
	 * @return
	 * 列出商品信息
	 */
	public List<Pro> findByProId();
	
	/**
	 * @param bid
	 * @return
	 * 更新用
	 */
	public BuyDetail findByBuyDetailId(Integer bid);
}
