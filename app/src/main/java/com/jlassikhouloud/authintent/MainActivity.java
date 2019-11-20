package com.jlassikhouloud.authintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    final String EXTRA_LOGIN ="user_login";
    final String EXTRA_PASSWORD ="user_password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText login =findViewById(R.id.user_email);
        final EditText pass =findViewById(R.id.user_password);
        final Button loginButton = findViewById(R.id.connect);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String loginTxt =login.getText().toString();
                final String passTxt =pass.getText().toString();

                Intent intent =new Intent( MainActivity.this, activity_login_display2.class);
                intent.putExtra(EXTRA_LOGIN,loginTxt);
                intent.putExtra(EXTRA_PASSWORD,passTxt);
                startActivity(intent);
            }
        });
    }

}
