package com.demo.store.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class foodProd {

    @Id @GeneratedValue
    Long id;
    
    String prodNm;
    int qty ;


    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public String getProdNm() {
        return prodNm;
    }
    public void setProdNm(String prodNm) {
        this.prodNm = prodNm;
    }





    
}