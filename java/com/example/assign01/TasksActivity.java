package com.example.assign01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;


public class TasksActivity extends AppCompatActivity implements OnClickListener {
    Task data;
    CheckBox chkRun5km, chkRun10km, chkRun15km, chkRead2p, chkRead5p, chkRead10p, chkWrite1p, chkWrite5p, chkWrite10p;
    RadioButton rdRunning, rdReading, rdWriting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        data = new Task();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
        chkRun5km = findViewById(R.id.chkRun5km);
        chkRun10km = findViewById(R.id.chkRun10km);
        chkRun15km = findViewById(R.id.chkRun15km);
        chkRead2p = findViewById(R.id.chkRead2p);
        chkRead5p = findViewById(R.id.chkRead5p);
        chkRead10p = findViewById(R.id.chkRead10p);
        chkWrite1p = findViewById(R.id.chkWrite1p);
        chkWrite5p = findViewById(R.id.chkWrite5p);
        chkWrite10p = findViewById(R.id.chkWrite10p);

        chkRun5km.setOnClickListener(this);
        chkRun10km.setOnClickListener(this);
        chkRun15km.setOnClickListener(this);
        chkRead5p.setOnClickListener(this);
        chkRead10p.setOnClickListener(this);
        chkRead2p.setOnClickListener(this);
        chkWrite10p.setOnClickListener(this);
        chkWrite5p.setOnClickListener(this);
        chkWrite1p.setOnClickListener(this);
        addListenerOnButton();
    }

    private void addListenerOnButton() {

        rdRunning = findViewById(R.id.rdRunning);
        rdReading = findViewById(R.id.rdReading);
        rdWriting = findViewById(R.id.rdWriting);

        rdRunning.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                chkRun5km.setEnabled(true);
                chkRun10km.setEnabled(true);
                chkRun15km.setEnabled(true);
            }
        });

        rdReading.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                chkRead2p.setEnabled(true);
                chkRead5p.setEnabled(true);
                chkRead10p.setEnabled(true);
            }
        });

        rdWriting.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                chkWrite1p.setEnabled(true);
                chkWrite5p.setEnabled(true);
                chkWrite10p.setEnabled(true);
            }
        });
    }

    @Override
    public void onClick(View view) {

        //for running
        if (view == chkRun5km) {
            data.running = chkRun5km.getText().toString();
            chkRun10km.setChecked(false);
            chkRun15km.setChecked(false);
        }
        else if (view == chkRun10km) {
            data.running = chkRun10km.getText().toString();
            chkRun5km.setChecked(false);
            chkRun15km.setChecked(false);
        }
        else if (view == chkRun15km) {
            data.running = chkRun15km.getText().toString();
            chkRun5km.setChecked(false);
            chkRun10km.setChecked(false);
        }

        //for reading
        else if (view == chkRead2p) {
            data.reading = chkRead2p.getText().toString();
            chkRead5p.setChecked(false);
            chkRead10p.setChecked(false);
        }
        else if (view == chkRead5p) {
            data.reading = chkRead5p.getText().toString();
            chkRead2p.setChecked(false);
            chkRead10p.setChecked(false);
        }
        else if (view == chkRead10p) {
            data.reading = chkRead10p.getText().toString();
            chkRead5p.setChecked(false);
            chkRead2p.setChecked(false);
        }

        //for writing
        else if (view == chkWrite1p) {
            data.writing = chkWrite1p.getText().toString();
            chkWrite5p.setChecked(false);
            chkWrite10p.setChecked(false);
        }
        else if (view == chkWrite5p) {
            data.writing = chkWrite5p.getText().toString();
            chkWrite1p.setChecked(false);
            chkWrite10p.setChecked(false);
        }
        else if (view == chkWrite10p) {
            data.writing = chkWrite10p.getText().toString();
            chkWrite1p.setChecked(false);
            chkWrite5p.setChecked(false);
        }
    }

    public void onBtnViewClick(View view) {
        Intent i = new Intent(TasksActivity.this, TaskViewActivity.class);
        i.putExtra("data", data);
        startActivity(i);
    }

    public void onBtnBackClick(View view) {
        finish();
    }
    public void onBtnResetClick(View view) {
        rdRunning.setChecked(false);
        chkRun5km.setChecked(false);
        chkRun10km.setChecked(false);
        chkRun15km.setChecked(false);

        chkRun5km.setEnabled(false);
        chkRun10km.setEnabled(false);
        chkRun15km.setEnabled(false);

        data.running = "";

        rdWriting.setChecked(false);
        chkWrite1p.setChecked(false);
        chkWrite5p.setChecked(false);
        chkWrite10p.setChecked(false);

        chkWrite1p.setEnabled(false);
        chkWrite5p.setEnabled(false);
        chkWrite10p.setEnabled(false);
        data.writing = "";

        rdReading.setChecked(false);
        chkRead2p.setChecked(false);
        chkRead5p.setChecked(false);
        chkRead10p.setChecked(false);

        chkRead2p.setEnabled(false);
        chkRead5p.setEnabled(false);
        chkRead10p.setEnabled(false);
        data.reading = "";

    }
}
