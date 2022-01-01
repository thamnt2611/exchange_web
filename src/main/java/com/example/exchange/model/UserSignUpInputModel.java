package com.example.exchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserSignUpInputModel {
    @JsonProperty(value = "Email")
    private String email;

    @JsonProperty(value = "Password")
    private String password;

    @JsonProperty(value = "Username")
    private String username;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
