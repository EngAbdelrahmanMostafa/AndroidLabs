package com.iti.android.dayone.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
Button LoginButton,CloseButton;
EditText Name;
EditText Pass;

public static final String UserNameKey="USERNAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginButton=findViewById(R.id.Login_btn);
        CloseButton=findViewById(R.id.Close_btn);
        Name=findViewById(R.id.Name_inp);
        Pass=findViewById(R.id.Pass_inp);
        LoginButton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               if(checkLogin(Name,Pass)){
                                                   proceedToNextActivity(Name);
                                               }
                                               else
                                                   Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_SHORT).show();
                                           }
                                       }
        );
        CloseButton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                           System.exit(0);
                                           }
                                       }
        );
    }
    private void proceedToNextActivity(EditText Name){
        Intent intent =new Intent(getApplicationContext(),WelcomePage.class);
        String Name_val=Name.getText().toString();
        Bundle bundle=new Bundle();
        bundle.putString(UserNameKey,Name_val);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private boolean checkLogin(EditText Name, EditText Pass){
       String Name_val=Name.getText().toString();
       String Pass_val=Pass.getText().toString();
        if (checkUserName(Name_val)&&checkPassword(Pass_val)){
            return true;
        }
        else return false;
    }
    private boolean checkUserName(String Name){
        if (Name.equalsIgnoreCase(""))
        {
            return false;
        }
        else return true;
    }
    private boolean checkPassword (String Pass){
        if (Pass.equals("123")){
            return true;
        }
        else return false;
    }
}