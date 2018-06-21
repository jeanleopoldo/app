package com.aula.cbfapp.app.schedule;

import com.aula.cbfapp.app.stadium.Stadium;
import com.aula.cbfapp.app.stadium.StadiumHandler;

public class PlaceGameData {

    private Schedule schedule;
    private StadiumHandler sh;

    public PlaceGameData(Schedule schedule, StadiumHandler sh) {
        this.schedule = schedule;
        this.sh = sh;
        setStadiumsAndTimeToGames();
    }

    private void setStadiumsAndTimeToGames() {

        Stadium luzhniki = this.sh.getStadiumById(1);
        Stadium otkritie = this.sh.getStadiumById(2);
        Stadium krestovsky = this.sh.getStadiumById(3);
        Stadium fishtOlympic = this.sh.getStadiumById(4);
        Stadium kaliningrad = this.sh.getStadiumById(5);
        Stadium cosmos = this.sh.getStadiumById(6);
        Stadium kazan = this.sh.getStadiumById(7);
        Stadium rostov = this.sh.getStadiumById(8);
        Stadium nizhnyNovgorod = this.sh.getStadiumById(9);
        Stadium mordovia = this.sh.getStadiumById(10);
        Stadium central = this.sh.getStadiumById(11);
        Stadium volgograd = this.sh.getStadiumById(12);

        Game game;

        // Group A

        game = this.schedule.getGameById(1);
        game.setStadium(luzhniki);
        game.setTime(12, "thu",14,6);

        game = this.schedule.getGameById(2);
        game.setStadium(central);
        game.setTime(9,  "fri",15,6);

        game = this.schedule.getGameById(17);
        game.setStadium(krestovsky);
        game.setTime(15, "tue",19,6);

        game = this.schedule.getGameById(18);
        game.setStadium(rostov);
        game.setTime(12, "wed",20,6);

        game = this.schedule.getGameById(33);
        game.setStadium(cosmos);
        game.setTime(11, "mon",25,6);

        game = this.schedule.getGameById(34);
        game.setStadium(volgograd);
        game.setTime(11, "mon",25,6);


        // Group B

        game = this.schedule.getGameById(4);
        game.setStadium(krestovsky);
        game.setTime(12, "fri",15,6);

        game = this.schedule.getGameById(3);
        game.setStadium(fishtOlympic);
        game.setTime(15, "fri", 15,6);

        game = this.schedule.getGameById(19);
        game.setStadium(luzhniki);
        game.setTime(9, "wed", 20,6);

        game = this.schedule.getGameById(20);
        game.setStadium(kazan);
        game.setTime(15, "wed", 20,6);

        game = this.schedule.getGameById(35);
        game.setStadium(mordovia);
        game.setTime(15, "mon", 25,6);

        game = this.schedule.getGameById(36);
        game.setStadium(kaliningrad);
        game.setTime(15 ,"mon", 25,6);


        // Group C

        game = this.schedule.getGameById(5);
        game.setStadium(kazan);
        game.setTime(7, "sat", 16, 6);

        game = this.schedule.getGameById(6);
        game.setStadium(mordovia);
        game.setTime(13, "sat", 16, 6);

        game = this.schedule.getGameById(22);
        game.setStadium(cosmos);
        game.setTime(9, "thu", 21, 6);

        game = this.schedule.getGameById(21);
        game.setStadium(central);
        game.setTime(12, "thu", 21, 6);

        game = this.schedule.getGameById(37);
        game.setStadium(luzhniki);
        game.setTime(11, "tue", 26, 6);

        game = this.schedule.getGameById(38);
        game.setStadium(fishtOlympic);
        game.setTime(11, "tue", 26, 6);

        // Group D

        game = this.schedule.getGameById(7);
        game.setStadium(otkritie);
        game.setTime(10, "sat", 17,  6);

        game = this.schedule.getGameById(8);
        game.setStadium(kaliningrad);
        game.setTime(16, "sat", 17, 6);

        game = this.schedule.getGameById(23);
        game.setStadium(nizhnyNovgorod);
        game.setTime(15, "tue", 21, 6);

        game = this.schedule.getGameById(24);
        game.setStadium(volgograd);
        game.setTime(12, "wed", 22, 6);

        game = this.schedule.getGameById(39);
        game.setStadium(krestovsky);
        game.setTime(15, "tue", 26, 6);

        game = this.schedule.getGameById(40);
        game.setStadium(rostov);
        game.setTime(15, "tue", 26, 6);


        // Group E
        game = this.schedule.getGameById(10);
        game.setStadium(cosmos);
        game.setTime(9, "sun",17,6);

        game = this.schedule.getGameById(9);
        game.setStadium(rostov);
        game.setTime(15, "sun", 17,6);

        game = this.schedule.getGameById(25);
        game.setStadium(krestovsky);
        game.setTime(9,"fri",22,6);

        game = this.schedule.getGameById(26);
        game.setStadium(kaliningrad);
        game.setTime(15,"fri", 22,6);

        game = this.schedule.getGameById(41);
        game.setStadium(otkritie);
        game.setTime(15,"wed",27,6);

        game = this.schedule.getGameById(42);
        game.setStadium(nizhnyNovgorod);
        game.setTime(15,"wed",27,6);


        // Group F

        game = this.schedule.getGameById(11);
        game.setStadium(luzhniki);
        game.setTime(12, "sun", 17, 6);

        game = this.schedule.getGameById(12);
        game.setStadium(nizhnyNovgorod);
        game.setTime(9,  "mon", 18, 6);

        game = this.schedule.getGameById(28);
        game.setStadium(rostov);
        game.setTime(12, "sat", 23, 6);

        game = this.schedule.getGameById(27);
        game.setStadium(fishtOlympic);
        game.setTime(15, "sat", 23, 6);

        game = this.schedule.getGameById(43);
        game.setStadium(kazan);
        game.setTime(11, "wed", 27, 6);

        game = this.schedule.getGameById(44);
        game.setStadium(central);
        game.setTime(11, "wed", 27, 6);


        // Group G

        game = this.schedule.getGameById(13);
        game.setStadium(fishtOlympic);
        game.setTime(11, "mon", 18,6);

        game = this.schedule.getGameById(14);
        game.setStadium(volgograd);
        game.setTime(15, "mon", 18,6);

        game = this.schedule.getGameById(29);
        game.setStadium(otkritie);
        game.setTime(9, "sat", 23, 6);

        game = this.schedule.getGameById(30);
        game.setStadium(nizhnyNovgorod);
        game.setTime(9, "sun", 24, 6);

        game = this.schedule.getGameById(45);
        game.setStadium(kaliningrad);
        game.setTime(15, "thu", 28, 6);

        game = this.schedule.getGameById(46);
        game.setStadium(mordovia);
        game.setTime(15, "thu", 28, 6);


        // Group H

        game = this.schedule.getGameById(16);
        game.setStadium(mordovia);
        game.setTime(9, "tue", 19,6);

        game = this.schedule.getGameById(15);
        game.setStadium(otkritie);
        game.setTime(12, "tue", 19,6);

        game = this.schedule.getGameById(32);
        game.setStadium(central);
        game.setTime(12, "sun", 24,6);

        game = this.schedule.getGameById(31);
        game.setStadium(kazan);
        game.setTime(15,"sun", 24,6);

        game = this.schedule.getGameById(47);
        game.setStadium(volgograd);
        game.setTime(11, "thu", 28,6);

        game = this.schedule.getGameById(48);
        game.setStadium(cosmos);
        game.setTime(11,"thu", 28,6);

    }


}

