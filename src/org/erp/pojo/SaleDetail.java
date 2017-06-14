package org.erp.pojo;

/**
 * SaleDetail entity. @author MyEclipse Persistence Tools
 */

public class SaleDetail implements java.io.Serializable {

	// Fields

	private int saleDetailId;
	private Pro pro;
	private Sale sale;
	private int saleNum;
	private Double salePrice;
	private Integer isDelete;

	// Constructors

	/** default constructor */
	public SaleDetail() {
	}

	/** full constructor */
	public SaleDetail(Pro pro, Sale sale, int saleNum, Double salePrice,
			Integer isDelete) {
		this.pro = pro;
		this.sale = sale;
		this.saleNum = saleNum;
		this.salePrice = salePrice;
		this.isDelete = isDelete;
	}

	public SaleDetail(int saleDetailId, Pro pro, Sale sale, int saleNum,
			Double salePrice, Integer isDelete) {
		super();
		this.saleDetailId = saleDetailId;
		this.pro = pro;
		this.sale = sale;
		this.saleNum = saleNum;
		this.salePrice = salePrice;
		this.isDelete = isDelete;
	}

	// Property accessors

	public int getSaleDetailId() {
		return this.saleDetailId;
	}

	public void setSaleDetailId(int saleDetailId) {
		this.saleDetailId = saleDetailId;
	}

	public Pro getPro() {
		return this.pro;
	}

	public void setPro(Pro pro) {
		this.pro = pro;
	}

	public Sale getSale() {
		return this.sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public int getSaleNum() {
		return this.saleNum;
	}

	public void setSaleNum(int saleNum) {
		this.saleNum = saleNum;
	}

	public Double getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

}