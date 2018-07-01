package com.catikco.makepo.entity;

public class NewsWithBLOBs extends News {
    private String digest;

    private String content;

    private String views;

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views == null ? null : views.trim();
    }
}