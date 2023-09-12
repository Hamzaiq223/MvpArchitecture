package com.example.mvparchitecture.Activites;

import com.example.mvparchitecture.Base.MvpPresenter;
import com.example.mvparchitecture.Base.MvpView;

import java.util.HashMap;

public interface MainActivityIPresenter <V extends MainActivityIView & MvpView> extends MvpPresenter<V> {
    void GetMessage( HashMap<String, Object> params);
}
