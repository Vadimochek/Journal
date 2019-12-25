package com.example.journal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
    }
    // придумать как вывести ФИО в заголовке
    public void click(View v) {
        switch (v.getId()) {
            case R.id.button4:
                Intent di = new Intent(Profile.this, Diary.class);
                startActivity(di);
                break;
            case R.id.button5:
                Intent cl = new Intent(Profile.this, Class.class);
                startActivity(cl);
                break;
            case R.id.button6:
                Intent sc = new Intent(Profile.this, School.class);
                startActivity(sc);
                break;
        }
    }

}
