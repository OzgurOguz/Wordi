package com.example.ozgur.wordi;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Appearence extends AppCompatActivity {

    DatasPojo datasPojo = new DatasPojo();
    ReturnCursor returnCursor = new ReturnCursor();

    final Button bnCumle = (Button) findViewById(R.id.bncumle);
    final Button bnsozluk = (Button) findViewById(R.id.bnsozluk);
    final Button bnsik = (Button) findViewById(R.id.bnsik);
    final ToggleButton bncevap = (ToggleButton) findViewById(R.id.bncevap);

    final TextView tvsoru = (TextView) findViewById(R.id.tvsoru);
    TextView tvcevap = (TextView) findViewById(R.id.tvcevap);
    final TextView tvsozluk = (TextView) findViewById(R.id.tvsozluk);
    final TextView tvcumle = (TextView) findViewById(R.id.tvcumle);
    final TextView tvsik1 = (TextView) findViewById(R.id.tvsik1);
    final TextView tvsik2 = (TextView) findViewById(R.id.tvsik2);
    final TextView tvsik3 = (TextView) findViewById(R.id.tvsik3);
    final TextView tvsik4 = (TextView) findViewById(R.id.tvsik4);

    final Cursor cursor = returnCursor.ReturnCursor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appearence);

        cursor.moveToFirst();

        bncevap.setText("CEVAP");
        tvsoru.setText(datasPojo.getSorguSoru());

        tvcumle.setVisibility(View.INVISIBLE);
        tvsozluk.setVisibility(View.INVISIBLE);
        tvsik1.setVisibility(View.INVISIBLE);
        tvsik2.setVisibility(View.INVISIBLE);
        tvsik3.setVisibility(View.INVISIBLE);
        tvsik4.setVisibility(View.INVISIBLE);


        bnCumle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvcumle.setVisibility(View.VISIBLE);
                String cumle = datasPojo.getSorguCumle();
                tvcumle.setText(cumle);
            }
        });

        bnsik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bnsik.setEnabled(false);
                bnsik.setTextColor(Color.BLACK);

                tvsik1.setVisibility(View.VISIBLE);
                tvsik2.setVisibility(View.VISIBLE);
                tvsik3.setVisibility(View.VISIBLE);
                tvsik4.setVisibility(View.VISIBLE);

                final String sik1 = datasPojo.getSorguSik1();
                final String sik2 = datasPojo.getSorguSik2();
                final String sik3 = datasPojo.getSorguSik3();
                final String sik4 = datasPojo.getSorguSik4();
                final String cevap = datasPojo.getSorguCevap();

                tvsik1.setText(sik1);
                tvsik2.setText(sik2);
                tvsik3.setText(sik3);
                tvsik4.setText(sik4);

                tvsik1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (sik1.equals(cevap)) {
                            tvsik1.setBackgroundColor(Color.GREEN);
                            tvsik2.setEnabled(false);
                            tvsik3.setEnabled(false);
                            tvsik4.setEnabled(false);
                        } else {
                            tvsik1.setBackgroundColor(Color.RED);
                            tvsik2.setEnabled(false);
                            tvsik3.setEnabled(false);
                            tvsik4.setEnabled(false);
                        }
                    }
                });

                tvsik2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (sik2.equals(cevap)) {
                            tvsik2.setBackgroundColor(Color.GREEN);
                            tvsik1.setEnabled(false);
                            tvsik3.setEnabled(false);
                            tvsik4.setEnabled(false);
                        } else {
                            tvsik2.setBackgroundColor(Color.RED);
                            tvsik1.setEnabled(false);
                            tvsik3.setEnabled(false);
                            tvsik4.setEnabled(false);
                        }
                    }
                });

                tvsik3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (sik3.equals(cevap)) {
                            tvsik3.setBackgroundColor(Color.GREEN);
                            tvsik1.setEnabled(false);
                            tvsik2.setEnabled(false);
                            tvsik4.setEnabled(false);
                        } else {
                            tvsik3.setBackgroundColor(Color.RED);
                            tvsik1.setEnabled(false);
                            tvsik2.setEnabled(false);
                            tvsik4.setEnabled(false);
                        }
                    }
                });

                tvsik4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (sik4.equals(cevap)) {
                            tvsik4.setBackgroundColor(Color.GREEN);
                            tvsik1.setEnabled(false);
                            tvsik2.setEnabled(false);
                            tvsik3.setEnabled(false);

                        } else {
                            tvsik4.setBackgroundColor(Color.RED);
                            tvsik1.setEnabled(false);
                            tvsik2.setEnabled(false);
                            tvsik3.setEnabled(false);
                        }
                    }
                });
            }
        });

        bnsozluk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsozluk.setVisibility(View.VISIBLE);
                String sozluk = datasPojo.getSorguIng();
                tvsozluk.setText(sozluk);
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

                    bnCumle.setVisibility(View.VISIBLE);
                    bnsozluk.setVisibility(View.VISIBLE);
                    bnsik.setVisibility(View.VISIBLE);
                    tvcevap.setVisibility(View.INVISIBLE);

                    bncevap.setText("CEVAP");
                    tvsoru.setText(datasPojo.getSorguSoru());

                    bnCumle.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            CumleGoster(datasPojo.getSorguCumle());
                        }
                    });

                    bnsik.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            SikGoster(datasPojo.getSorguSik1(), datasPojo.getSorguSik2(), datasPojo.getSorguSik3(), datasPojo.getSorguSik4(), datasPojo.getSorguCevap());

                        }
                    });

                    bnsozluk.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            SozlukGoster(datasPojo.getSorguIng());
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

    private void SikGoster(final String sik1, final String sik2, final String sik3, final String sik4, final String cevap) {
        Button bnSik = (Button) findViewById(R.id.bnsik);
        bnSik.setEnabled(false);
        bnSik.setTextColor(Color.BLACK);

        tvsik1.setBackgroundColor(Color.YELLOW);
        tvsik2.setBackgroundColor(Color.YELLOW);
        tvsik3.setBackgroundColor(Color.YELLOW);
        tvsik4.setBackgroundColor(Color.YELLOW);

        tvsik1.setVisibility(View.VISIBLE);
        tvsik2.setVisibility(View.VISIBLE);
        tvsik3.setVisibility(View.VISIBLE);
        tvsik4.setVisibility(View.VISIBLE);

        tvsik1.setText(sik1);
        tvsik2.setText(sik2);
        tvsik3.setText(sik3);
        tvsik4.setText(sik4);

        tvsik1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sik1.equals(cevap)) {
                    tvsik1.setBackgroundColor(Color.GREEN);
                    tvsik2.setEnabled(false);
                    tvsik3.setEnabled(false);
                    tvsik4.setEnabled(false);
                } else {
                    tvsik1.setBackgroundColor(Color.RED);
                    tvsik2.setEnabled(false);
                    tvsik3.setEnabled(false);
                    tvsik4.setEnabled(false);
                }
            }
        });

        tvsik2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sik2.equals(cevap)) {
                    tvsik2.setBackgroundColor(Color.GREEN);
                    tvsik1.setEnabled(false);
                    tvsik3.setEnabled(false);
                    tvsik4.setEnabled(false);
                } else {
                    tvsik2.setBackgroundColor(Color.RED);
                    tvsik1.setEnabled(false);
                    tvsik3.setEnabled(false);
                    tvsik4.setEnabled(false);
                }
            }
        });

        tvsik3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sik3.equals(cevap)) {
                    tvsik3.setBackgroundColor(Color.GREEN);
                    tvsik1.setEnabled(false);
                    tvsik2.setEnabled(false);
                    tvsik4.setEnabled(false);
                } else {
                    tvsik3.setBackgroundColor(Color.RED);
                    tvsik1.setEnabled(false);
                    tvsik2.setEnabled(false);
                    tvsik4.setEnabled(false);
                }
            }
        });
        tvsik4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sik4.equals(cevap)) {
                    tvsik4.setBackgroundColor(Color.GREEN);
                    tvsik1.setEnabled(false);
                    tvsik2.setEnabled(false);
                    tvsik3.setEnabled(false);
                } else {
                    tvsik4.setBackgroundColor(Color.RED);
                    tvsik1.setEnabled(false);
                    tvsik2.setEnabled(false);
                    tvsik3.setEnabled(false);
                }
            }
        });
    }

    private void SozlukGoster(String sozluk) {
        tvsozluk.setVisibility(View.VISIBLE);
        tvsozluk.setText(sozluk);
    }

    private void CevapGoster(String cevap) {

        tvcevap.setVisibility(View.VISIBLE);
        bnCumle.setVisibility(View.INVISIBLE);
        tvcumle.setVisibility(View.INVISIBLE);
        bnsik.setVisibility(View.INVISIBLE);
        tvsik1.setVisibility(View.INVISIBLE);
        tvsik2.setVisibility(View.INVISIBLE);
        tvsik3.setVisibility(View.INVISIBLE);
        tvsik4.setVisibility(View.INVISIBLE);
        bnsozluk.setVisibility(View.INVISIBLE);
        tvsozluk.setVisibility(View.INVISIBLE);
        tvcevap.setText(cevap);
        bnsik.setEnabled(true);
        tvsik1.setEnabled(true);
        tvsik2.setEnabled(true);
        tvsik3.setEnabled(true);
        tvsik4.setEnabled(true);
        cursor.moveToNext();
    }

    private void SonucSayfasiGoster() {
        Intent i = new Intent(Appearence.this, Result.class);
        startActivity(i);
    }


}







