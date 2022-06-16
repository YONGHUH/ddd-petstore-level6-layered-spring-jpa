package com.demo.store.domain;

import javax.persistence.*;

import com.demo.store.storeApplication;

@Entity
public class Foodprod {

    @Id @GeneratedValue
    int prodId ;
    int storeId ;
    String prodNm ;
    int qty;

    public int getProdId() {
        return prodId;
    }
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getStoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
 
    public String getProdNm() {
        return prodNm;
    }
    public void setProdNm(String prodNm) {
        this.prodNm = prodNm;
    }

    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }




}
