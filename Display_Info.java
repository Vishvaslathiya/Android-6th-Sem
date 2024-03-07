package com.me.exam_cie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display_Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        TextView lbl;

        lbl=findViewById(R.id.dname);

        Intent di = getIntent();

        String name,pass,email,gen,city,depart;

        name = ((Intent) di).getStringExtra("name");
        pass = ((Intent) di).getStringExtra("pass");
        email = ((Intent) di).getStringExtra("email");
        gen = ((Intent) di).getStringExtra("gen");
        city = ((Intent) di).getStringExtra("city");
        depart = ((Intent) di).getStringExtra("depart");

        lbl.setText(" Name: " + name+ "\n Email: " + email  + "\n Password: " + pass + "\n City: " + city + "\n Department: " + depart  + "\n Gender: " + gen  );


    }
}