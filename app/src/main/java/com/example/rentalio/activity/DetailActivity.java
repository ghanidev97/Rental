package com.example.rentalio.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.rentalio.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class DetailActivity extends AppCompatActivity {
    TextView withDriver, wihtoutDriver;
    RelativeLayout rlwithDriver, rlwitthoutDriver, rltransMision, rlmanualTransmision;
    EditText etDate1, etDate2;
    Button btnBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        rlwithDriver = findViewById(R.id.ll_btn_with_driver);
        rlwitthoutDriver = findViewById(R.id.ll_btn_without_driver);
        rltransMision = findViewById(R.id.ll_btn_transmision);
        rlmanualTransmision = findViewById(R.id.ll_btn_mt_transmision);
        withDriver = findViewById(R.id.btn_with_driver);
        wihtoutDriver = findViewById(R.id.btn_without_driver);
        btnBook = findViewById(R.id.btn_book);
        etDate2 = findViewById(R.id.et_date2);


       btnBook.setOnClickListener(new View.OnClickListener(){

           @Override
           public void onClick(View view) {
               if (btnBook.getVisibility() == View.VISIBLE){
                   btnBook.setVisibility(View.INVISIBLE);

               }else {
                   btnBook.setVisibility(View.VISIBLE);
               }
           }
       });

        rlwithDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rlwithDriver.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
                if (rltransMision.getVisibility() == View.INVISIBLE){
                    rltransMision.setVisibility(View.VISIBLE);

                }else {
                    rltransMision.setVisibility(View.INVISIBLE);
                }
            }
        });
        rltransMision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                rltransMision.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
          }
        });



        rlwitthoutDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rlwitthoutDriver.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
                if (rlmanualTransmision.getVisibility() == View.INVISIBLE){
                    rlmanualTransmision.setVisibility(View.VISIBLE);

                }else {
                    rlmanualTransmision.setVisibility(View.INVISIBLE);
                }
            }
        });

        rlmanualTransmision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rlmanualTransmision.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
            }
        });
        etDate1 = findViewById(R.id.et_date1);
        SimpleDateFormat dateF = new SimpleDateFormat("EEE, d MMM yyyy", Locale.getDefault());
        SimpleDateFormat timeF = new SimpleDateFormat("HH:mm", Locale.getDefault());
        String date = dateF.format(Calendar.getInstance().getTime());
        String time = timeF.format(Calendar.getInstance().getTime());
        etDate1.setText(date);
        etDate1.setText(time);

        etDate2 = findViewById(R.id.et_date2);
        SimpleDateFormat dateG = new SimpleDateFormat("EEE, d MMM yyyy", Locale.getDefault());
        SimpleDateFormat timeG = new SimpleDateFormat("HH:mm", Locale.getDefault());
        String date2 = dateG.format(Calendar.getInstance().getTime());
        String time2 = timeG.format(Calendar.getInstance().getTime());
        etDate1.setText(date2);
        etDate1.setText(time2);


        }

        }

