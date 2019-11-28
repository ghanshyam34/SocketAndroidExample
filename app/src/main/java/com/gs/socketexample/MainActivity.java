package com.gs.socketexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ghanshyam.socketexample.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainApplicatilon.getInstance().initSocket();
    }

    @Override
    protected void onDestroy() {
        MainApplicatilon.getInstance().disconnect();
        super.onDestroy();
    }
}
