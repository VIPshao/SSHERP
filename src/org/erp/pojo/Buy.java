package org.erp.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Buy entity. @author MyEclipse Persistence Tools
 */

public class Buy implements java.io.Serializable {

	// Fields

	private Integer buyId;
	private Userinfo userinfo;
	private Date buyDate;
	private Integer isDelete;
	private Set buyDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Buy() {
	}

	/** full constructor */
	public Buy(Userinfo userinfo, Date buyDate, Integer isDelete, Set buyDetails) {
		this.userinfo = userinfo;
		this.buyDate = buyDate;
		this.isDelete = isDelete;
		this.buyDetails = buyDetails;
	}

	// Property accessors

	public Buy(Integer buyId, Userinfo userinfo, Date buyDate, Integer isDelete, Set buyDetails) {
		super();
		this.buyId = buyId;
		this.userinfo = userinfo;
		this.buyDate = buyDate;
		this.isDelete = isDelete;
		this.buyDetails = buyDetails;
	}

	public Integer getBuyId() {
		return this.buyId;
	}

	public void setBuyId(Integer buyId) {
		this.buyId = buyId;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Date getBuyDate() {
		return this.buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Set getBuyDetails() {
		return this.buyDetails;
	}

	public void setBuyDetails(Set buyDetails) {
		this.buyDetails = buyDetails;
	}

}