package com.example.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Settings extends Activity {

    public float textSize = 24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void buttonClicked_make_text_small(View view){
        TextView textChange = (TextView) findViewById(R.id.text_size_title);
        textChange.setTextSize(textSize);
    }
}
