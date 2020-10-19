package com.example.androgin;

public class SingerModel {
    private String singerName;
    private String song;


    public SingerModel(String singerName, String song) {
        this.singerName = singerName;
        this.song = song;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getSong() {
        return song;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
