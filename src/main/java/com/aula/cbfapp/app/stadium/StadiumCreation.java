package com.aula.cbfapp.app.stadium;

public class StadiumCreation {

    private StadiumHandler sh;

    public StadiumCreation(StadiumHandler stadiumHandler) {

        this.sh = stadiumHandler;
        createStadiums();
    }

    public void createStadiums() {
        Stadium stadium;

        for (int i = 0; i < this.sh.getStadiums().length; i++) {
            stadium = new Stadium(i + 1, "name " + i, "city " + i, 0, 0);
            this.sh.getStadiums()[i] = stadium;
        }
    }
}
