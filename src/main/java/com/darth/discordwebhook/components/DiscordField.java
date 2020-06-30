package com.darth.discordwebhook.components;

public class DiscordField {


    private String name;
    private String value;
    private boolean inline;

    public DiscordField(String name, String value, boolean inline) {
        this.name = name;
        this.value = value;
        this.inline = inline;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public boolean isInLine() {
        return inline;
    }

}