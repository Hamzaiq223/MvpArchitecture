package com.example.mvparchitecture.Activites;

import com.example.mvparchitecture.Base.MvpView;
import com.example.mvparchitecture.Models.GetMessageResponse;

public interface MainActivityIView extends MvpView {
    void GetMessageSuccess(GetMessageResponse getMessageResponse);
}
