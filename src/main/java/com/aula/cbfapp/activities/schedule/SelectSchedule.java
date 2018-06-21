package com.aula.cbfapp.activities.schedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aula.cbfapp.R;
import com.aula.cbfapp.activities.schedule.ScheduleActivity;

public class SelectSchedule extends AppCompatActivity {

    private static final String PATH = "com.aula.cbfapp.activities.schedule.GROUP_ID";

    private Button group1;
    private Button group2;
    private Button group3;
    private Button group4;
    private Button group5;
    private Button group6;
    private Button group7;
    private Button group8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_schedule);

        run();
    }

    private void run() {
        initializeTVs();
        setListeners();
    }

    private void setListeners() {

        group1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScheduleActivity.class);
                intent.putExtra(PATH, 1);
                startActivity(intent);
            }
        });

        group2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScheduleActivity.class);
                intent.putExtra(PATH, 2);
                startActivity(intent);
            }
        });

        group3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScheduleActivity.class);
                intent.putExtra(PATH, 3);
                startActivity(intent);
            }
        });

        group4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScheduleActivity.class);
                intent.putExtra(PATH, 4);
                startActivity(intent);
            }
        });

        group5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScheduleActivity.class);
                intent.putExtra(PATH, 5);
                startActivity(intent);
            }
        });

        group6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScheduleActivity.class);
                intent.putExtra(PATH, 6);
                startActivity(intent);
            }
        });

        group7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScheduleActivity.class);
                intent.putExtra(PATH, 7);
                startActivity(intent);
            }
        });

        group8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScheduleActivity.class);
                intent.putExtra(PATH, 8);
                startActivity(intent);
            }
        });
    }

    private void initializeTVs() {

        this.group1 = (Button) findViewById(R.id.group_1);
        this.group2 = (Button) findViewById(R.id.group_2);
        this.group3 = (Button) findViewById(R.id.group_3);
        this.group4 = (Button) findViewById(R.id.group_4);
        this.group5 = (Button) findViewById(R.id.group_5);
        this.group6 = (Button) findViewById(R.id.group_6);
        this.group7 = (Button) findViewById(R.id.group_7);
        this.group8 = (Button) findViewById(R.id.group_8);

    }
}
