package com.example.voctrainer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Result extends AppCompatActivity implements View.OnClickListener{

    public Button btn_continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gui13_result);
        this.setTitle("Dein Ergebnis");

        btn_continue = (Button) findViewById(R.id.button_skip);
        btn_continue.setText("weiter");
        btn_continue.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_skip) {
            Intent intent = new Intent(Result.this, Congratulation.class);
            startActivity(intent);
            this.finish();
        }
    }
}