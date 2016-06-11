package com.example.user.myapp.member;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by USER on 2016-06-11.
 */
public class MemberDAO extends SQLiteOpenHelper{
    public MemberDAO(Context context) {
        super(context, null, null, 1);//DB_NAME, null, DB_VERSION
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public String signup(MembereBean member) {
        String name   = member.getName();
        String id     = member.getId();
        String email = member.getEmail();
        String pw     = member.getPw();

        Log.i("namn ", name);
        Log.i("id ", id);
        Log.i("email ", email);
        Log.i("pw ", pw);

        return "회원가입을 축하합니다.";
    }

    public MembereBean login(MembereBean member) {
        MembereBean mem = new MembereBean();
        mem.setId(member.getId());
        mem.setPw(member.getPw());
        mem.setEmail(member.getEmail());
        mem.setName(member.getName());

        Log.i("namn ", mem.getName());
        Log.i("id ", mem.getId());
        Log.i("email ", mem.getEmail());
        Log.i("pw ", mem.getPw());
        return mem;
    }

    public MembereBean update(MembereBean member) {
        MembereBean mem = new MembereBean();
        return mem;
    }

    public String delete(MembereBean member) {
        return "삭제완료";
    }
}
