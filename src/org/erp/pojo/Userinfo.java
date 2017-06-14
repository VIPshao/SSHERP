package org.erp.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Dept dept;
	private String userNum;
	private String userPass;
	private String userName;
	private Integer isDelete;
	private Set buies = new HashSet(0);
	private Set sales = new HashSet(0);
	private Set clears = new HashSet(0);

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** full constructor */
	public Userinfo(Dept dept, String userNum, String userPass, String userName, Integer isDelete, Set buies, Set sales,
			Set clears) {
		this.dept = dept;
		this.userNum = userNum;
		this.userPass = userPass;
		this.userName = userName;
		this.isDelete = isDelete;
		this.buies = buies;
		this.sales = sales;
		this.clears = clears;
	}

	// Property accessors

	public Userinfo(Integer userId, Dept dept, String userNum, String userPass, String userName, Integer isDelete,
			Set buies, Set sales, Set clears) {
		super();
		this.userId = userId;
		this.dept = dept;
		this.userNum = userNum;
		this.userPass = userPass;
		this.userName = userName;
		this.isDelete = isDelete;
		this.buies = buies;
		this.sales = sales;
		this.clears = clears;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getUserNum() {
		return this.userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Set getBuies() {
		return this.buies;
	}

	public void setBuies(Set buies) {
		this.buies = buies;
	}

	public Set getSales() {
		return this.sales;
	}

	public void setSales(Set sales) {
		this.sales = sales;
	}

	public Set getClears() {
		return this.clears;
	}

	public void setClears(Set clears) {
		this.clears = clears;
	}

}