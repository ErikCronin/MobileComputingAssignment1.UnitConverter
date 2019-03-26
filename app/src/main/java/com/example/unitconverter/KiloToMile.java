package com.example.unitconverter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.text.DecimalFormat;

public class KiloToMile extends AppCompatActivity {

    private static DecimalFormat df2 = new DecimalFormat(".##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilo_to_mile);
    }

    //Variable Initialisation
    public EditText mEdit;
    public Button button;
    public double parsedDouble;

    // Celsius Button Press
    public void buttonClicked(View view) {
        button = findViewById(R.id.button_kil_to_mile);
        mEdit = findViewById(R.id.editText_kilo_to_mile);
        parsedDouble = Double.parseDouble(mEdit.getText().toString());

        // Celsius to Fahrenheit conversion
        double kTm = parsedDouble/1.609;
        String shortenedDouble = String.format("%.2f", kTm);
//        String printTheInt = Double.toString(shortenedDouble);

        //Printing conversion in Toast format
        Context context = getApplicationContext();

        CharSequence text = parsedDouble + " Kilometres is: " + shortenedDouble + " Miles.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
