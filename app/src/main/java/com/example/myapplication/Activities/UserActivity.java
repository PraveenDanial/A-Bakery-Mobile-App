package com.example.myapplication.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class UserActivity extends AppCompatActivity {

    Button ButtonCallInvoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        ButtonCallInvoice=(Button) findViewById(R.id.btnCall_Invoice);

        ButtonCallInvoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentInvoice = new Intent(UserActivity.this, InvoiceActivity.class);
                startActivity(intentInvoice);
            }
        });

    }
}