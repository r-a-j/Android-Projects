package com.example.er_ra.guessnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void generateRandomNumber () {

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;

    }
    public void guessFunction(View view) {

        EditText numberEditText = (EditText) findViewById(R.id.numberEditText);
        int guessedValue = Integer.parseInt(numberEditText.getText().toString());

        if(guessedValue > 20 || guessedValue < 1) {
            Toast.makeText(this, "Invalid Range", Toast.LENGTH_LONG).show();
        }
        else {
            if(guessedValue > randomNumber) {
                Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
            }
            if(guessedValue < randomNumber) {
                Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
            }
            if(guessedValue == randomNumber) {
                Toast.makeText(this, "Correct Congratzz..!", Toast.LENGTH_LONG).show();
                generateRandomNumber();
            }
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();
        
    }
}
