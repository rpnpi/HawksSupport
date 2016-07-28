package com.webhawksit.hawkssupport;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {

    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/fontawesome-webfont.ttf");
        TextView textView = (TextView) findViewById(R.id.getStart);
        textView.setTypeface(font);
        textView.setText("Get Started    " + "\uF061");



    }
}
