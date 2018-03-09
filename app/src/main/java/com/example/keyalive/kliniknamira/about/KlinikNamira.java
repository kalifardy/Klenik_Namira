package com.example.keyalive.kliniknamira.about;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.keyalive.kliniknamira.R;

import java.net.URI;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class KlinikNamira extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klinik_namira);
    }
    public void maps(View view){
        Uri gmmIntentUri = Uri.parse("https://goo.gl/maps/h5EdwFWuASH2");

// Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

// Set package Google Maps untuk tujuan aplikasi yang di Intent
        mapIntent.setPackage("com.google.android.apps.maps");

// Untuk menjalankan aplikasi yang di hendel dari intent
        startActivity(mapIntent);
    }
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
