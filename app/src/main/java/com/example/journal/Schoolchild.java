package com.example.journal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class Schoolchild extends Activity implements CompoundButton.OnCheckedChangeListener {
    Switch sw1, sw2;
    EditText login,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schoolchild);
        sw1 = findViewById(R.id.switch1);
        sw2 = findViewById(R.id.switch2);
        login =findViewById(R.id.editText);
        pass=findViewById(R.id.editText2);
        if (sw1 != null) {
            sw1.setOnCheckedChangeListener(this);
        }
        if (sw2 != null) {
            sw2.setOnCheckedChangeListener(this);
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.switch1:
                Toast.makeText(this, (isChecked ? "Выбран" : "Снят с выбора") + "  Ученик", Toast.LENGTH_SHORT).show();
                if (sw2.isChecked())
                    sw2.setChecked(false);

                break;
            case R.id.switch2:
                Toast.makeText(this, (isChecked ? "Выбран" : "Снят с выбора") + "  Родители", Toast.LENGTH_SHORT).show();
                if (sw1.isChecked())
                    sw1.setChecked(false);

                break;
        }
    }
    public void click1(View v){
        if (sw1.isChecked()){
            if (login.getText().toString().equals("123") && pass.getText().toString().equals("123")) {
                Intent in = new Intent(Schoolchild.this, Profile.class);
                startActivity(in);
            }else
                Toast.makeText(this, "Неправильный логин/пароль",Toast.LENGTH_SHORT).show();
        }
        else if (sw2.isChecked()){
            if (login.getText().toString().equals("123") && pass.getText().toString().equals("123")) {
                Intent in2 = new Intent(Schoolchild.this, Profile.class);
                startActivity(in2);
            }
            else
                Toast.makeText(this, "Неправильный логин/пароль",Toast.LENGTH_SHORT).show();
        }

        else {
            Toast.makeText(this, "Выберите что-нибудь",Toast.LENGTH_SHORT).show();
        }
    }
}
