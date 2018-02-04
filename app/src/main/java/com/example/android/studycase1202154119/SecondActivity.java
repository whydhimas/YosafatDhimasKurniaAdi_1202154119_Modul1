package com.example.android.studycase1202154119;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String showmessage3 = intent.getStringExtra("Lokasi");
        String showmessage1 = intent.getStringExtra("Menu");
        String showmessage2 = intent.getStringExtra("Porsi");
        String showmessage4 = intent.getStringExtra("Harga");

        int total = Integer.valueOf(showmessage2)*Integer.valueOf(showmessage4);

        TextView textView3 = (TextView) findViewById(R.id.makan_malam_second);
        TextView textView1 = (TextView) findViewById(R.id.menu_second);
        TextView textView2 = (TextView) findViewById(R.id.porsi_second);
        TextView textView4 = (TextView) findViewById(R.id.harga_second);

        textView3.setText(showmessage3);
        textView1.setText(showmessage1);
        textView2.setText(showmessage2);
        textView4.setText(String.valueOf(total));

        if (total > 65500) {
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya," +
                    " uang kamu tidak cukup", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan " +
                    "malamnya", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
