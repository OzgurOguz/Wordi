package com.example.ozgur.wordi;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

import category.Sorgu;

import static android.view.View.INVISIBLE;

public class AppearenceMilliyet extends AppCompatActivity {

    DatasPojo datasPojo = new DatasPojo();
    ReturnCursor returnCursor = new ReturnCursor();
    final Cursor cursor = returnCursor.ReturnCursor();

    final TextView tvsoru = (TextView) findViewById(R.id.tvsoru);
    final TextView tvcumle = (TextView) findViewById(R.id.tvcumle);
    final TextView tvcevap = (TextView) findViewById(R.id.tvcevap);
    final ToggleButton bncevap = (ToggleButton) findViewById(R.id.bncevap);
    final Button bncumle = (Button) findViewById(R.id.bncumle);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appearence_milliyet);

        cursor.moveToFirst();

        tvcumle.setVisibility(INVISIBLE);

        bncevap.setText("CEVAP");
        tvsoru.setText(datasPojo.getSorguSoru());

        bncumle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvcumle.setVisibility(View.VISIBLE);
                tvcumle.setText(datasPojo.getSorguLokasyon());
            }
        });


        bncevap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cursor.isNull(datasPojo.getId())) {
                    bncevap.setText("ANASAYFA");
                    SonucSayfasiGoster();
                }
                boolean on = ((ToggleButton) v).isChecked();
                if (on) {
                    bncevap.setText("SONRAKİ SORU");
                    CevapGoster(datasPojo.getSorguCevap());
                } else {

                    bncumle.setVisibility(View.VISIBLE);
                    tvcevap.setVisibility(View.INVISIBLE);

                    bncevap.setText("CEVAP");
                    tvsoru.setText(datasPojo.getSorguSoru());

                    bncumle.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            CumleGoster(datasPojo.getSorguCumle());
                        }
                    });

                }
            }
        });
    }

    private void CumleGoster(String dpcumle) {
        tvcumle.setVisibility(View.VISIBLE);
        tvcumle.setText(dpcumle);
    }


    private void CevapGoster(String cevap) {
        tvcevap.setVisibility(View.VISIBLE);
        tvcumle.setVisibility(View.INVISIBLE);
        tvcevap.setText(cevap);
        cursor.moveToNext();

    }

    private void SonucSayfasiGoster() {
        Intent i = new Intent(AppearenceMilliyet.this, Result.class);
        startActivity(i);
    }
}

