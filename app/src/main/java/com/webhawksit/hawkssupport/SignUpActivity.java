package com.webhawksit.hawkssupport;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    TextView textView, footerTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Typeface font = Typeface.createFromAsset( getAssets(), "fonts/fontawesome-webfont.ttf" );
        TextView textView = (TextView) findViewById( R.id.footerTextSingUp );
        textView.setTypeface(font);
        textView.setText("My profile   "+"\uf061");

        TextView footerTextView = (TextView) findViewById(R.id.footerTextSingUp);
        footerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MyProfileActivity.class);
                startActivity(intent);
            }
        });


    }
}
