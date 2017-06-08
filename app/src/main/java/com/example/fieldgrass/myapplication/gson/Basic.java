package com.example.fieldgrass.myapplication.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fieldgrass on 2017/4/21.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
