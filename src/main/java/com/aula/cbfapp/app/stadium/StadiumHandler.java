package com.aula.cbfapp.app.stadium;


import com.aula.cbfapp.app.cons.ConstantHolder;

public class StadiumHandler {

    private Stadium[] stadiums;

    public StadiumHandler() {
        this.stadiums = new Stadium[ConstantHolder.getNumberOfStadiums()];
        new StadiumCreation(this);
        new StadiumSetup(this);

    }

    public Stadium[] getStadiums() {
        return stadiums;
    }

    public Stadium getStadiumByName(String name) {
        Stadium stadium = null;
        for (int i = 0; i < this.stadiums.length; i++) {
            stadium = stadiums[i];

            if (stadium.getName() == name) {
                return stadium;
            }
        }

        return stadium;
    }

    public Stadium getStadiumById(int id) {
        Stadium stadium = null;

        if (isStadiumValidId(id)) {

            for (int i = 0; i < this.stadiums.length; i++) {
                stadium = stadiums[i];

                if (stadium.getId() == id) {
                    return stadium;
                }
            }
        }

        return stadium;
    }

    public boolean isStadiumValidId(int id) {
        if (id <= this.stadiums.length && id > 0)
            return true;
        return false;
    }

    public String[] getStadiumsNameStringList() {

        String[] stringList = new String[this.stadiums.length];
        String name;

        for (int i = 0; i < stringList.length; i++) {
            name = this.stadiums[i].getName();
            stringList[i] = name;

        }

        return stringList;
    }

}

