package com.example.keyalive.kliniknamira.bab1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.keyalive.kliniknamira.MainActivity;
import com.example.keyalive.kliniknamira.R;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Bab1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab1);
    }

    public void satu(View view){
        Intent i = new Intent(Bab1Activity.this,babsatu_satu.class);
        startActivity(i);
    }
    public void dua(View view){
        Intent i = new Intent(Bab1Activity.this,babsatu_dua.class);
        startActivity(i);
    }
    public void tiga(View view){
        Intent i = new Intent(Bab1Activity.this,babsatu_tiga.class);
        startActivity(i);
    }
    public void empat(View view){
        Intent i = new Intent(Bab1Activity.this,babsatu_empat.class);
        startActivity(i);
    }
    public void lima(View view){
        Intent i = new Intent(Bab1Activity.this,babsatu_lima.class);
        startActivity(i);
    }
    public void enam(View view){
        Intent i = new Intent(Bab1Activity.this,babsatu_enam.class);
    startActivity(i);
}
    public void tuju(View view){
        Intent i = new Intent(Bab1Activity.this,babsatu_tujuh.class);
        startActivity(i);
    }
    public void delapan(View view){
        Intent i = new Intent(Bab1Activity.this,babsatu_delapan.class);
        startActivity(i);
    }
    public void sembilan(View view){
        Intent i = new Intent(Bab1Activity.this,babsatu_sembilan.class);
        startActivity(i);
    }
    public void sepuluh(View view){
        Intent i = new Intent(Bab1Activity.this,babsatu_sepuluh.class);
        startActivity(i);
    }
    public void sebelas(View view){
        Intent i = new Intent(Bab1Activity.this,babsatu_sebelas.class);
        startActivity(i);
    }

//    @Override
//    public void onBackPressed() {
//        Intent i = new Intent(Bab1Activity.this,MainActivity.class);
//        startActivity(i);
//
//        }
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
