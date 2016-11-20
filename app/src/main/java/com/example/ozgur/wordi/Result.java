package com.example.ozgur.wordi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tvbilgi = (TextView) findViewById(R.id.tvbilgi);
        TextView bnanasayfa = (TextView) findViewById(R.id.tvanasayfa);

        tvbilgi.setText("Bu kategoriyi tamamlandı. Diğer kategorilere girmek için anasayfadan devam ediniz");

        bnanasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Result.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
