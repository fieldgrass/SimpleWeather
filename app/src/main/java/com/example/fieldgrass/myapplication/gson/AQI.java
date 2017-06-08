package com.example.fieldgrass.myapplication.gson;

/**
 * Created by fieldgrass on 2017/4/21.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
