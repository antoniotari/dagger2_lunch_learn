package com.antoniotari.dagger2_example;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;
import javax.inject.Named;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    @Inject @Named ("cached") OkHttpClient client;
    @Inject @Named("non_cached") OkHttpClient client2;
    @Inject SharedPreferences sharedPreferences;
    @Inject @ForApplication Context mApplicationContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApp) getApplication()).getNetComponent().inject(this);

        sharedPreferences.edit().putBoolean("bool", true).apply();
    }
}
