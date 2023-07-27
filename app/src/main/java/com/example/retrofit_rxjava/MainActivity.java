package com.example.retrofit_rxjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import android.util.Log;
import android.widget.TextView;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    //Ui
    TextView responseTextView;

    //vars
    private static final String TAG = "MainActivity";
    MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        responseTextView = findViewById(R.id.response_textview);

        MainViewModel viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.makeQuery().observe(this, new Observer<ResponseBody>() {
            @Override
            public void onChanged(ResponseBody responseBody) {
                Log.d(TAG, "onChanged: this is a live data response!");
                try {
                    Log.d(TAG, "onChanged: " + responseBody.getBody());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}