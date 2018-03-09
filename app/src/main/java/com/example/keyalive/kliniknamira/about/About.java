package com.example.keyalive.kliniknamira.about;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.keyalive.kliniknamira.R;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    public void TentangKlinik(View view){
        Intent i = new Intent(About.this,KlinikNamira.class);
        startActivity(i);
    }
    public void Pengembang(View view){
        Intent i = new Intent(About.this,Pengembang.class);
        startActivity(i);
    }
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
