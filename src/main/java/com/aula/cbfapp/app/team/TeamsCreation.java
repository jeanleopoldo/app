package com.aula.cbfapp.app.team;

import com.aula.cbfapp.app.cons.ConstantHolder;
import com.aula.cbfapp.app.player.Player;
import com.aula.cbfapp.app.player.PlayerHandler;

public class TeamsCreation {

    private TeamHandler th;
    private PlayerHandler ph;

    public TeamsCreation(TeamHandler th) {
        this.th = th;
        this.ph = new PlayerHandler();
        run();
        new TeamsSetup(th);
    }

    private void run() {
        this.createTeams();
        this.addPlayersToTeams();
    }

    private void addPlayersToTeams() {

        Team team;
        Player player;
        Player[] teamPlayers = ph.getPlayers();
        int playerId = 0;


        for (int i = 0; i < ConstantHolder.getNumberOfTeams(); i++) {

            team = this.th.getTeams()[i];
            teamPlayers = new Player[ConstantHolder.getNumberOfPlayersPerTeam()];

            for (int j = 0; j < ConstantHolder.getNumberOfPlayersPerTeam(); j++) {

                player = this.ph.getPlayers()[playerId];
                teamPlayers[j] = player;
                playerId++;
            }

        }
    }

    private boolean isNextTeam(int j) {

        if (j % ConstantHolder.getNumberOfPlayersPerTeam() == 0 && j != 0) {
            return true;
        }
        return false;
    }

    private void createTeams() {
        Team[] teams = new Team[32];
        Team team;
        String name = "Confederation";
        String country = "Country";
        int id = 1;
        for (int i = 0; i < th.getTeams().length; i++) {
            team = new Team(id, name, country);
            teams[i] = team;
            id++;
        }

        this.th.setTeams(teams);
    }

}


