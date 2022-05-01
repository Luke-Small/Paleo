package com.example.paleo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "nutrients.db";

    public static final String MINERAL_TABLE_NAME = "mineral_table";
    public static final String min_col_1 = "NAME";
    public static final String min_col_2 = "RDA"; // recommended daily allowance
    public static final String min_col_3 = "UI"; //uppper intake
    public static final String min_col_4 = "ADI"; //average daily intake
    public static final String min_col_5 = "CI"; //current intake

    public static final String VITAMIN_TABLE_NAME = "vitamin_table";

    public static final String WATER_TABLE_NAME = "water_table";

    public static final String FAT_TABLE_NAME = "fat_table";

    public static final String CARBS_TABLE_NAME = "Carbohydrate_table";

    public static final String PROTEIN_TABLE_NAME = "Protein_table";

    public DataBaseHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

    }

    @Override void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
