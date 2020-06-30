package com.darth.discordwebhook.components;

import com.google.gson.annotations.SerializedName;

public class DiscordThumbnail {

    @SerializedName("url")
    private String url;

    @SerializedName("proxy_url")
    private String proxyUrl;

    @SerializedName("height")
    private int height;

    @SerializedName("width")
    private int width;

    public DiscordThumbnail(String iconUrl, String proxyUrl, int height, int width) {
        this.url = iconUrl;
        this.proxyUrl = proxyUrl;
        this.height = height;
        this.width = width;
    }


    public String getThumbnailUrl() {
        return url;
    }

    public String getThumbnailProxyUrl() {
        return proxyUrl;
    }

    public int getThumbnailHeight() {
        return height;
    }

    public int getThumbnailWidth() {
        return width;
    }
}