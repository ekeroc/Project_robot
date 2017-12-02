package com.example.robert.bluetoothnew;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robert on 2017/11/26.
 */

public class SingleTonTemp {

    public static final String MAP_ACTION = "MAP_ACTION";
    private static SingleTonTemp instance = null ;
    public int arrivalDirection = 0;
    public int index =0;

    public LatLng Gps,directionPosition = null,lastPosition = null;
    public boolean status,sourceStatus,directionstatus,filterGps;
    public List<LatLng> planPath  = new ArrayList<LatLng>();



    private SingleTonTemp() {
    }
    public static SingleTonTemp getInstance(){
        if(instance == null){
            instance = new SingleTonTemp();
        }
        return instance;
    }
    public void initStatus(){
        status= false;
        sourceStatus= false;
        directionstatus = false;
        filterGps = false;
        directionPosition = null;
    }
}