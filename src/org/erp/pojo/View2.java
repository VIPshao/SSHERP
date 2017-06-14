package org.erp.pojo;

/**
 * View2 entity. @author MyEclipse Persistence Tools
 */

public class View2 implements java.io.Serializable {

	// Fields

	private View2Id id;

	// Constructors

	/** default constructor */
	public View2() {
	}

	/** full constructor */
	public View2(View2Id id) {
		this.id = id;
	}

	// Property accessors

	public View2Id getId() {
		return this.id;
	}

	public void setId(View2Id id) {
		this.id = id;
	}

}