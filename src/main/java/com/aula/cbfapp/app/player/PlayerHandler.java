package com.aula.cbfapp.app.player;

import com.aula.cbfapp.app.cons.ConstantHolder;

public class PlayerHandler {

    private Player[] players;

    public PlayerHandler() {
        this.players = new Player[ConstantHolder.getNumberOfPlayers()];

        new PlayerCreation(this);
        new PlayerSetup(this);

    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Player[] getPlayers() {
        return players;
    }
    public Player[] getBrazilsPlayers() {
        Player players [] = new Player[ConstantHolder.getNumberOfPlayersPerTeam()];
        int index = 345;

        for (int i = 0; i < players.length; i++) {

            players[i] = this.players[index];
            index++;
        }

        return players;
    }
}