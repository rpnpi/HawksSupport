package com.webhawksit.hawkssupport;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUpActivity extends AppCompatActivity {
    TextView textView, footerTextView;
    EditText firstName, lastName, email, password, phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/fontawesome-webfont.ttf");
        TextView textView = (TextView) findViewById(R.id.footerTextSingUp);
        textView.setTypeface(font);
        textView.setText("My profile   " + "\uf061");

        firstName = (EditText) findViewById(R.id.firstName);
        if (firstName.getText().toString().length() == 0) {
            firstName.setError("First name is required!");
        }

        lastName = (EditText) findViewById(R.id.lastName);
        email = (EditText) findViewById(R.id.emailAddress);
        phoneNumber = (EditText) findViewById(R.id.phoneNumber);

        TextView footerTextView = (TextView) findViewById(R.id.footerTextSingUp);

        footerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!firstName.getText().toString().isEmpty()) {
                    Intent intent = new Intent(getApplicationContext(), MyProfileActivity.class);

                    intent.putExtra("firstName", firstName.getText().toString());
                    intent.putExtra("lastName", lastName.getText().toString());
                    intent.putExtra("email", email.getText().toString());
                    intent.putExtra("phoneNumber", phoneNumber.getText().toString());
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "This not valid ", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
