package com.manage.anodev.inoutcome.userauthentication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by GEEKS 1 on 10/28/2016.
 */

public interface UserApi {
    //register
    @POST("/users")
    Call<User> saveUser(@Body User user);
    //login
    @POST("/users")
    Call<User> loginUser(@Body User user);
    //login with get
    @GET("/users/auth")
    Call<User> getUser();
}
