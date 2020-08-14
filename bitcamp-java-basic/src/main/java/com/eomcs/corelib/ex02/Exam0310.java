// java.util.Date 클래스 - 생성자 활용
package com.eomcs.corelib.ex02;

import java.util.Date;

public class Exam0310 {
  public static void main(String[] args) {
    //Date() 기본 생성자
    Date d1 = new Date(); // 현재시간을 저장
    System.out.println(d1);

    //Date(long) : 1970-01-01 00:00:00 부터 지금까지 경과된 밀리초
    Date d2 = new Date(1000);
    System.out.println(d2); //Thu Jan 01 09:00:01 KST 1970

    Date d3 = new Date(System.currentTimeMillis());
    System.out.println(d3); //현재시간

    Date d4 = new Date(119, 0, 15);
    System.out.println(d4); //Tue Jan 15 00:00:00 KST 2019

    //java.sql.Date
    java.sql.Date d5 = new java.sql.Date(System.currentTimeMillis());
    System.out.println(d5); //2020-08-14(현재 년월일)

    //간접객체 생성
    java.sql.Date d6 = java.sql.Date.valueOf("2019-1-10");
    System.out.println(d6); //2019-01-10

  }
}


