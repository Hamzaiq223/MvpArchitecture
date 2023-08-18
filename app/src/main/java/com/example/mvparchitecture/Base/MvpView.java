package com.example.mvparchitecture.Base;

import android.app.Activity;

public interface MvpView {
    Activity activity();

    void showLoading();

    void hideLoading();

    void onMarkNotificationAsReadSuccess(Object refreshToken);

    void onError(Throwable throwable);
}
