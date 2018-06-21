package com.aula.cbfapp.activities.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.aula.cbfapp.R;
import com.aula.cbfapp.app.news.News;
import com.aula.cbfapp.app.news.NewsHandler;

public class ExpandedNewsActivity extends AppCompatActivity {

    private TextView titleTV;
    private TextView subtitleTV;
    private TextView bodyTV;

    private NewsHandler nh;
    private static int index;

    private News news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_expanded_news);

        this.nh = new NewsHandler();

        run();
    }

    private void run() {
        initializeTVs();
        setGlobalIndex();
        setNewsToHandle();
        setTVs();
    }

    public void setGlobalIndex() {
        Intent in = getIntent();
        index =  in.getIntExtra("com.cbf.aula.activities.news.NEWS_INDEX", -1);
    }
    private void initializeTVs() {
        this.titleTV = (TextView) findViewById(R.id.titleShTV);
        this.subtitleTV = (TextView) findViewById(R.id.subtitleShTV);
        this.bodyTV = (TextView) findViewById(R.id.bodyShTV);
    }

    public void setNewsToHandle () {
        this.news = this.nh.getNewsList().get(index);
    }

    private void setTVs() {

        String title = news.getTitle();
        String subtitle = news.getSubTitle();
        String body = news.getBody();

        this.titleTV.setText(title);
        this.subtitleTV.setText(subtitle);
        this.bodyTV.setText(body);
    }
}
