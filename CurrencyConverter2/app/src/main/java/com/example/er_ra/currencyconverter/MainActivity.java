package com.example.er_ra.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);

        String dollar = editText.getText().toString();

        double dollarDouble = Double.parseDouble(dollar);

        Double rupeesDouble = dollarDouble * 68.84;

        String rupees = String.format("%.2f", rupeesDouble);

        Toast.makeText(this, "Rs "+rupees, Toast.LENGTH_SHORT).show();

        // Toast.makeText(this, rupees," Rs", Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
