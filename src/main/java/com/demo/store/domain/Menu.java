package com.demo.store.domain;

import javax.persistence.*;

import com.demo.store.storeApplication;

@Entity
public class Menu {

    @Id @GeneratedValue
    Long id;
    
    String storeId ;

    String menuNm;
    String amt ;
    String prodId ;



    public String getStoreId() {
        return storeId;
    }
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }
    
    public String getProdId() {
        return prodId;
    }
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getMenuNm() {
        return menuNm;
    }
    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm;
    }

    public String getAmt() {
        return amt;
    }
    public void setAmt(String amt) {
        this.amt = amt;
    }

    


}
