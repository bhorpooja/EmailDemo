package com.codekul.EmailDemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by pooja on 29/11/17.
 */
@Entity
public class Stud {

    @Id
    Integer id;
    String name;
    String email;
    String pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
