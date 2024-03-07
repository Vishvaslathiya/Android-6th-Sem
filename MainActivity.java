package com.me.exam_cie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText name,email,pass;
    AutoCompleteTextView city;
    Spinner depart;
    String[] acCity = {"Surat","Ahmedabad","Gandhinagar","Bombay"};
    RadioButton male,female,other;
    CheckBox cb;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intialize();
        Aradapter();
        buttonClicks();
    }

    protected void  Intialize(){

        btn = findViewById(R.id.submit);
        name= findViewById(R.id.name);
        email= findViewById(R.id.email);
        pass= findViewById(R.id.pass);
        city= findViewById(R.id.city);

        depart = (Spinner) findViewById(R.id.depart);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        other = findViewById(R.id.other);
        cb= findViewById(R.id.tnc);
    }

    protected  void  Aradapter(){

        ArrayAdapter<String> aa=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,acCity);
        city.setThreshold(1);
        city.setAdapter(aa);
    }

    protected  void buttonClicks(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sname,semail,spass,scity,sdepart,sgender;
                if (male.isChecked()){
                    sgender = "male";
                } else if (female.isChecked()) {
                    sgender = "female";
                }
                else{
                    sgender = "other";
                }
                sname = name.getText().toString();
                semail = email.getText().toString();
                spass = pass.getText().toString();
                scity = city.getText().toString();
                sdepart = depart.getSelectedItem().toString();

                if (cb.isChecked()){
                    Intent i = new Intent(getApplicationContext(),Display_Info.class);
                    i.putExtra("name",sname);
                    i.putExtra("email",semail);
                    i.putExtra("pass",spass);
                    i.putExtra("city",scity);
                    i.putExtra("depart",sdepart);
                    i.putExtra("gen",sgender);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Please Agree to T&C", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

}