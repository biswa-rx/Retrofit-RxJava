package com.example.retrofit_rxjava;

import android.arch.lifecycle.LiveData;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private Repository repository;

    public MainViewModel() {
        repository = Repository.getInstance();
    }

    public LiveData<ResponseBody> makeQuery(){
        return repository.makeReactiveQuery();
    }
}