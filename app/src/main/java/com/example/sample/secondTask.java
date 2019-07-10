package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondTask extends AppCompatActivity {

    Button btnExit;
    Button btnNext;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_task);
        btnExit = findViewById(R.id.btnExit);
        myTextView = findViewById(R.id.textViewReceive);
        btnNext = findViewById(R.id.btnNext);


        myTextView.setText(getIntent().getStringExtra("KEY"));  //set data from main acitivity to the 2nd activity using intent
    }

    public void clickButtons(View view) {

        switch (view.getId())
        {
            case R.id.btnExit: //this will close the current activity and go back to main act/y
                finish();
                break;

            case R.id.btnNext:
                Intent i = new Intent(this,LastActivity.class);
                startActivity(i);
                break;
        }



    }
}
