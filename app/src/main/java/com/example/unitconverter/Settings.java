package com.example.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Settings extends Activity {

    public static float normal_textSize = 24;
    public float title_textSize = 30;

//    public TextView sphinx_text = (TextView) findViewById(R.id.text_sample_example);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        TextView sphinx_text = (TextView) findViewById(R.id.text_sample_example);
        TextView sphinx_text_title = (TextView) findViewById(R.id.text_sample_title);
        sphinx_text_title.setTextSize(title_textSize);
        sphinx_text.setTextSize(normal_textSize);
    }

    public void buttonClicked_make_text_smallest(View view){
        TextView sphinx_text = (TextView) findViewById(R.id.text_sample_example);
        TextView sphinx_text_title = (TextView) findViewById(R.id.text_sample_title);

        normal_textSize = 12;
        title_textSize = 19;

        sphinx_text_title.setTextSize(title_textSize);
        sphinx_text.setTextSize(normal_textSize);
    }

    public void buttonClicked_make_text_medium(View view){
        TextView sphinx_text = (TextView) findViewById(R.id.text_sample_example);
        TextView sphinx_text_title = (TextView) findViewById(R.id.text_sample_title);

        normal_textSize = 24;
        title_textSize = 30;

        sphinx_text_title.setTextSize(title_textSize);
        sphinx_text.setTextSize(normal_textSize);
    }
}
