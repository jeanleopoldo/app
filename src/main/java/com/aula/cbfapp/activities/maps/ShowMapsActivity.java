package com.aula.cbfapp.activities.maps;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.aula.cbfapp.R;
import com.aula.cbfapp.app.stadium.Stadium;
import com.aula.cbfapp.app.stadium.StadiumHandler;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ShowMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private static final String PATH_STADIUM_ID = "com.cbf.aula.activities.maps.STADIUM_ID";
    private int STADIUM_ID;
    private GoogleMap mMap;
    private Stadium stadium;
    private StadiumHandler sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        this.sh = new StadiumHandler();

        run();
    }

    private void run() {
        setStadiumID();
        setStadiumToHandle();
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        double stadiumLat = this.stadium.getLat();
        double stadiumLon = this.stadium.getLon();

        mMap = googleMap;

        // Add a marker in Sydney, Australia, and move the camera.
        LatLng stadiumPlace = new LatLng(stadiumLat, stadiumLon);

        mMap.addMarker(new MarkerOptions().position(stadiumPlace).title("Marker in "+this.stadium.getName()+", "+this.stadium.getCity()));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stadiumPlace));
        mMap.setMinZoomPreference(5);
    }

    public void setStadiumToHandle() {
        this.stadium = this.sh.getStadiumById(STADIUM_ID);
    }

    public void setStadiumID() {
        Intent in = getIntent();
        STADIUM_ID = in.getIntExtra(PATH_STADIUM_ID, -1);
    }
}
