package com.example.user.myapp.member;

import android.app.Activity;

/**
 * Created by USER on 2016-06-11.
 */
public class MeberServiceImpl extends Activity implements MemberService{
    MemberDAO dao = new MemberDAO(this.getApplicationContext());

    @Override
    public String signup(MembereBean member) {
        return dao.signup(member);
    }

    @Override
    public MembereBean login(MembereBean member) {
        return dao.login(member);
    }

    @Override
    public MembereBean update(MembereBean member) {
        return dao.update(member);
    }

    @Override
    public String delete(MembereBean member) {
        return dao.delete(member);
    }
}
