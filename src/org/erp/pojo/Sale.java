package org.erp.pojo;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sale entity. @author MyEclipse Persistence Tools
 */

public class Sale implements java.io.Serializable {

	// Fields

	private int saleId;
	private Userinfo userinfo;
	private Customer customer;
	private Date saleDate;
	private Integer isDelete;
	private Set saleDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Sale() {
	}

	/** full constructor */
	public Sale(Userinfo userinfo, Customer customer, Date saleDate,
			Integer isDelete, Set saleDetails) {
		this.userinfo = userinfo;
		this.customer = customer;
		this.saleDate = saleDate;
		this.isDelete = isDelete;
		this.saleDetails = saleDetails;
	}
	
	public Sale(Userinfo userinfo, Customer customer, Date saleDate,
			Integer isDelete) {
		super();
		this.userinfo = userinfo;
		this.customer = customer;
		this.saleDate = saleDate;
		this.isDelete = isDelete;
	}

	public Sale(int saleId, Userinfo userinfo, Customer customer,
			Date saleDate, Integer isDelete, Set saleDetails) {
		super();
		this.saleId = saleId;
		this.userinfo = userinfo;
		this.customer = customer;
		this.saleDate = saleDate;
		this.isDelete = isDelete;
		this.saleDetails = saleDetails;
	}

	// Property accessors

	public int getSaleId() {
		return this.saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getSaleDate() {
		return this.saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
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

}