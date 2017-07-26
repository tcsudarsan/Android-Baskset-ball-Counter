package com.example.sudarsan.basketball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int TeamA = 0;
    int TeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**Adds 1 point to scoreA*/
    public void OneForTeamA(View v) {
        TeamA = TeamA + 1;
        displayScoreA(TeamA);
    }

    /**Adds 2 points to scoreA*/
    public void TwoForTeamA(View v) {
        TeamA =TeamA + 2;
        displayScoreA(TeamA);
    }

    /**Adds 3 points to scoreA*/
    public void ThreeForTeamA(View v) {
        TeamA = TeamA + 3;
        displayScoreA(TeamA);
    }

    /**Adds 1 point to scoreB*/
    public void OneForTeamB(View v) {
        TeamB = TeamB + 1;
        displayScoreB(TeamB);
    }

/**Adds 2 points to scoreB*/
    public void TwoForTeamB(View v) {
        TeamB = TeamB + 2;
        displayScoreB(TeamB);
    }

/**Adds 3 points to ScoreA*/
    public void ThreeForTeamB(View v) {
        TeamB = TeamB + 3;
        displayScoreB(TeamB);
    }

/** Reset's the existing Game*/
    public void reset(View v) {
        TeamA = 0;
        TeamB = 0;
        displayScoreA(TeamA);
        displayScoreB(TeamB);
    }

    /**display scoreB*/
    public void displayScoreA(int score) {
        TextView ViewScore = (TextView) findViewById(R.id.scoreA);
        ViewScore.setText(String.valueOf(score));
    }

    /**display scoreB*/
    public void displayScoreB(int score) {
        TextView ViewScore = (TextView) findViewById(R.id.scoreB);
        ViewScore.setText(String.valueOf(score));
    }
}