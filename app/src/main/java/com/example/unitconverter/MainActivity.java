package com.example.unitconverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends Activity {

    public boolean text_bool = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sizeOfText();
    }

    public void sizeOfText(){
        final float main_normal_textSize = Settings.normal_textSize;

        if(!text_bool){
            TextView title = (TextView)findViewById(R.id.main_title);
            title.setTextSize(main_normal_textSize);
        }

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

    public void buttonClicked_kilo_to_mile(View view){
        Intent kTm_intent = new Intent(this, KiloToMile.class);
        startActivity(kTm_intent);
    }
}
