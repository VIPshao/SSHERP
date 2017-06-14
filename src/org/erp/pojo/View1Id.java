package org.erp.pojo;

/**
 * View1Id entity. @author MyEclipse Persistence Tools
 */

public class View1Id implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Integer deptId;
	private String deptName;
	private String userNum;
	private String userPass;
	private String userName;
	private Integer isDelete;

	// Constructors

	/** default constructor */
	public View1Id() {
	}

	/** minimal constructor */
	public View1Id(Integer userId) {
		this.userId = userId;
	}

	/** full constructor */
	public View1Id(Integer userId, Integer deptId, String deptName, String userNum, String userPass, String userName,
			Integer isDelete) {
		this.userId = userId;
		this.deptId = deptId;
		this.deptName = deptName;
		this.userNum = userNum;
		this.userPass = userPass;
		this.userName = userName;
		this.isDelete = isDelete;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof View1Id))
			return false;
		View1Id castOther = (View1Id) other;

		return ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
				&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())))
				&& ((this.getDeptId() == castOther.getDeptId()) || (this.getDeptId() != null
						&& castOther.getDeptId() != null && this.getDeptId().equals(castOther.getDeptId())))
				&& ((this.getDeptName() == castOther.getDeptName()) || (this.getDeptName() != null
						&& castOther.getDeptName() != null && this.getDeptName().equals(castOther.getDeptName())))
				&& ((this.getUserNum() == castOther.getUserNum()) || (this.getUserNum() != null
						&& castOther.getUserNum() != null && this.getUserNum().equals(castOther.getUserNum())))
				&& ((this.getUserPass() == castOther.getUserPass()) || (this.getUserPass() != null
						&& castOther.getUserPass() != null && this.getUserPass().equals(castOther.getUserPass())))
				&& ((this.getUserName() == castOther.getUserName()) || (this.getUserName() != null
						&& castOther.getUserName() != null && this.getUserName().equals(castOther.getUserName())))
				&& ((this.getIsDelete() == castOther.getIsDelete()) || (this.getIsDelete() != null
						&& castOther.getIsDelete() != null && this.getIsDelete().equals(castOther.getIsDelete())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result + (getDeptId() == null ? 0 : this.getDeptId().hashCode());
		result = 37 * result + (getDeptName() == null ? 0 : this.getDeptName().hashCode());
		result = 37 * result + (getUserNum() == null ? 0 : this.getUserNum().hashCode());
		result = 37 * result + (getUserPass() == null ? 0 : this.getUserPass().hashCode());
		result = 37 * result + (getUserName() == null ? 0 : this.getUserName().hashCode());
		result = 37 * result + (getIsDelete() == null ? 0 : this.getIsDelete().hashCode());
		return result;
	}

}