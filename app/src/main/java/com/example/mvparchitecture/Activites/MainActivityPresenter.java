package com.example.mvparchitecture.Activites;

import com.example.mvparchitecture.ApiClient.ApiClient;
import com.example.mvparchitecture.Base.BasePresenter;
import com.example.mvparchitecture.Base.MvpView;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivityPresenter <V extends MainActivityIView & MvpView> extends BasePresenter<V> implements MainActivityIPresenter<V> {


    @Override
    public void GetMessage(HashMap<String, Object> params) {
        getCompositeDisposable().add(ApiClient
                .getAPIClient()
                .GetMessage(params)
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(getMvpView()::GetMessageSuccess, getMvpView()::onError));
    }
}
