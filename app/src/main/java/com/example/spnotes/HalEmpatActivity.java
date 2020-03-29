package com.example.spnotes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HalEmpatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halempat);
    }

    public void handleHalEmpat(View view) {
        Intent intent = new Intent(this,HalTigaActivity.class);
        startActivity(intent);
    }
}
