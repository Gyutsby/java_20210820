package com.example.vo;

public class member {
    int userid = 0;
    String username = null;
    int userage = 0;
    String userphone = null;

    public member() {
        this.userage = 100;
    }

    public member(int userage) {
        this.userage = userage;
    }

    @Override
    public String toString() {
        return "member [userage=" + userage + ", userid=" + userid + ", username=" + username + ", userphone="
                + userphone + "]";
    }

    // 가시성 리턴타입 메소드명 (전달값)
    public int getuserid() {
        return this.userid;
    }

    // 가시성 리턴타입 메소드명 (전달값)
    public void setuserid(int id) {
        this.userid = id;
    }

    // 가시성 리턴타입 메소드명 (전달값)
    public String getusername() {
        return this.username;
    }

    // 가시성 리턴타입 메소드명 (전달값)
    public void setusername(String name) {
        this.username = name;
    }

    // 가시성 리턴타입 메소드명 (전달값)
    public int getuserage() {
        return this.userage;
    }

    // 가시성 리턴타입 메소드명 (전달값)
    public void setuserage(int age) {
        this.userage = age;
    }

    // 가시성 리턴타입 메소드명 (전달값)

    public String getuserphone() {
        return this.userphone;
    }

    // 가시성 리턴타입 메소드명 (전달값)
    public void setuserphone(String phone) {
        this.userphone = phone;
    }
}
