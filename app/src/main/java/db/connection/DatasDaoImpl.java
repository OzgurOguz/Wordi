package db.connection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;

/**
 * Created by ozgur on 18.11.2016.
 */

public class DatasDaoImpl extends SQLiteOpenHelper {

    private static final String PATH = "/data/data/com.example.ozgur.wordi/databases/";
    private static final String NAME = "aileVeritabani.db";
    private static final int VERSION = 1;
    private SQLiteDatabase sqLiteDatabase;
    Context mContext;

    public DatasDaoImpl(Context context) {
        super(context, NAME, null, VERSION);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public void createDataBase() {

        boolean dbExist = checkDataBase();

        if (dbExist) {
        } else {
            this.getReadableDatabase();
            try {
                copyDataBase();
            } catch (IOException e) {

                throw new Error("Veritabanı kopyalanamadı");
            }
        }
    }

    private void copyDataBase() throws IOException {
        InputStream myInput = mContext.getAssets().open(NAME);
        String outFileName = PATH + NAME;
        OutputStream myOutput = new FileOutputStream(outFileName);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer)) > 0) {
            myOutput.write(buffer, 0, length);
        }
        myOutput.flush();
        myOutput.close();
        myInput.close();
    }


    private boolean checkDataBase() {
        SQLiteDatabase checkDB = null;
        try {
            String myPath = PATH + NAME;
            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
        } catch (SQLiteException e) {

        }
        if (checkDB != null) {
            checkDB.close();
        }
        return checkDB != null ? true : false;
    }

    public void openDataBase() throws SQLException {
        String myPath = PATH + NAME;
        sqLiteDatabase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
    }

    public SQLiteDatabase getDatabase() {
        return sqLiteDatabase;
    }

    @Override
    public synchronized void close() {
        if (sqLiteDatabase != null)
            sqLiteDatabase.close();
        super.close();
    }
}
