package com.iti.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editText;
public static final String Name_Save = "Name_Save";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
    }
    public void saveSharedPref(View view) {
        if (!editText.getText().toString().equalsIgnoreCase("")) {
            SharedPreferences pref = getPreferences(MODE_PRIVATE);

            SharedPreferences.Editor editor = pref.edit();
            editor.putString(Name_Save, editText.getText().toString());
            editor.apply();
            editText.setText("");
        }
    }
    public void loadSharedPref(View view){
        SharedPreferences pref=getPreferences(MODE_PRIVATE);
        editText.setText(pref.getString(Name_Save, "error in name"));
    }
}