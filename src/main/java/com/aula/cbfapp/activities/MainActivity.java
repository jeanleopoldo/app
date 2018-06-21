package com.aula.cbfapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.aula.cbfapp.R;

import com.aula.cbfapp.activities.news.ExpandedNewsActivity;
import com.aula.cbfapp.activities.news.NewsAdapter;
import com.aula.cbfapp.activities.schedule.ScheduleActivity;
import com.aula.cbfapp.activities.player.ShowPlayers;
import com.aula.cbfapp.activities.schedule.SelectSchedule;
import com.aula.cbfapp.app.cons.keyHolder;
import com.aula.cbfapp.app.news.News;
import com.aula.cbfapp.app.news.NewsHandler;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;

public class MainActivity extends YouTubeBaseActivity {

    //  GAMBIARRA
    private boolean b = true;

    private static final String  newsPosition = "com.cbf.aula.activities.news.NEWS_INDEX";

    private YouTubePlayerView ytbPlayerView;
    private YouTubePlayer.OnInitializedListener listener;
    private Button schedule;
    private Button team;
    private ListView newsListView;
    private NewsHandler nh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nh = new NewsHandler();
        this.run();

    }

    private void run() {
        setAttributesViews();
        setYouTubeVideo();
        setButtonsListener();
        populateNewsList();
    }

    private void populateNewsList() {

        ArrayList<News> news = this.nh.getNewsList();
        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> subTitles= new ArrayList<>();
        String title;
        String subTitle;

        for (int i = 0; i < news.size(); i++ ) {
            title = news.get(i).getTitle();
            subTitle = news.get(i).getSubTitle();
            titles.add(title);
            subTitles.add(subTitle);
        }

        NewsAdapter na = new NewsAdapter(this, titles, subTitles);

        this.newsListView.setAdapter(na);
    }

    private void setAttributesViews() {

        this.ytbPlayerView = (YouTubePlayerView) findViewById(R.id.ytbPlayerView);
        this.schedule = (Button) findViewById(R.id.scheduleBtn);
        this.team = (Button) findViewById(R.id.teamBtn);
        this.newsListView = (ListView) findViewById(R.id.newsListView);
    }

    private void setYouTubeVideo() {
        this.setVideoToShow();
        this.initializeVideo();
    }

    private void setButtonsListener() {

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SelectSchedule.class);
                startActivity(intent);
            }
        });

        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), ShowPlayers.class);
               startActivity(intent);
            }
        });

        this.newsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ExpandedNewsActivity.class);
                intent.putExtra(newsPosition, position);
                startActivity(intent);
            }
        });
    }

    private void setVideoToShow() {

        this.listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                //LOAD PLAYLIST
                youTubePlayer.loadPlaylist("PLM5VXwiB0sf32kZWYZX76pTFiV9gXuYrl");

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
    }

    private void initializeVideo() {
        this.ytbPlayerView.initialize(keyHolder.KEY,listener);
    }
}