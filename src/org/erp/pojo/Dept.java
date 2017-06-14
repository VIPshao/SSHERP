package org.erp.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private int deptId;
	private String deptName;
	private Set userinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** full constructor */
	public Dept(String deptName, Set userinfos) {
		this.deptName = deptName;
		this.userinfos = userinfos;
	}

	// Property accessors

	public Dept(int deptId, String deptName, Set userinfos) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.userinfos = userinfos;
	}

	public int getDeptId() {
		return this.deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set getUserinfos() {
		return this.userinfos;
	}

	public void setUserinfos(Set userinfos) {
		this.userinfos = userinfos;
	}

}