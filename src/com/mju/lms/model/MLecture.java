package com.mju.lms.model;

public class MLecture extends MModel {

    private String id;
    private String name;
    private String lecturer;
    private String score;
    private String time;

    public MLecture() {
    }

    public MLecture(String id, String name, String lecturer, String score, String time) {
        this.id = id;
        this.name = name;
        this.lecturer = lecturer;
        this.score = score;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + lecturer + " " + score + " " + time;
    }

}
