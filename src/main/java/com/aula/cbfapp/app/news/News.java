package com.aula.cbfapp.app.news;

public class News {

    private String title;
    private String subTitle;
    private String body;


    public News(String title, String subTitle, String body) {
        this.body = body;
        this.subTitle = subTitle;
        this.title = title;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public String getSubTitle() {
        return subTitle;
    }


    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
}
