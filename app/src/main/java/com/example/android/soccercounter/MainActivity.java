package com.example.android.soccercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowCardsTeamA = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamA = 0;
    int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Displays the score for Team A.
    public void displayForTeamA(int number) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(number));
    }

    // Displays the number of yellow cards for Team A.
    public void displayYellowCardsTeamA(int number) {
        TextView yellowView = (TextView) findViewById(R.id.team_a_yellow_card);
        yellowView.setText(String.valueOf(number));
    }

    // Displays the number of red cards for Team A.
    public void displayRedCardsTeamA(int number) {
        TextView redView = (TextView) findViewById(R.id.team_a_red_card);
        redView.setText(String.valueOf(number));
    }

    // Increases the score for Team A.
    public void goalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    // Increases the number of yellow cards for Team A.
    public void yellowCardForTeamA(View v) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayYellowCardsTeamA(yellowCardsTeamA);
    }

    // Increases the number of red cards for Team A.
    public void redCardForTeamA(View v) {
        redCardsTeamA = redCardsTeamA + 1;
        displayRedCardsTeamA(redCardsTeamA);
    }

    // Displays the given score for Team B.
    public void displayForTeamB(int number) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(number));
    }

    // Displays the number of yellow cards for Team A.
    public void displayYellowCardsTeamB(int number) {
        TextView yellowView = (TextView) findViewById(R.id.team_b_yellow_card);
        yellowView.setText(String.valueOf(number));
    }

    // Displays the number of red cards for Team A.
    public void displayRedCardsTeamB(int number) {
        TextView redView = (TextView) findViewById(R.id.team_b_red_card);
        redView.setText(String.valueOf(number));
    }

    // Increases the score for Team B.
    public void goalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    // Increases the number of yellow cards for Team B.
    public void yellowCardForTeamB(View v) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayYellowCardsTeamB(yellowCardsTeamB);
    }

    // Increases the number of red cards for Team B.
    public void redCardForTeamB(View v) {
        redCardsTeamB = redCardsTeamB + 1;
        displayRedCardsTeamB(redCardsTeamB);
    }

    // Reset Button
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowCardsTeamA = 0;
        yellowCardsTeamB = 0;
        redCardsTeamA = 0;
        redCardsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayYellowCardsTeamA(yellowCardsTeamA);
        displayRedCardsTeamA(yellowCardsTeamA);
        displayYellowCardsTeamB(redCardsTeamB);
        displayRedCardsTeamB(redCardsTeamB);
    }

}