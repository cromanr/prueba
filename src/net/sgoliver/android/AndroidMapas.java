package net.sgoliver.android;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

import android.os.Bundle;

public class AndroidMapas extends MapActivity {

	private MapView mapa = null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Obtenemos una referencia al control MapView
        mapa = (MapView)findViewById(R.id.mapa);
        
        //Mostramos los controles de zoom sobre el mapa
        mapa.setBuiltInZoomControls(true);
    }
    
    @Override
    protected boolean isRouteDisplayed() {
    	return false;
    }
    
}