package com.example.githubapitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String apikey=BuildConfig.API_KEY;
        //String botkey=BuildConfig.BOT_KEY;
        String url=apikey+"aef2f0fc-e635-4531-bea5-506d612f0f42";
        System.out.println(url);
    }
}