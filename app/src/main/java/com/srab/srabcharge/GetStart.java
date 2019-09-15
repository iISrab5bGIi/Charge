package com.srab.srabcharge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

public class GetStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_start);
        ImageView how = (ImageView) findViewById(R.id.how);

        how.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent how = new Intent(GetStart.this,Howtouse.class);
                startActivity(how);
            }
        });

        ImageView start = findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start = new Intent(GetStart.this,ChoiceCountry.class
                );
                startActivity(start);
            }
        });
    }
}
