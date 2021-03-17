package com.example.aflkg;

public class DataModel {

    private int num;
    private String team;
    private int games;
    private int win;
    private int draw;
    private int loss;
    private int goals;
    private int points;

    public DataModel(int num, String team, int games, int win, int draw, int loss, int goals, int points) {
        this.num = num;
        this.team = team;
        this.games = games;
        this.win = win;
        this.draw = draw;
        this.loss = loss;
        this.goals = goals;
        this.points = points;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
