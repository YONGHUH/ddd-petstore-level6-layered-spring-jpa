package com.demo.store.domain;

import javax.persistence.*;

@Entity
public class Salemenu {
    @Id @GeneratedValue
    Long id;
    String name;
    String amt ;
    
    public String getAmt() {
        return amt;
    }
    public void setAmt(String amt) {
        this.amt = amt;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
