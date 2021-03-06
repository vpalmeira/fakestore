package com.fakestore.mobile.service.login;

import com.fakestore.mobile.model.TestValue;

import com.fakestore.mobile.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserClient {

    @GET("/api/values")
    Call<List<TestValue>> getValues(

            @Header("Authorization")
            String authHeader
    );

    @POST("/api/account/login")
    Call<User> login(

            @Body
            User user
    );
}
