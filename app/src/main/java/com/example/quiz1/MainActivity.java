package com.example.quiz1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Adapter adapter = new Adapter();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);

        HttpBuilder.setupRetrofit().getNews(
                "myallies-breaking-news-v1.p.rapidapi.com",
                "0f9542e81emsh65ef1c06acf253dp1047abjsn2399b9dca684")
                .enqueue(new Callback<SampleData>() {
                    @Override
                    public void onResponse(Call<SampleData> call, Response<SampleData> response) {
                        adapter.setNewList(response.body().getData());
                    }

                    @Override
                    public void onFailure(Call<SampleData> call, Throwable t) {
                        t.printStackTrace();
                    }
                });
    }
}
