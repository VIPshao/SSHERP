package org.erp.pojo;

import java.util.Date;

/**
 * View2Id entity. @author MyEclipse Persistence Tools
 */

public class View2Id implements java.io.Serializable {

	// Fields

	private Integer buyId;
	private Integer saleId;
	private Date sbDate;
	private Double MOut;
	private Double MIn;

	// Constructors

	/** default constructor */
	public View2Id() {
	}

	/** full constructor */
	public View2Id(Integer buyId, Integer saleId, Date sbDate, Double MOut, Double MIn) {
		this.buyId = buyId;
		this.saleId = saleId;
		this.sbDate = sbDate;
		this.MOut = MOut;
		this.MIn = MIn;
	}

	// Property accessors

	public Integer getBuyId() {
		return this.buyId;
	}

	public void setBuyId(Integer buyId) {
		this.buyId = buyId;
	}

	public Integer getSaleId() {
		return this.saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public Date getSbDate() {
		return this.sbDate;
	}

	public void setSbDate(Date sbDate) {
		this.sbDate = sbDate;
	}

	public Double getMOut() {
		return this.MOut;
	}

	public void setMOut(Double MOut) {
		this.MOut = MOut;
	}

	public Double getMIn() {
		return this.MIn;
	}

	public void setMIn(Double MIn) {
		this.MIn = MIn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof View2Id))
			return false;
		View2Id castOther = (View2Id) other;

		return ((this.getBuyId() == castOther.getBuyId()) || (this.getBuyId() != null && castOther.getBuyId() != null
				&& this.getBuyId().equals(castOther.getBuyId())))
				&& ((this.getSaleId() == castOther.getSaleId()) || (this.getSaleId() != null
						&& castOther.getSaleId() != null && this.getSaleId().equals(castOther.getSaleId())))
				&& ((this.getSbDate() == castOther.getSbDate()) || (this.getSbDate() != null
						&& castOther.getSbDate() != null && this.getSbDate().equals(castOther.getSbDate())))
				&& ((this.getMOut() == castOther.getMOut()) || (this.getMOut() != null && castOther.getMOut() != null
						&& this.getMOut().equals(castOther.getMOut())))
				&& ((this.getMIn() == castOther.getMIn()) || (this.getMIn() != null && castOther.getMIn() != null
						&& this.getMIn().equals(castOther.getMIn())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBuyId() == null ? 0 : this.getBuyId().hashCode());
		result = 37 * result + (getSaleId() == null ? 0 : this.getSaleId().hashCode());
		result = 37 * result + (getSbDate() == null ? 0 : this.getSbDate().hashCode());
		result = 37 * result + (getMOut() == null ? 0 : this.getMOut().hashCode());
		result = 37 * result + (getMIn() == null ? 0 : this.getMIn().hashCode());
		return result;
	}

}