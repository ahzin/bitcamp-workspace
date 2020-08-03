package com.eomcs.basic.ex07;

// # 메서드 : 개념 및 기본 문법 II
//
public class Exam0222 {

  static void hello(String name, int age) {
    System.out.printf("%d살 %s님 반갑습니다.\n", age, name);
  }

  public static void main(String[] args) {

    hello("홍길동",20);
    hello("윤봉길", (int)26.5 );
    // 파라미터의 타입, 개수, 순서가 일치해야 한다.

    // hello("윤봉길"); // 컴파일 오류!
    // hello(20, "윤봉길"); // 컴파일 오류!
    // String r = hello("안중근", 30); // 컴파일 오류!
    // void r = hello("안중근", 30); // 컴파일 오류!
  }
}
