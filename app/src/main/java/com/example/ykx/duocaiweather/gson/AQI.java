package com.example.ykx.duocaiweather.gson;

/**
 * Created by YKX on 2017/5/10.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
