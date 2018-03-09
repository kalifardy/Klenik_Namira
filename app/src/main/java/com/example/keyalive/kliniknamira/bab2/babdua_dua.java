package com.example.keyalive.kliniknamira.bab2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.example.keyalive.kliniknamira.R;
import com.example.keyalive.kliniknamira.bab1.Bab1Activity;
import com.example.keyalive.kliniknamira.bab1.babsatu_enam;

import java.util.HashMap;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class babdua_dua extends AppCompatActivity implements BaseSliderView.OnSliderClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babdua_dua);
        SliderLayout mDemoSlider = (SliderLayout)findViewById(R.id.slider);

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("3",R.drawable.abaddua_tiga);
        file_maps.put("1",R.drawable.ababdua_satu);
        file_maps.put("2",R.drawable.ababdua_dua);




        for(String name : file_maps.keySet()){
            DefaultSliderView textSliderView = new DefaultSliderView(this);
            // initialize a SliderLayout
            textSliderView
//                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.CenterInside)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            mDemoSlider.addSlider(textSliderView);
            mDemoSlider.setDuration(120000);
        }

    }

    public void kembali(View view){
        Intent i = new Intent(babdua_dua.this,Bab2Activity.class);
        startActivity(i);
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}

