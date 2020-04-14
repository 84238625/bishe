package com.sjj.bishe.pojo;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "supplier")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "coname")
    String coname;
    String cophone;
    String coaddress;
    String cocredibility;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConame() {
        return coname;
    }

    public void setConame(String coname) {
        this.coname = coname;
    }

    public String getCophone() {
        return cophone;
    }

    public void setCophone(String cophone) {
        this.cophone = cophone;
    }

    public String getCoaddress() {
        return coaddress;
    }

    public void setCoaddress(String coaddress) {
        this.coaddress = coaddress;
    }

    public String getCocredibility() {
        return cocredibility;
    }

    public void setCocredibility(String cocredibility) {
        this.cocredibility = cocredibility;
    }
}
