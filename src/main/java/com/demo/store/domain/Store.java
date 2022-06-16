package com.demo.store.domain;


import javax.persistence.*;

@Entity
public class Store {

    @Id @GeneratedValue
    int storeId;     

    String storeName;
    String passWd ;
    int tableCnt ;
   

    



    public int getTableCnt() {
        return tableCnt;
    }

    public void setTableCnt(int tableCnt) {
        this.tableCnt = tableCnt;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }





    
}