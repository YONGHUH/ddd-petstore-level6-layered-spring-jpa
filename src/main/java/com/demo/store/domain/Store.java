package com.demo.store.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Store {

    @Id @GeneratedValue
    Long id;
    
    String storeName;
    String passWd ;
    int tableNo ;
   

    



    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
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