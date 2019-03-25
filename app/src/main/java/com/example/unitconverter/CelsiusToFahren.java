package com.example.unitconverter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

public class CelsiusToFahren extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius_to_fahren);
    }

    //Variable Initialisation
    public EditText mEdit;
    public Button button;
    public double parsedDouble;

    // Celsius Button Press
    public void buttonClicked(View view) {
        button = findViewById(R.id.button_celsius_to_fahren);
        mEdit = findViewById(R.id.editText_celsius_to_fahren);
        parsedDouble = Double.parseDouble(mEdit.getText().toString());

        // Celsius to Fahrenheit conversion
        double cTf = (parsedDouble * 9/5) + 32;
        String printTheInt = Double.toString(cTf);

        //Printing conversion in Toast format
        Context context = getApplicationContext();
        CharSequence text = parsedDouble + " degrees Celsius is: " + printTheInt + " Fahrenheit";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}