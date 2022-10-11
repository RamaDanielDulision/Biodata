package com.example.tugasbiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Alamat(View v){
        Intent it = new Intent(Intent.ACTION_VIEW);
        String url = "https://www.bing.com/maps?q=jl+imam+bonjol+no+23+semarang&FORM=HDRSC4";
        it.setData(Uri.parse(url));
        startActivity(it);
    }

    public void Telpon(View v){
        Intent memanggil = new Intent(Intent.ACTION_DIAL);
        String nomor = "082312930192";
        memanggil.setData(Uri.fromParts("tel", nomor, "null"));
        startActivity(memanggil);
    }

    public void Email(View v){
        Intent mail = new Intent(Intent.ACTION_VIEW);
        String url = "https://mail.google.com/mail/u/0/#inbox";
        mail.setData(Uri.parse(url));
        startActivity(mail);
    }
}