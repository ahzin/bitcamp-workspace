// StringBuffer - 문자열 비교
package com.eomcs.corelib.ex02;

public class Exam0124 {
  public static void main(String[] args) {

    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");
    System.out.println(b1 == b2); //false
    System.out.println(b1.equals(b2)); //false

    //StringBuffer은 오버라이딩 하지 않음, String이랑 헷갈리지 말기!

  }
}


