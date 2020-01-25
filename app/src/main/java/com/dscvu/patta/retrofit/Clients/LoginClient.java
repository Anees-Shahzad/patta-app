package com.dscvu.patta.retrofit.Clients;


import com.dscvu.patta.models.Credentials;
import com.dscvu.patta.retrofit.Objs.LoginObj;
import com.dscvu.patta.utils.URLs;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginClient {

    @POST(URLs.LOGIN_URL)
    Call<LoginObj> getLogin(@Body Credentials credentials);
}
