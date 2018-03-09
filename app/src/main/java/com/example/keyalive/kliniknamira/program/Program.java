package com.example.keyalive.kliniknamira.program;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.keyalive.kliniknamira.R;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Program extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
    }
    public void BabySpa(View v){
        Intent i =new Intent(Program.this,Baby_spa.class);
        startActivity(i);
    }
    public void BabyMessage(View v){
        Intent i =new Intent(Program.this,Baby_massage.class);
        startActivity(i);
    }
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
