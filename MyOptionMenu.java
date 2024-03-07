package com.me.exam_cie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MyOptionMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_option_menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.my_optionmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.Register){
            Intent i = new Intent(MyOptionMenu.this,MainActivity.class);
            startActivity(i);
            return true;
        } else if (id == R.id.Login) {
            Intent i = new Intent(MyOptionMenu.this,Login.class);
            startActivity(i);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}