package com.example.voctrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button btn_start;
    public Button btn_help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_start = (Button) findViewById(R.id.button_start);
        btn_start.setText("Start");
        btn_start.setOnClickListener(this);

        btn_help = (Button) findViewById(R.id.button_help);
        btn_help.setText("?");
        btn_help.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.button_start) {
            //Toast.makeText(getApplicationContext(),
            //        "Test", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, MovingCounter.class);
            startActivity(intent);
            //this.finish();
        } else if (v.getId() == R.id.button_help) {
            //Toast.makeText(getApplicationContext(),
            //        "Test", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, Help.class);
            intent.putExtra("activity_id", 0); //MainActivity is ID = 0
            startActivity(intent);
            //this.finish();
        }
    }
}