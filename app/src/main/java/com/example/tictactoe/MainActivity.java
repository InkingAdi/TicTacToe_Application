package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView txt_player_score_1, txt_player_score_2;
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_reset;
    String[] moves = new String[]{"","","","","","","","","",""};

    public static String LOG_NAME = "DEBUG";
    public static String ACTIVITY_LIFE_CYCLE = "ACTIVITY";

    public static Boolean MOVES_FLAG = true;
    public static Boolean PLAYER_WON = false;

    public static Integer moves_count = 0;
    public static Integer PLAYER_1 = 0;
    public static Integer PLAYER_2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_player_score_1 = findViewById(R.id.txt_player_score_1);
        txt_player_score_2 = findViewById(R.id.txt_player_score_2);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_reset = findViewById(R.id.btn_reset);

        //Reset Buttons and variables when user click to reset button
        btn_reset.setOnClickListener(view -> {
            Log.d(LOG_NAME,"Reset was clicked");
            //CALL RESET FUNCTION
            reset_button();
            Log.d(LOG_NAME,"Reset completed Successfully");
        });

        btn_1.setOnClickListener( view -> {
            if(MOVES_FLAG){
                moves[0] = "X";
                btn_1.setText("X");
                MOVES_FLAG = false;
                btn_1.setClickable(false);
                who_won();
            }else {
                moves[0] = "O";
                MOVES_FLAG = true;
                btn_1.setText("O");
                btn_1.setClickable(false);
                who_won();
            }
        });

        btn_2.setOnClickListener(view -> {
            if(MOVES_FLAG){
                moves[1] = "X";
                btn_2.setText("X");
                MOVES_FLAG = false;
                btn_2.setClickable(false);
                who_won();
            }else {
                moves[1] = "O";
                btn_2.setText("O");
                MOVES_FLAG = true;
                btn_2.setClickable(false);
                who_won();
            }
        });

        btn_3.setOnClickListener(view -> {
            if(MOVES_FLAG){
                moves[2] = "X";
                btn_3.setText("X");
                MOVES_FLAG = false;
                btn_3.setClickable(false);
                who_won();
            }else {
                moves[2] = "O";
                MOVES_FLAG = true;
                btn_3.setText("O");
                btn_3.setClickable(false);
                who_won();
            }
        });

        btn_4.setOnClickListener(view -> {
            if(MOVES_FLAG){
                moves[3] = "X";
                MOVES_FLAG = false;
                btn_4.setText("X");
                btn_4.setClickable(false);
                who_won();
            }else {
                moves[3] = "O";
                MOVES_FLAG = true;
                btn_4.setText("O");
                btn_4.setClickable(false);
                who_won();
            }
        });

        btn_5.setOnClickListener(view -> {
            if(MOVES_FLAG){
                moves[4] = "X";
                MOVES_FLAG = false;
                btn_5.setText("X");
                btn_5.setClickable(false);
                who_won();
            }else {
                moves[4] = "O";
                MOVES_FLAG = true;
                btn_5.setText("O");
                btn_5.setClickable(false);
                who_won();
            }
        });

        btn_6.setOnClickListener(view -> {
            if(MOVES_FLAG){
                moves[5] = "X";
                MOVES_FLAG = false;
                btn_6.setText("X");
                btn_6.setClickable(false);
                who_won();
            }else {
                moves[5] = "O";
                MOVES_FLAG = true;
                btn_6.setText("O");
                btn_6.setClickable(false);
                who_won();
            }
        });

        btn_7.setOnClickListener(view -> {
            if(MOVES_FLAG){
                moves[6] = "X";
                MOVES_FLAG = false;
                btn_7.setText("X");
                btn_7.setClickable(false);
                who_won();
            }else {
                moves[6] = "O";
                MOVES_FLAG = true;
                btn_7.setText("O");
                btn_7.setClickable(false);
                who_won();
            }
        });

        btn_8.setOnClickListener(view -> {
            if(MOVES_FLAG){
                moves[7] = "X";
                MOVES_FLAG = false;
                btn_8.setText("X");
                btn_8.setClickable(false);
                who_won();
            }else {
                moves[7] = "O";
                MOVES_FLAG = true;
                btn_8.setText("O");
                btn_8.setClickable(false);
                who_won();
            }
        });

        btn_9.setOnClickListener(view -> {
            if(MOVES_FLAG){
                moves[8] = "X";
                MOVES_FLAG = false;
                btn_9.setText("X");
                btn_9.setClickable(false);
                who_won();
            }else {
                moves[8] = "O";
                MOVES_FLAG = true;
                btn_9.setText("O");
                btn_9.setClickable(false);
                who_won();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(ACTIVITY_LIFE_CYCLE, "ON_START was called !");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(ACTIVITY_LIFE_CYCLE,"ON_RESUME was called !");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(ACTIVITY_LIFE_CYCLE,"ON_PAUSE was called !");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(ACTIVITY_LIFE_CYCLE,"ON_STOP was called !");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(ACTIVITY_LIFE_CYCLE,"ON_RESTART was called !");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(ACTIVITY_LIFE_CYCLE, "ON_DESTROY was called !");
    }

    public void reset_button(){

        //button to null
        btn_1.setText("");
        btn_2.setText("");
        btn_3.setText("");
        btn_4.setText("");
        btn_5.setText("");
        btn_6.setText("");
        btn_7.setText("");
        btn_8.setText("");
        btn_9.setText("");

        btn_1.setClickable(true);
        btn_2.setClickable(true);
        btn_3.setClickable(true);
        btn_4.setClickable(true);
        btn_5.setClickable(true);
        btn_6.setClickable(true);
        btn_7.setClickable(true);
        btn_8.setClickable(true);
        btn_9.setClickable(true);

        //Clearing ArrayList
        //moves = new String[]{"","","","","","","","","",""};
        Arrays.fill(moves, "");
        if(MOVES_FLAG){MOVES_FLAG = false;}else {MOVES_FLAG = false;}
        PLAYER_WON = false;

        moves_count = 0;

    }

    public void who_won()
    {
            moves_count+=1;

            //DRAW
            if ( moves_count > 9 && !PLAYER_WON) {
                Toast.makeText(this, "Match Drawn !", Toast.LENGTH_LONG).show();
                reset_button();
            }

            //0 1 2
            if (moves[0].trim().equals("X") && moves[1].trim().equals("X") && moves[2].trim().equals("X")) {
                //Player 1 WON
                PLAYER_WON = true;
                PLAYER_1 += 1;
                txt_player_score_1.setText(String.valueOf(PLAYER_1));
                reset_button();
                Toast.makeText(this, "Player 1 Won !", Toast.LENGTH_LONG).show();

            } else if (moves[0].trim().equals("O") && moves[1].trim().equals("O") && moves[2].trim().equals("O")) {
                //Player 2 WON
                PLAYER_WON = true;
                PLAYER_2 += 1;
                txt_player_score_2.setText(String.valueOf(PLAYER_2));
                reset_button();
                Toast.makeText(this, "Player 2 Won !", Toast.LENGTH_LONG).show();

            }

            //3 4 5
            if (moves[3].trim().equals("X") && moves[4].trim().equals("X") && moves[5].trim().equals("X")) {
                //Player 1 WON
                PLAYER_WON = true;
                PLAYER_1 += 1;
                txt_player_score_1.setText(String.valueOf(PLAYER_1));
                Toast.makeText(this, "Player 1 Won !", Toast.LENGTH_LONG).show();
                reset_button();

            } else if (moves[3].trim().equals("O") && moves[4].trim().equals("O") && moves[5].trim().equals("O")) {
                //Player 2 WON
                PLAYER_WON = true;
                PLAYER_2 += 1;
                txt_player_score_2.setText(String.valueOf(PLAYER_2));
                Toast.makeText(this, "Player 2 Won !", Toast.LENGTH_LONG).show();
                reset_button();
            }

            //6 7 8
            if (moves[6].trim().equals("X") && moves[7].trim().equals("X") && moves[8].trim().equals("X")) {
                //Player 1 WON
                PLAYER_WON = true;
                PLAYER_1 += 1;
                txt_player_score_1.setText(String.valueOf(PLAYER_1));
                Toast.makeText(this, "Player 1 Won !", Toast.LENGTH_LONG).show();
                reset_button();
            } else if (moves[6].trim().equals("O") && moves[7].trim().equals("O") && moves[8].trim().equals("O")) {
                //Player 2 WON
                PLAYER_WON = true;
                PLAYER_2 += 1;
                txt_player_score_2.setText(String.valueOf(PLAYER_2));
                Toast.makeText(this, "Player 2 Won !", Toast.LENGTH_LONG).show();
                reset_button();
            }

            //0 3 6
            if (moves[0].trim().equals("X") && moves[3].trim().equals("X") && moves[6].trim().equals("X")) {
                //Player 1 WON
                PLAYER_WON = true;
                PLAYER_1 += 1;
                txt_player_score_1.setText(String.valueOf(PLAYER_1));
                Toast.makeText(this, "Player 1 Won !", Toast.LENGTH_LONG).show();
                reset_button();
            } else if (moves[0].trim().equals("O") && moves[3].trim().equals("O") && moves[6].trim().equals("O")) {
                //Player 2 WON
                PLAYER_WON = true;
                PLAYER_2 += 1;
                txt_player_score_2.setText(String.valueOf(PLAYER_2));
                Toast.makeText(this, "Player 2 Won !", Toast.LENGTH_LONG).show();
                reset_button();
            }

            //1 4 7
            if (moves[1].trim().equals("X") && moves[4].trim().equals("X") && moves[7].trim().equals("X")) {
                //Player 1 WON
                PLAYER_WON = true;
                PLAYER_1 += 1;
                txt_player_score_1.setText(String.valueOf(PLAYER_1));
                Toast.makeText(this, "Player 1 Won !", Toast.LENGTH_LONG).show();
                reset_button();

            } else if (moves[1].trim().equals("O") && moves[4].trim().equals("O") && moves[7].trim().equals("O")) {
                //Player 2 WON
                PLAYER_WON = true;
                PLAYER_2 += 1;
                txt_player_score_2.setText(String.valueOf(PLAYER_2));
                Toast.makeText(this, "Player 2 Won !", Toast.LENGTH_LONG).show();
                reset_button();
            }

            //2 5 8
            if (moves[2].trim().equals("X") && moves[5].trim().equals("X") && moves[8].trim().equals("X")) {
                //Player 1 WON
                PLAYER_WON = true;
                PLAYER_1 += 1;
                txt_player_score_1.setText(String.valueOf(PLAYER_1));
                Toast.makeText(this, "Player 1 Won !", Toast.LENGTH_LONG).show();
                reset_button();

            } else if (moves[2].trim().equals("O") && moves[5].trim().equals("O") && moves[8].trim().equals("O")) {
                //Player 2 WON
                PLAYER_WON = true;
                PLAYER_2 += 1;
                Toast.makeText(this, "Player 2 Won !", Toast.LENGTH_LONG).show();
                txt_player_score_2.setText(String.valueOf(PLAYER_2));
                reset_button();
            }

            //0 4 8
            if (moves[0].trim().equals("X") && moves[4].trim().equals("X") && moves[8].trim().equals("X")) {
                //Player 1 WON
                PLAYER_WON = true;
                PLAYER_1 += 1;
                txt_player_score_1.setText(String.valueOf(PLAYER_1));
                Toast.makeText(this, "Player 1 Won !", Toast.LENGTH_LONG).show();
                reset_button();

            } else if (moves[0].trim().equals("O") && moves[4].trim().equals("O") && moves[8].trim().equals("O")) {
                //Player 2 WON
                PLAYER_WON = true;
                PLAYER_2 += 1;
                txt_player_score_2.setText(String.valueOf(PLAYER_2));
                Toast.makeText(this, "Player 2 Won !", Toast.LENGTH_LONG).show();
                reset_button();
            }

            //2 4 6
            if (moves[2].trim().equals("X") && moves[4].trim().equals("X") && moves[6].trim().equals("X")) {
                //Player 1 WON
                PLAYER_WON = true;
                PLAYER_1 += 1;
                txt_player_score_1.setText(String.valueOf(PLAYER_1));
                Toast.makeText(this, "Player 1 Won !", Toast.LENGTH_LONG).show();
                reset_button();

            } else if (moves[2].trim().equals("O") && moves[4].trim().equals("O") && moves[6].trim().equals("O")) {
                //Player 2 WON
                PLAYER_WON = true;
                PLAYER_2 += 1;
                txt_player_score_2.setText(String.valueOf(PLAYER_2));
                Toast.makeText(this, "Player 2 Won !", Toast.LENGTH_LONG).show();
                reset_button();
            }
    }

}