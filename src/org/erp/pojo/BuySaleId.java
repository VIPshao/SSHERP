package org.erp.pojo;

import java.util.Date;


/**
 * BuySaleId entity. @author MyEclipse Persistence Tools
 */

public class BuySaleId  implements java.io.Serializable {


    // Fields    
	private Integer clearId;
     private Integer proId;
     private String proName;
     private String proKindName;
     private Integer realNum;
     private String userName;
     private Date clearDate;
     private Integer isDelete;


    // Constructors

    /** default constructor */
    public BuySaleId() {
    }

	/** minimal constructor */
    public BuySaleId(Integer proId) {
        this.proId = proId;
    }
    
    /** full constructor */
    public BuySaleId(Integer clearId,Integer proId, String proName, String proKindName, Integer realNum, String userName, Date clearDate, Integer isDelete) {
        this.clearId = clearId;
    	this.proId = proId;
        this.proName = proName;
        this.proKindName = proKindName;
        this.realNum = realNum;
        this.userName = userName;
        this.clearDate = clearDate;
        this.isDelete = isDelete;
    }

   
    // Property accessors

    public Integer getProId() {
        return this.proId;
    }
    
    public Integer getClearId() {
		return clearId;
	}

	public void setClearId(Integer clearId) {
		this.clearId = clearId;
	}

	public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return this.proName;
    }
    
    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProKindName() {
        return this.proKindName;
    }
    
    public void setProKindName(String proKindName) {
        this.proKindName = proKindName;
    }

    public Integer getRealNum() {
        return this.realNum;
    }
    
    public void setRealNum(Integer realNum) {
        this.realNum = realNum;
    }

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getClearDate() {
        return this.clearDate;
    }
    
    public void setClearDate(Date clearDate) {
        this.clearDate = clearDate;
    }

    public Integer getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BuySaleId) ) return false;
		 BuySaleId castOther = ( BuySaleId ) other; 
         
		 return ( (this.getProId()==castOther.getProId()) || ( this.getProId()!=null && castOther.getProId()!=null && this.getProId().equals(castOther.getProId()) ) )
 && ( (this.getProName()==castOther.getProName()) || ( this.getProName()!=null && castOther.getProName()!=null && this.getProName().equals(castOther.getProName()) ) )
 && ( (this.getProKindName()==castOther.getProKindName()) || ( this.getProKindName()!=null && castOther.getProKindName()!=null && this.getProKindName().equals(castOther.getProKindName()) ) )
 && ( (this.getRealNum()==castOther.getRealNum()) || ( this.getRealNum()!=null && castOther.getRealNum()!=null && this.getRealNum().equals(castOther.getRealNum()) ) )
 && ( (this.getUserName()==castOther.getUserName()) || ( this.getUserName()!=null && castOther.getUserName()!=null && this.getUserName().equals(castOther.getUserName()) ) )
 && ( (this.getClearDate()==castOther.getClearDate()) || ( this.getClearDate()!=null && castOther.getClearDate()!=null && this.getClearDate().equals(castOther.getClearDate()) ) )
 && ( (this.getIsDelete()==castOther.getIsDelete()) || ( this.getIsDelete()!=null && castOther.getIsDelete()!=null && this.getIsDelete().equals(castOther.getIsDelete()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getProId() == null ? 0 : this.getProId().hashCode() );
         result = 37 * result + ( getProName() == null ? 0 : this.getProName().hashCode() );
         result = 37 * result + ( getProKindName() == null ? 0 : this.getProKindName().hashCode() );
         result = 37 * result + ( getRealNum() == null ? 0 : this.getRealNum().hashCode() );
         result = 37 * result + ( getUserName() == null ? 0 : this.getUserName().hashCode() );
         result = 37 * result + ( getClearDate() == null ? 0 : this.getClearDate().hashCode() );
         result = 37 * result + ( getIsDelete() == null ? 0 : this.getIsDelete().hashCode() );
         return result;
   }   





}