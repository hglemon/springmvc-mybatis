package com.rlk.mi.entity;

import java.io.Serializable;

public class UserReclaim implements Serializable {

    private static final long serialVersionUID = -3833029667716343488L;
    private String token;
    private String email;
    private String date;

    public void setToken(String token){
        this.token = token;
    }
    public String getToken(){
        return token;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getDate(){
        return date;
    }
}
