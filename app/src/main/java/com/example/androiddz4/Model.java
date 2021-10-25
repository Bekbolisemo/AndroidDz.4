package com.example.androiddz4;

public class Model {
    private String number;
    private String musicName;
    private String executor;
    private String time;

    public Model(String number, String musicName, String executor, String time) {
        this.number = number;
        this.musicName = musicName;
        this.executor = executor;
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
