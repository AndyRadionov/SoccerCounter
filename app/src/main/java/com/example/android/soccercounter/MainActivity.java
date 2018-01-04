package com.example.android.soccercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView scoreViewTeamA;
    private Button yellowCardsViewTeamA;
    private Button redCardsViewTeamA;

    private TextView scoreViewTeamB;
    private Button yellowCardsViewTeamB;
    private Button redCardsViewTeamB;

    private int scoreTeamA = 0;
    private int yellowCardsTeamA = 0;
    private int redCardsTeamA = 0;

    private int scoreTeamB = 0;
    private int yellowCardsTeamB = 0;
    private int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewTeamA = findViewById(R.id.team_a_score);
        yellowCardsViewTeamA = findViewById(R.id.btn_yellow_card_team_a);
        redCardsViewTeamA = findViewById(R.id.btn_red_card_team_a);

        scoreViewTeamB = findViewById(R.id.team_b_score);
        yellowCardsViewTeamB = findViewById(R.id.btn_yellow_card_team_b);
        redCardsViewTeamB = findViewById(R.id.btn_red_card_team_b);
    }

    public void addOneForTeamA(View view) {
        scoreViewTeamA.setText(String.valueOf(++scoreTeamA));
    }

    public void addYellowCardForTeamA(View view) {
        yellowCardsViewTeamA.setText(String.valueOf(++yellowCardsTeamA));
    }

    public void addRedCardForTeamA(View view) {
        redCardsViewTeamA.setText(String.valueOf(++redCardsTeamA));
    }

    public void addOneForTeamB(View view) {
        scoreViewTeamB.setText(String.valueOf(++scoreTeamB));
    }

    public void addYellowCardForTeamB(View view) {
        yellowCardsViewTeamB.setText(String.valueOf(++yellowCardsTeamB));
    }

    public void addRedCardForTeamB(View view) {
        redCardsViewTeamB.setText(String.valueOf(++redCardsTeamB));
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        yellowCardsTeamA = 0;
        redCardsTeamA = 0;

        scoreViewTeamA.setText(String.valueOf(scoreTeamA));
        yellowCardsViewTeamA.setText(String.valueOf(yellowCardsTeamA));
        redCardsViewTeamA.setText(String.valueOf(redCardsTeamA));

        scoreTeamB = 0;
        yellowCardsTeamB = 0;
        redCardsTeamB = 0;

        scoreViewTeamB.setText(String.valueOf(scoreTeamB));
        yellowCardsViewTeamB.setText(String.valueOf(yellowCardsTeamB));
        redCardsViewTeamB.setText(String.valueOf(redCardsTeamB));
    }
}