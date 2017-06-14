package org.erp.action;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.erp.pojo.Dept;
import org.erp.pojo.Userinfo;
import org.erp.services.UserinfoServices;

import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class UserinfoAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4512970390914020686L;
	private Dept dept;
	private Set buies = new HashSet(0);
	private Set sales = new HashSet(0);
	private Set clears = new HashSet(0);
	private Integer userId;//员工id
	private Integer deptId;//部门编号
	private String userNum;//员工账号
	private String userPass;//员工密码
	private String userName;//员工姓名
	private Integer isDelete;
	private Integer uid;  //员工id,查询删除时使用
	private String userN;   //员工名称，查询使用
	private Userinfo pojo;
	private int currentPage;  //当前页
    private int pageSize;  	//页总数
    private String resultContent; //返回结果
	private UserinfoServices services;
	private JSONArray jsonA;
	
	/**
	 * @return
	 */
	public String doIns() {  
		Dept dept = new Dept(deptId,null,null);
        Userinfo pojo = new Userinfo(dept,userNum,userPass,userName,1,null,null,null);  
        boolean bool = this.services.doIns(pojo);  
        this.setResultContent(Boolean.toString(bool));  
        return "success";  
    }  
	
	/**
	 * @return
	 */
	public String findAll() {  
        int count = this.services.findCountByUserName(userN);  
        List<Userinfo> list = this.services.findByUserName(userN, currentPage, pageSize) ;
        jsonA = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("count", count);
        jsonA.add(jsonObject);
        for (int i = 0; i < list.size(); i++) {
			Userinfo info = list.get(i);
			JSONObject jsonO = new JSONObject();
			jsonO.put("userId", info.getUserId());
			jsonO.put("d",info.getDept().getDeptName());
			jsonO.put("usernum",info.getUserNum());
			jsonO.put("userpass",info.getUserPass());
			jsonO.put("username",info.getUserName());
			jsonA.add(jsonO);
		}
        return "succ";  
    }  

	public String doUpd() {
		Dept dept = new Dept(deptId,null,null);
		dept.setDeptId(deptId);
		Userinfo ui = new Userinfo(userId,dept,userNum,userPass,userName,1,null,null,null);
		boolean bool = this.services.doUpd(ui);
		this.setResultContent(Boolean.toString(bool));
		return "success";
	}

	public String findById() {
		Userinfo pojo = this.services.findById(uid);
		this.setPojo(pojo);
		return "suc";
	}

	public String doDel() {
		boolean bool = this.services.doDel(uid);
		this.setResultContent(Boolean.toString(bool));
		return "success";
	}
	
	public String findAllDept(){
		List<Dept> list = this.services.findByDid();
		jsonA = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonA.add(jsonObject);
        for (int i = 0; i < list.size(); i++) {
			Dept pojo = list.get(i);
			JSONObject jsonO = new JSONObject();
			jsonO.put("deptid", pojo.getDeptId());
			jsonO.put("deptname", pojo.getDeptName());
			jsonA.add(jsonO);
		}
		return "succ";
	}
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Set getBuies() {
		return buies;
	}
	public void setBuies(Set buies) {
		this.buies = buies;
	}
	public Set getSales() {
		return sales;
	}
	public void setSales(Set sales) {
		this.sales = sales;
	}
	public Set getClears() {
		return clears;
	}
	public void setClears(Set clears) {
		this.clears = clears;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getUserNum() {
		return userNum;
	}
	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUserN() {
		return userN;
	}
	public void setUserN(String userN) {
		this.userN = userN;
	}
	public Userinfo getPojo() {
		return pojo;
	}
	public void setPojo(Userinfo pojo) {
		this.pojo = pojo;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getResultContent() {
		return resultContent;
	}
	public void setResultContent(String resultContent) {
		this.resultContent = resultContent;
	}
	public UserinfoServices getServices() {
		return services;
	}
	public void setServices(UserinfoServices services) {
		this.services = services;
	}
	public JSONArray getJsonA() {
		return jsonA;
	}
	public void setJsonA(JSONArray jsonA) {
		this.jsonA = jsonA;
	}
	
}
