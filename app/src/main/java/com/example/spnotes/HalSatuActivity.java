package com.example.spnotes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HalSatuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halsatu);
    }

    public void handleHalSatu(View view) {
        Intent intent = new Intent(this,HalDuaActivity.class);
        startActivity(intent);
    }
}
