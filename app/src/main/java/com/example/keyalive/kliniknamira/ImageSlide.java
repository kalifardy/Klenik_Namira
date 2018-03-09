package com.example.keyalive.kliniknamira;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ImageSlide extends AppCompatActivity implements BaseSliderView.OnSliderClickListener {

    private SliderLayout mDemoSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nimage_slide);
        mDemoSlider = (SliderLayout)findViewById(R.id.slider);

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("visi",R.drawable.imag_slider_a);
        file_maps.put("moto",R.drawable.image_slider_b);
        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView
//                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            mDemoSlider.addSlider(textSliderView);
        }

    }
    protected void onStop() {
        // make sure to call stopAutoCycle() on the slider before activity
        mDemoSlider.stopAutoCycle();
        super.onStop();
    }

    public void masuk (View view){
        Intent i = new Intent(ImageSlide.this,MainActivity.class);
        startActivity(i);
    }
    @Override
    public void onSliderClick(BaseSliderView slider) {

    }
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
