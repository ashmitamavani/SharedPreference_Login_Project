package com.example.sharedpreference_login_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class Home_Activity extends AppCompatActivity {

    AppCompatEditText email,password;
    AppCompatButton Add;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        Add=findViewById(R.id.Add);

        preferences=getSharedPreferences("Aashu",0);
        editor=preferences.edit();

        String email1=email.getText().toString();
        String password1=password.getText().toString();

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putBoolean("loginposition",true);
                editor.commit();
                Intent intent=new Intent(Home_Activity.this, Logout_Activity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}