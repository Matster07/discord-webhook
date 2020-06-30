package com.darth.discordwebhook.components;

import java.util.List;


public class DiscordEmbed {

    private String title;
    private String url;
    private String description;
    private int color;
    private DiscordThumbnail thumbnail;
    private DiscordFooter footer;
    private List<DiscordField> fields;
    private DiscordImage image;
    private DiscordVideo video;

    public DiscordEmbed(String title,
                        String url,
                        String description,
                        int color,
                        DiscordFooter footer,
                        DiscordThumbnail thumbnail,
                        List<DiscordField> fields) {

        this.title = title;
        this.url = url;
        this.description = description;
        this.color = color;
        this.footer = footer;
        this.thumbnail = thumbnail;
        this.fields = fields;
    }

    public DiscordEmbed(String title,
                        String url,
                        String description,
                        int color,
                        DiscordFooter footer,
                        DiscordImage image,
                        List<DiscordField> fields) {

        this.title = title;
        this.url = url;
        this.description = description;
        this.color = color;
        this.footer = footer;
        this.image = image;
        this.fields = fields;
    }
    public DiscordEmbed(String title,
                        String url,
                        String description,
                        int color,
                        DiscordFooter footer,
                        DiscordVideo video,
                        List<DiscordField> fields) {

        this.title = title;
        this.url = url;
        this.description = description;
        this.color = color;
        this.footer = footer;
        this.video = video;
        this.fields = fields;
    }

    public DiscordEmbed(String title,
                        String url,
                        String description,
                        int color,
                        DiscordFooter footer,
                        DiscordThumbnail thumbnail,
                        DiscordImage image,
                        List<DiscordField> fields) {

        this.title = title;
        this.url = url;
        this.description = description;
        this.color = color;
        this.footer = footer;
        this.thumbnail = thumbnail;
        this.image = image;
        this.fields = fields;
    }

    public DiscordEmbed(String title,
                        String url,
                        String description,
                        int color,
                        DiscordFooter footer,
                        DiscordThumbnail thumbnail,
                        DiscordVideo video,
                        List<DiscordField> fields) {

        this.title = title;
        this.url = url;
        this.description = description;
        this.color = color;
        this.footer = footer;
        this.thumbnail = thumbnail;
        this.video = video;
        this.fields = fields;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public DiscordThumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(DiscordThumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public DiscordFooter getFooter() {
        return footer;
    }

    public void setFooter(DiscordFooter footer) {
        this.footer = footer;
    }

    public List<DiscordField> getFields() {
        return fields;
    }

    public void setFields(List<DiscordField> fields) {
        this.fields = fields;
    }

    public DiscordImage getImage() {
        return image;
    }

    public void setImage(DiscordImage image) {
        this.image = image;
    }

    public DiscordVideo getVideo() {
        return video;
    }

    public void setVideo(DiscordVideo video) {
        this.video = video;
    }
}
