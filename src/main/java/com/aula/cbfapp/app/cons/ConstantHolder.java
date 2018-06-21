package com.aula.cbfapp.app.cons;

public final class ConstantHolder {

    private static final int NUMBER_OF_GROUPS = 8;
    private static final int NUMBER_OF_KOs = 5;
    private static final int NUMBER_OF_TEAMS_PER_GROUP = 4;
    private static final int NUMBER_OF_GAMES = 64;
    private static final int NUMBER_OF_TEAMS = 32;
    private static final int NUMBER_OF_GAMES_GROUP = 48;
    private static final int NUMBER_OF_GAMES_1st_KOs = 8;
    private static final int NUMBER_OF_PLAYERS_PER_TEAM = 23;
    private static final int NUMBER_OF_STADIUMS = 12;
    private static final int NUMBER_OF_PLAYERS = NUMBER_OF_TEAMS * NUMBER_OF_PLAYERS_PER_TEAM;

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

    public static int getNumberOfPlayersPerTeam() {
        return NUMBER_OF_PLAYERS_PER_TEAM;
    }

    public static int getNumberOfStadiums() {
        return NUMBER_OF_STADIUMS;
    }

    public static int getNumberOfPlayers() {

        return NUMBER_OF_PLAYERS;

    }

}
