// String - 문자열 리터럴
package com.eomcs.corelib.ex02;

public class Exam0111 {
  public static void main(String[] args) {

    //문자열 리터럴
    //  내용물이 같으면 기존 인스턴스 주소를 리턴 => 메모리 절약, 중복 방지
    //  JVM이 끝날 때 까지 메모리에 유지

    String x1 = "Hello";
    String x2 = "Hello"; // 기존의 String 인스턴스 주소를 리턴

    System.out.println(x1 == x2); //true
  }
}


