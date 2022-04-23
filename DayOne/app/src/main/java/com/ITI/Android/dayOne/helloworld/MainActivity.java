package com.ITI.Android.dayOne.helloworld;

import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("----------","OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("----------","OnStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("----------","OnResume");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("----------","OnStop");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("----------","OnRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("----------","OnDestroy");
    }

}