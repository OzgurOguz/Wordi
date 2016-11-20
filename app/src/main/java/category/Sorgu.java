package category;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;

import com.example.ozgur.wordi.DatasPojo;
import com.example.ozgur.wordi.ReturnCursor;

public class Sorgu extends Activity{

    DatasPojo datasPojo = new DatasPojo();
    ReturnCursor returnCursor = new ReturnCursor();

    public Sorgu(String sorgu){
        Cursor cursor = returnCursor.ReturnCursor();

        if(sorgu.equals("baskent")){
            datasPojo.setSorguSoru(cursor.getString(cursor.getColumnIndex(sorgu + "Soru")));
            datasPojo.setSorguCevap(cursor.getString(cursor.getColumnIndex(sorgu + "Cevap")));
            datasPojo.setSorguLokasyon(cursor.getString(cursor.getColumnIndex(sorgu + "Lokasyon")));
        }

        else if(sorgu.equals("ulkemilliyet")){
            datasPojo.setSorguSoru(cursor.getString(cursor.getColumnIndex(sorgu + "Soru")));
            datasPojo.setSorguCevap(cursor.getString(cursor.getColumnIndex(sorgu + "Cevap")));
            datasPojo.setSorguLokasyon(cursor.getString(cursor.getColumnIndex(sorgu + "Tanim")));
        }

        else if(sorgu.equals("ulke")){
            datasPojo.setSorguSoru(cursor.getString(cursor.getColumnIndex(sorgu + "Soru")));
            datasPojo.setSorguCevap(cursor.getString(cursor.getColumnIndex(sorgu + "Cevap")));
            datasPojo.setSorguSik1(cursor.getString(cursor.getColumnIndex(sorgu + "Sik1")));
            datasPojo.setSorguSik2(cursor.getString(cursor.getColumnIndex(sorgu + "Sik2")));
            datasPojo.setSorguSik3(cursor.getString(cursor.getColumnIndex(sorgu + "Sik3")));
            datasPojo.setSorguSik4(cursor.getString(cursor.getColumnIndex(sorgu + "Sik4")));
            datasPojo.setSorguLokasyon(cursor.getString(cursor.getColumnIndex(sorgu + "Lokasyon")));
        }

        else {
            datasPojo.setSorguSoru(cursor.getString(cursor.getColumnIndex(sorgu + "Soru")));
            datasPojo.setSorguCevap(cursor.getString(cursor.getColumnIndex(sorgu + "Cevap")));
            datasPojo.setSorguCumle(cursor.getString(cursor.getColumnIndex(sorgu + "Cumle")));
            datasPojo.setSorguSik1(cursor.getString(cursor.getColumnIndex(sorgu + "Sik1")));
            datasPojo.setSorguSik2(cursor.getString(cursor.getColumnIndex(sorgu + "Sik2")));
            datasPojo.setSorguSik3(cursor.getString(cursor.getColumnIndex(sorgu + "Sik3")));
            datasPojo.setSorguSik4(cursor.getString(cursor.getColumnIndex(sorgu + "Sik4")));
            datasPojo.setSorguIng(cursor.getString(cursor.getColumnIndex(sorgu + "Ing")));
            datasPojo.setId(cursor.getInt(cursor.getColumnIndex(sorgu + "Soru")));
        }
    }

}
