package com.example.sharedpreference_login_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Logout_Activity extends AppCompatActivity {
    Button logout;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        logout=findViewById(R.id.logout);

        preferences=getSharedPreferences("Aashu",0);
        editor=preferences.edit();

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putBoolean("loginposition",false);
                editor.apply();
                Intent intent=new Intent(Logout_Activity.this,Home_Activity.class);
                startActivity(intent);


            }
        });
    }
}