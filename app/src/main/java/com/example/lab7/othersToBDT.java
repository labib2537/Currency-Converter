package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class othersToBDT extends AppCompatActivity {

    Double result, number;
    TextView textView;
    EditText editText;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others_to_bdt);
        editText = findViewById(R.id.editTextTwo);
        textView = findViewById(R.id.textViewResultTwo);
    }
    public void convertIntoBD(View view) {
        number = Double.parseDouble(editText.getText().toString());
        if(view.getId()==R.id.Button1) {
            result = number * 86.36;
            s = String.format("%.2f", result);
            textView.setText(""+number + " $ USD= "+s+" TK");
        }
        else if(view.getId()==R.id.Button2){
            result = number*99.77;
            s = String.format("%.2f", result);
            textView.setText(""+number+" Euro= "+s+" TK");
        }
        else {
            result = number*1.15;
            s = String.format("%.2f", result);
            textView.setText(""+number+" Rupee= "+s+" TK");
        }
    }

    public void home(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}