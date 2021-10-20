package com.example.assignment1;

public class Athlete {

    private int athleteId;
    private String name, age, height, games, sport, medal;

    public Athlete(String name, String age, String height, String games, String sport, String medal) {
        setName(name);
        setAge(age);
        setHeight(height);
        setGames(games);
        setSport(sport);
        setMedal(medal);
        athleteId = 0;
    }

    public int getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(int athleteId) {
        if (athleteId > 0) {
            this.athleteId = athleteId;
        } else {
            throw new IllegalArgumentException("athleteId must be greater than 0");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getMedal() {
        return medal;
    }

    public void setMedal(String medal) {
        this.medal = medal;
    }
}
