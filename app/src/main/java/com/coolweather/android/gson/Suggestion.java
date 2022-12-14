package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public static class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public static class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public static class Sport {
        @SerializedName("txt")
        public String info;
    }
}
