package com.example.quiz1;

import com.google.gson.annotations.SerializedName;

public class News {
    @SerializedName("ID")
    private int id;
    @SerializedName("MainTitle")
    private String mainTitle;
    @SerializedName("Description")
    private String description;
    @SerializedName("ArticleImageUrl")
    private String articleImageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArticleImageUrl() {
        return articleImageUrl;
    }
}
