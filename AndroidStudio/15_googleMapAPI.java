//New > Google > Google Maps Activity 로 필요한 MapsActivity.java 자동 생성 가능

//gradle app => id 'com.google.gms.google-services' 
//           => implementation 'com.google.android.gms:play-services-maps:17.0.0'

//AndroidMenifest.xml
//    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
//    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
//    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />

// res > values > google_maps_api.xml에 API key 입력 (string tag 안)

//[MapsActivity.java]=====================================================

package com.mega.mobile11;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        mMap = googleMap;
        //37.55504023637654, 126.93690356577383
        // Add a marker in Sydney and move the camera
      
      //좌표값 넣으면 핀 찍힘!
        LatLng sinchon = new LatLng(37.5550, 126.9369);
        mMap.addMarker(new MarkerOptions().position(sinchon).title("Marker in Sinchon Station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sinchon));
    }
}



//[MainActivity2.java]===========================================================
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn3;
        btn3 = findViewById(R.id.button3);

        //java class 생성: 우클릭 > new > Google > Google Maps Activity
        //manifest에 자동으로 필요 내용 생성
        //연결할 key를 google_maps_api.xml에 추가해 줘야 한다 (23번째 줄)

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}
