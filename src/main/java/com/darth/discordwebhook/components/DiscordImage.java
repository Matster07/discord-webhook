package com.darth.discordwebhook.components;

import com.google.gson.annotations.SerializedName;

public class DiscordImage {

    @SerializedName("url")
    private String url;

    @SerializedName("proxy_url")
    private String proxyUrl;

    @SerializedName("height")
    private int height;

    @SerializedName("width")
    private int width;

    public DiscordImage(String imageUrl, String proxyUrl, int height, int width) {
        this.url = imageUrl;
        this.proxyUrl = proxyUrl;
        this.height = height;
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProxyUrl() {
        return proxyUrl;
    }

    public void setProxyUrl(String proxyUrl) {
        this.proxyUrl = proxyUrl;
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