package org.erp.services;

import java.util.List;

import org.erp.pojo.Dept;
import org.erp.pojo.Userinfo;

public interface UserinfoServices {
	 /**
     * ���Ա��
     * @param pojo
     * @return
     */
    public boolean doIns(Userinfo pojo);  
    /**
     * ɾ��Ա��
     * @param bId
     * @return
     */
    public boolean doDel(Integer bId); 
    /**
     * ����Ա��
     * @param pojo
     * @return
     */
    public boolean doUpd(Userinfo pojo);  
    /**
     * ͨ��Ա��id��ѯ
     * @param sId
     * @return
     */
    public Userinfo findById(int sId);  
    /**
     * ͨ������ģ����ѯ�ӷ�ҳ
     * @param userName
     * @param currentPage
     * @param pageSize
     * @return
     */
    public List<Userinfo> findByUserName(String userName, int currentPage,  
            int pageSize);  
    /**
     * ��ѯԱ��������Ϊ��ҳ׼��
     * @param userName
     * @return
     */
    public int findCountByUserName(String userName);  
    
    
    /**
     * �г�������Ϣ
     * @return
     */
    public List<Dept> findByDid();
}
