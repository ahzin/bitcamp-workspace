// String - String 인스터스에 있는 값을 비교하기 : equalsIgnoreCase()
package com.eomcs.corelib.ex02;

public class Exam0121 {
  public static void main(String[] args) {

    String s1 = new String("hello");
    String s2 = new String("HELLO");

    System.out.println(s1.equals(s2)); //false
    System.out.println(s1.equalsIgnoreCase(s2)); //true
  }
}


