package com.example.fieldgrass.myapplication.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fieldgrass on 2017/4/21.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
