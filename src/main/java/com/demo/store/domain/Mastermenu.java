package com.demo.store.domain;

import javax.persistence.*;

import com.demo.store.storeApplication;

@Entity
public class Mastermenu {

    @Id @GeneratedValue
    int menuId;

    int storeId ;
    String menuNm;
    String amt ;
    int prodNm ;


    public int getProdNm() {
        return prodNm;
    }
    public void setProdNm(int prodNm) {
        this.prodNm = prodNm;
    }
    public int getStoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
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
