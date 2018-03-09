package com.example.keyalive.kliniknamira.bab2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.keyalive.kliniknamira.R;
import com.example.keyalive.kliniknamira.bab1.Bab1Activity;
import com.example.keyalive.kliniknamira.bab1.babsatu_dua;
import com.example.keyalive.kliniknamira.bab1.babsatu_empat;
import com.example.keyalive.kliniknamira.bab1.babsatu_lima;
import com.example.keyalive.kliniknamira.bab1.babsatu_satu;
import com.example.keyalive.kliniknamira.bab1.babsatu_tiga;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Bab2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab2);

    }
    public void satu(View view){
        Intent i = new Intent(Bab2Activity.this,babdua_satu.class);
        startActivity(i);
    }
    public void dua(View view){
        Intent i = new Intent(Bab2Activity.this,babdua_dua.class);
        startActivity(i);
    }
    public void tiga(View view){
        Intent i = new Intent(Bab2Activity.this,babdua_tiga.class);
        startActivity(i);
    }
    public void empat(View view){
        Intent i = new Intent(Bab2Activity.this,babdua_empat.class);
        startActivity(i);
    }
    public void lima(View view){
        Intent i = new Intent(Bab2Activity.this,babdua_lima.class);
        startActivity(i);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

}
