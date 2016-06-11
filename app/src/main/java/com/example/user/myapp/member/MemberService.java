package com.example.user.myapp.member;

/**
 * Created by USER on 2016-06-11.
 */
public interface MemberService {
    public String signup(MembereBean member);
    public MembereBean login(MembereBean member);
    public MembereBean update(MembereBean member);
    public String delete(MembereBean member);
}
