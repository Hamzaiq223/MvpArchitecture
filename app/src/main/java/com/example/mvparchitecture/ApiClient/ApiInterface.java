package com.example.mvparchitecture.ApiClient;

import com.example.mvparchitecture.Models.GetMessageResponse;
import com.example.mvparchitecture.Models.SendResponse;

import java.util.HashMap;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

public interface ApiInterface {
    @Multipart
    @POST("api/send/message")
    Observable<SendResponse> SendMessage(@PartMap HashMap<String, RequestBody> params, @Part MultipartBody.Part file1 , @Part MultipartBody.Part file);

    @FormUrlEncoded
    @POST("api/get/user/message")
    Observable<GetMessageResponse> GetMessage(@FieldMap HashMap<String, Object> params);

}
