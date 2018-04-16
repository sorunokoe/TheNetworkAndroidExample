package com.kitestart.thenetwork.Controller;

import android.content.Intent;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.kitestart.thenetwork.R;


public class DetailUserActivity extends AppCompatActivity implements OnMapReadyCallback{


    TextView name, status;
    //MapView myMap;
    String lat;
    String lon;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_user);


        name = findViewById(R.id.nameTxt);
        status = findViewById(R.id.statusTxt);

        //myMap = findViewById(R.id.myMap);

        Intent intent = getIntent();


        if(intent != null){
            String nameStr = intent.getExtras().getString("name");
            String statusStr = intent.getExtras().getString("status");
            this.lat = intent.getExtras().getString("lat");
            this.lon = intent.getExtras().getString("long");

            if(nameStr != null){
                name.setText(nameStr);
            }
            if(statusStr != null) {
                status.setText(statusStr);
            }
        }



        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(new Double(this.lon), new Double(this.lat));
        mMap.setMinZoomPreference(5);
        mMap.addMarker(new MarkerOptions().position(sydney).title(this.name.getText().toString()));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
