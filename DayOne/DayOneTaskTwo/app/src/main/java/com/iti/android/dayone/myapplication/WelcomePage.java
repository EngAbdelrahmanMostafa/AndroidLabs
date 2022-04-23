package com.iti.android.dayone.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomePage extends AppCompatActivity {
TextView result;
Button Close_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        result=findViewById(R.id.resultView);
        result.setText("Welcome back champ,"+getIntent().getExtras().getString(MainActivity.UserNameKey));
        Close_btn=findViewById(R.id.CloseWelcome);
        Close_btn.setOnClickListener(new View.OnClickListener() {
                                                      @Override
                                                      public void onClick(View view) {
                                                          System.exit(0);
                                                      }
                                                  }
        );
    }
}