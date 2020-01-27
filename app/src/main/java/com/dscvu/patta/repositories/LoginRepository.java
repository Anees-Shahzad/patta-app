package com.dscvu.patta.repositories;

import android.content.Context;

import com.dscvu.patta.Listeners.LoginListener;
import com.dscvu.patta.models.Credentials;
import com.dscvu.patta.models.UserData;
import com.dscvu.patta.retrofit.Clients.LoginClient;
import com.dscvu.patta.retrofit.Objs.LoginObj;
import com.dscvu.patta.utils.RetrofitUtil;
import com.dscvu.patta.utils.URLs;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginRepository {


    private LoginRepository(Context context){

    }

    public static LoginRepository getInstance(Context context){
        return new LoginRepository(context);
    }

    public void loginUser(String email, String password, LoginListener loginListener){
        loginListener.onLoginStart();
        LoginClient loginClient = RetrofitUtil.retrofit.create(LoginClient.class);
        Call<LoginObj> call = loginClient.getLogin(new Credentials(email, password));
        call.enqueue(new Callback<LoginObj>() {
            @Override
            public void onResponse(Call<LoginObj> call, Response<LoginObj> response) {
                LoginObj loginObj = response.body();
                if (loginObj != null){
                    if (loginObj.getResponseCode().equals("201")){
                        UserData userData = loginObj.getResponse();
                        loginListener.onLoginSuccess();
                    } else {
                        loginListener.onLoginFailure(loginObj.getResponseCode());
                    }
                } else {
                    loginListener.onLoginFailure(response.message());
                }
            }

            @Override
            public void onFailure(Call<LoginObj> call, Throwable t) {
                loginListener.onLoginFailure(t.getMessage());
            }
        });
    }

}
