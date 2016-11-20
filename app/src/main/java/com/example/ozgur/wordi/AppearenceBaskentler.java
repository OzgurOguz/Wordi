package com.example.ozgur.wordi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class AppearenceBaskentler extends AppCompatActivity {

    DatasPojo datasPojo = new DatasPojo();
    ReturnCursor returnCursor = new ReturnCursor();

    final Button bnCumle = (Button) findViewById(R.id.bncumle);
    final ToggleButton bncevap = (ToggleButton) findViewById(R.id.bncevap);
    final TextView tvsoru = (TextView) findViewById(R.id.tvsoru);
    TextView tvcevap = (TextView) findViewById(R.id.tvcevap);
    final TextView tvcumle = (TextView) findViewById(R.id.tvcumle);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appearence_baskentler);

        returnCursor.ReturnCursor().moveToFirst();

        bncevap.setText("CEVAP");
        tvsoru.setText(datasPojo.getSorguSoru());

        tvcumle.setVisibility(View.INVISIBLE);

        bnCumle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvcumle.setVisibility(View.VISIBLE);
                String cumle = datasPojo.getSorguCumle();
                tvcumle.setText(cumle);
            }
        });

        bncevap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (returnCursor.ReturnCursor().isNull(datasPojo.getId())) {
                    bncevap.setText("ANASAYFA");
                    SonucSayfasiGoster();
                }
                boolean on = ((ToggleButton) v).isChecked();
                if (on) {
                    bncevap.setText("SONRAKİ SORU");
                    CevapGoster(datasPojo.getSorguCevap());
                } else {

                    bnCumle.setVisibility(View.VISIBLE);
                    tvcevap.setVisibility(View.INVISIBLE);

                    bncevap.setText("CEVAP");
                    tvsoru.setText(datasPojo.getSorguSoru());

                    bnCumle.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            CumleGoster(datasPojo.getSorguLokasyon());
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
        bnCumle.setVisibility(View.INVISIBLE);
        tvcumle.setVisibility(View.INVISIBLE);
        tvcevap.setText(cevap);
        returnCursor.ReturnCursor().moveToNext();
    }

    private void SonucSayfasiGoster() {
        Intent i = new Intent(AppearenceBaskentler.this, Result.class);
        startActivity(i);
    }
}
