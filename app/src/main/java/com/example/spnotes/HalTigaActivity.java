package com.example.spnotes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HalTigaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haltiga);
    }

    public void handleHalTiga(View view) {
        Intent intent = new Intent(this,HalEmpatActivity.class);
        startActivity(intent);
    }
}
