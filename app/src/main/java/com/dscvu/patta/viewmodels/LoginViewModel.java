package com.dscvu.patta.viewmodels;

import android.app.Application;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.dscvu.patta.Listeners.LoginListener;
import com.dscvu.patta.repositories.LoginRepository;

public class LoginViewModel extends AndroidViewModel {

    public String email = null;
    public String password = null;
    private LoginRepository loginRepository;
    public LoginListener loginListener;

    public LoginViewModel(@NonNull Application application) {
        super(application);
        loginRepository = LoginRepository.getInstance(application.getApplicationContext());
    }

    public void loginUser(View view){
        Log.d("test1", "func working");
        loginRepository.loginUser(email, password, loginListener);
    }
}
