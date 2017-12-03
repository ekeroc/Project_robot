package com.example.robert.bluetoothnew;

import android.location.Location;
import android.util.Log;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by robert on 2017/10/28.
 */

public class ArrivalDestination {
    public LatLng direction ;
    public LatLng source ;

    public ArrivalDestination(){
        direction = null ;
        source = null;
    }
    public void setDirection(LatLng direction){
        this.direction = direction ;
    }
    public void setSource(LatLng source){
        this.source = source ;
    }
    public boolean calDistance(){
        float [] temp = new float[1];
        Location.distanceBetween(direction.latitude,direction.longitude,source.latitude,source.longitude,temp);
//        double temp = sqrt(pow(direction.latitude-source.latitude,2)+pow(direction.longitude - source.longitude,2)) * 111100;    // 緯經度差一度差， 111.1公里
        Log.v("Direction","Direction :"+temp[0]+" source "+source+" direction "+direction);
        if(temp[0] < 5) {
            return true;
        }
        return false;
    }
}
