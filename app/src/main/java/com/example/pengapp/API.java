package com.example.pengapp;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
public class API {
    @POST("register")
    Call<ResponseBody> createUser(
            @Body User user
    );
    @POST("login")
    Call<ResponseBody> checkUser(
            @Body User user
    );
}
