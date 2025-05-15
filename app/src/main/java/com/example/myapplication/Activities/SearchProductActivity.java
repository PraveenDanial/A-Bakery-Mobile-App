package com.example.myapplication.Activities;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Adapters.ProductClass;
import com.example.myapplication.DBClasses.DBHelper;
import com.example.myapplication.R;

import java.util.ArrayList;

public class SearchProductActivity extends AppCompatActivity {
    private DBHelper dbHelper;
    ListView ListViewProducts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_product);

        dbHelper=new DBHelper(this);
        dbHelper.OpenDB();


        ListViewProducts = (ListView) findViewById(R.id.lst_L_Products);

        ArrayList<String> theList = new ArrayList<>();
        Cursor cursor=dbHelper.SearchAllProduct();
        if(cursor.getCount()==0)
        {
            Toast.makeText(getApplicationContext(), "No data found", Toast.LENGTH_LONG).show();
        }
        else
        {
            while (cursor.moveToNext())
            {
                theList.add(cursor.getString(0));
                ListAdapter listAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
                ListViewProducts.setAdapter(listAdapter);
            }
        }
        ListViewProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String productId="P00"+String.valueOf(position+1);//0+1=1=p001
                ArrayList<ProductClass> productList = dbHelper.SearchProduct(productId);//p001
                if (productList.size()!=0){
                    Intent intentViwList= new Intent(SearchProductActivity.this,ViewProductInfoActivity.class);
                    ProductClass product = productList.get(0);

                    intentViwList.putExtra("ProductID" , product.getProductId());//P001
                    intentViwList.putExtra("ProductName" , product.getProductName());//
                    intentViwList.putExtra("CategoryID" , product.getCategoryId());//
                    intentViwList.putExtra("Price" , product.getPrice());//
                    intentViwList.putExtra("Quantity" , product.getQuantity());//
                    startActivity(intentViwList);



                }

            }
        });

    }
}