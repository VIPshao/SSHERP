package org.erp.pojo;

import java.math.BigDecimal;

/**
 * DetailBuyViewId entity. @author MyEclipse Persistence Tools
 */

public class DetailBuyViewId implements java.io.Serializable {

	// Fields

	private Integer buyDetailId;
	private Integer buyId;
	private Integer proId;
	private String proName;
	private Integer buyNum;
	private Double buyPrice;
	private BigDecimal totalPrice;
	private Integer isDelete;

	// Constructors

	/** default constructor */
	public DetailBuyViewId() {
	}

	/** minimal constructor */
	public DetailBuyViewId(Integer buyDetailId, Integer proId) {
		this.buyDetailId = buyDetailId;
		this.proId = proId;
	}

	/** full constructor */
	public DetailBuyViewId(Integer buyDetailId, Integer buyId, Integer proId, String proName, Integer buyNum, Double buyPrice,
			BigDecimal totalPrice, Integer isDelete) {
		this.buyDetailId = buyDetailId;
		this.buyId = buyId;
		this.proId = proId;
		this.proName = proName;
		this.buyNum = buyNum;
		this.buyPrice = buyPrice;
		this.totalPrice = totalPrice;
		this.isDelete = isDelete;
	}

	// Property accessors

	public Integer getBuyDetailId() {
		return this.buyDetailId;
	}

	public void setBuyDetailId(Integer buyDetailId) {
		this.buyDetailId = buyDetailId;
	}

	public Integer getBuyId() {
		return this.buyId;
	}

	public void setBuyId(Integer buyId) {
		this.buyId = buyId;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getProName() {
		return this.proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
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

	public BigDecimal getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DetailBuyViewId))
			return false;
		DetailBuyViewId castOther = (DetailBuyViewId) other;

		return ((this.getBuyDetailId() == castOther.getBuyDetailId()) || (this.getBuyDetailId() != null
				&& castOther.getBuyDetailId() != null && this.getBuyDetailId().equals(castOther.getBuyDetailId())))
				&& ((this.getBuyId() == castOther.getBuyId()) || (this.getBuyId() != null
						&& castOther.getBuyId() != null && this.getBuyId().equals(castOther.getBuyId())))
				&& ((this.getProId() == castOther.getProId()) || (this.getProId() != null
						&& castOther.getProId() != null && this.getProId().equals(castOther.getProId())))
				&& ((this.getProName() == castOther.getProName()) || (this.getProName() != null
						&& castOther.getProName() != null && this.getProName().equals(castOther.getProName())))
				&& ((this.getBuyNum() == castOther.getBuyNum()) || (this.getBuyNum() != null
						&& castOther.getBuyNum() != null && this.getBuyNum().equals(castOther.getBuyNum())))
				&& ((this.getBuyPrice() == castOther.getBuyPrice()) || (this.getBuyPrice() != null
						&& castOther.getBuyPrice() != null && this.getBuyPrice().equals(castOther.getBuyPrice())))
				&& ((this.getTotalPrice() == castOther.getTotalPrice()) || (this.getTotalPrice() != null
						&& castOther.getTotalPrice() != null && this.getTotalPrice().equals(castOther.getTotalPrice())))
				&& ((this.getIsDelete() == castOther.getIsDelete()) || (this.getIsDelete() != null
						&& castOther.getIsDelete() != null && this.getIsDelete().equals(castOther.getIsDelete())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBuyDetailId() == null ? 0 : this.getBuyDetailId().hashCode());
		result = 37 * result + (getBuyId() == null ? 0 : this.getBuyId().hashCode());
		result = 37 * result + (getProId() == null ? 0 : this.getProId().hashCode());
		result = 37 * result + (getProName() == null ? 0 : this.getProName().hashCode());
		result = 37 * result + (getBuyNum() == null ? 0 : this.getBuyNum().hashCode());
		result = 37 * result + (getBuyPrice() == null ? 0 : this.getBuyPrice().hashCode());
		result = 37 * result + (getTotalPrice() == null ? 0 : this.getTotalPrice().hashCode());
		result = 37 * result + (getIsDelete() == null ? 0 : this.getIsDelete().hashCode());
		return result;
	}

}