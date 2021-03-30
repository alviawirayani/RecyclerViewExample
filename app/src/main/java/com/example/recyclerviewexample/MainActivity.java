package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyBagData[] myBagData = new MyBagData[]{
                new MyBagData("Glida Slingbag", "150.000",R.drawable.glida_slingbag),
                new MyBagData("Damona Bag", "200.000",R.drawable.damona_bag),
                new MyBagData("Lisbet Totebag", "120.000",R.drawable.lisbet_totebag),
                new MyBagData("Lyrica Handbag", "240.000",R.drawable.lyrica_handbag),
                new MyBagData("Mara Bag", "160.000",R.drawable.mara_bag),
                new MyBagData("Marloe Maroon Bag", "310.000",R.drawable.marloe_maroon_bag),
                new MyBagData("Myk Skulderveske Bag", "270.000",R.drawable.myk_skulderveske_bag),
                new MyBagData("Rozenn Bag", "300.000",R.drawable.rozenn_bag),
                new MyBagData("Sidonie Bag", "250.000",R.drawable.sidonie_bag),
                new MyBagData("Leda Slingbag", "1400.000",R.drawable.bag_leda_slingbag),


        };

        MyBagAdapter myBagAdapter = new MyBagAdapter(myBagData, MainActivity.this);
        recyclerView.setAdapter(myBagAdapter);

    }

}