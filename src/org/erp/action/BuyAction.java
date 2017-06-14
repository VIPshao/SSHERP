package org.erp.action;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.erp.pojo.Buy;
import org.erp.pojo.Userinfo;
import org.erp.services.BuyServices;
import org.erp.tools.DataConverter;

import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author dalin
 *采购单action
 */
public class BuyAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4637035590822393342L;
	
	private Userinfo userinfo; //采购者信息
	private Set buyDetails = new HashSet(0); //采购明细单
	private Integer buyId;	//采购单编号,查询条件
	private Integer userId;	//采购者id
	private Date buyDate;	//采购日期
	private Integer isDelete;  //是否删除
	private int currentPage;  //当前页
    private int pageSize;  	//页总数
    private String resultContent; //返回结果
    private int bid;	//采购单编号，删除条件
    private Buy pojo; 	//采购单
    private BuyServices services;
    private JSONArray jsonA;
	private String username;//员工姓名
	private Integer uid;//员工姓名
	private String uidname;
	
	/**
	 * @return
	 * 获取所有的员工，为新增和修改采购单
	 */
	public String findAllUser(){
		List<Userinfo> list = this.services.findByUid();
		jsonA = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonA.add(jsonObject);
        for (int i = 0; i < list.size(); i++) {
			Userinfo pojo = list.get(i);
			JSONObject jsonO = new JSONObject();
			jsonO.put("userid", pojo.getUserId());
			jsonO.put("username", pojo.getUserName());
			jsonA.add(jsonO);
		}
		return "succ";
	}
	/**
	 * @return
	 * 新增采购单
	 */
	public String doIns() {  
		Userinfo userinfo = new Userinfo(userId,null,null,null,null,1,null,null,null);
		Buy pojo = new Buy(userinfo,buyDate,1,null);
        boolean bool = this.services.doIns(pojo);  
        this.setResultContent(Boolean.toString(bool));  
        return "success";  
    }
	/**
	 * @return
	 * 查询显示列表
	 */
	public String findAll() {  
        int count = this.services.findCountById(buyId,username); //根据订单编号，采购员查询采购单数量 
        List<Buy> list = this.services.findById(buyId,username, currentPage, pageSize);//查询，列表显示所有采购单信息
        jsonA = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("count", count);//这里json将订单数量传递前台
        jsonA.add(jsonObject);
        for (int i = 0; i < list.size(); i++) {
			Buy pojo = list.get(i);
			JSONObject jsonO = new JSONObject();
			jsonO.put("buyId", pojo.getBuyId());
			jsonO.put("userid",pojo.getUserinfo().getUserName());
			jsonO.put("buyDate",DataConverter.dataToString(pojo.getBuyDate(),"yyyy-MM-dd"));
			jsonA.add(jsonO);
		}
        return "succ";  
    }  
	/**
	 * 根据id查询采购单，修改采购单时使用
	 * @return
	 */
	public String findById() {  
        Buy buy = this.services.findByBuyId(bid);  
        this.setPojo(buy);  
        return "suc";  
    }
	/**
	 * 根据id查询采购单
	 * @return
	 */
	public String findByBid() {  
        Buy buy = this.services.findByBuyId(bid);  
        this.setPojo(buy);  
        return "show";  
    }
	/**
	 * 修改采购单信息
	 * @return
	 */
	public String doUpd() {  
		Userinfo userinfo = new Userinfo(Integer.valueOf(uidname),null,null,null,null,1,null,null,null);
		Buy buy = new Buy(buyId,userinfo,buyDate,1,null);
        boolean bool = this.services.doUpd(buy);  
        this.setResultContent(Boolean.toString(bool));  
        return "success";  
    }  
	
	/**
	 * 删除采购单
	 * @return
	 */
	public String doDel() {  
        boolean bool = this.services.doDel(bid);  
        this.setResultContent(Boolean.toString(bool));  
        return "success";  
    }
	public Userinfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	public Set getBuyDetails() {
		return buyDetails;
	}
	public void setBuyDetails(Set buyDetails) {
		this.buyDetails = buyDetails;
	}
	public Integer getBuyId() {
		return buyId;
	}
	public void setBuyId(Integer buyId) {
		this.buyId = buyId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
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
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public Buy getPojo() {
		return pojo;
	}
	public void setPojo(Buy pojo) {
		this.pojo = pojo;
	}
	public BuyServices getServices() {
		return services;
	}
	public void setServices(BuyServices services) {
		this.services = services;
	}
	public JSONArray getJsonA() {
		return jsonA;
	}
	public void setJsonA(JSONArray jsonA) {
		this.jsonA = jsonA;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUidname() {
		return uidname;
	}
	public void setUidname(String uidname) {
		this.uidname = uidname;
	}
	
}
