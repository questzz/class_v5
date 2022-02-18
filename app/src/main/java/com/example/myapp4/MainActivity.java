package com.example.myapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private String TAG1 = "Life_Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG1, "onCreate ~ 호출 됨.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG1, "onStart ~ 호출 됨.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG1, "onResume ~ 호출 됨.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG1, "onPause ~ 호출 됨.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG1, "onStop ~ 호출 됨.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG1, "onDestroy ~ 호출 됨.");
    }
}