package com.darth.discordwebhook;

import com.darth.discordwebhook.components.DiscordFooter;
import com.google.gson.Gson;
import com.darth.discordwebhook.components.DiscordEmbed;
import com.darth.discordwebhook.components.DiscordField;
import com.darth.discordwebhook.components.DiscordThumbnail;
import kong.unirest.Unirest;
import java.util.List;

public class DiscordWebhook {

    private List<DiscordEmbed> embeds;
    private DiscordFooter footer;
    private List<DiscordField> fields;
    private DiscordThumbnail thumbnail;
    private String content;
    private String username;
    private String avatar_url;

    public DiscordWebhook(String content, String username, String avatar_url, List<DiscordEmbed> embeds, String webhookUrl) {
        this.content = content;
        this.username = username;
        this.avatar_url = avatar_url;
        this.embeds = embeds;
        Gson gson = new Gson();
        Unirest.post(webhookUrl)
                .header("Content-Type", "application/json")
                .body(gson.toJson(this))
                .asEmpty();
    }

}