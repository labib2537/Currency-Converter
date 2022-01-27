package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnFunction(View view) {
        if(view.getId()==R.id.bdtToOther){
            Intent intent = new Intent(this, bdtToOthers.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(this, othersToBDT.class);
            startActivity(intent);
        }
    }
}