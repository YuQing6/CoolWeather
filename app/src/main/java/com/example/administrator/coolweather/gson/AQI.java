package com.example.administrator.coolweather.gson;

/**
 * Created by Administrator on 2017/12/22.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String api;
        public String pm25;
    }
}
