package com.example.mvparchitecture;

import android.app.Application;

public class MVPApplication extends Application {
    private static MVPApplication mInstance;

    public static synchronized MVPApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
}
