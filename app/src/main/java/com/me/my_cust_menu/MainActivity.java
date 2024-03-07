package com.me.my_cust_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        custList();
    }

    private void custList() {
        ListView list = findViewById(R.id.listview);

        ArrayList<Cards> card = new ArrayList<>();

        card.add(new Cards(R.drawable.item_2,"Sai Shyam Impex -1 ", "This is a sample visiting card for sai shyam impex Company"));
        card.add(new Cards(R.drawable.item_3,"Sai Shyam Impex -2 ", "This is a sample visiting card for sai shyam impex Company"));
        card.add(new Cards(R.drawable.item_4,"Sai Shyam Impex -3 ", "This is a sample visiting card for sai shyam impex Company"));
        card.add(new Cards(R.drawable.item_1,"Sai Shyam Impex -4 ", "This is a sample visiting card for sai shyam impex Company"));

        Cust_Adapter crd = new Cust_Adapter(this,R.layout.cust_list_layout,card);
        list.setAdapter(crd);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.Register) {
            Intent i = new Intent(MainActivity.this, MainActivity.class);
            startActivity(i);
            return true;
        } else if (id == R.id.Login) {
            Intent i = new Intent(MainActivity.this, Login.class);
            startActivity(i);
            return true;
        }
        return true;
    }
}