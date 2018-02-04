package com.example.android.studycase1202154119;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mMessageEditText1;
    private EditText mMessageEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessageEditText1 = (EditText) findViewById(R.id.menu_edittext);
        mMessageEditText2 = (EditText) findViewById(R.id.porsi_edittext);
    }

    public void functionEatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        String message1 = mMessageEditText1.getText().toString();
        String message2 = mMessageEditText2.getText().toString();

        intent.putExtra("Lokasi", "Eatbus");
        intent.putExtra("Menu", message1);
        intent.putExtra("Porsi", message2);
        intent.putExtra("Harga", "50000");

        startActivity(intent);
    }

    public void functionAbnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        String message1 = mMessageEditText1.getText().toString();
        String message2 = mMessageEditText2.getText().toString();

        intent.putExtra("Lokasi", "Abnormal");
        intent.putExtra("Menu", message1);
        intent.putExtra("Porsi", message2);
        intent.putExtra("Harga", "30000");

        startActivity(intent);
    }
}
