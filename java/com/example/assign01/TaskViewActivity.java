package com.example.assign01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TaskViewActivity extends AppCompatActivity {

    TextView txtRDist;
    TextView txtRPages;
    TextView txtWPages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_view);

        txtRDist = findViewById(R.id.txtRDist);
        txtRPages = findViewById(R.id.txtRPages);
        txtWPages = findViewById(R.id.txtWPages);

        Intent intent = getIntent();
        Task data = (Task) intent.getSerializableExtra("data");

         if(!data.running.equals("")) {
             txtRDist.setText(data.running);
         }

         if(!data.reading.equals("")) {
             txtRPages.setText(data.reading);
         }

         if(!data.writing.equals("")) {
             txtWPages.setText(data.writing);
         }

    }

    public void onBtnBackClick(View view) {
        finish();
    }
}