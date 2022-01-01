package com.example.exchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
// TODO : Khac voi frontend
public class UserSignInInputModel {
    @JsonProperty(value = "Username")
    private String userName;

    @JsonProperty(value = "Password")
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
