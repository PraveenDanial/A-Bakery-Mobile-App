package com.example.myapplication.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class ViewProductInfoActivity extends AppCompatActivity {

    EditText EditTextProductId, EditTextProductName, EditTextCategoryId, EditTextPrice, EditTextQty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product_info);

        EditTextProductId = (EditText) findViewById(R.id.txt_VP_ProductId);
        EditTextProductName = (EditText) findViewById(R.id.txt_VP_ProductName);
        EditTextCategoryId = (EditText) findViewById(R.id.txt_VP_CategoryId);
        EditTextPrice = (EditText) findViewById(R.id.txt_VP_Price);
        EditTextQty = (EditText) findViewById(R.id.txt_VP_Qty);
        Intent intent = this.getIntent();

        EditTextProductId.setText(intent.getStringExtra("ProductID"));
        EditTextProductId.setText(intent.getStringExtra("ProductName"));
        EditTextProductId.setText(intent.getStringExtra("CategoryID"));
        EditTextProductId.setText(intent.getStringExtra("Price"));
        EditTextProductId.setText(intent.getStringExtra("Quantity"));
    }
}