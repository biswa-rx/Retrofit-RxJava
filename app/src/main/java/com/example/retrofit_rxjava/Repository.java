package com.example.retrofit_rxjava;


import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.LiveDataReactiveStreams;

import io.reactivex.schedulers.Schedulers;

public class Repository {
    private static Repository instance;

    public static Repository getInstance(){
        if(instance == null){
            instance = new Repository();
        }
        return instance;
    }


    public LiveData<ResponseBody> makeReactiveQuery(){
        return LiveDataReactiveStreams.fromPublisher(ServiceGenerator.getRequestApi()
                .makeQuery()
                .subscribeOn(Schedulers.io()));
    }

}
