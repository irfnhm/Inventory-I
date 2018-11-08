package com.example.irfan.inventory_i.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class InventoryAppDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "inventory.db";
    private static final int DATABASE_VERSION = 1;

    public InventoryAppDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String SQL_CREATE_INVENTORY_TABLE = "CREATE TABLE " + InventoryAppContract.InventoryEntry.TABLE_NAME + " (" +
                InventoryAppContract.InventoryEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                InventoryAppContract.InventoryEntry.COLUMN_PRODUCT_NAME + " TEXT NOT NULL, " +
                InventoryAppContract.InventoryEntry.COLUMN_PRODUCT_PRICE + " REAL NOT NULL, " +
                InventoryAppContract.InventoryEntry.COLUMN_PRODUCT_QUANTITY + " INTEGER NOT NULL, " +
                InventoryAppContract.InventoryEntry.COLUMN_SUPPLIER_NAME + " TEXT NOT NULL, " +
                InventoryAppContract.InventoryEntry.COLUMN_SUPPLIER_PHONE + " TEXT NOT NULL " +
                "); ";
        sqLiteDatabase.execSQL(SQL_CREATE_INVENTORY_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + InventoryAppContract.InventoryEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
