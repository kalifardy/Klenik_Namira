package com.example.keyalive.kliniknamira.bab1;

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

import java.util.HashMap;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class babsatu_tiga extends AppCompatActivity implements BaseSliderView.OnSliderClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babsatu_tiga);
        SliderLayout mDemoSlider = (SliderLayout)findViewById(R.id.slider);

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("1",R.drawable.babtiga_satu);
        file_maps.put("2",R.drawable.babtiga_dua);
        file_maps.put("3",R.drawable.babtiga_tiga);
        file_maps.put("4",R.drawable.babtiga_empat);
        file_maps.put("5",R.drawable.babtiga_lima);
        file_maps.put("6",R.drawable.babtiga_enam);
        file_maps.put("7",R.drawable.babtiga_tujuh);
        file_maps.put("8",R.drawable.babtiga_delapan);
        file_maps.put("9",R.drawable.babtiga_sembilan);

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
        Intent i = new Intent(babsatu_tiga.this,Bab1Activity.class);
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
