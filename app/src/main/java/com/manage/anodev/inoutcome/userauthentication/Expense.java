package com.manage.anodev.inoutcome.userauthentication;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.manage.anodev.inoutcome.DataHelper;

import static android.provider.Contacts.SettingsColumns.KEY;
import static com.manage.anodev.inoutcome.DataHelper.COL_AMOUNTH;
import static com.manage.anodev.inoutcome.DataHelper.COL_DESCRIPTION;
import static com.manage.anodev.inoutcome.DataHelper.COL_ID;
import static com.manage.anodev.inoutcome.DataHelper.TMPTB_OUTCOME;

/**
 * Created by GEEKS 1 on 10/31/2016.
 */

public class Expense {
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
        Cursor cursor = db.rawQuery("SELECT * FROM " + TMPTB_OUTCOME, null);
        return cursor;
    }


    public static boolean saveExpense(DataHelper databaseHelper, Expense expense) {
        boolean status = false;
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DataHelper.COL_DESCRIPTION, expense.getDescription());
        contentValues.put(DataHelper.COL_AMOUNTH, expense.getAmounth());
        long result = db.insert(TMPTB_OUTCOME, null, contentValues);
        return result != -1;
    }
}
