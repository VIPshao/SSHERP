package org.erp.services;

import java.util.List;

import org.erp.pojo.Buy;
import org.erp.pojo.Userinfo;

public interface BuyServices {
	 /**
     * ��Ӳɹ���
     * @param pojo
     * @return
     */
    public boolean doIns(Buy pojo);  
    
    /**
     * ɾ���ɹ���
     * @param bId
     * @return
     */
    public boolean doDel(Integer bId);  
  
    /**
     * �޸Ĳɹ���
     * @param pojo
     * @return
     */
    public boolean doUpd(Buy pojo);  
  
    /**
     * ͨ���ɹ�����������ѯ
     * @param username
     * @return
     */
    public Buy findByUsername(String username);  
  
    /**
     * ���ݲɹ�����Ų�ѯ
     * @param bId
     * @param currentPage
     * @param pageSize
     * @return
     */
    public List<Buy> findById(Integer bId,String username, int currentPage,  
            int pageSize);  
  
    /**
     * ͳ�Ʋɹ������������ڷ�ҳ��ѯ
     * @param bId
     * @return
     */
    public int findCountById(Integer bId,String username);
    /**
	 * ����ʱ��id����
	 * @param bid
	 * @return
	 */
	public Buy findByBuyId(Integer bid);
	/**
	 * @return
	 * �г�Ա����Ϣ��id�����������������ɹ���ʱѡ��ɹ�Ա
	 */
	public List<Userinfo> findByUid();
}
