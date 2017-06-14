package org.erp.pojo;

/**
 * BuyDetail entity. @author MyEclipse Persistence Tools
 */

public class BuyDetail implements java.io.Serializable {

	// Fields

	private Integer buyDetailId;
	private Pro pro;
	private Buy buy;
	private Integer buyNum;
	private Double buyPrice;
	private Integer isDelete;

	// Constructors

	/** default constructor */
	public BuyDetail() {
	}

	/** full constructor */
	public BuyDetail(Pro pro, Buy buy, Integer buyNum, Double buyPrice, Integer isDelete) {
		this.pro = pro;
		this.buy = buy;
		this.buyNum = buyNum;
		this.buyPrice = buyPrice;
		this.isDelete = isDelete;
	}

	// Property accessors

	public BuyDetail(Integer buyDetailId, Pro pro, Buy buy, Integer buyNum, Double buyPrice, Integer isDelete) {
		super();
		this.buyDetailId = buyDetailId;
		this.pro = pro;
		this.buy = buy;
		this.buyNum = buyNum;
		this.buyPrice = buyPrice;
		this.isDelete = isDelete;
	}

	public Integer getBuyDetailId() {
		return this.buyDetailId;
	}

	public void setBuyDetailId(Integer buyDetailId) {
		this.buyDetailId = buyDetailId;
	}

	public Pro getPro() {
		return this.pro;
	}

	public void setPro(Pro pro) {
		this.pro = pro;
	}

	public Buy getBuy() {
		return this.buy;
	}

	public void setBuy(Buy buy) {
		this.buy = buy;
	}

	public Integer getBuyNum() {
		return this.buyNum;
	}

	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}

	public Double getBuyPrice() {
		return this.buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

}