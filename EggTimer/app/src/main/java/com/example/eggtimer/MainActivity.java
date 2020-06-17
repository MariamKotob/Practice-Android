package com.example.eggtimer;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);



        /*
        //Repeating code based on time chunks (timer) CountDownTimer class
        new CountDownTimer(15000, 1500){
            //The code snippet to be repeated every 1.5S
            @Override
            public void onTick(long millisUntilFinished) {
                Log.i("count down timer left", String.valueOf(millisUntilFinished/1000));
            }

            public void onFinish(){
                Log.i("Done!", "Count down timer finished");
            }
        }.start();  //end of the count down timer

        //Repeating code based on time chunks (timer) using handlers
        final Handler handler = new Handler();  //It's a too; to allow a junk of code to be delayed for a specific chunk of time
        Runnable run = new Runnable() {
            @Override
            public void run() {
                //Here in this method we insert the code that we want to repeat
                Log.i("Runnable was checked!", "A second have passed");
                handler.postDelayed(this, 1000);
            }
        };
        handler.post(run); //end of the handler code
*/


        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
