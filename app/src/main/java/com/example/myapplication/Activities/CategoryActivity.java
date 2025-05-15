package com.example.myapplication.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.Adapters.CategoryClass;
import com.example.myapplication.DBClasses.DBHelper;
import com.example.myapplication.R;

public class CategoryActivity extends AppCompatActivity {
    EditText EditTextCategoryID,EditTextCategoryName;
    Button ButtonSubmit;

    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        dbHelper=new DBHelper(this);
        dbHelper.OpenDB();

        EditTextCategoryID = (EditText) findViewById(R.id.txt_Category_ID);
        EditTextCategoryName = (EditText) findViewById(R.id.txt_Category_Name);
        ButtonSubmit = (Button)findViewById(R.id.btn_Category_Register);

        ButtonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(EditTextCategoryID.getText().toString().isEmpty()||EditTextCategoryName.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Fields can't be blank", Toast.LENGTH_SHORT).show();
                }
                CategoryClass categoryClass = new CategoryClass(EditTextCategoryID.getText().toString(),EditTextCategoryName.getText().toString());
                if(dbHelper.CreateNewCategory(categoryClass)){
                    Toast.makeText(getApplicationContext(), "category Created", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), EditTextCategoryID.getText().toString()+"Has Login as"+EditTextCategoryName.getText().toString(),
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Category Creation Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}