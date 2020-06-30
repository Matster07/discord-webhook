package com.darth.discordwebhook.components;

import com.google.gson.annotations.SerializedName;

public class DiscordVideo {

    @SerializedName("url")
    private String url;


    @SerializedName("height")
    private int height;

    @SerializedName("width")
    private int width;

    public DiscordVideo(String iconUrl, int height, int width) {
        this.url = iconUrl;
        this.height = height;
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}