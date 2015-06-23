package voluda.treasurehuntkali;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class KarteActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karte);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Windlass.ttf");
        Button myButtonText = (Button) findViewById(R.id.button2);
        myButtonText.setTypeface(myTypeface);
        myButtonText.setTextColor(Color.parseColor("#fbda9d"));
        myButtonText.setShadowLayer(8, 0, 0, Color.BLACK);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);

        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        Criteria criteria = new Criteria();
        String bestProvider = locationManager.getBestProvider(criteria, true);
        Location location = locationManager.getLastKnownLocation(bestProvider);
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        final LatLng latLng = new LatLng(latitude, longitude);

        Intent m = getIntent();
        String previousActivity = m.getStringExtra("FROM_ACTIVITY");

        if (previousActivity.equals("Campus")) {
            final LatLng latLng1 = new LatLng(51.500823, 6.545623);

            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    googleMap.setMyLocationEnabled(true);
                    googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                    googleMap.addMarker(new MarkerOptions().position(latLng1));
                }
            });

        }

        else if (previousActivity.equals("Kirche")){
            final LatLng latLng1 = new LatLng(51.496124, 6.546466);

            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    googleMap.setMyLocationEnabled(true);
                    googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                    googleMap.addMarker(new MarkerOptions().position(latLng1));
                }
            });

        }

        else if (previousActivity.equals("Steinkreis")){
            final LatLng latLng1 = new LatLng(51.501109, 6.544498);

            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    googleMap.setMyLocationEnabled(true);
                    googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                    googleMap.addMarker(new MarkerOptions().position(latLng1));
                }
            });

        }

        else if (previousActivity.equals("Freibad")){
            final LatLng latLng1 = new LatLng(51.499528, 6.544158);

            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    googleMap.setMyLocationEnabled(true);
                    googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                    googleMap.addMarker(new MarkerOptions().position(latLng1));
                }
            });

        }

        else if (previousActivity.equals("Foerderturm")){
            final LatLng latLng1 = new LatLng(51.499618, 6.538573);

            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    googleMap.setMyLocationEnabled(true);
                    googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                    googleMap.addMarker(new MarkerOptions().position(latLng1));
                }
            });

        }

        else if (previousActivity.equals("Einkauf")){
            final LatLng latLng1 = new LatLng(51.500116, 6.551058);

            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    googleMap.setMyLocationEnabled(true);
                    googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                    googleMap.addMarker(new MarkerOptions().position(latLng1));
                }
            });

        }

        else if (previousActivity.equals("Skulptur")){
            final LatLng latLng1 = new LatLng(51.503542, 6.547629);

            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    googleMap.setMyLocationEnabled(true);
                    googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                    googleMap.addMarker(new MarkerOptions().position(latLng1));
                }
            });

        }

        else if (previousActivity.equals("Tafel")){
            final LatLng latLng1 = new LatLng(51.503781, 6.544566);

            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    googleMap.setMyLocationEnabled(true);
                    googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                    googleMap.addMarker(new MarkerOptions().position(latLng1));
                }
            });

        }

        ((Button) findViewById(R.id.button2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_karte, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
