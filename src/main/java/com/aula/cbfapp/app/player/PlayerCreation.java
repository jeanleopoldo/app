package com.aula.cbfapp.app.player;

public class PlayerCreation {

    private PlayerHandler ph;

    public PlayerCreation(PlayerHandler ph) {
        this.ph = ph;
        run();

    }

    public void run() {

        Player[] players = new Player[this.ph.getPlayers().length];
        Player player;
        int playerId = 1;

        for (int i = 0; i < players.length; i++) {

            player = new Player(playerId, "Player " + playerId, "Player " + playerId, 0, null, null, 0);
            players[i] = player;
            playerId++;

        }
        this.ph.setPlayers(players);
    }
}
