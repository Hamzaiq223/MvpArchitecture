package com.example.mvparchitecture.Base;

import android.app.Activity;

import com.example.mvparchitecture.ApiClient.ApiClient;
import com.example.mvparchitecture.MVPApplication;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class BasePresenter <V extends MvpView> implements  MvpPresenter<V>{

    private final CompositeDisposable mCompositeDisposable;
    private V mMvpView;

    public BasePresenter() {
        mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    public Activity activity() {
        return getMvpView().activity();
    }

    @Override
    public MVPApplication appContext() {
        return MVPApplication.getInstance();
    }

    @Override
    public void attachView(V mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void detachView() {
        mCompositeDisposable.dispose();
        mMvpView = null;
    }

    public V getMvpView() {
        return mMvpView;
    }


    public CompositeDisposable getCompositeDisposable() {
        return mCompositeDisposable;
    }


}
