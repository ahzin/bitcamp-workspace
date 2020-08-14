// String - String 인스터스에 있는 값을 비교하기 : equals()
package com.eomcs.corelib.ex02;

public class Exam0120 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s1 == s2); //false
    //String은 오버라이딩 되어있음
    System.out.println(s1.equals(s2)); //true -> 문자열 비교
  }
}


