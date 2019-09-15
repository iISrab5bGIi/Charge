package com.srab.srabcharge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ch_Sporter_Egypt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch__sporter__egypt);
        final ImageView vodafone = findViewById(R.id.vodafone);
        ImageView we       = findViewById(R.id.we);
        ImageView orange   = findViewById(R.id.orange);
        ImageView etsalat  = findViewById(R.id.etsalat);

        vodafone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Ch_Sporter_Egypt.this,Vodafone.class);
                startActivity(next);
            }
        });
        we.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent we = new Intent(Ch_Sporter_Egypt.this,We.class);
                startActivity(we);
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent orange = new Intent(Ch_Sporter_Egypt.this,Orange.class);
            startActivity(orange);}
        });
        etsalat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent etsalat = new Intent(Ch_Sporter_Egypt.this,Etsalat.class);
                startActivity(etsalat);
            }
        });
    }
}
