// String - String 객체와 문자열 리터럴의 타입
package com.eomcs.corelib.ex02;

public class Exam0112 {
  public static void main(String[] args) {

    String s1 = new String("Hello");
    String s2 = "Hello";

    System.out.println(s1 instanceof String); //true
    System.out.println(s2 instanceof String); //true
    System.out.println(s1 == s2); //false

  }
}


