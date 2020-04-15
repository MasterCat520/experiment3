package com.example.demo.model;

public class Task {
    private int id;
    private String introduce;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Task(int id, String introduce) {
        this.id = id;
        this.introduce = introduce;
    }
}
