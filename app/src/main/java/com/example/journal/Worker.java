package com.example.journal;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class Worker extends Activity implements CompoundButton.OnCheckedChangeListener {
    Switch sw1,sw2,sw3,sw4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.worker);
        sw1 =  findViewById(R.id.switch10);
        sw2 =  findViewById(R.id.switch20);
        sw3 =  findViewById(R.id.switch3);
        sw4 =  findViewById(R.id.switch4);
       if (sw1 != null) {
            sw1.setOnCheckedChangeListener(this);
        }
        if (sw2 != null) {
            sw2.setOnCheckedChangeListener(this);
        }
        if (sw3 != null) {
            sw3.setOnCheckedChangeListener(this);

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
                    if (sw3.isChecked())
                   sw3.setChecked(false);
                    if (sw4.isChecked())
                        sw4.setChecked(false);
                    break;
                case R.id.switch20:
                    Toast.makeText(this, (isChecked ? "Выбран" : "Снят с выбора") + "  Директор" , Toast.LENGTH_SHORT).show();
                    if (sw1.isChecked())
                        sw1.setChecked(false);
                    if (sw3.isChecked())
                        sw3.setChecked(false);
                    if (sw4.isChecked())
                        sw4.setChecked(false);
                    break;
                case R.id.switch3:
                    Toast.makeText(this, (isChecked ? "Выбран" : "Снят с выбора") + "  Администратор",Toast.LENGTH_SHORT).show();
                    if (sw1.isChecked())
                        sw1.setChecked(false);
                    if (sw2.isChecked())
                        sw2.setChecked(false);
                    if (sw4.isChecked())
                        sw4.setChecked(false);
                    break;
                case R.id.switch4:
                    Toast.makeText(this, (isChecked ? "Выбран" : "Снят с выбора")+ "  Другой сотрудник" ,Toast.LENGTH_SHORT).show();
                    if (sw1.isChecked())
                        sw1.setChecked(false);
                    if (sw2.isChecked())
                        sw2.setChecked(false);
                    if (sw3.isChecked())
                        sw3.setChecked(false);
                    break;
            }
        }

    }

