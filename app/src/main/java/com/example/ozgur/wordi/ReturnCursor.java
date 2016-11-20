package com.example.ozgur.wordi;

import android.app.Activity;
import android.database.Cursor;

import java.sql.SQLException;

import db.connection.DatasDaoImpl;

/**
 * Created by ozgur on 18.11.2016.
 */

public class ReturnCursor extends Activity {
    DatasDaoImpl datasDao = new DatasDaoImpl(this);
    public Cursor ReturnCursor(){
        try {
            datasDao.createDataBase();
            datasDao.openDataBase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Cursor cursor = datasDao.getDatabase().rawQuery("select * from Ailedb", null);
        return cursor;
    }
}
