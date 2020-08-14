// String - 문자열 객체 만들기
package com.eomcs.corelib.ex02;

public class Exam0110 {
  public static void main(String[] args) {
    // String 레퍼런스는 클래스이다.(자바 기본 타입x)
    String s1; // s1은 String 인스턴스 주소를 담는 레퍼런스

    // String 인스턴스는 힙에 문자코드를 저장할 메모리를 만들고 그 주소를 리턴
    // 내용물 동일 여부를 검사하지 않고 무조건 인스턴스 생성
    s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1 == s2); // false, 서로 다른 인스턴스
  }
}


