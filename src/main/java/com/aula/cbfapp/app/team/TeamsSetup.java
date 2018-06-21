package com.aula.cbfapp.app.team;

public class TeamsSetup {

    private TeamHandler th;

    public TeamsSetup(TeamHandler th) {
        this.th = th;
        setTeams();
    }

    // 23 teams to create :'(

    public void setTeams() {
        Team team;

        // ######################################
        // Group A

        team = this.th.getTeam(0);
        team.setCountry("Russia");
        team.setName("R.F.S.");

        team = this.th.getTeam(1);
        team.setCountry("Saudi Arabia");
        team.setName("S.A.F.F.");

        team = this.th.getTeam(2);
        team.setCountry("Egypt");
        team.setName("E.F.A.");

        team = this.th.getTeam(3);
        team.setCountry("Uruguay");
        team.setName("A.U.F.");

        // ######################################
        // Group B
        team = this.th.getTeam(4);
        team.setCountry("Portugal");
        team.setName("F.P.F.");

        team = this.th.getTeam(5);
        team.setCountry("Spain");
        team.setName("R.F.E.F.");

        team = this.th.getTeam(6);
        team.setCountry("Morocco");
        team.setName("F.R.M.F.");

        team = this.th.getTeam(7);
        team.setCountry("Iran");
        team.setName("F.F.I.R.I.");

        // ######################################
        // Group C
        team = this.th.getTeam(8);
        team.setCountry("France");
        team.setName("F.F.F.");

        team = this.th.getTeam(9);
        team.setCountry("Australia");
        team.setName("F.F.A.");

        team = this.th.getTeam(10);
        team.setCountry("Peru");
        team.setName("F.P.F.");

        team = this.th.getTeam(11);
        team.setCountry("Denmark");
        team.setName("D.B.U.");

        // ######################################
        // Group D
        team = this.th.getTeam(12);
        team.setCountry("Argentina");
        team.setName("A.F.A.");

        team = this.th.getTeam(13);
        team.setCountry("Iceland");
        team.setName("K.S.Í.");

        team = this.th.getTeam(14);
        team.setCountry("Croatia");
        team.setName("C.F.F.");

        team = this.th.getTeam(15);
        team.setCountry("Nigeria");
        team.setName("N.F.F.");

        // ######################################
        // Group E
        team = this.th.getTeam(16);
        team.setCountry("Brazil");
        team.setName("C.B.F.");

        team = this.th.getTeam(17);
        team.setCountry("Switzerland");
        team.setName("S.F.A.");

        team = this.th.getTeam(18);
        team.setCountry("Costa Rica");
        team.setName("F.C.F.");

        team = this.th.getTeam(19);
        team.setCountry("Serbia");
        team.setName("F.A.S.");

        // ######################################
        // Group F
        team = this.th.getTeam(20);
        team.setCountry("Germany");
        team.setName("D.F.B.");

        team = this.th.getTeam(21);
        team.setCountry("Mexico");
        team.setName("F.M.F.");

        team = this.th.getTeam(22);
        team.setCountry("Sweden");
        team.setName("Sv.F.F.");

        team = this.th.getTeam(23);
        team.setCountry("South Korea");
        team.setName("K.F.A.");

        // ######################################
        // Group G
        team = this.th.getTeam(24);
        team.setCountry("Belgium");
        team.setName("K.B.V.B.");

        team = this.th.getTeam(25);
        team.setCountry("Panama");
        team.setName("P.F.F.");

        team = this.th.getTeam(26);
        team.setCountry("Tunisia");
        team.setName("T.F.F.");

        team = this.th.getTeam(27);
        team.setCountry("England");
        team.setName("F.A.");

        // ######################################
        // Group H
        team = this.th.getTeam(28);
        team.setCountry("Poland");
        team.setName("P.F.A.");

        team = this.th.getTeam(29);
        team.setCountry("Senegal");
        team.setName("F.S.F.");

        team = this.th.getTeam(30);
        team.setCountry("Colombia");
        team.setName("F.C.F.");

        team = this.th.getTeam(31);
        team.setCountry("Japan");
        team.setName("J.F.A.");
    }

}

