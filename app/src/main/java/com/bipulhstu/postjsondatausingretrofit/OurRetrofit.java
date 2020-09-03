package com.bipulhstu.postjsondatausingretrofit;

import com.bipulhstu.postjsondatausingretrofit.DataSet;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

//this is the client part
public interface OurRetrofit {
    @POST("/post")
    Call<DataSet> SendPostRequest(@Body DataSet dataSet);
}
