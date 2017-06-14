package org.erp.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Sup entity. @author MyEclipse Persistence Tools
 */

public class Sup implements java.io.Serializable {

	// Fields

	private int supId;
	private String supName;
	private String supAdd;
	private String supLinkName;
	private Integer supLinkSex;
	private String supLinkTel;
	private Integer isDelete;
	private Set proSups = new HashSet(0);

	// Constructors

	/** default constructor */
	public Sup() {
	}

	/** full constructor */
	public Sup(String supName, String supAdd, String supLinkName,
			Integer supLinkSex, String supLinkTel, Integer isDelete, Set proSups) {
		this.supName = supName;
		this.supAdd = supAdd;
		this.supLinkName = supLinkName;
		this.supLinkSex = supLinkSex;
		this.supLinkTel = supLinkTel;
		this.isDelete = isDelete;
		this.proSups = proSups;
	}

	// Property accessors

	public int getSupId() {
		return this.supId;
	}

	public void setSupId(int supId) {
		this.supId = supId;
	}

	public String getSupName() {
		return this.supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	public String getSupAdd() {
		return this.supAdd;
	}

	public void setSupAdd(String supAdd) {
		this.supAdd = supAdd;
	}

	public String getSupLinkName() {
		return this.supLinkName;
	}

	public void setSupLinkName(String supLinkName) {
		this.supLinkName = supLinkName;
	}

	public Integer getSupLinkSex() {
		return this.supLinkSex;
	}

	public void setSupLinkSex(Integer supLinkSex) {
		this.supLinkSex = supLinkSex;
	}

	public String getSupLinkTel() {
		return this.supLinkTel;
	}

	public void setSupLinkTel(String supLinkTel) {
		this.supLinkTel = supLinkTel;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Set getProSups() {
		return this.proSups;
	}

	public void setProSups(Set proSups) {
		this.proSups = proSups;
	}

}