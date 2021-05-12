package com.mju.lms.valueObject;

import com.mju.lms.model.MLecture;
import com.mju.lms.model.MModel;

import java.util.Objects;

public class OLecture extends OModel {

    private String id;
    private String name;
    private String lecturer;
    private String score;
    private String time;

    @Override
    public MModel toEntity() {
        return new MLecture(id, name, lecturer, score, time);
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
        return this.id + " " + this.name + " " + this.lecturer + " " + this.score + " " + this.time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OLecture oLecture = (OLecture) o;
        return Objects.equals(id, oLecture.id) && Objects.equals(name, oLecture.name) &&
                Objects.equals(lecturer, oLecture.lecturer) && Objects.equals(score, oLecture.score) &&
                Objects.equals(time, oLecture.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lecturer, score, time);
    }
}
