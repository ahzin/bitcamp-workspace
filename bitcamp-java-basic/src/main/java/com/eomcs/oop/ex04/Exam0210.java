package com.eomcs.oop.ex04;

public class Exam0210 {

  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("ABC");
    //인스턴스 메서드
    //non-static method
    //  - 인스턴스 주소를 가지고 호출해야 한다.
    //  - this라는 내장 변수가 잇다.
    //  - 특정 인스턴스의 변수를 다루는 메서드

    char c1 = s1.charAt(1);
    System.out.println(c1); //e

    char c2 = s2.charAt(1);
    System.out.println(c2); //B

  }
}
