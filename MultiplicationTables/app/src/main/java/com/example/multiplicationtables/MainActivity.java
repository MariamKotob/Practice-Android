package com.example.multiplicationtables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView timesTableListView;

    //Generating the values for the times tables
    public void generateTimesTable( int timesTable){

        //creating the values to display in the list view
        ArrayList<String> timesTableContent = new ArrayList<String>();
        for(int i=1; i<= 12; i++){
            timesTableContent.add(Integer.toString(i*timesTable));
        }

        //adding the items we prepared to the list view
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, timesTableContent);
        timesTableListView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar timesTableSeekBar = (SeekBar) findViewById(R.id.timesTableSeekBar);
        timesTableListView = (ListView) findViewById(R.id.timesTableListView);

        //Setting the max and minimum values of the seek bar
        timesTableSeekBar.setMax(20);
        timesTableSeekBar.setProgress(10);
        //****A handy way to set the min. value for the seek bar
        timesTableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int minimum = 1;
                int timesTable;

                if(progress < minimum){
                    timesTable = minimum;
                    timesTableSeekBar.setProgress(minimum);
                }else { timesTable = progress; }

                //Dynamically change the displayed table to the value of the seek bar which is equal to the value of the timesTable variable.
                generateTimesTable(timesTable);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
        }); //End of the method on change listener.

        //Print the initial value when the app starts with the table of 10
        generateTimesTable(10);

    }
}













