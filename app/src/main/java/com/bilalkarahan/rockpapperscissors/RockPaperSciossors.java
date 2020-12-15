package com.bilalkarahan.rockpapperscissors;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class RockPaperSciossors extends AppCompatActivity {
    Singleton singleton = Singleton.getInstance();
    ImageView imageView;
    TextView resultText;
    TextView userScoreText;
    TextView cpuScoreText;
    Bitmap rock;
    Bitmap paper;
    Bitmap scissors;
    int userScore;
    int cpuScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_sciossors);

        userScore = 0;
        cpuScore = 0;

        imageView = findViewById(R.id.imageView);
        resultText = findViewById(R.id.resultText);
        userScoreText = findViewById(R.id.userScoreText);
        cpuScoreText = findViewById(R.id.cpuScoreText);

        rock = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.stone);
        paper = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.paper);
        scissors = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.scissors);

        userScoreText.setText("Your Score: " + userScore);
        cpuScoreText.setText("CPU Score: " + cpuScore);


    }


    public void rock(View view) {
        Random r = new Random();
        int random = r.nextInt(3);
        switch (random) {
            case 0:
                singleton.setChosenImage(rock);
                imageView.setImageBitmap(singleton.getChosenImage());
                resultText.setText("Draw!");
                break;
            case 1:
                singleton.setChosenImage(paper);
                imageView.setImageBitmap(singleton.getChosenImage());
                resultText.setText("You've Lost!");
                cpuScore++;
                userScoreText.setText("Your Score: " + userScore);
                cpuScoreText.setText("CPU Score: " + cpuScore);

                break;
            case 2:
                singleton.setChosenImage(scissors);
                imageView.setImageBitmap(singleton.getChosenImage());
                resultText.setText("You've Won");
                userScore++;
                userScoreText.setText("Your Score: " + userScore);
                cpuScoreText.setText("CPU Score: " + cpuScore);

                break;
        }
        if (cpuScore == 5) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("RESTART");
            alert.setMessage("You've lost the game. Play again?");
            alert.setCancelable(false);
            alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            });
            alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            });
            alert.show();}
        else if (userScore == 5) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("RESTART");
            alert.setMessage("You've won the game. Play again?");
            alert.setCancelable(false);
            alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            });
            alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            });
            alert.show();
        }
    }

    public void paper(View view) {
        Random r = new Random();
        int random = r.nextInt(3);
        switch (random) {
            case 0:
                singleton.setChosenImage(rock);
                imageView.setImageBitmap(singleton.getChosenImage());
                resultText.setText("You've Won!");
                userScore++;
                userScoreText.setText("Your Score: " + userScore);
                cpuScoreText.setText("CPU Score: " + cpuScore);

                break;
            case 1:
                singleton.setChosenImage(paper);
                imageView.setImageBitmap(singleton.getChosenImage());
                resultText.setText("Draw!");
                break;
            case 2:
                singleton.setChosenImage(scissors);
                imageView.setImageBitmap(singleton.getChosenImage());
                resultText.setText("You've Lost!");
                cpuScore++;
                userScoreText.setText("Your Score: " + userScore);
                cpuScoreText.setText("CPU Score: " + cpuScore);

                break;
        }
        if (cpuScore == 5) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("RESTART");
            alert.setMessage("You've lost the game. Play again?");
            alert.setCancelable(false);
            alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            });
            alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            });
            alert.show();}
        else if (userScore == 5) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("RESTART");
            alert.setMessage("You've won the game. Play again?");
            alert.setCancelable(false);
            alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            });
            alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            });
            alert.show();
        }

            }

    public void scissors (View view){
                Random r = new Random();
                int random = r.nextInt(3);
                switch (random) {
                    case 0:
                        singleton.setChosenImage(rock);
                        imageView.setImageBitmap(singleton.getChosenImage());
                        resultText.setText("You've Lost!");
                        cpuScore++;
                        userScoreText.setText("Your Score: " + userScore);
                        cpuScoreText.setText("CPU Score: " + cpuScore);

                        break;
                    case 1:
                        singleton.setChosenImage(paper);
                        imageView.setImageBitmap(singleton.getChosenImage());
                        resultText.setText("You've Won!");
                        userScore++;
                        userScoreText.setText("Your Score: " + userScore);
                        cpuScoreText.setText("CPU Score: " + cpuScore);

                        break;
                    case 2:
                        singleton.setChosenImage(scissors);
                        imageView.setImageBitmap(singleton.getChosenImage());
                        resultText.setText("Draw!");

                        break;
                }
                if (cpuScore == 5) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("RESTART");
                    alert.setMessage("You've lost the game. Play again?");
                    alert.setCancelable(false);
                    alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = getIntent();
                            finish();
                            startActivity(intent);
                        }
                    });
                    alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                        }
                    });
                    alert.show();}
        else if (userScore == 5) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(this);
                        alert.setTitle("RESTART");
                        alert.setMessage("You've won the game. Play again?");
                        alert.setCancelable(false);
                        alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = getIntent();
                                finish();
                                startActivity(intent);
                            }
                        });
                        alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        alert.show();
                    }
                }

            }
