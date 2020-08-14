// String - String 인스턴스를 상수풀에 생성하기: intern()
package com.eomcs.corelib.ex02;

public class Exam0114 {
  public static void main(String[] args) {

    String s1 = new String("Hello");
    String s2 = "Hello"; //상수풀에 String 객체 생성
    String s3 = s1.intern();

    System.out.println(s1 == s2); //false
    System.out.println(s1 == s3); //false
    System.out.println(s2 == s3); //true
  }
}


