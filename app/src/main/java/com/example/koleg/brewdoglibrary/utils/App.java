package com.example.koleg.brewdoglibrary.utils;

import android.app.Application;
import android.content.Context;

import io.realm.Realm;

public class App extends Application{
    Context context = this;

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(context);



    }
}
