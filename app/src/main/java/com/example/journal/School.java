package com.example.journal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class School extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.school);
    }
    public void click(View v){
        switch (v.getId()){
            case R.id.button7:
                Intent i = new Intent(School.this, Personal.class);
                startActivity(i);
            case R.id.button8:
                Intent i1 = new Intent(School.this, Schooler.class);
                startActivity(i1);
        }
    }
}
