package com.aula.cbfapp.activities.schedule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.aula.cbfapp.R;
import com.aula.cbfapp.activities.maps.ShowMapsActivity;
import com.aula.cbfapp.app.schedule.Schedule;
import com.aula.cbfapp.app.table.Game;

import java.util.ArrayList;

public class ScheduleActivity extends AppCompatActivity {

    private static final String PATH_GROUP_ID = "com.aula.cbfapp.activities.schedule.GROUP_ID";

    private static final String PATH_STADIUM_ID = "com.cbf.aula.activities.maps.STADIUM_ID";

    private ListView gamesListView;

    private String [] gamesString;
    private String [] timesString;
    private String [] stadiumsString;
    private String [] citiesString;

    private Schedule schedule;


    private int stadiumId;
    private int groupId;

    private ArrayList<Game>games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        this.schedule = new Schedule();
        this.run();
    }

    private void setAdapter() {
        ScheduleAdapter sa = new ScheduleAdapter(this,gamesString, timesString, stadiumsString, citiesString);
        this.gamesListView.setAdapter(sa);
    }

    private void run() {
        setGroupId();
        initializeViews();
        setGamesToHandle();
        initializeArrays();
        populateLists();
        setAdapter();
        setListeners();
     }

    private void setGroupId() {

        Intent intent = getIntent();
        this.groupId = intent.getIntExtra(PATH_GROUP_ID, -1);
    }

    private void setGamesToHandle() {
        this.games = this.schedule.getGamesByGroup(this.groupId);
    }

    private void initializeViews() {
        this.gamesListView = (ListView) findViewById(R.id.scheduleListView);
    }

    private void populateLists() {
        for (int i = 0; i < games.size(); i++) {
            populateGames(i);
            populateTimes(i);
            populateStadiums(i);
            populateCities(i);
        }
    }

    private void setListeners() {

        this.gamesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                stadiumId = getStadiumId(position);

                Intent intent = new Intent(getApplicationContext(), ShowMapsActivity.class);
                intent.putExtra(PATH_STADIUM_ID, stadiumId);
                startActivity(intent);
            }
        });
    }

    private int getStadiumId(int position) {
        return this.games.get(position).getStadium().getId();
    }

    private void initializeArrays() {

        this.gamesString = new String[this.games.size()];
        this.timesString = new String[this.games.size()];
        this.stadiumsString = new String[this.games.size()];
        this.citiesString = new String[this.games.size()];
    }

    private void populateCities(int i) {
        String c = this.games.get(i).getStadium().getCity();
        this.citiesString[i] = c;
    }

    private void populateGames(int i) {
        String g = formatGame(games.get(i));
        this.gamesString[i] = g;
    }

    private void populateTimes(int i) {
        String t = games.get(i).getTime();
        this.timesString[i] = t;
    }

    private void populateStadiums(int i) {
        String s = games.get(i).getStadium().getName();
        this.stadiumsString[i] = s;
    }

    private String formatGame(Game game) {

        String t1 = game.getTeam1().getCountry();
        String t2 = game.getTeam2().getCountry();

        String g = t1 + " vs " + t2;

        return g;
    }
}