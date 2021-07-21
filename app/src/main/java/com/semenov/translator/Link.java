package com.semenov.translator;

import java.util.Map;

import retrofit.Call;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface Link {
    @FormUrlEncoded
    @POST("/user/edit")
    Call<Object> translate(@FieldMap Map<String, String> map);
}
