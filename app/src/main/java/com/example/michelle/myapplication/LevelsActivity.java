package com.example.michelle.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LevelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
    }

    public void onClickA(View view){
        Intent intent = new Intent(this, LevelA.class);
        startActivity(intent);
    }

    public void onClickB(View view){
        Intent intent = new Intent(this, LevelB.class);
        startActivity(intent);
    }
}
