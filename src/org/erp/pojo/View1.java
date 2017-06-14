package org.erp.pojo;

/**
 * View1 entity. @author MyEclipse Persistence Tools
 */

public class View1 implements java.io.Serializable {

	// Fields

	private View1Id id;

	// Constructors

	/** default constructor */
	public View1() {
	}

	/** full constructor */
	public View1(View1Id id) {
		this.id = id;
	}

	// Property accessors

	public View1Id getId() {
		return this.id;
	}

	public void setId(View1Id id) {
		this.id = id;
	}

}