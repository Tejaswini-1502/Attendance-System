package com.example.attendancesystem;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Database extends SQLiteOpenHelper {
    public static final String LOGIN_TABLE = "LOGIN_TABLE";
    public static final String COLUMN_USERNAME = "USERNAME";
    public static final String COLUMN_PASSWORD = "PASSWORD";
    public static final String COURSES_TABLE = "COURSES";
    public static final String COLUMN_COURSE_ID = "COURSE_ID";
    public static final String COLUMN_COURSE_NAME = "COURSE_NAME";
    public static final String COLUMN_TEACHER_NAME = "TEACHER_NAME";


    public Database(@Nullable Context context) {
        super(context, "presence.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createtable = "CREATE TABLE " + LOGIN_TABLE + "(" + COLUMN_USERNAME + " TEXT PRIMARY KEY," + COLUMN_PASSWORD + " TEXT)";
        db.execSQL(createtable);
        String createTableCourses = "CREATE TABLE " + COURSES_TABLE + " (" + COLUMN_COURSE_ID + " INTEGER PRIMARY KEY," + COLUMN_COURSE_NAME + " TEXT," + COLUMN_TEACHER_NAME + " INTEGER, FOREIGN KEY(" + COLUMN_TEACHER_NAME + ") REFERENCES " + LOGIN_TABLE + "(" + COLUMN_USERNAME + "))";
        db.execSQL(createTableCourses);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void delete(){
        SQLiteDatabase db = this.getWritableDatabase();
        String deleteRows = "DELETE FROM "+LOGIN_TABLE;
        db.execSQL(deleteRows);
    }
    boolean insert(login c){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_USERNAME,c.getUsername());
        cv.put(COLUMN_PASSWORD,c.getPwd());
        long insert = db.insert(LOGIN_TABLE, null, cv);
        if(insert == -1){
            return false;
        }
        return true;
    }
    boolean checkUsername(String username){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from "+LOGIN_TABLE+" where "+COLUMN_USERNAME+" = ?",new String[]{username});
        if(cursor.getCount()>0){
            return true;
        }
        return false;
    }

    boolean checkUsernamePwd(String username,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from "+LOGIN_TABLE+" where "+COLUMN_USERNAME+" = ? and "+COLUMN_PASSWORD+" = ?",new String[]{username,password});
        if(cursor.getCount()>0){
            return true;
        }
        return false;
    }
    boolean insertCourses(courses c){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_COURSE_ID,c.getCourse_id());
        cv.put(COLUMN_COURSE_NAME,c.getCourse_name());
        cv.put(COLUMN_TEACHER_NAME,c.getTeacher_name());
        long insert = db.insert(COURSES_TABLE, null, cv);
        if(insert == -1){
            return false;
        }
        return true;
    }

    ArrayList<String> retrieveCourses(String user){
        ArrayList<String> res = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM "+COURSES_TABLE+" WHERE "+COLUMN_TEACHER_NAME+" = ?",new String[]{user});
        if(cursor.moveToFirst())
        {
            do{
                String course_name = cursor.getString(1);
                res.add(course_name);
            }while(cursor.moveToNext());
        }
        else{
        }
        cursor.close();
        db.close();
        return res;
    }

}