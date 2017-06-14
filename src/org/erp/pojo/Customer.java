package org.erp.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private int customerId;
	private String customerName;
	private String customerTel;
	private String customerAdd;
	private Integer customerSex;
	private Integer isDelete;
	private Set sales = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** full constructor */
	public Customer(String customerName, String customerTel,
			String customerAdd, Integer customerSex, Integer isDelete, Set sales) {
		this.customerName = customerName;
		this.customerTel = customerTel;
		this.customerAdd = customerAdd;
		this.customerSex = customerSex;
		this.isDelete = isDelete;
		this.sales = sales;
	}

	
	public Customer(String customerName, String customerTel,
			String customerAdd, Integer customerSex, Integer isDelete) {
		super();
		this.customerName = customerName;
		this.customerTel = customerTel;
		this.customerAdd = customerAdd;
		this.customerSex = customerSex;
		this.isDelete = isDelete;
	}

	public Customer(int customerId, String customerName, String customerTel,
			String customerAdd, Integer customerSex, Integer isDelete, Set sales) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerTel = customerTel;
		this.customerAdd = customerAdd;
		this.customerSex = customerSex;
		this.isDelete = isDelete;
		this.sales = sales;
	}

	// Property accessors

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerTel() {
		return this.customerTel;
	}

	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}

	public String getCustomerAdd() {
		return this.customerAdd;
	}

	public void setCustomerAdd(String customerAdd) {
		this.customerAdd = customerAdd;
	}

	public Integer getCustomerSex() {
		return this.customerSex;
	}

	public void setCustomerSex(Integer customerSex) {
		this.customerSex = customerSex;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Set getSales() {
		return this.sales;
	}

	public void setSales(Set sales) {
		this.sales = sales;
	}

}