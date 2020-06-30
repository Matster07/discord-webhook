package com.darth.discordwebhook.components;

import com.google.gson.annotations.SerializedName;

public class DiscordFooter {


    @SerializedName("icon_url")
    private String iconUrl;

    @SerializedName("text")
    private String text;

    @SerializedName("proxy_icon_url")
    private String proxyIconUrl;

    public DiscordFooter(String iconUrl, String footerText, String proxyIconUrl) {
        this.iconUrl = iconUrl;
        this.text = footerText;
        this.proxyIconUrl = proxyIconUrl;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getText() {
        return text;
    }

    public String getProxyIconUrl() {
        return proxyIconUrl;
    }
}
