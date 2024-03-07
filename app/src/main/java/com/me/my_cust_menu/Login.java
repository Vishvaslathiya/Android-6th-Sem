package com.me.my_cust_menu;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    EditText name,pass;
    Button btn;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.login);
        Init();
        btnclick();
    }

    protected  void Init(){
        name = findViewById(R.id.uname);
        pass = findViewById(R.id.pass);
        Button btn = findViewById(R.id.button);
    }
    private void btnclick() {

        String uname = name.getText().toString();
        String upass = pass.getText().toString();

        if (uname.equals("a") && upass.equals("a")){
            Intent i = new  Intent(Login.this,Home.class);
            startActivity(i);
        }
        else {
            Toast.makeText(getApplicationContext(), "Invalid Username or pass", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.Register) {
            Intent i = new Intent(Login.this, MainActivity.class);
            startActivity(i);
            return true;
        } else if (id == R.id.Login) {
            Intent i = new Intent(Login.this, Login.class);
            startActivity(i);
            return true;
        }

        return true;
    }



}
