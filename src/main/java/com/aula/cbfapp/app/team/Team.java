package com.aula.cbfapp.app.team;

import com.aula.cbfapp.app.player.Player;
import com.aula.cbfapp.app.schedule.Game;

import java.util.ArrayList;

public class Team {

    private int id;
    private String name;
    private String country;
    private Player players[];
    private ArrayList <Game> games;

    public Team(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.players = new Player[23];
        this.games = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public void addPlayer(Player player) {

        int pos = player.getId();

        if (pos < 23) {
            this.players[pos] = player;
        }
    }

    public void addGame(Game game) {
        this.games.add(game);
    }

    public ArrayList<Game>getGames() {
        return this.games;
    }
}
