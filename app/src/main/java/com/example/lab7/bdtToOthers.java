package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class bdtToOthers extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Double result, number;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdt_to_others);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textViewResult);
    }


    public void convertInOther(View view) {
        number = Double.parseDouble(editText.getText().toString());
        if (view.getId() == R.id.usButton) {
            result = number / 86.36;
            s = String.format("%.2f", result);
            textView.setText("BDT " + number + " TK= " + s + " $ USD");
        } else if (view.getId() == R.id.euroButton) {
            result = number / 99.77;
            s = String.format("%.2f", result);
            textView.setText("BDT " + number + " TK= " + s + " Euro");
        } else {
            result = number / 1.15;
            s = String.format("%.2f", result);
            textView.setText("BDT " + number + " TK= " +s+ " Rupee");
        }

    }

    public void home(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}