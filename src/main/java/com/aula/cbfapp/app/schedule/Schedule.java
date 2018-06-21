package com.aula.cbfapp.app.schedule;

import com.aula.cbfapp.app.cons.ConstantHolder;
import com.aula.cbfapp.app.stadium.StadiumHandler;
import com.aula.cbfapp.app.table.Game;
import com.aula.cbfapp.app.table.Group;
import com.aula.cbfapp.app.table.KnockOutStage;
import com.aula.cbfapp.app.team.Team;
import com.aula.cbfapp.app.team.TeamHandler;

import java.util.ArrayList;

public class Schedule {

    private static final int NUMBER_OF_GROUPS = ConstantHolder.getNumberOfGroups();
    private static final int NUMBER_OF_KOs = ConstantHolder.getNumberOfKos();
    private static final int NUMBER_OF_TEAMS_PER_GROUP = ConstantHolder.getNumberOfTeamsPerGroup();
    private static final int NUMBER_OF_GAMES = ConstantHolder.getNumberOfGames();
    private static final int NUMBER_OF_TEAMS = ConstantHolder.getNumberOfTeams();
    private static final int NUMBER_OF_GAMES_GROUP = ConstantHolder.getNumberOfGamesGroup();
    private static final int NUMBER_OF_GAMES_1st_KOs = ConstantHolder.getNumberOfGames1stKos();
    private static final int NUMBER_OF_STADIUMS = ConstantHolder.getNumberOfStadiums();

    private Game games[];
    private Group groups[];
    private KnockOutStage KOs[];

    private TeamHandler th;
    private StadiumHandler sh;

    public Schedule() {

        groups = new Group[NUMBER_OF_GROUPS];
        games = new Game[NUMBER_OF_GAMES];
        KOs = new KnockOutStage[NUMBER_OF_KOs];
        th = new TeamHandler();
        sh = new StadiumHandler();

        run();
    }

    private void run() {
        createGames();
        setGamesData();
        createGroups();
        setGamesToGroups();
        setTeamsToGroups();
        setGamesToTeams();
    }

    private void setGamesData() {
        new PlaceGameData(this, this.sh);
    }

    private void setTeamsToGroups() {

        int groupId = 0;
        int teamId = 0;
        Group group;
        Team teams[] = null;
        Team team;

        for (int i = 0; i < NUMBER_OF_GROUPS; i++) {

            teams = new Team[NUMBER_OF_TEAMS_PER_GROUP];
            groupId++;
            group = getGroupById(groupId);

            for (int j = 0; j < NUMBER_OF_TEAMS_PER_GROUP; j++) {

                teamId++;
                team = th.getTeamById(teamId);
                teams[j] = team;

            }

            group.setTeams(teams);
        }

    }

    private void setGamesToTeams() {
        int groupId = 0;
        Group group = null;
        Team teams[];

        for (int i = 0; i < this.groups.length; i++) {
            groupId++;
            group = getGroupById(groupId);

            teams = group.getTeams();

            Team team1 = teams[0];
            Team team2 = teams[1];
            Team team3 = teams[2];
            Team team4 = teams[3];

            // Game1
            Game game1 = group.getGames().get(0);
            game1.setTeam1(team1);
            game1.setTeam2(team2);

            // Game2
            Game game2 = group.getGames().get(1);
            game2.setTeam1(team3);
            game2.setTeam2(team4);

            // Game3
            Game game3 = group.getGames().get(2);
            game3.setTeam1(team1);
            game3.setTeam2(team3);

            // Game4
            Game game4 = group.getGames().get(3);
            game4.setTeam1(team4);
            game4.setTeam2(team2);

            // Game5
            Game game5 = group.getGames().get(4);
            game5.setTeam1(team4);
            game5.setTeam2(team1);

            // Game6
            Game game6 = group.getGames().get(5);
            game6.setTeam1(team2);
            game6.setTeam2(team3);

        }

    }

    public Game getGameById(int id) {
        Game game = null;
        for (int i = 0; i < this.games.length; i++) {
            game = games[i];
            if (game.getId() == id) {
                return game;
            }
        }
        return game;
    }

    private void setGamesToGroups() {

        int groupId = 0;
        Game game;
        Group group;
        int tie = 1;

        for (int i = 0; i < NUMBER_OF_GAMES_GROUP; i++) {

            game = games[i];

            if (!nextGroup(i)) {

                game.setTie(tie);
                group = getGroupById(groupId);
                group.addGame(game);

            } else {

                groupId++;

                if (isBiggestGroup(groupId)) {

                    groupId = 1;
                    tie++;

                }

                game.setTie(tie);
                group = getGroupById(groupId);
                group.addGame(game);

            }

        }

    }

    private boolean isBiggestGroup(int i) {
        if (i > 8)
            return true;
        return false;
    }

    private boolean nextGroup(int i) {
        if (i % 2 == 0) {
            return true;
        }
        return false;
    }

    public Group getGroupById(int id) {
        Group group = null;
        for (int i = 0; i < NUMBER_OF_GROUPS; i++) {
            if (groups[i].getId() == id) {
                group = groups[i];
                return group;
            }
        }
        return group;
    }

    private void createGames() {
        Game game;
        int gameNumber = 1;
        for (int i = 0; i < NUMBER_OF_GAMES; i++) {
            game = new Game(gameNumber);
            games[i] = game;
            gameNumber++;
        }
    }

    private void createGroups() {

        Group group = null;
        int groupNumber = 1;

        for (int i = 0; i < NUMBER_OF_GROUPS; i++) {
            group = new Group(groupNumber);
            this.groups[i] = group;
            groupNumber++;
        }
    }

    public static int getNumberOfGroups() {
        return NUMBER_OF_GROUPS;
    }

    public static int getNumberOfKos() {
        return NUMBER_OF_KOs;
    }

    public static int getNumberOfTeamsPerGroup() {
        return NUMBER_OF_TEAMS_PER_GROUP;
    }

    public static int getNumberOfGames() {
        return NUMBER_OF_GAMES;
    }

    public static int getNumberOfTeams() {
        return NUMBER_OF_TEAMS;
    }

    public static int getNumberOfGamesGroup() {
        return NUMBER_OF_GAMES_GROUP;
    }

    public static int getNumberOfGames1stKos() {
        return NUMBER_OF_GAMES_1st_KOs;
    }

    public ArrayList<Game> getGamesByGroup(int id) {
        ArrayList<Game> games = null;
        Group group;
        for (int i = 0; i < this.NUMBER_OF_GROUPS; i++) {

            if (this.groups[i].getId() == id) {
                group = this.groups[i];
                games = group.getGames();
                return games;
            }
        }
        return games;
    }

    public Group[] getGroups() {
        return this.groups;
    }

    public Game[] getGames() {
        return this.games;
    }

    public static int getNumberOfStadiums() {
        return NUMBER_OF_STADIUMS;
    }
}

