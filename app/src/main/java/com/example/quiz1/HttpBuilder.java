package com.example.quiz1;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpBuilder {

    private static OkHttpClient setupOkhttp() {
        return new OkHttpClient().newBuilder()
                .addInterceptor(getInterceptor())
                .build();
    }

    private static HttpLoggingInterceptor getInterceptor() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        return logging;
    }

    public static ForumService setupRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://myallies-breaking-news-v1.p.rapidapi.com/")
                .client(setupOkhttp())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(ForumService.class);
    }
}
