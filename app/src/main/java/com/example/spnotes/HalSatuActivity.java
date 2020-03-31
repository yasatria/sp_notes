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

        Thread thread = new Thread() {
            public void run(){
                try {
                    sleep(2000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent (HalSatuActivity.this, HalDuaActivity.class);
                    startActivity(intent);

                    finish();
                }
            }
        };
        thread.start();
    }

}
