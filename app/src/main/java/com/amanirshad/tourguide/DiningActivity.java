package com.amanirshad.tourguide;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DiningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new DiningFragment()).commit();
    }
}
