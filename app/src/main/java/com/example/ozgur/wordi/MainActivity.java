package com.example.ozgur.wordi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import category.Sorgu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bnAile = (Button)findViewById(R.id.bnAile);
        Button bnBaglaclar = (Button)findViewById(R.id.bnBaglaclar);
        Button bnBaskentler = (Button)findViewById(R.id.bnBaskentler);
        Button bnBitkiler = (Button)findViewById(R.id.bnBitkiler);
        Button bnBurclar = (Button)findViewById(R.id.bnBurclar);
        Button bnCografiTerimler = (Button)findViewById(R.id.bnCografiTerimler);
        Button bnDenizHayvanlari = (Button)findViewById(R.id.bnDenizHayvanlari);
        Button bnEsyalar = (Button)findViewById(R.id.bnEsyalar);
        Button bnEvinBolumleri = (Button)findViewById(R.id.bnEvinBolumleri);
        Button bnGiyim = (Button)findViewById(R.id.bnGiyim);
        Button bnGeometrikSekiller = (Button)findViewById(R.id.bnGeometrikSekiller);
        Button bnHavaDurumu = (Button)findViewById(R.id.bnHavaDurumu);
        Button bnHayvanlar = (Button)findViewById(R.id.bnHayvanlar);
        Button bnIcecekler = (Button)findViewById(R.id.bnIcecekler);
        Button bnKitapTurleri = (Button)findViewById(R.id.bnKitapTurleri);
        Button bnMeslekler = (Button)findViewById(R.id.bnMeslekler);
        Button bnMiktarZarflari = (Button)findViewById(R.id.bnMiktarZarflari);
        Button bnMilliyetler = (Button)findViewById(R.id.bnMilliyetler);
        Button bnMutfakAletleri = (Button)findViewById(R.id.bnMutfakAletleri);
        Button bnOrganlar = (Button)findViewById(R.id.bnOrganlar);
        Button bnRenkler = (Button)findViewById(R.id.bnRenkler);
        Button bnUlkeler = (Button)findViewById(R.id.bnUlkeler);
        Button bnYerYonZarflari = (Button)findViewById(R.id.bnYerYonZarflari);
        Button bnYiyecekler = (Button)findViewById(R.id.bnYiyecekler);
        Button bnZamanZarflari = (Button)findViewById(R.id.bnZamanZarflari);


        bnAile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("aile");
                startActivity(i);
            }
        });

        bnBaglaclar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, Appearence.class);
            new Sorgu("baglac");
            startActivity(i);
        }
    });

        bnBaskentler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AppearenceBaskentler.class);
                new Sorgu("baskent");
                startActivity(i);
            }
        });

        bnBitkiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("bitki");
                startActivity(i);
            }
        });

        bnBurclar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("burc");
                startActivity(i);
            }
        });

        bnCografiTerimler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("cografya");
                startActivity(i);
            }
        });

        bnDenizHayvanlari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("denizhayvan");
                startActivity(i);
            }
        });

        bnEsyalar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("esya");
                startActivity(i);
            }
        });

        bnEvinBolumleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("ev");
                startActivity(i);
            }
        });

        bnGiyim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("giyim");
                startActivity(i);
            }
        });

        bnGeometrikSekiller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("geometrik");
                startActivity(i);
            }
        });

        bnHavaDurumu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("hava");
                startActivity(i);
            }
        });

        bnHayvanlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("hayvan");
                startActivity(i);
            }
        });

        bnIcecekler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("icecek");
                startActivity(i);
            }
        });

        bnKitapTurleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("kitap");
                startActivity(i);
            }
        });

        bnMeslekler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("meslek");
                startActivity(i);
            }
        });

        bnMiktarZarflari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("miktar");
                startActivity(i);
            }
        });

        bnMilliyetler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AppearenceMilliyet.class);
                new Sorgu("ulkemilliyet");
                startActivity(i);
            }
        });

        bnMutfakAletleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("mutfak");
                startActivity(i);
            }
        });

        bnOrganlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("organ");
                startActivity(i);
            }
        });

        bnRenkler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("renk");
                startActivity(i);
            }
        });

        bnUlkeler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AppearenceUlkeler.class);
                new Sorgu("ulke");
                startActivity(i);
            }
        });

        bnYerYonZarflari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("yeryon");
                startActivity(i);
            }
        });

        bnYiyecekler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("yemek");
                startActivity(i);
            }
        });

        bnZamanZarflari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Appearence.class);
                new Sorgu("zaman");
                startActivity(i);
            }
        });

}




}
