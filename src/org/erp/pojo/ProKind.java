package org.erp.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * ProKind entity. @author MyEclipse Persistence Tools
 */

public class ProKind implements java.io.Serializable {

	// Fields

	private int proKindId;
	private String proKindName;
	private Integer isDelete;
	private Set pros = new HashSet(0);

	// Constructors

	/** default constructor */
	public ProKind() {
	}

	/** full constructor */
	public ProKind(String proKindName, Integer isDelete, Set pros) {
		this.proKindName = proKindName;
		this.isDelete = isDelete;
		this.pros = pros;
	}

	// Property accessors

	public ProKind(int proKindId, String proKindName, Integer isDelete, Set pros) {
		super();
		this.proKindId = proKindId;
		this.proKindName = proKindName;
		this.isDelete = isDelete;
		this.pros = pros;
	}

	public int getProKindId() {
		return this.proKindId;
	}

	public void setProKindId(int proKindId) {
		this.proKindId = proKindId;
	}

	public String getProKindName() {
		return this.proKindName;
	}

	public void setProKindName(String proKindName) {
		this.proKindName = proKindName;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Set getPros() {
		return this.pros;
	}

	public void setPros(Set pros) {
		this.pros = pros;
	}

}