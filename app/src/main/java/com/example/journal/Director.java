package com.example.journal;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Director extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.director);
    }
    public void click1(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Director.this);
        builder.setTitle("Приложение подсчета бюджета")
                .setMessage("Бюджет составляет 1 000 000 рублей" )
                .setCancelable(false)
                .setNegativeButton("Понятно",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
    public void click2(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Director.this);
        builder.setTitle("Приложение подсчета расходов")
                .setMessage("Зарплаты - 500 000 рублей \nСпонсирование спортсменов - 100 000 рублей \nЗатраты на содержание столовой - 200 000 рублей \nМелкие затраты - 50 000 рублей \nСвободно для операций - 150 000 рублей"  )
                .setCancelable(false)
                .setNegativeButton("Понятно",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
    public void click(View v) {
     Intent pi = new Intent(Director.this, School.class);
     startActivity(pi);
    }
}
