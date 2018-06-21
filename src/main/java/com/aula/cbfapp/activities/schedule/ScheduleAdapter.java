package com.aula.cbfapp.activities.schedule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.aula.cbfapp.R;

public class ScheduleAdapter extends BaseAdapter{

    private String games[];
    private String times[];
    private String stadiums[];
    private String cities[];

    private LayoutInflater li;

    public ScheduleAdapter(Context c, String [] game, String [] time, String [] stadium,String [] cities) {

        this.games = game;
        this.times = time;
        this.stadiums = stadium;
        this.cities = cities;

        this.li = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return games.length;
    }

    @Override
    public Object getItem(int position) {
        return games[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = li.inflate(R.layout.game_detail_view, null);

        TextView gameTV = (TextView) v.findViewById(R.id.gameTextView);
        TextView timeTV = (TextView) v.findViewById(R.id.timeTextView);
        TextView stadiumTV = (TextView) v.findViewById(R.id.stadiumTextView);
        TextView citiesTV = (TextView) v.findViewById(R.id.cityTextView);

        String g = this.games[position];
        String t = this.times[position];
        String s = this.stadiums[position];
        String c = this.cities[position];

        gameTV.setText(g);
        timeTV.setText(t);
        stadiumTV.setText(s);
        citiesTV.setText(c);


        return v;
    }
}
