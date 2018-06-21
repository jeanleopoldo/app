package com.aula.cbfapp.app.schedule;

import com.aula.cbfapp.app.team.Team;

import java.util.ArrayList;

public class Group {

    private int id;
    private Team teams[];
    private ArrayList<Game> games;

    public Group(int numberOfGroup) {
        this.id = numberOfGroup;
        this.games = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Team[] getTeams() {
        return teams;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void addGame(Game game) {
        this.games.add(game);
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

}

