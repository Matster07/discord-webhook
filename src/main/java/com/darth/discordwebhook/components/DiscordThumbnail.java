package com.darth.discordwebhook.components;

import com.google.gson.annotations.SerializedName;

public class DiscordThumbnail {

    @SerializedName("url")
    private final String url;

    @SerializedName("proxy_url")
    private final String proxyUrl;

    @SerializedName("height")
    private final int height;

    @SerializedName("width")
    private final int width;

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