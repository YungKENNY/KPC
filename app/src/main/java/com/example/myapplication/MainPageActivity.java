package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPageActivity extends AppCompatActivity {
    Button button_2,button_, button_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        button_2 = findViewById(R.id.button2);
        button_3 = findViewById(R.id.button3);
        button_ = findViewById(R.id.button);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPageActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPageActivity.this,CallScheduleActivity.class);
                startActivity(intent);
            }
        });
        button_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPageActivity.this,WebsiteActivity.class);
                startActivity(intent);
            }
        });
    }
    public void startNewActivity(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}