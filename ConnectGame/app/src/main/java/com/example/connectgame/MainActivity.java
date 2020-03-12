package com.example.connectgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Yellow=0, Red=1;
    int activePlayer = 0;

    boolean gameIsActive = true;

    //2 means the value isn't played
    int[] gameState = {2,2,2,2,2,2,2,2,2};

    int[][] winningPositions = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};

    public void dropin(View viw){
        ImageView counter =(ImageView) viw;
        int tappedCounter = Integer.parseInt(counter.getTag().toString());
        TextView winnerMessage = (TextView) findViewById(R.id.winnerMessage);
        LinearLayout layout = (LinearLayout) findViewById(R.id.playAgainLayout);


        if(gameState[tappedCounter] == 2 && gameIsActive) {

            gameState[tappedCounter] = activePlayer;

            counter.setTranslationY(-1000f);
            System.out.println(counter.getTag().toString());

            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.yellow);
                activePlayer = 1;
            } else {
                counter.setImageResource(R.drawable.red);
                activePlayer = 0;
            }

            counter.animate().translationYBy(1000f).rotation(360).setDuration(300);

            for(int[] winningPosition: winningPositions){
                if (gameState[winningPosition[0]] == gameState[winningPosition[1]]
                        && gameState[winningPosition[1]] == gameState[winningPosition[2]]
                        && gameState[winningPosition[0]] != 2) {

                    //when a winner is declared...
                    gameIsActive = false;
                    String winner = "Red";
                    if(gameState[winningPosition[0]] == 0){
                        winner = "Yellow";
                    }

                    layout.setVisibility(View.VISIBLE);
                    winnerMessage.setText(winner + " has won!");
                    //Finish declaring the winner

                }else{
                    boolean gameIsOver = true;
                    for(  int counterState: gameState){
                        if(counterState == 2){gameIsOver = false;}
                    }

                    if(gameIsOver){
                        winnerMessage.setText("Woops! it's a draw");
                        layout.setVisibility(View.VISIBLE);
                    }
                }

             //End of for loop searches for the winning positions
            }

        //end of the gameState condition
        }

     //End of dropIn method
    }



    public void playAgain(View view){
        LinearLayout layout = (LinearLayout) findViewById(R.id.playAgainLayout);
        layout.setVisibility(View.INVISIBLE);

        //Yellow=0, Red=1;
         activePlayer = 0;

        //2 means the value isn't played = resetting game state to the initial state
        for(int i=0; i<gameState.length; i++){ gameState[i] = 2;}

        gameIsActive = true;

        androidx.gridlayout.widget.GridLayout gridLayout = findViewById(R.id.gridLayout);
        for(int i=0; i<gridLayout.getChildCount(); i++){ ((ImageView)gridLayout.getChildAt(i)).setImageResource(0);}
        //this line walks through each image view and returns its resource to 0 = an empty image

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
