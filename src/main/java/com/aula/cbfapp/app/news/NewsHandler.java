package com.aula.cbfapp.app.news;
import java.util.ArrayList;

public class NewsHandler {

    private ArrayList<News> newsList;


    public NewsHandler() {
        this.newsList = new ArrayList<>();

        new NewsCreation(this);
    }

    public void addNews(News news) {
        this.newsList.add(news);
    }

    public ArrayList<News> getNewsList() {
        return this.newsList;
    }

}

