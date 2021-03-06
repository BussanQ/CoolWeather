package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	public static final String Create_Province = "create table Province (id integer primary key autoincrement,province_name text,province_code text)";
	
	public static final String Create_City = "create table City (id integer primary key autoincrement,city_name text,city_code text,province_id integer)";
	
	public static final String Create_Country = "create table City (id integer primary key autoincrement,city_name text,city_code text,province_id integer)";
	
	public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,int version){
		super(context, name, factory, version);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db)
	{
		db.execSQL(Create_Province);
		db.execSQL(Create_City);
		db.execSQL(Create_Country);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){}
}
