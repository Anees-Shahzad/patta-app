package com.dscvu.patta.Listeners;

public interface LoginListener {
    void onLoginStart();
    void onLoginSuccess();
    void onLoginFailure(String error);
}
