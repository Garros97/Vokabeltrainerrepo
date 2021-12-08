package com.example.voctrainer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class LevelSelection extends AppCompatActivity implements View.OnClickListener{

    public Button btn_newArea;
    public Button btn_level1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gui5_level_selection);
        this.setTitle("Levelstufe wählen");

        btn_level1 = (Button) findViewById(R.id.button_level1);
        btn_level1.setText("Level 1");
        btn_level1.setOnClickListener(this);

        btn_newArea = (Button) findViewById(R.id.button_newArea);
        btn_newArea.setText("Anderes Fachgebiet finden");
        btn_newArea.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_newArea) {
            Intent intent = new Intent(LevelSelection.this, GeoMap.class);
            startActivity(intent);
            this.finish();
        }
        else if (v.getId() == R.id.button_level1) {
            Intent intent = new Intent(LevelSelection.this, VocabularyView.class);
            startActivity(intent);
            this.finish();
        }
    }
}