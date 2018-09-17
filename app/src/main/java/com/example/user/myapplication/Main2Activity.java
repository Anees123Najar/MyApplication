package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    TextView tvRes1, tvRes2;
    Button btBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvRes1 = (TextView) findViewById(R.id.tvRes1);
        tvRes2 = (TextView) findViewById(R.id.tvRes2);
        Intent i = getIntent();
        int res1 = i.getIntExtra("res1",-1);
        tvRes1.setText("Sum of numbers:" +res1);
        int res2 = i.getIntExtra("res2",-1);
        tvRes2.setText("tareh of numbers:" +res2);
        btBack = (Button) findViewById(R.id.btBack);
        btBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
