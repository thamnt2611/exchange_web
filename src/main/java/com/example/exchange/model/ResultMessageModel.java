package com.example.exchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultMessageModel {
    @JsonProperty(value = "isValid")
    private boolean isValid;

    @JsonProperty(value = "message")
    private String message = "";

    public ResultMessageModel(boolean isValid, String message) {
        this.isValid = isValid;
        this.message = message;
    }

    public ResultMessageModel() {

    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
