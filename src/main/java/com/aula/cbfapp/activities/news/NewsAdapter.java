package com.aula.cbfapp.activities.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.aula.cbfapp.R;

import java.util.ArrayList;



public class NewsAdapter extends BaseAdapter {
    private ListView newsListView;
    private ArrayList<String> titles;
    private ArrayList<String> subtitles;

    private LayoutInflater li;

    public NewsAdapter(Context c, ArrayList<String> titles, ArrayList<String> subTitles) {

        this.titles = titles;
        this.subtitles = subTitles;
        this.li = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Object getItem(int position) {
        return this.titles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View v = li.inflate(R.layout.news_detail, null);

        TextView title = v.findViewById(R.id.titleShTV);
        TextView subtitle = v.findViewById(R.id.subTitleTV);

        String titleString = titles.get(position);
        String subtitleString = subtitles.get(position);

        title.setText(titleString);
        subtitle.setText(subtitleString);

        return v;
    }
}
