package com.example.assign01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class StartActivity extends AppCompatActivity {
    EditText edtDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        edtDate = (EditText)  findViewById(R.id.edtDate);
    }

    public void onBtnNextClick(View view) {
        if(edtDate.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Plz enter date first!", Toast.LENGTH_SHORT).show(); }

        else {
            Intent i = new Intent(StartActivity.this, TasksActivity.class);
            startActivity(i);
        }
    }

    public void onBtnExitClick(View view) {
        finish();
    }
}


