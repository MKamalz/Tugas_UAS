package com.example.tugas_uas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class fragmentosclass extends Fragment implements OnMapReadyCallback, View.OnClickListener{
    GoogleMap mGoogleMap;
    MapView mapView;
    Button btn;
    EditText txtbox;
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState){
             View view = inflater.inflate(R.layout.fragmentos, container, false);
            btn = (Button) view.findViewById(R.id.butons);
            btn.setOnClickListener(this);
            txtbox = (EditText) view.findViewById(R.id.teksbok);
            return view;

}

public fragmentosclass(){

}
    @Override
    public void onViewCreated(@NonNull View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mapView = (MapView)view.findViewById(R.id.map);
        if (mapView != null){
            mapView.onCreate(null);
            mapView.onResume();
            mapView.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(getContext());

        mGoogleMap = googleMap;
        googleMap.setMapType( GoogleMap.MAP_TYPE_NORMAL);
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-2.968680, 104.768245)).title("Toko Uap"));
        CameraPosition uap = CameraPosition.builder().target(new LatLng(-2.968680, 104.768245)).zoom(16).bearing(0).tilt(40).build();

        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(uap));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.butons :
                txtbox.setText("");
                Toast.makeText(getActivity(),"Terima Kasih Atas Masukannya~! :)", Toast.LENGTH_LONG).show();
                break;
        }
    }
}

