package com.srab.srabcharge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ChoiceCountry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_country);

        ImageView next = findViewById(R.id.imgv);
        final Spinner SC = (Spinner) findViewById(R.id.sp);
        final List<String> Scl = new ArrayList<String>();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Scl);
        Scl.add("أختار دولة");
        Scl.add("المملكة العربية السعودية");
        Scl.add("مصر");
        Scl.add("الكويت");
        Scl.add("البحرين");
        SC.setAdapter(adapter);
        SC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });






    }}