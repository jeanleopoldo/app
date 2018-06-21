package com.aula.cbfapp.app.stadium;

public class StadiumSetup {

    private StadiumHandler sh;

    public StadiumSetup(StadiumHandler sh) {
        this.sh = sh;
        setStadiums();
    }

    private void setStadiums() {

        Stadium stadium;
        int id = 1;
        // Luzhniki Stadium

        stadium = this.sh.getStadiumById(id);
        stadium.setName("Luzhniki Stadium");
        stadium.setCity("Moscow");
        stadium.setLat(55.715762);
        stadium.setLon(37.551527);
        id++;

        // Otkritie Arena

        stadium = this.sh.getStadiumById(id);
        stadium.setName("Otkritie Arena");
        stadium.setCity("Moscow");
        stadium.setLat(55.8178196);
        stadium.setLon(37.4384106);
        id++;

        // Krestovsky Stadium

        stadium = this.sh.getStadiumById(id);
        stadium.setName("Krestovsky Stadium");
        stadium.setCity("Saint-Petersburg");
        stadium.setLat(59.972728);
        stadium.setLon(30.2192158);
        id++;

        // Fisht Olympic Stadium

        stadium =this.sh.getStadiumById(id);
        stadium.setName("Fisht Olympic Stadium");
        stadium.setCity("Sochi");
        stadium.setLat(43.4020252);
        stadium.setLon(39.9531344);
        id++;

        // Kaliningrad Stadium

        stadium = this.sh.getStadiumById(id);
        stadium.setName("Kaliningrad Stadium");
        stadium.setCity("Kaliningrad");
        stadium.setLat(54.6979473);
        stadium.setLon(20.5326633);
        id++;

        // Cosmos Arena

        stadium = this.sh.getStadiumById(id);
        stadium.setName("Cosmos Arena");
        stadium.setCity("Samara");
        stadium.setLat(53.2779718);
        stadium.setLon(50.2352815);
        id++;

        // Kazan Arena

        stadium = this.sh.getStadiumById(id);
        stadium.setName("Kazan Arena");
        stadium.setCity("Kazan");
        stadium.setLat(55.821002);
        stadium.setLon(49.1586594);
        id++;

        // Rostov Arena

        stadium = this.sh.getStadiumById(id);
        stadium.setName("Rostov Arena");
        stadium.setCity("Rostov-on-Don");
        stadium.setLat(47.2098587);
        stadium.setLon(39.736495);
        id++;

        // Nizhny Novgorod Stadium

        stadium = this.sh.getStadiumById(id);
        stadium.setName("Nizhny Novgorod Stadium");
        stadium.setCity("Nizhny Novgorod");
        stadium.setLat(56.3375157);
        stadium.setLon(43.9611755);
        id++;

        // Mordovia Arena

        stadium = this.sh.getStadiumById(id);
        stadium.setName("Mordovia Arena");
        stadium.setCity("Saransk");
        stadium.setLat(54.1817934);
        stadium.setLon(45.2015065);
        id++;

        // Central Stadium

        stadium = this.sh.getStadiumById(id);
        stadium.setName("Central Stadium");
        stadium.setCity("Yekaterinburg");
        stadium.setLat(55.7967811);
        stadium.setLon(49.0965299);
        id++;

        // Volgograd Arena

        stadium = this.sh.getStadiumById(id);
        stadium.setName("Volgograd Arena");
        stadium.setCity("Volgograd");
        stadium.setLat(48.7344107);
        stadium.setLon(44.5463641);
        id++;

    }

}