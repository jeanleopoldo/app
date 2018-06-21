package com.aula.cbfapp.app.table;

import com.aula.cbfapp.app.stadium.Stadium;
import com.aula.cbfapp.app.team.Team;

public class Game {

    private int id;
    private int tie;
    private Team team1;
    private Team team2;
    private Stadium stadium;
    private String time;
    private int result[];

    public Game(int id, Team team1, Team team2, Stadium stadium, String time) {
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;
        this.stadium = stadium;
        this.time = time;
        this.result = new int[2];
    }

    public Game(int id) {
        this.id = id;
        this.result = new int[2];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTie() {
        return tie;
    }

    public void setTie(int tie) {
        this.tie = tie;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public String getTime() {
        return time;
    }


    public void setTime(int hour, String weekDay, int month, int day) {

        this.time = hour+":00, "+weekDay+", "+day+"/"+month;
    }

    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }

    public String getResultString() {
        if (result != null)
            return this.result[0] + " x " + this.result[1];
        return null;
    }
}
