package org.erp.pojo;

/**
 * ProSup entity. @author MyEclipse Persistence Tools
 */

public class ProSup implements java.io.Serializable {

	// Fields

	private int proSupId;
	private Pro pro;
	private Sup sup;

	// Constructors

	/** default constructor */
	public ProSup() {
	}

	/** full constructor */
	public ProSup(Pro pro, Sup sup) {
		this.pro = pro;
		this.sup = sup;
	}

	// Property accessors

	public int getProSupId() {
		return this.proSupId;
	}

	public void setProSupId(int proSupId) {
		this.proSupId = proSupId;
	}

	public Pro getPro() {
		return this.pro;
	}

	public void setPro(Pro pro) {
		this.pro = pro;
	}

	public Sup getSup() {
		return this.sup;
	}

	public void setSup(Sup sup) {
		this.sup = sup;
	}

}