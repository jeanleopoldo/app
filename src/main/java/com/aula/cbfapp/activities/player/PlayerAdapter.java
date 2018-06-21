package com.aula.cbfapp.activities.player;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.aula.cbfapp.R;

public class PlayerAdapter extends BaseAdapter{

    private String nickNameString [];
    private int squadNumbers[];

    private LayoutInflater li;

    public PlayerAdapter(Context c, String[] fullNameString, int [] squadNumbers) {

        this.nickNameString = fullNameString;
        this.squadNumbers = squadNumbers;
        this.li = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return nickNameString.length;
    }

    @Override
    public Object getItem(int position) {
        return this.nickNameString[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = this.li.inflate(R.layout.playerlist_detail, null);

        TextView squadNumberTV = (TextView) v.findViewById(R.id.squadNumberTV);
        TextView nickNameTV = (TextView) v.findViewById(R.id.nickNameTV);

        int sn = this.squadNumbers[position];
        String nn = this.nickNameString[position];

        String sns = Integer.toString(sn);
        squadNumberTV.setText(sns);
        nickNameTV.setText(nn);

        return v;
    }
}
