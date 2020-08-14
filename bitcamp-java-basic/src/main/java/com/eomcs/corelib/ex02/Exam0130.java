// String - hashCode()
package com.eomcs.corelib.ex02;

public class Exam0130 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s1.hashCode() == s2.hashCode()); //true

    //Object의 hashCode()는 인스턴스 마다 다르지만,
    //String의 hashCode()는 문자열이 같으면 같은 값을 리턴하도록 오버라이딩
  }
}


