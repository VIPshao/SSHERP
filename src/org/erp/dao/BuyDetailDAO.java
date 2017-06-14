package org.erp.dao;

import java.util.List;

import org.erp.pojo.Buy;
import org.erp.pojo.BuyDetail;
import org.erp.pojo.DetailBuyView;
import org.erp.pojo.Pro;

public interface BuyDetailDAO {
	
	
	/**
     * ��Ӳɹ�����ϸ
     * @param pojo
     * @return
     */
    public boolean doIns(BuyDetail pojo);  
    
    /**
     * ɾ���ɹ�����ϸ
     * @param bId
     * @return
     */
    public boolean doDel(Integer bId); 
  
    /**
     * �޸Ĳɹ�����ϸ
     * @param pojo
     * @return
     */
    public boolean doUpd(BuyDetail pojo);  
   
    /**
     * ���ݲɹ�����Ų�ѯ�ɹ�����ϸ
     * @param bId
     * @param currentPage
     * @param pageSize
     * @return
     */
    public List<DetailBuyView> findById(Integer bId,int currentPage,  
            int pageSize);  
  
    /**
     * ͳ�Ʋɹ���ϸ�����������ڷ�ҳ��ѯ
     * @param bId
     * @return
     */
    public int findCountById(Integer bId);
    /**
	 * @return
	 * �г��ɹ�����Ϣ
	 */
	public List<Buy> findByBuyId();
	/**
	 * @return
	 * �г���Ʒ��Ϣ
	 */
	public List<Pro> findByProId();
	
	/**
	 * @param bid
	 * @return
	 * ������
	 */
	public BuyDetail findByBuyDetailId(Integer bid);
}
