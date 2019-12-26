package com.example.journal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileTeacher extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profteach);
    }
    public void click(View v) {
        switch (v.getId()) {
            case R.id.button4:
                Intent di = new Intent(ProfileTeacher.this, TeachDiary.class);
                //di.putExtra("keyName", );
                startActivity(di);
                break;
            case R.id.button5:
                Intent cl = new Intent(ProfileTeacher.this, Class.class);
                startActivity(cl);
                break;
            case R.id.button6:
                Intent sc = new Intent(ProfileTeacher.this, School.class);
                startActivity(sc);
                break;
        }
    }
}
