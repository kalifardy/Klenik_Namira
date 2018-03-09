package com.example.keyalive.kliniknamira;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.keyalive.kliniknamira.about.About;
import com.example.keyalive.kliniknamira.bab1.Bab1Activity;
import com.example.keyalive.kliniknamira.bab2.Bab2Activity;
import com.example.keyalive.kliniknamira.program.Program;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bab1(View view) {
        Intent i = new Intent(MainActivity.this, Bab1Activity.class);
        startActivity(i);
    }

    public void bab2(View view) {
        Intent i = new Intent(MainActivity.this, Bab2Activity.class);
        startActivity(i);
    }

    public void program(View view) {
        Intent i = new Intent(MainActivity.this, Program.class);
        startActivity(i);
    }
    public void About(View view) {
        Intent i = new Intent(MainActivity.this, About.class);
        startActivity(i);
    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Klik BACK dua kali untuk exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
                MainActivity.this.finish();

            }
        }, 2000);
    }
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}

