package com.catikco.makepo.entity;

public class CyclopediaWithBLOBs extends Cyclopedia {
    private String digest;

    private String content;

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
}