package com.example.journal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent uc = new Intent(MainActivity.this, Schoolchild.class);
                startActivity(uc);
                break;
            case R.id.button2:
                Intent so = new Intent(MainActivity.this, Worker.class);
                startActivity(so);
                break;
        }
    }
}
