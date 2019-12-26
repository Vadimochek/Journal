package com.example.journal;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TeachDiary extends Activity {
    SharedPreferences sPref;
EditText etText,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,e24;
    public final String SAVED_TEXT = "saved_text";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teachdiary);
        etText =  findViewById(R.id.crok);
        e1 =  findViewById(R.id.crok1);
        e3 =  findViewById(R.id.crok2);
        e4 =  findViewById(R.id.crok3);
        e5 =  findViewById(R.id.crok4);
        e6 =  findViewById(R.id.crok5);
        e7 =  findViewById(R.id.crok6);
        e8 =  findViewById(R.id.crok7);
        e9 =  findViewById(R.id.crok8);
        e10 =  findViewById(R.id.crok9);
        e11 =  findViewById(R.id.crok10);
        e12 =  findViewById(R.id.crok11);
        e13 =  findViewById(R.id.crok12);
        e14 =  findViewById(R.id.crok13);
        e15 =  findViewById(R.id.crok14);
        e16 =  findViewById(R.id.crok15);
        e17 =  findViewById(R.id.crok16);
        e18 =  findViewById(R.id.crok17);
        e19 =  findViewById(R.id.crok18);
        e20 =  findViewById(R.id.crok19);
        e21 =  findViewById(R.id.crok20);
        e22 =  findViewById(R.id.crok21);
        e23 =  findViewById(R.id.crok22);
        e24 =  findViewById(R.id.crok23);
        loadText();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText();
    }
    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, etText.getText().toString());
        ed.commit();
        Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }
public void clock(View v){
    Toast.makeText(this, "В это время класс 10А", Toast.LENGTH_SHORT).show();
    }
   public void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        etText.setText(savedText);
        Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();

    }
}
