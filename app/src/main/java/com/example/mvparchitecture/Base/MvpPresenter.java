package com.example.mvparchitecture.Base;

import android.app.Activity;

import com.example.mvparchitecture.MVPApplication;

public interface MvpPresenter <V extends MvpView>{

    Activity activity();

    MVPApplication appContext();

    void attachView(V mvpView);

    void detachView();


}
