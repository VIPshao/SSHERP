package org.erp.action;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.erp.pojo.Buy;
import org.erp.pojo.BuyDetail;
import org.erp.pojo.DetailBuyView;
import org.erp.pojo.Pro;
import org.erp.services.BuyDetailServices;

import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class BuyDetailAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3246553332715554614L;
	private Integer buyDetailId;//明细单id
	private Integer bdid;//明细单id
	private Pro pro;//商品
	private Buy buy;//采购单
	private Integer buyNum;//采购数量
	private Double buyPrice;//采购价格
	private Integer isDelete;
	private int currentPage;  //当前页
    private int pageSize;  	//页总数
    private String resultContent; //返回结果
    private JSONArray jsonA;
    private BuyDetailServices services;
	private Integer buyId;//采购单id
	private Integer proId;//商品id
	private String proName;//商品名
	private BigDecimal totalPrice;//总价
	private BuyDetail pojo;
	/**
	 * @return
	 * 查询显示列表
	 */
	public String findAll() {  
        int count = this.services.findCountById(buyDetailId);
        List<DetailBuyView> list = this.services.findById(buyId,currentPage, pageSize);
        jsonA = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("count", count);//这里json将订单数量传递前台
        jsonA.add(jsonObject);
        for (int i = 0; i < list.size(); i++) {
        	DetailBuyView pojo = list.get(i);
			JSONObject jsonO = new JSONObject();
			jsonO.put("bdId", pojo.getId().getBuyDetailId());
			jsonO.put("buyId", pojo.getId().getBuyId());
			jsonO.put("proid",pojo.getId().getProId());
			jsonO.put("proname",pojo.getId().getProName());
			jsonO.put("buynum", pojo.getId().getBuyNum());
			jsonO.put("price",pojo.getId().getBuyPrice());
			jsonO.put("total",pojo.getId().getTotalPrice());
			jsonA.add(jsonO);
		}
        return "succ";  
    }  
	
	/**
	 * 根据id查询所有采购单
	 * @return
	 */
	public String findByBuyid() {  
		List<Buy> list = this.services.findByBuyId();
		jsonA = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonA.add(jsonObject);
        for (int i = 0; i < list.size(); i++) {
        	Buy pojo = list.get(i);
			JSONObject jsonO = new JSONObject();
			jsonO.put("buyid", pojo.getBuyId());
			jsonA.add(jsonO);
		}
		return "succ"; 
    }
	
	/**
	 * 根据id查询所有商品，列出id和商品名
	 * @return
	 */
	public String findByProid() {  
		List<Pro> list = this.services.findByProId();
		jsonA = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonA.add(jsonObject);
        for (int i = 0; i < list.size(); i++) {
        	Pro pojo = list.get(i);
			JSONObject jsonO = new JSONObject();
			jsonO.put("proid", pojo.getProId());
			jsonO.put("proname", pojo.getProName());
			jsonA.add(jsonO);
		}
		return "succ"; 
    }
	/**
	 * @return
	 * 新增采购单明细
	 */
	public String doIns() { 
		Buy buy = new Buy(buyId,null,new Date(),1,null);
		Pro pro = new Pro(proId, null, null, null, 1, null,null, null, null);
		BuyDetail detail = new BuyDetail(buyDetailId, pro, buy, buyNum, buyPrice, 1);
		boolean bool = this.services.doIns(detail);  
        this.setResultContent(Boolean.toString(bool)); 
        return "success";  
    }
	
	/**
	 * 根据id查询采购单，修改采购单时使用
	 * @return
	 */
	public String findById() {  
		BuyDetail buyd = this.services.findByBuyDetailId(bdid); 
        this.setPojo(buyd); 
        return "suc";  
    }
	
	/**
	 * 修改采购明细单信息
	 * @return
	 */
	public String doUpd() {  
		Buy buy = new Buy(buyId,null,new Date(),1,null);
		buy.setBuyId(buyId);
		Pro pro = new Pro(proId, null, null, null, 1, null,null, null, null);
		pro.setProId(proId);
		BuyDetail detail = new BuyDetail(bdid, pro, buy, buyNum, buyPrice, 1);
        boolean bool = this.services.doUpd(detail);  
        this.setResultContent(Boolean.toString(bool));  
        return "success";  
    }  
	
	/**
	 * 删除采购单明细
	 * @return
	 */
	public String doDel() {  
        boolean bool = this.services.doDel(bdid);  
        this.setResultContent(Boolean.toString(bool));  
        return "success";  
    }
	public Integer getBdid() {
		return bdid;
	}

	public void setBdid(Integer bdid) {
		this.bdid = bdid;
	}

	public Integer getBuyDetailId() {
		return buyDetailId;
	}
	public void setBuyDetailId(Integer buyDetailId) {
		this.buyDetailId = buyDetailId;
	}
	public Pro getPro() {
		return pro;
	}
	public void setPro(Pro pro) {
		this.pro = pro;
	}
	public Buy getBuy() {
		return buy;
	}
	public void setBuy(Buy buy) {
		this.buy = buy;
	}
	public Integer getBuyNum() {
		return buyNum;
	}
	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}
	public Double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
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
	public JSONArray getJsonA() {
		return jsonA;
	}
	public void setJsonA(JSONArray jsonA) {
		this.jsonA = jsonA;
	}
	public BuyDetailServices getServices() {
		return services;
	}
	public void setServices(BuyDetailServices services) {
		this.services = services;
	}
	public Integer getBuyId() {
		return buyId;
	}
	public void setBuyId(Integer buyId) {
		this.buyId = buyId;
	}
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public BuyDetail getPojo() {
		return pojo;
	}

	public void setPojo(BuyDetail pojo) {
		this.pojo = pojo;
	}
	
}
