package com.example.android.baseballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.baseballcounter.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int outsTeamA = 0;
    int scoreTeamB = 0;
    int outsTeamB = 0;
    int innings = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClickSetTeamA(View v) {
        TextView displayTeamAName = (TextView) findViewById(R.id.team_a_name);
        EditText editTeamAName = (EditText) findViewById(R.id.edit_text_team_a_name);
        displayTeamAName.setText(editTeamAName.getText().toString());
        displayTeamAName.setTextSize(32);

        View btnA = findViewById(R.id.btn_set_team_a_name);
        btnA.setVisibility(View.GONE);
        editTeamAName.setVisibility(View.GONE);
    }

    public void btnClickSetTeamB(View v) {
        TextView displayTeamBName = (TextView) findViewById(R.id.team_b_name);
        EditText editTeamBName = (EditText) findViewById(R.id.edit_text_team_b_name);
        displayTeamBName.setText(editTeamBName.getText().toString());
        displayTeamBName.setTextSize(32);

        View btnB = findViewById(R.id.btn_set_team_b_name);
        btnB.setVisibility(View.GONE);
        editTeamBName.setVisibility(View.GONE);
    }

    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void btnMinusRunTeamA(View v) {
        if (scoreTeamA <=0) {
         scoreTeamA = scoreTeamA  ;
        }
        else {
            scoreTeamA = scoreTeamA - 1;
            displayScoreForTeamA(scoreTeamA);
        }
    }

    public void btnAddRunTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void btnMinusRunTeamB(View v) {
        if (scoreTeamB <= 0) {
            scoreTeamB = scoreTeamB;
        } else {
            scoreTeamB = scoreTeamB - 1;
            displayScoreForTeamB(scoreTeamB);
        }
    }

    public void btnAddRunTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);

    }

    public void displayOutsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_outs);
        scoreView.setText(String.valueOf(score));
    }

    public void btnMinusOutTeamA(View v) {
        if (outsTeamA <=0) {
            outsTeamA = outsTeamA  ;
        }
        else {
            outsTeamA = outsTeamA - 1;
            displayOutsForTeamA(outsTeamA);
        }
    }

    public void btnAddOutTeamA(View v) {
        if (outsTeamA ==3)
        {
            outsTeamA = outsTeamA;
        }
        else {
            outsTeamA = outsTeamA + 1;
            displayOutsForTeamA(outsTeamA);
        }

    }

    public void displayOutsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_outs);
        scoreView.setText(String.valueOf(score));
    }

    public void btnMinusOutTeamB(View v) {
        if (outsTeamB <=0) {
            outsTeamB = outsTeamB  ;
        }
        else {
            outsTeamB = outsTeamB - 1;
            displayOutsForTeamB(outsTeamB);
        }
    }

    public void btnAddOutTeamB(View v) {
        if (outsTeamB ==3)
        {
            outsTeamB = outsTeamB;
        }
        else {
            outsTeamB = outsTeamB + 1;
            displayOutsForTeamB(outsTeamB);
        }

    }

    public void displayInnings(int innings) {
        TextView inningsView = (TextView) findViewById(R.id.txtInnings);
        inningsView.setText(String.valueOf(innings));
    }

    public void btnNextInning(View v) {
        innings = innings + 1;
        displayInnings(innings);
        outsTeamA = 0;
        outsTeamB = 0;
        displayOutsForTeamA(outsTeamA);
        displayOutsForTeamB(outsTeamB);
    }

    public void resetGame(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        outsTeamA = 0;
        outsTeamB = 0;
        innings = 1;

        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayInnings(innings);

        displayOutsForTeamA(outsTeamA);
        displayOutsForTeamB(outsTeamB);


        View btnA = findViewById(R.id.btn_set_team_a_name);
        btnA.setVisibility(View.VISIBLE);

        EditText editTeamAName = (EditText) findViewById(R.id.edit_text_team_a_name);
        editTeamAName.setVisibility(View.VISIBLE);
        editTeamAName.setText("");

        TextView displayTeamAName = (TextView) findViewById(R.id.team_a_name);
        displayTeamAName.setText("");


        View btnB = findViewById(R.id.btn_set_team_b_name);
        btnB.setVisibility(View.VISIBLE);

        EditText editTeamBName = (EditText) findViewById(R.id.edit_text_team_b_name);
        editTeamBName.setVisibility(View.VISIBLE);
        editTeamBName.setText("");

        TextView displayTeamBName = (TextView) findViewById(R.id.team_b_name);
        displayTeamBName.setText("");

    }


}
