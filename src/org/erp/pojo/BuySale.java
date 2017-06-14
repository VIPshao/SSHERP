package org.erp.pojo;



/**
 * BuySale entity. @author MyEclipse Persistence Tools
 */

public class BuySale  implements java.io.Serializable {


    // Fields    

     private BuySaleId id;


    // Constructors

    /** default constructor */
    public BuySale() {
    }

    
    /** full constructor */
    public BuySale(BuySaleId id) {
        this.id = id;
    }

   
    // Property accessors

    public BuySaleId getId() {
        return this.id;
    }
    
    public void setId(BuySaleId id) {
        this.id = id;
    }
   








}