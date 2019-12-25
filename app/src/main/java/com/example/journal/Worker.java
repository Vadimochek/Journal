package com.example.journal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class Worker extends Activity implements CompoundButton.OnCheckedChangeListener {
    Switch sw1,sw2,sw3,sw4;
    EditText log;
    EditText pas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.worker);
        sw1 =  findViewById(R.id.switch10);
        sw2 =  findViewById(R.id.switch20);
        sw4 =  findViewById(R.id.switch4);
        log=findViewById(R.id.editText);
        pas=findViewById(R.id.editText2);
       if (sw1 != null) {
            sw1.setOnCheckedChangeListener(this);
        }
        if (sw2 != null) {
            sw2.setOnCheckedChangeListener(this);
        }

        if (sw4 != null) {
            sw4.setOnCheckedChangeListener(this);
        }
    }
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            switch (buttonView.getId()) {
                case R.id.switch10:
                    Toast.makeText(this, (isChecked ? "Выбран" : "Снят с выбора") + "  Учитель" , Toast.LENGTH_SHORT).show();
                   if (sw2.isChecked())
                       sw2.setChecked(false);

                    if (sw4.isChecked())
                        sw4.setChecked(false);
                    break;
                case R.id.switch20:
                    Toast.makeText(this, (isChecked ? "Выбран" : "Снят с выбора") + "  Директор" , Toast.LENGTH_SHORT).show();
                    if (sw1.isChecked())
                        sw1.setChecked(false);

                    if (sw4.isChecked())
                        sw4.setChecked(false);
                    break;

                case R.id.switch4:
                    Toast.makeText(this, (isChecked ? "Выбран" : "Снят с выбора")+ "  Другой сотрудник" ,Toast.LENGTH_SHORT).show();
                    if (sw1.isChecked())
                        sw1.setChecked(false);
                    if (sw2.isChecked())
                        sw2.setChecked(false);

                    break;
            }
        }

    public void click(View v){
   if (sw1.isChecked()){
       if (log.getText().toString().equals("123") && pas.getText().toString().equals("123")) {
           Intent in = new Intent(Worker.this, ProfileTeacher.class);
           startActivity(in);
       }else
       Toast.makeText(this, "Неправильный логин/пароль",Toast.LENGTH_SHORT).show();
   }
       else if (sw2.isChecked()){
       if (log.getText().toString().equals("123") && pas.getText().toString().equals("123")) {
           Intent in2 = new Intent(Worker.this, Director.class);
           startActivity(in2);
       }
       else
       Toast.makeText(this, "Неправильный логин/пароль",Toast.LENGTH_SHORT).show();
        }
       else if (sw4.isChecked()){
           if (log.getText().toString().equals("123") && pas.getText().toString().equals("123")) {
               Intent in3 = new Intent(Worker.this, Other.class);
               startActivity(in3);
           }
           else
               Toast.makeText(this, "Неправильный логин/пароль",Toast.LENGTH_SHORT).show();

        }
        else {
       Toast.makeText(this, "Выберите что-нибудь",Toast.LENGTH_SHORT).show();
   }
}
}

