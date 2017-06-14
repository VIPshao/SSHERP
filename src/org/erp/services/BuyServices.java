package org.erp.services;

import java.util.List;

import org.erp.pojo.Buy;
import org.erp.pojo.Userinfo;

public interface BuyServices {
	 /**
     * 添加采购单
     * @param pojo
     * @return
     */
    public boolean doIns(Buy pojo);  
    
    /**
     * 删除采购单
     * @param bId
     * @return
     */
    public boolean doDel(Integer bId);  
  
    /**
     * 修改采购单
     * @param pojo
     * @return
     */
    public boolean doUpd(Buy pojo);  
  
    /**
     * 通过采购者名称来查询
     * @param username
     * @return
     */
    public Buy findByUsername(String username);  
  
    /**
     * 根据采购单编号查询
     * @param bId
     * @param currentPage
     * @param pageSize
     * @return
     */
    public List<Buy> findById(Integer bId,String username, int currentPage,  
            int pageSize);  
  
    /**
     * 统计采购单数量，用于分页查询
     * @param bId
     * @return
     */
    public int findCountById(Integer bId,String username);
    /**
	 * 更新时的id线索
	 * @param bid
	 * @return
	 */
	public Buy findByBuyId(Integer bid);
	/**
	 * @return
	 * 列出员工信息，id和姓名，用于新增采购单时选择采购员
	 */
	public List<Userinfo> findByUid();
}
