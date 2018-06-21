package com.aula.cbfapp.activities.schedule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.aula.cbfapp.R;

public class ScheduleAdapter extends BaseAdapter{

    private String teams1[];
    private String teams2[];
    private String times[];
    private String stadiums[];
    private String cities[];

    private LayoutInflater li;

    public ScheduleAdapter(Context c, String [] t1,String []t2, String [] time, String [] stadium,String [] cities) {

        this.teams1 = t1;
        this.teams2 = t2;
        this.times = time;
        this.stadiums = stadium;
        this.cities = cities;

        this.li = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return teams1.length;
    }

    @Override
    public Object getItem(int position) {
        return teams1[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = li.inflate(R.layout.game_detail_view, null);

        TextView team1TV = (TextView) v.findViewById(R.id.team1);
        TextView team2TV = (TextView) v.findViewById(R.id.team2);
        TextView timeTV = (TextView) v.findViewById(R.id.timeTextView);
        TextView stadiumTV = (TextView) v.findViewById(R.id.stadiumTextView);
        TextView citiesTV = (TextView) v.findViewById(R.id.cityTextView);

        String t1 = this.teams1[position];
        String t2 = this.teams2[position];
        String t = this.times[position];
        String s = this.stadiums[position];
        String c = this.cities[position];

        team1TV.setText(t1);
        team2TV.setText(t2);
        timeTV.setText(t);
        stadiumTV.setText(s);
        citiesTV.setText(c);


        return v;
    }
}
