package com.demo.store.domain;

import javax.persistence.*;

import com.demo.store.storeApplication;

@Entity
public class Sale {

    @Id @GeneratedValue
    int saleId ;
    int orderNumber ;
    int storeId ;
    String storeName;
    String saleDtm ;


    public int getSaleId() {
        return saleId;
    }
    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }
       
    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
 
    public int getStoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
 
    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getSaleDtm() {
        return saleDtm;
    }
    public void setSaleDtm(String saleDtm) {
        this.saleDtm = saleDtm;
    }



    


}
