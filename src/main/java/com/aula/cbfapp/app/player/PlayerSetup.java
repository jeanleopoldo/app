package com.aula.cbfapp.app.player;

public class PlayerSetup {

    private PlayerHandler ph;

    public PlayerSetup(PlayerHandler ph) {
        this.ph = ph;
        this.run();
    }

    private void run() {
        this.createBrazilPlayers();
    }

    private void createBrazilPlayers() {
        Player player;

        int i = 345;

        // GK

        //0
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(1);
        player.setFullName("Alisson Ramses Becker");
        player.setNickName("Alisson");
        player.setAge(25);
        player.setWikiPage("https://en.wikipedia.org/wiki/Alisson_(footballer,_born_1992)");
        player.setClub("A.S. Roma");
        i++;

        //1
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(16);
        player.setFullName("Cassio Ramos");
        player.setNickName("Cassio");
        player.setAge(31);
        player.setWikiPage("https://en.wikipedia.org/wiki/C%C3%A1ssio_Ramos");
        player.setClub("S.C. Corinthians P.");
        i++;

        //2
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(23);
        player.setFullName("Ederson Moraes");
        player.setNickName("Ederson");
        player.setAge(24);
        player.setWikiPage("https://en.wikipedia.org/wiki/Ederson_Moraes");
        player.setClub("Manchester City F.C.");
        i++;



        //#################################################
        //DF


        //3
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(2);
        player.setFullName("Thiago Emiliano Silva");
        player.setNickName("Thiago Silva");
        player.setAge(33);
        player.setWikiPage("https://en.wikipedia.org/wiki/Thiago_Silva");
        player.setClub("Paris Saint-Germain");
        i++;

        //4
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(3);
        player.setFullName("João Miranda de Souza Filho");
        player.setNickName("Miranda");
        player.setAge(33);
        player.setWikiPage("https://en.wikipedia.org/wiki/Miranda_(footballer)");
        player.setClub("F.C. Internazionale Milano S.p.A");
        i++;

        //5
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(22);
        player.setFullName("Fagner Conserva Lemos");
        player.setNickName("Fagner");
        player.setAge(29);
        player.setWikiPage("https://en.wikipedia.org/wiki/Fagner_Conserva_Lemos");
        player.setClub("S.C. Corinthians P.");
        i++;

        //6
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(4);
        player.setFullName("Pedro Geromel");
        player.setNickName("Geromel");
        player.setAge(32);
        player.setWikiPage("https://en.wikipedia.org/wiki/Pedro_Geromel");
        player.setClub("Gremio F.B.P.A");
        i++;

        //7
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(6);
        player.setFullName("Filipe Luís Kasmirski");
        player.setNickName("Filipe Luís");
        player.setAge(32);
        player.setWikiPage("https://en.wikipedia.org/wiki/Filipe_Lu%C3%ADs");
        player.setClub("C. Atletico Madrid");
        i++;

        //8
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(12);
        player.setFullName("Marcelo Vieira da Silva Júnior");
        player.setNickName("Marcelo");
        player.setAge(30);
        player.setWikiPage("https://en.wikipedia.org/wiki/Marcelo_(footballer,_born_1988)");
        player.setClub("Real Madrid C.F.");
        i++;

        //9
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(13);
        player.setFullName("Marcos Aoas Correa");
        player.setNickName("Marquinhos");
        player.setAge(24);
        player.setWikiPage("https://en.wikipedia.org/wiki/Ederson_Moraes");
        player.setClub("Paris Saint-Germain");
        i++;

        //10
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(14);
        player.setFullName("Danilo Luiz da Silva");
        player.setNickName("Danilo");
        player.setAge(26);
        player.setWikiPage("https://en.wikipedia.org/wiki/Danilo_(footballer,_born_July_1991)");
        player.setClub("Manchester City F.C.");
        i++;

        //#####################################################
        //MF

        //11
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(5);
        player.setFullName("Carlos Henrique Casimiro");
        player.setNickName("Casemiro");
        player.setAge(26);
        player.setWikiPage("https://en.wikipedia.org/wiki/Casemiro");
        player.setClub("Real Madrid C.F.");
        i++;

        //12
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(8);
        player.setFullName("Renato Soares de Oliveira Augusto");
        player.setNickName("Renato Augusto");
        player.setAge(30);
        player.setWikiPage("https://en.wikipedia.org/wiki/Danilo_(footballer,_born_July_1991)");
        player.setClub("Beijing Sinobo Guoan F.C.");
        i++;

        //13
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(11);
        player.setFullName("Philippe Coutinho Correia");
        player.setNickName("Philippe Coutinho");
        player.setAge(26);
        player.setWikiPage("https://en.wikipedia.org/wiki/Danilo_(footballer,_born_July_1991)");
        player.setClub("F.C. Barcelona");
        i++;

        //14
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(19);
        player.setFullName("Willian Borges da Silva");
        player.setNickName("Willian");
        player.setAge(29);
        player.setWikiPage("https://en.wikipedia.org/wiki/Danilo_(footballer,_born_July_1991)");
        player.setClub("Chelsea F.C.");
        i++;

        //15
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(15);
        player.setFullName("Jose Paulo Bezerra Maciel Júnior");
        player.setNickName("Paulinho");
        player.setAge(29);
        player.setWikiPage("https://en.wikipedia.org/wiki/Paulinho_(footballer)");
        player.setClub("F.C. Barcelona");
        i++;

        //16
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(17);
        player.setFullName("Fernando Luiz Roza");
        player.setNickName("Fernandinho");
        player.setAge(33);
        player.setWikiPage("https://en.wikipedia.org/wiki/Fernandinho_(footballer)");
        player.setClub("Manchester City F.C.");
        i++;

        //17
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(18);
        player.setFullName("Frederico Rodrigues de Paula Santos");
        player.setNickName("Fred");
        player.setAge(25);
        player.setWikiPage("https://en.wikipedia.org/wiki/Danilo_(footballer,_born_July_1991)");
        player.setClub("Manchester United F.C.");
        i++;

        //###########################################
        //FW

        //18
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(7);
        player.setFullName("Douglas Costa de Souza");
        player.setNickName("Douglas Costa");
        player.setAge(27);
        player.setWikiPage("https://en.wikipedia.org/wiki/Douglas_Costa");
        player.setClub("Juventus F.C.");
        i++;


        //19
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(9);
        player.setFullName("Gabriel Fernando de Jesus");
        player.setNickName("Gabriel Jesus");
        player.setAge(21);
        player.setWikiPage("https://en.wikipedia.org/wiki/Gabriel_Jesus");
        player.setClub("Manchester City F.C.");
        i++;


        //20
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(20);
        player.setFullName("Roberto Firmino Barbosa de Oliveira");
        player.setNickName("Roberto Firmino");
        player.setAge(26);
        player.setWikiPage("https://en.wikipedia.org/wiki/Roberto_Firmino");
        player.setClub("Liverpool F.C.");
        i++;

        //21
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(21);
        player.setFullName("Taison Barcellos Freda");
        player.setNickName("Taison");
        player.setAge(30);
        player.setWikiPage("https://en.wikipedia.org/wiki/Taison");
        player.setClub("F.C. Shakhtar Donetsk");
        i++;

        //22
        player = this.ph.getPlayers()[i];
        player.setSquadNumber(10);
        player.setFullName("Neymar da Silva Santos Junior");
        player.setNickName("Neymar");
        player.setAge(26);
        player.setWikiPage("https://en.wikipedia.org/wiki/Danilo_(footballer,_born_July_1991)");
        player.setClub("Paris Saint-Germain");
        i++;

    }

}
