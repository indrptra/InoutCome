package com.manage.anodev.inoutcome.userauthentication;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.manage.anodev.inoutcome.DataHelper;

/**
 * Created by GEEKS 1 on 10/31/2016.
 */

public class Income {
    private String Id;
    private int Amounth;
    private String Description;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }


    public int getAmounth() {
        return Amounth;
    }

    public void setAmounth(int amounth) {
        Amounth = amounth;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public static Cursor listIncome(DataHelper databaseHelper) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + DataHelper.TMPTB_INCOME, null);
        return cursor;
    }

    public static boolean saveIncome(DataHelper databaseHelper, Income income) {
        boolean status = false;
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DataHelper.COL_DESCRIPTION, income.getDescription());
        contentValues.put(DataHelper.COL_AMOUNTH, income.getAmounth());
        long result = db.insert(DataHelper.TMPTB_INCOME, null, contentValues);
        return result != -1;
    }
}
