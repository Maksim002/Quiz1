package com.example.quiz1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView title;
    private TextView description;

    public ViewHolder(View view) {
        super(view);
        imageView = view.findViewById(R.id.imageView);
        title = view.findViewById(R.id.titleTextView);
        description = view.findViewById(R.id.descriptionTextView);
    }

    public void bind(News value) {
        Glide.with(itemView)
        .load(value.getArticleImageUrl())
        .apply(new RequestOptions().circleCrop())
        .into(imageView);

        title.setText(value.getMainTitle());
        description.setText(value.getDescription());
    }
}
