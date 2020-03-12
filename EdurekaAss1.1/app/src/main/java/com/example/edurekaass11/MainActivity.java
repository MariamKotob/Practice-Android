package com.example.edurekaass11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "OnCreate method invoked", Toast.LENGTH_LONG).show();
    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(MainActivity.this, "OnStart method invoked", Toast.LENGTH_LONG).show();
    }

    protected void onResume(){
        super.onResume();
        Toast.makeText(MainActivity.this, "OnResume method invoked", Toast.LENGTH_LONG).show();
    }

    protected void onPause(){
        super.onPause();
        Toast.makeText(MainActivity.this, "OnPause method invoked", Toast.LENGTH_LONG).show();
    }

    protected void onStop(){
        super.onStop();
        Toast.makeText(MainActivity.this, "OnStop method invoked", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(MainActivity.this, "OnDetroy method invoked", Toast.LENGTH_LONG).show();
    }
}
