package com.jlassikhouloud.authintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_login_display2 extends AppCompatActivity {
    final String EXTRA_LOGIN ="user_login";
    final String EXTRA_PASSWORD ="user_password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_display2);
        Intent intent =getIntent();
        TextView loginDisplay =findViewById(R.id.email_display);
        TextView passwordDispaly =findViewById(R.id.password_display);

        if(intent != null){
         loginDisplay.setText(intent.getStringExtra(EXTRA_LOGIN));
         passwordDispaly.setText(intent.getStringExtra(EXTRA_PASSWORD));
        }
    }





}
