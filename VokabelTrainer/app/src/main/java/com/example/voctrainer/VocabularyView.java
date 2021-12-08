package com.example.voctrainer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class VocabularyView extends AppCompatActivity implements View.OnClickListener {

    public Button btn_DEBUG_Skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gui6_vocabulary_view);
        this.setTitle("Voc1-Level1");

        btn_DEBUG_Skip = (Button) findViewById(R.id.button_DEBUG_skip);
        btn_DEBUG_Skip.setText("skip");
        btn_DEBUG_Skip.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_DEBUG_skip) {
            Intent intent = new Intent(VocabularyView.this, ProgressView.class);
            startActivity(intent);
            this.finish();
        }
        //else if (v.getId() == R.id.button_help) {

        //}
    }
}