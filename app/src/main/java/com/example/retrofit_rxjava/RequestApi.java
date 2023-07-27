package com.example.retrofit_rxjava;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface RequestApi {
    @GET("posts/1")
    Flowable<ResponseBody> makeQuery();
}
