package org.erp.services;

import java.util.List;

import org.erp.pojo.Dept;
import org.erp.pojo.Userinfo;

public interface UserinfoServices {
	 /**
     * 添加员工
     * @param pojo
     * @return
     */
    public boolean doIns(Userinfo pojo);  
    /**
     * 删除员工
     * @param bId
     * @return
     */
    public boolean doDel(Integer bId); 
    /**
     * 更新员工
     * @param pojo
     * @return
     */
    public boolean doUpd(Userinfo pojo);  
    /**
     * 通过员工id查询
     * @param sId
     * @return
     */
    public Userinfo findById(int sId);  
    /**
     * 通过名称模糊查询加分页
     * @param userName
     * @param currentPage
     * @param pageSize
     * @return
     */
    public List<Userinfo> findByUserName(String userName, int currentPage,  
            int pageSize);  
    /**
     * 查询员工数量，为分页准备
     * @param userName
     * @return
     */
    public int findCountByUserName(String userName);  
    
    
    /**
     * 列出部门信息
     * @return
     */
    public List<Dept> findByDid();
}
