package com.dscvu.patta.retrofit.Objs;

import com.dscvu.patta.models.UserData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginObj {

    @Expose
    private String responseCode;

    @SerializedName("response")
    @Expose
    private UserData response;

    public LoginObj(String responseCode, UserData response) {
        this.responseCode = responseCode;
        this.response = response;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public UserData getResponse() {
        return response;
    }

    public void setResponse(UserData response) {
        this.response = response;
    }
}
