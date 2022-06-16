package com.demo.store.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Menu {

    @Id @GeneratedValue
    Long id;
    
    String menuNm;
    String amt ;
    String prodId ;


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