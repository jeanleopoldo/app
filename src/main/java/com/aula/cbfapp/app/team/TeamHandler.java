package com.aula.cbfapp.app.team;


import com.aula.cbfapp.app.cons.ConstantHolder;

public class TeamHandler {

    private Team teams[];


    public TeamHandler() {
        this.teams = new Team[ConstantHolder.getNumberOfTeams()];

        new TeamsCreation(this);
        new TeamsSetup(this);

    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public Team getTeam(String country) {

        Team team = null;

        for (int i = 0; i < teams.length; i++) {
            if (teams[i].getCountry() == country) {
                team = teams[i];
                return team;
            }
        }
        return team;
    }

    public Team[] getTeams() {
        return this.teams;
    }

    public Team getTeamById(int id) {

        Team team = null;
        for (int i = 0; i < this.teams.length; i++) {
            team = teams[i];
            if (team.getId() == id) {
                return team;
            }
        }
        return team;
    }

    public Team getTeam(int pos) {

        if (pos <= this.teams.length)
            return this.teams[pos];
        return null;
    }

    public Team getTeamByName(String name) {
        Team team;
        for (int i = 0; i < this.teams.length; i++) {
            team = teams[i];
            if (team.getCountry() == name) {
                return team;
            }
        }
        return null;
    }
}
