package com.example.unitconverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void buttonClicked_go_settings(View view) {
        Intent settings_intent = new Intent(this, Settings.class);
        startActivity(settings_intent);
    }

    public void buttonClicked_celsius_to_fahren(View view){
        Intent cTf_intent = new Intent(this, CelsiusToFahren.class);
        startActivity(cTf_intent);
    }

    public void buttonClicked_fahren_to_celsius(View view){
        Intent fTc_intent = new Intent(this, FahrenToCelsius.class);
        startActivity(fTc_intent);
    }
}
