package com.example.apiweatherex;

import java.util.List;

public class WeatherResponse {
    public static WeatherByPoint weatherByPoint;
    public static class WeatherByPoint {
        public request Request;
        public climate Climate;
    }
    public static class request {
        public String lat = "58.01";
        public String lon = "56.3";
    }
    public static class climate {
        public List<days> Days;
    }
    public static class days {
        public int limit = 10;
        public int offset = 10;
        public String maxDayTemperature;
    }
}
