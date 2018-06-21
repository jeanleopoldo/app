package com.aula.cbfapp.activities.player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.aula.cbfapp.R;

import com.aula.cbfapp.app.player.Player;
import com.aula.cbfapp.app.player.PlayerHandler;

public class ShowPlayers extends AppCompatActivity {

    private static int SIZE;

    private ListView playersListView;
    private String [] nickNameString;
    private int [] squadNumbers;

    private PlayerHandler ph;

    private Player[] players;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_players);

        this.ph = new PlayerHandler();

        run();

    }

    private void run() {
        initializeViews();
        setPlayersToHandle();
        setSize();
        initializeArrays();
        populateArrays();
        setListener();
        setAdapter();
    }

    private void initializeViews() {
        this.playersListView = (ListView)findViewById(R.id.playersList);
    }

    private void populateArrays() {

        for (int i = 0; i < this.players.length; i++) {
            this.squadNumbers[i] = this.players[i].getSquadNumber();
            this.nickNameString[i] = this.players[i].getNickName();
        }
    }

    private void setListener() {

        this.playersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), PlayerDetail.class);
                intent.putExtra("com.aula.cbfapp.activities.PLAYER_INDEX", position);
                startActivity(intent);
            }
        });
    }


    private void setAdapter() {

        PlayerAdapter pa = new PlayerAdapter(this, this.nickNameString, this.squadNumbers);
        this.playersListView.setAdapter(pa);
    }


    private void setPlayersToHandle() {
        this.players = this.ph.getBrazilsPlayers();
    }

    private void setSize() {
        this.SIZE = this.players.length;
    }

    private void initializeArrays() {
        this.nickNameString = new String[SIZE];
        this.squadNumbers = new int[SIZE];
    }
}
