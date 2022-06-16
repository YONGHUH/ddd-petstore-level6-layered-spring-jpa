package com.demo.store.domain;

import javax.persistence.*;

import com.demo.store.storeApplication;

@Entity
public class Menu {

    @Id @GeneratedValue
    int menuId;

    int storeId ;
    String menuNm;
    String amt ;
    int prodId ;



    public String getProdNm() {
        return prodNm;
    }
    public void setProdNm(String prodNm) {
        this.prodNm = prodNm;
    }
    public String getStoreId() {
        return storeId;
    }
    public void setStoreId(String storeId) {
        this.storeId = storeId;
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
