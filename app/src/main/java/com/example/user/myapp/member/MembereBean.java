package com.example.user.myapp.member;

/**
 * Created by USER on 2016-06-11.
 */
public class MembereBean {
    private String id;
    private String pw;
    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "[회원정보]" +
                "이메일='" + email + '\'' +
                ", 아이디='" + id + '\'' +
                ", 패스워드='" + pw + '\'' +
                ", 이름='" + name + '\'';
    }
}
