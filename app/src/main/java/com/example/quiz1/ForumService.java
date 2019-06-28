package com.example.quiz1;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface ForumService {

    @GET("GetTopNews")
    public Call<SampleData> getNews(@Header("X-RapidAPI-Host") String host,
                                    @Header("X-RapidAPI-Key") String key);
}
