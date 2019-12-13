package com.example.tugas_uas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class daftargame extends AppCompatActivity  implements View.OnClickListener{
ImageView image;
TextView teks;
String tek1;
Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftargame);
        image = (ImageView) findViewById(R.id.gambargame);
        teks = (TextView) findViewById(R.id.teksgame);
        kembali = findViewById(R.id.back);
        kembali.setOnClickListener(this);
        int img =getIntent().getIntExtra("gam", R.drawable.game1);
        tek1= getIntent().getStringExtra("gim");
        image.setImageResource(img);
        teks.setText(tek1);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.back :
                finish();
        }
    }
}
