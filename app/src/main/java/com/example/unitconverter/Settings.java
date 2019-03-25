package com.example.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Settings extends Activity {

    public float normal_textSize = 24;
    public float title_textSize = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        TextView sphinx_text = (TextView) findViewById(R.id.text_sample_example);
        sphinx_text.setTextSize(normal_textSize);
    }

    public void buttonClicked_make_text_smallest(View view){
        TextView sphinx_text = (TextView) findViewById(R.id.text_sample_example);
        normal_textSize = 12;
        sphinx_text.setTextSize(normal_textSize);
    }
}
