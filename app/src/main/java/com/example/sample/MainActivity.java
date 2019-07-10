package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button myBtn;
    EditText myTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBtn = findViewById(R.id.btnNext);
        //bind btn obj to the xml btn
        myTxt = findViewById(R.id.addText);
        //bind edit text to the xml
    }

    public void btnOnClick(View view) {

        Intent i = new Intent(this,secondTask.class);

        i.putExtra("KEY",myTxt.getText().toString()); //sending data from edit text to the next activity

        startActivity(i);
    }
}
