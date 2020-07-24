package com.example.androidproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, "plannerDB", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
<<<<<<< HEAD
        String table = "create table planner_tb (_id integer primary key autoincrement, plan_title, plan_content, date, start_time, end_time)";
        db.execSQL(table);
        db.execSQL("insert into planner_tb (plan_title, plan_content, date, start_time, end_time) values ('수학 공부하기', '삼각함수 공부하기 (p15~p20)', '2020-7-31', '2:30', '4:30')");
        db.execSQL("insert into planner_tb (plan_title, plan_content, date, start_time, end_time) values ('영어 공부하기', '영어 문법 공부하기 (p.35~p.40)', '2020-8-1', '16:00', '18:30')");
        db.execSQL("insert into planner_tb (plan_title, plan_content, date, start_time, end_time) values ('독서하기', '`오베라는 남자` 읽고 독후감 쓰기', '2020-8-4', '19:30', '22:30')");
=======
        String table = "create table planner_tb (_id integer primary key autoincrement, title, plan, date)";
        db.execSQL(table);
        db.execSQL("insert into message_tb (title, plan, date) values ('홍길동', '안녕하세요. 잘 지내시는지요?', '18/3/5')");
        db.execSQL("insert into message_tb (title, plan, date) values ('도깨비', '안녕~ 도깨비신부', '18/4/5')");
        db.execSQL("insert into message_tb (title, plan, date) values ('서준희', '밥 잘 사주는 예쁜 누나 봐야 되', '18/6/8')");
>>>>>>> 0e701f8d2212f2cacc5f14943751e12031b04174
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(newVersion == DATABASE_VERSION){
<<<<<<< HEAD
            db.execSQL("drop table planner_tb");
=======
            db.execSQL("drop table message_tb");
>>>>>>> 0e701f8d2212f2cacc5f14943751e12031b04174
            onCreate(db);
        }
    }
}
