package org.erp.pojo;

import java.sql.Timestamp;

/**
 * Clear entity. @author MyEclipse Persistence Tools
 */

public class Clear implements java.io.Serializable {

	// Fields

	private int clearId;
	private Pro pro;
	private Userinfo userinfo;
	private int proNum;
	private int proClearNum;
	private Timestamp clearDate;
	private Integer isDelete;

	// Constructors

	/** default constructor */
	public Clear() {
	}

	/** full constructor */
	public Clear(Pro pro, Userinfo userinfo, int proNum, int proClearNum,
			Timestamp clearDate, Integer isDelete) {
		this.pro = pro;
		this.userinfo = userinfo;
		this.proNum = proNum;
		this.proClearNum = proClearNum;
		this.clearDate = clearDate;
		this.isDelete = isDelete;
	}

	// Property accessors

	public int getClearId() {
		return this.clearId;
	}

	public void setClearId(int clearId) {
		this.clearId = clearId;
	}

	public Pro getPro() {
		return this.pro;
	}

	public void setPro(Pro pro) {
		this.pro = pro;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public int getProNum() {
		return this.proNum;
	}

	public void setProNum(int proNum) {
		this.proNum = proNum;
	}

	public int getProClearNum() {
		return this.proClearNum;
	}

	public void setProClearNum(int proClearNum) {
		this.proClearNum = proClearNum;
	}

	public Timestamp getClearDate() {
		return this.clearDate;
	}

	public void setClearDate(Timestamp clearDate) {
		this.clearDate = clearDate;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

}