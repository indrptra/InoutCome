package com.manage.anodev.inoutcome;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by GEEKS 1 on 10/28/2016.
 */

public class DataHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "MoneyNote.db";
    public static final int DB_VERSION = 1;

    public static final String TB_INCOME = "Income";
    public static final String TMPTB_INCOME = "tmpIncome";
    public static final String TB_OUTCOME = "Outcome";
    public static final String TMPTB_OUTCOME = "tmpOutcome";

    public static final String COL_ID = "Id";
    public static final String COL_AMOUNTH = "Amounth";
    public static final String COL_DESCRIPTION = "Description";
    SQLiteDatabase db;

    public DataHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createTable(TB_INCOME));
        db.execSQL(createTable(TMPTB_INCOME));
        db.execSQL(createTable(TB_OUTCOME));
        db.execSQL(createTable(TMPTB_OUTCOME));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TB_INCOME);
        db.execSQL("DROP TABLE IF EXISTS " + TMPTB_INCOME);
        db.execSQL("DROP TABLE IF EXISTS " + TB_OUTCOME);
        db.execSQL("DROP TABLE IF EXISTS " + TMPTB_OUTCOME);
        onCreate(db);
    }

    private String createTable(String TABLE_NAME){
        String TABLE_CREATE = "CREATE TABLE " + TABLE_NAME + " (" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_AMOUNTH + " INTEGER, " +
                COL_DESCRIPTION + " TEXT )";
        return TABLE_CREATE;
    }
    public Cursor getAllContacts(){
        return db.query(TMPTB_OUTCOME, new String[] {COL_ID, COL_DESCRIPTION, COL_AMOUNTH},null,null,null,null,null);
    }


    /*
    public static final int DATABASE_VERSION = 1;
    //DATABASE NAME
    public static final String DATABASE_NAME = "Inoutcome.db";
    //TABLE DATABASE
    public static final String TABLE_EXPENSE = "Expenses";
    public static final String TABLE_INCOME = "Income";

    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAMABARANG";
    public static final String COL_3 = "HARGABARANG";

    public static final String COLIN_1 = "ID";
    public static final String COLIN_2 = "PEMASUKAN";
    public static final String COLIN_3 = "JUMLAH";




    public static final String TABLE_CREATE_EXPENSE = "CREATE TABLE " + TABLE_EXPENSE + " ( " +

            COL_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +

            COL_2 + " TEXT, " +

            COL_3 + " TEXT, );";

    public static final String TABLE_CREATE_INCOME = "CREATE TABLE " + TABLE_INCOME + " ( " +

            COLIN_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +

            COLIN_2 + " TEXT, " +

            COLIN_3 + " TEXT, );";


    public DataHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }




    @Override

    public void onCreate(SQLiteDatabase db) {

        db.execSQL(TABLE_CREATE_EXPENSE);
        db.execSQL(TABLE_CREATE_INCOME);

    }

    @Override

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EXPENSE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_INCOME);
        onCreate(db);

    }

// OPERATION FOR TABLE EXPENSE

    public boolean save_barang(String namabarang, String hargabarang) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues content_values = new ContentValues();
        content_values.put(COL_2, namabarang);
        content_values.put(COL_3, hargabarang);
        long result = db.insert(TABLE_EXPENSE, null, content_values);
        return result != -1;

    }


    public Cursor list_barang() {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor expenses = db.rawQuery("SELECT * FROM " + TABLE_EXPENSE, null);
        return expenses;

    }


    public boolean update_barang(String id, String namabarang, String hargabaarang) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues content_values = new ContentValues();
        content_values.put(COL_1, id);
        content_values.put(COL_2, namabarang);
        content_values.put(COL_3, hargabaarang);
        db.update(TABLE_EXPENSE, content_values, "ID = ? ", new String[]{id});

        return true;

    }


    public Integer delete_barang(String id) {

        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_EXPENSE, "ID = ?", new String[] {id});

    }

    // OPERATION FOR TABLE INCOME

    public boolean save_pemasukan(String pemasukan, String jumlah) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues content_values = new ContentValues();
        content_values.put(COLIN_2, pemasukan);
        content_values.put(COLIN_3, jumlah);
        long result = db.insert(TABLE_INCOME, null, content_values);
        return result != -1;

    }


    public Cursor list_pemasukan() {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor income = db.rawQuery("SELECT * FROM " + TABLE_INCOME, null);
        return income;

    }


    public boolean update_pemasukan(String id, String pemasukan, String jumlah) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues content_values = new ContentValues();
        content_values.put(COLIN_1, id);
        content_values.put(COLIN_2, pemasukan);
        content_values.put(COLIN_3, jumlah);
        db.update(TABLE_INCOME, content_values, "ID = ? ", new String[]{id});

        return true;

    }


    public Integer delete_pemasukan(String id) {

        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_INCOME, "ID = ?", new String[] {id});

    }*/
}