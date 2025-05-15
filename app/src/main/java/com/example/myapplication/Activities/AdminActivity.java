package com.example.myapplication.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class AdminActivity extends AppCompatActivity {

    Button ButttonCallCategory,ButtonCallProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        ButttonCallCategory = (Button) findViewById(R.id.btn_Call_Category);
        ButtonCallProduct = (Button) findViewById(R.id.btn_Call_Product);

        ButttonCallCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCategory = new Intent(AdminActivity.this,CategoryActivity.class);
                startActivity(intentCategory);
            }
        });
        ButtonCallProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProduct = new Intent(AdminActivity.this,ProductActivity.class);
                startActivity(intentProduct);
            }
        });
    }
}