package com.example.sharedpreference_login_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Boolean IsLonin=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {

               preferences=getSharedPreferences("Aashu",0);
               editor=preferences.edit();
               IsLonin=preferences.getBoolean("loginposition",false);
               Intent intent;
               if (IsLonin)
               {
                    intent=new Intent(MainActivity.this, Home_Activity.class);
               }
               else
               {
                    intent=new Intent(MainActivity.this, Logout_Activity.class);
               }
               startActivity(intent);
               finish();



           }
       },4000);




    }
}