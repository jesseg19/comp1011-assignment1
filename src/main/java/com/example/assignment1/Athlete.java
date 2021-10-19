package com.example.assignment1;

import java.util.Arrays;
import java.util.List;

public class Athlete {

    private String name, season;
    private int id, age, height;

    public Athlete(String name, int age, int height, String season) {
        setName(name);
        setAge(age);
        setHeight(height);
        setSeason(season);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 50) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Invalid height");
        }
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        List<String> validSeasons = Arrays.asList("summer", "winter");
        if (validSeasons.contains(season.toLowerCase())) {
            this.season = season;
        } else {
            throw new IllegalArgumentException("Invalid season, can only be summer or winter");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID must be greater than 0");
        }

    }
}
