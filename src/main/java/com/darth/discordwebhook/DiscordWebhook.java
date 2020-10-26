package com.darth.discordwebhook;

import com.darth.discordwebhook.components.DiscordEmbed;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import okhttp3.*;

import java.io.IOException;
import java.util.List;

public class DiscordWebhook {

    private final String content;
    private final String username;

    @SerializedName("avatar_url")
    private final String avatarUrl;

    private final List<DiscordEmbed> embeds;

    public DiscordWebhook(String content, String username, String avatarUrl, List<DiscordEmbed> embeds) {
        this.content = content;
        this.username = username;
        this.avatarUrl = avatarUrl;
        this.embeds = embeds;
    }

    public Response execute(String webhookUrl) throws IOException {
        OkHttpClient client = new OkHttpClient();
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");

        RequestBody body = RequestBody.create(new Gson().toJson(this), JSON);

        Request request = new Request.Builder()
                .url(webhookUrl)
                .post(body)
                .build();


        return client.newCall(request).execute();
    }

    public String getContent() {
        return content;
    }

    public String getUsername() {
        return username;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public List<DiscordEmbed> getEmbeds() {
        return embeds;
    }
}