package com.example.retrofit_rxjava;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface RequestApi {

    @GET("/posts/1")
    Observable<ResponseBody> makeObservableQuery();
}
