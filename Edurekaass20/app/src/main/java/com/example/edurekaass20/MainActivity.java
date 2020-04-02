package com.example.edurekaass20;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout myLayout;
    RadioGroup colorCollection;
    int mySelection;
    RadioButton selectedColor;
    String background;
    Button googleButton, yahooButton;
    WebView pageViewer;

    public void redOnCheck(View view){
        mySelection = colorCollection.getCheckedRadioButtonId();
        selectedColor = (RadioButton) findViewById(mySelection);
        background = selectedColor.getText().toString();
        Toast.makeText(MainActivity.this, selectedColor.getText(), Toast.LENGTH_SHORT).show();
        myLayout.setBackgroundColor(Color.rgb(255, 0, 0));
    }

    public void redgreenOnCheck(View view){
        mySelection = colorCollection.getCheckedRadioButtonId();
        selectedColor = (RadioButton) findViewById(mySelection);
        background = selectedColor.getText().toString();
        Toast.makeText(MainActivity.this, selectedColor.getText(), Toast.LENGTH_SHORT).show();
        myLayout.setBackgroundColor(Color.rgb(0, 255, 0));
    }

    public void blueOnCheck(View view){
        mySelection = colorCollection.getCheckedRadioButtonId();
        selectedColor = (RadioButton) findViewById(mySelection);
        background = selectedColor.getText().toString();
        Toast.makeText(MainActivity.this, selectedColor.getText(), Toast.LENGTH_SHORT).show();
        myLayout.setBackgroundColor(Color.rgb(0, 0, 255));
    }

    public void setGoogleButton(View view){
        pageViewer.loadUrl("https://www.google.com.eg/");
    }

    public void setYahooButton(View view){
        pageViewer.loadUrl("https://maktoob.yahoo.com/?p=us&guccounter=1");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLayout = (ConstraintLayout) findViewById(R.id.LayoutHome);
        colorCollection = (RadioGroup) findViewById(R.id.colorRadioGroup);
        googleButton = (Button) findViewById(R.id.googleButton);
        yahooButton = (Button) findViewById(R.id.yahooButton);
        pageViewer = (WebView) findViewById(R.id.pageViewer);
        pageViewer.getSettings().setJavaScriptEnabled(true);

    }
}
