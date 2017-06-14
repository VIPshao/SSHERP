package org.erp.pojo;

/**
 * DetailBuyView entity. @author MyEclipse Persistence Tools
 */

public class DetailBuyView implements java.io.Serializable {

	// Fields

	private DetailBuyViewId id;

	// Constructors

	/** default constructor */
	public DetailBuyView() {
	}

	/** full constructor */
	public DetailBuyView(DetailBuyViewId id) {
		this.id = id;
	}

	// Property accessors

	public DetailBuyViewId getId() {
		return this.id;
	}

	public void setId(DetailBuyViewId id) {
		this.id = id;
	}

}