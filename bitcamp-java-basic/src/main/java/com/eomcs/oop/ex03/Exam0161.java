package com.eomcs.oop.ex03;

public class Exam0161 {

  static class Member{
    String id;
    String password;
    int type; // 0: 손님, 1: 회원, 2: 관리
  }

  public static void main(String[] args) {
    final int GUEST = 0;
    final int MEMBER = 1;
    final int MANAGER = 2;

    Member m1 = new Member();
    m1.id = "aaa";
    m1.password = "1111";
    m1.type = GUEST ;

    Member m2 = new Member();
    m2.id = "bbb";
    m2.password = "2222";
    m2.type = MEMBER ;

    Member m3 = new Member();
    m3.id = "ccc";
    m3.password = "3333";
    m3.type = MANAGER ;
  }
}
