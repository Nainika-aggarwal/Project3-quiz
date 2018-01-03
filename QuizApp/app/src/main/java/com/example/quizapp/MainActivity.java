package com.example.quizapp;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button(View v) {
        int count = 0;
        int count1 = 0;
        RadioButton ques1 = (RadioButton) findViewById(R.id.an1);
        RadioButton ques3 = (RadioButton) findViewById(R.id.an3);
        EditText ques = (EditText) findViewById(R.id.an4);
        String ques4 = ques.getText().toString().toLowerCase();
        RadioButton ques5 = (RadioButton) findViewById(R.id.an5);
        RadioButton ques6 = (RadioButton) findViewById(R.id.an6);
        RadioButton ques7 = (RadioButton) findViewById(R.id.an7);
        RadioButton ques8 = (RadioButton) findViewById(R.id.an8);
        RadioButton ques9 = (RadioButton) findViewById(R.id.an9);
        RadioButton ques10 = (RadioButton) findViewById(R.id.an10);
        CheckBox ques2a = (CheckBox) findViewById(R.id.an2a);
        CheckBox ques2b = (CheckBox) findViewById(R.id.an2b);
        CheckBox ques2c = (CheckBox) findViewById(R.id.an2c);
        CheckBox ques2d = (CheckBox) findViewById(R.id.an2d);
        if (ques1.isChecked())
            count = count + 1;
        else {
            count1 = count1 + 1;
        }
        if (ques3.isChecked())
            count = count + 1;
        else {
            count1 = count1 + 1;
        }
        if (ques4.equals("frames"))
            count = count + 1;
        else {
            count1 = count1 + 1;
        }
        if (ques5.isChecked())
            count = count + 1;
        else {
            count1 = count1 + 1;
        }
        if (ques6.isChecked())
            count = count + 1;
        else {
            count1 = count1 + 1;
        }
        if (ques7.isChecked())
            count = count + 1;
        else {
            count1 = count1 + 1;
        }
        if (ques8.isChecked())
            count = count + 1;
        else {
            count1 = count1 + 1;
        }
        if (ques9.isChecked())
            count = count + 1;
        else {
            count1 = count1 + 1;
        }
        if (ques10.isChecked())
            count = count + 1;
        else {
            count1 = count1 + 1;
        }
        if (ques2a.isChecked() && ques2b.isChecked() && ques2c.isChecked() && !ques2d.isChecked())
            count = count + 1;
        else {
            count1 = count1 + 1;
        }
        Toast toast = Toast.makeText(this, count + " Correct answer and " + count1 + " incorrect answers", Toast.LENGTH_SHORT);
        toast.show();
    }
}
