package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btStart);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView tvPhoneNumber = (TextView)findViewById(R.id.tvPhoneNumber);
        Intent myIntent = new Intent(getApplicationContext(), BasketOrdersActivity.class);
        myIntent.putExtra("phoneNumber", tvPhoneNumber.getText().toString());
        startActivity(myIntent);
    }
}