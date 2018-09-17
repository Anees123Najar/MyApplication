package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button btResult;
    EditText etnum1, etnum2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btResult = (Button) findViewById(R.id.btResult);
        btResult.setOnClickListener(this);
        etnum1 = (EditText) findViewById(R.id.etnum1);
        etnum2 = (EditText) findViewById(R.id.etnum2);
    }

    @Override
    public void onClick(View v)
    {
        if(etnum2.getText().toString().equals("")||etnum1.getText().toString().equals(""))
        {
            Toast.makeText(this, "Empty Fields", Toast.LENGTH_SHORT).show();
        }
        else {
            int num1 = Integer.parseInt(etnum1.getText().toString());
            int num2 = Integer.parseInt(etnum2.getText().toString());
            int res1 = num1+num2;
            int res2 = num1-num2;
            Intent i = new Intent(this, Main2Activity.class);
            i.putExtra("res1",res1);
            i.putExtra("res2",res2);
            startActivity(i);
        }

    }
}
