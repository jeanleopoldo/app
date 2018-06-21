package com.aula.cbfapp.app.stadium;
public class Stadium {

    private int id;
    private String name;
    private String city;
    private double lat;
    private double lon;

    public Stadium(int id, String name, String city, double lat, double lon) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.lat = lat;
        this.lon = lon;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}