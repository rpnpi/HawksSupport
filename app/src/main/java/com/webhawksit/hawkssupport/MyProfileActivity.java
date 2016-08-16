package com.webhawksit.hawkssupport;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {

    TextView textView, firstName, lastName, email, phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/fontawesome-webfont.ttf");
        TextView textView = (TextView) findViewById(R.id.getStart);
        textView.setTypeface(font);
        textView.setText("Get Started    " + "\uF061");

        String firstname = getIntent().getStringExtra("firstName");
        firstName = (TextView) findViewById(R.id.firstNameView);
        firstName.setText(firstname);

        lastName = (TextView) findViewById(R.id.lastNameView);
        lastName.setText(getIntent().getStringExtra("lastName"));

        email = (TextView) findViewById(R.id.emailView);
        email.setText(getIntent().getStringExtra("email"));

        phoneNumber = (TextView) findViewById(R.id.phoneNumberView);
        String phone = getIntent().getStringExtra("phoneNumber");
        phoneNumber.setText("0"+phone);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                startActivity(intent);
            }
        });


    }
}
