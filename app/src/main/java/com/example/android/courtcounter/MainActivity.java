package com.example.android.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null){
            scoreTeamA=savedInstanceState.getInt("scoreTeamA");
            scoreTeamB=savedInstanceState.getInt("scoreTeamB");
        }

        displayTeamAScore(scoreTeamA);
        displayTeamBScore(scoreTeamB);
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("scoreTeamA", scoreTeamA);
        savedInstanceState.putInt("scoreTeamB", scoreTeamB);

        super.onSaveInstanceState(savedInstanceState);
    }


    public void add3ToTeamAScore(View view){
        scoreTeamA = scoreTeamA + 3;
        displayTeamAScore(scoreTeamA);
    }

    public void add2ToTeamAScore(View view){
        scoreTeamA = scoreTeamA + 2;
        displayTeamAScore(scoreTeamA);
    }

    public void add1ToTeamAScore(View view){
        scoreTeamA = scoreTeamA + 1;
        displayTeamAScore(scoreTeamA);
    }

    public void displayTeamAScore(int score){
        TextView teamAScoreView = (TextView) findViewById(R.id.textTeamAScore);
        teamAScoreView.setText(String.valueOf(score));
    }

    public void add3ToTeamBScore(View view){
        scoreTeamB = scoreTeamB + 3;
        displayTeamBScore(scoreTeamB);
    }

    public void add2ToTeamBScore(View view){
        scoreTeamB = scoreTeamB + 2;
        displayTeamBScore(scoreTeamB);
    }

    public void add1ToTeamBScore(View view){
        scoreTeamB = scoreTeamB + 1;
        displayTeamBScore(scoreTeamB);
    }

    public void displayTeamBScore(int score){
        TextView teamAScoreView = (TextView) findViewById(R.id.textTeamBScore);
        teamAScoreView.setText(String.valueOf(score));
    }

    public void resetTeamScores(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamAScore(scoreTeamA);
        displayTeamBScore(scoreTeamB);
    }

    public void showResults(View v){

        String winTeamName;
        if (scoreTeamA > scoreTeamB) {
            winTeamName = "TEAM A";
        }
        else
        {
            winTeamName = "TEAM B";
        }

        Intent intent = new Intent(getApplicationContext(),WinnerActivity.class);
        intent.putExtra("data",winTeamName);
        startActivity(intent);

    }
}
