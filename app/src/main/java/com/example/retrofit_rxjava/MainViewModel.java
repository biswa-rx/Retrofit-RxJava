package com.example.retrofit_rxjava;


import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.concurrent.Future;

import io.reactivex.rxjava3.core.Observable;

public class MainViewModel extends ViewModel {
    private static final String TAG = "biswa";
    private Repository repository;

    public MainViewModel() {
        repository = Repository.getInstance();
    }

    public Future<Observable<ResponseBody>> makeFutureQuery(){
        Log.d(TAG, "makeFutureQuery: ");
        return repository.makeFutureQuery();
    }
}