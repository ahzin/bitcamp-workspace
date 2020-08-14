// StringBuffer - 문자열 비교 II
package com.eomcs.corelib.ex02;

public class Exam0125 {
  public static void main(String[] args) {
    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");

    //StringBuffer에서 문자열 비교하려면, String을 직접 꺼내 비교
    String s1 = b1.toString();
    String s2 = b2.toString();
    System.out.println(s1.equals(s2)); //true
    System.out.println(b1.toString().equals(b2.toString())); //true

  }
}


