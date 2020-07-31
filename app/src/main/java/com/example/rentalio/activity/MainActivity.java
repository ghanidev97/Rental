package com.example.rentalio.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ViewFlipper;

import com.example.rentalio.R;
import com.example.rentalio.adapter.KendaraanAdapter;
import com.example.rentalio.model.Kendaraan;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView ivKendaraan;
    ViewFlipper vFlipper;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.action_home :
                    case R.id.action_history :
                    case R.id.action_help :
                    case R.id.action_acount :
                        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });

        recyclerView = findViewById(R.id.rv_kendaraan);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        recyclerView.setLayoutManager(gridLayoutManager);

        //data icon kendaraan
        String[] namaKendaraan = {
                "CITY",
                "SUV",
                "MPV",
                "JEEP",
                "BUS",
                "BOX",
                "VAN",
                "SPORT",
                "SPEC",
                "CUSTOM RIDE",
                "YATCH",
                "JET"


        };

        int[] gambarKendaraan = {
                R.drawable.city,
                R.drawable.suv,
                R.drawable.mpv,
                R.drawable.jeep,
                R.drawable.bus,
                R.drawable.box,
                R.drawable.van,
                R.drawable.sport,
                R.drawable.spec,
                R.drawable.cutom_ride,
                R.drawable.yatch,
                R.drawable.jet
        };

        ArrayList<Kendaraan>kendaraanList = new ArrayList<>();

        for (int i = 0; i < namaKendaraan.length; i++){
            Kendaraan kendaraan = new Kendaraan(gambarKendaraan[i], namaKendaraan[i]);
            kendaraanList.add(kendaraan);
        }
        KendaraanAdapter kendaraanAdapter = new KendaraanAdapter(this, kendaraanList);
        recyclerView.setAdapter(kendaraanAdapter);



        int[] images = new int[]{R.drawable.banner1, R.drawable.banner2};
        vFlipper = findViewById(R.id.v_flipper);

        for (int image: images){
            flipperImages(image);
        }


    }


    public void flipperImages (int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        vFlipper.addView(imageView);
        vFlipper.setFlipInterval(3000);
        vFlipper.setAutoStart(true);

        vFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        vFlipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }






}