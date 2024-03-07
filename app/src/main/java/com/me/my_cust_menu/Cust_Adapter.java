package com.me.my_cust_menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Cust_Adapter extends ArrayAdapter<Cards> {
    private  Context context1;
    private  int resorce;

    public Cust_Adapter(@NonNull Context context, int resource, @NonNull ArrayList<Cards> objects) {
        super(context, resource, objects);
        this.context1 = context;
        this.resorce=resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater lay_inf = LayoutInflater.from(context1);

        convertView = lay_inf.inflate(resorce,parent,false);

        ImageView img = convertView.findViewById(R.id.img);
        TextView title = convertView.findViewById(R.id.title);
        TextView description = convertView.findViewById(R.id.desc);

        img.setImageResource(getItem(position).getImage());
        title.setText(getItem(position).getTitle());
        description.setText(getItem(position).getDesc());



        return convertView;
    }
}
