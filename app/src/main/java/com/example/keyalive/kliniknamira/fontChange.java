package com.example.keyalive.kliniknamira;

import android.app.Application;

import com.example.keyalive.kliniknamira.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by keyalive on 14/11/2017.
 */

public class fontChange extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/JosefinSans-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/JosefinSans-SemiBold.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        //....
    }
}