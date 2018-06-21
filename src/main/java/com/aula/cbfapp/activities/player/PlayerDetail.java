package com.aula.cbfapp.activities.player;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.widget.ImageView;
import android.widget.TextView;

import com.aula.cbfapp.R;
import com.aula.cbfapp.app.player.Player;
import com.aula.cbfapp.app.player.PlayerHandler;

public class PlayerDetail extends AppCompatActivity {
    private PlayerHandler ph;
    private TextView squadNumber;
    private TextView fullName;
    private TextView nickName;
    private TextView club;
    private TextView age;

    private int index;

    private String sn;
    private String nn;
    private String fn;
    private String a;
    private String c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_detail);

        this.ph = new PlayerHandler();

        run();
    }

    private void initializeTVs() {
        this.squadNumber = (TextView) findViewById(R.id.squadNumberTV);
        this.nickName = (TextView) findViewById(R.id.nickNameTV);
        this.fullName = (TextView) findViewById(R.id.fullNameTV);
        this.age = (TextView) findViewById(R.id.ageTV);
        this.club = (TextView) findViewById(R.id.clubTV);
    }

    private void run() {

        initializeTVs();
        setPlayerIndex();
        setTVs();


    }

    private void setTVs() {
        Player player = getPlayer();
        setStrings(player);
        setTexts(sn, nn, fn, a, c);
        setImg();
    }

    private void setImg() {
        int pic = getImage();
        ImageView imgV = (ImageView) findViewById(R.id.imgView);
        scaleImg(imgV, pic);
    }

    private void setPlayerIndex() {
        Intent in = getIntent();
        this.index = in.getIntExtra("com.aula.cbfapp.activities.PLAYER_INDEX", -1);
    }

    private int getImage() {

        switch(index) {
            case 0:
                return R.drawable.alisson;
            case 1:
                return R.drawable.cassio;
            case 2:
                return R.drawable.ederson;
            case 3:
                return R.drawable.ts;
            case 4:
                return R.drawable.miranda;
            case 5:
                return R.drawable.fagner;
            case 6:
                return R.drawable.geromel;
            case 7:
                return R.drawable.filipeluis;
            case 8:
                return R.drawable.marcelo;
            case 9:
                return R.drawable.marquinhos;
            case 10:
                return R.drawable.danilo;
            case 11:
                return R.drawable.casemiro;
            case 12:
                return R.drawable.renatoaugusto;
            case 13:
                return R.drawable.coutinho;
            case 14:
                return R.drawable.willian;
            case 15:
                return R.drawable.paulinho;
            case 16:
                return R.drawable.fernandinho;
            case 17:
                return R.drawable.fred;
            case 18:
                return R.drawable.douglascosta;
            case 19:
                return R.drawable.gabrieljesus;
            case 20:
                return R.drawable.firmino;
            case 21:
                return R.drawable.neymar;
            case 22:
                return R.drawable.alisson;
                default: return -1;
        }
    }

    private void scaleImg(ImageView img, int pic) {
        Display screen = getWindowManager().getDefaultDisplay();
        BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), pic, options);

        int imgWidth = options.outWidth;
        int screenWidth = screen.getWidth();

        if (imgWidth > screenWidth) {
            int ratio = Math.round((float) imgWidth/ (float) screenWidth);
            options.inSampleSize = ratio;
        }

        options.inJustDecodeBounds=false;
        Bitmap scaledImage = BitmapFactory.decodeResource(getResources(), pic, options);
        img.setImageBitmap(scaledImage);

    }

    private void setTexts(String sn,  String nn,  String fn,  String a,  String c) {
        this.squadNumber.setText(sn);
        this.nickName.setText(nn);
        this.fullName.setText(fn);
        this.age.setText(a);
        this.club.setText(c);
    }

    private void setStrings(Player player) {
        sn = Integer.toString(player.getSquadNumber()) + ".";
        nn = "   "+player.getNickName();
        fn = "Full name: "+player.getFullName();
        a = "Age: "+Integer.toString(player.getAge()) + " years old";
        c = "Current club: "+player.getClub();
    }

    private Player getPlayer() {

        Player player = this.ph.getBrazilsPlayers()[index];

        return player;
    }


}
