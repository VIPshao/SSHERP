package org.erp.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Pro entity. @author MyEclipse Persistence Tools
 */

public class Pro implements java.io.Serializable {

	// Fields

	private int proId;
	private ProKind proKind;
	private String proName;
	private String proSize;
	private Integer isDelete;
	private Set saleDetails = new HashSet(0);
	private Set clears = new HashSet(0);
	private Set buyDetails = new HashSet(0);
	private Set proSups = new HashSet(0);

	// Constructors

	/** default constructor */
	public Pro() {
	}

	/** full constructor */
	public Pro(ProKind proKind, String proName, String proSize,
			Integer isDelete, Set saleDetails, Set clears, Set buyDetails,
			Set proSups) {
		this.proKind = proKind;
		this.proName = proName;
		this.proSize = proSize;
		this.isDelete = isDelete;
		this.saleDetails = saleDetails;
		this.clears = clears;
		this.buyDetails = buyDetails;
		this.proSups = proSups;
	}

	// Property accessors

	public Pro(int proId, ProKind proKind, String proName, String proSize, Integer isDelete, Set saleDetails,
			Set clears, Set buyDetails, Set proSups) {
		super();
		this.proId = proId;
		this.proKind = proKind;
		this.proName = proName;
		this.proSize = proSize;
		this.isDelete = isDelete;
		this.saleDetails = saleDetails;
		this.clears = clears;
		this.buyDetails = buyDetails;
		this.proSups = proSups;
	}

	public int getProId() {
		return this.proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public ProKind getProKind() {
		return this.proKind;
	}

	public void setProKind(ProKind proKind) {
		this.proKind = proKind;
	}

	public String getProName() {
		return this.proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProSize() {
		return this.proSize;
	}

	public void setProSize(String proSize) {
		this.proSize = proSize;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Set getSaleDetails() {
		return this.saleDetails;
	}

	public void setSaleDetails(Set saleDetails) {
		this.saleDetails = saleDetails;
	}

	public Set getClears() {
		return this.clears;
	}

	public void setClears(Set clears) {
		this.clears = clears;
	}

	public Set getBuyDetails() {
		return this.buyDetails;
	}

	public void setBuyDetails(Set buyDetails) {
		this.buyDetails = buyDetails;
	}

	public Set getProSups() {
		return this.proSups;
	}

	public void setProSups(Set proSups) {
		this.proSups = proSups;
	}

}