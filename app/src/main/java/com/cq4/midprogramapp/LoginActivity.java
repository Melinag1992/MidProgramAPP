package com.cq4.midprogramapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by melina.gonzalez on 12/6/17.
 */

public class LoginActivity extends AppCompatActivity{

    private EditText email;
    private EditText password;
    private CheckBox checkbox;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email_textview);
        password = findViewById(R.id.password_textview);
        checkbox = findViewById(R.id.checkbox);
        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString() == "user@aol.com" && password.getText().toString()== "password1234"){
                    Intent k = new Intent(getApplicationContext(), ListActivity.class);
                    k.putExtra("email", email.getText().toString());
                    startActivity(k);

                }
            }
        });

    }





}
