package com.example.damar.finalproject.Hasil;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Auditori1 extends AppCompatActivity {
    public TextView metode1, metode2, metode3, metode4, metode5, keterangan1, keterangan2, keterangan3, keterangan4, keterangan5;
    String hasil1 = "Metode Ceramah";
    String ket1 = "bla bla bla";
    String hasil2 = "Metode Tanya Jawab";
    String ket2 = "bla bla bla";
    String hasil3 = "Metode Curah Pendapat";
    String ket3 = "bla bla bla";
    String hasil4 = "Metode Sumbang Saran";
    String ket4 = "bla bla bla";
    String hasil5 = "Metode Share Your Information";
    String ket5 = "bla bla bla";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        metode1 = (TextView) findViewById(R.id.txt_metode1);
        keterangan1 = (TextView) findViewById(R.id.txt_ket1);
        metode2 = (TextView) findViewById(R.id.txt_metode2);
        keterangan2 = (TextView) findViewById(R.id.txt_ket2);
        metode3 = (TextView) findViewById(R.id.txt_metode3);
        keterangan3 = (TextView) findViewById(R.id.txt_ket3);
        metode4 = (TextView) findViewById(R.id.txt_metode4);
        keterangan4 = (TextView) findViewById(R.id.txt_ket4);
        metode5 = (TextView) findViewById(R.id.txt_metode5);
        keterangan5 = (TextView) findViewById(R.id.txt_ket5);

        metode1.setText("1. "+hasil1);
        keterangan1.setText("keterangan: "+ket1);
        metode2.setText("2. "+hasil2);
        keterangan2.setText("keterangan: "+ket2);
        metode3.setText("3. "+hasil3);
        keterangan3.setText("keterangan: "+ket3);
        metode4.setText("4. "+hasil4);
        keterangan4.setText("keterangan: "+ket4);
        metode5.setText("5. "+hasil5);
        keterangan5.setText("keterangan: "+ket5);

    }
}
