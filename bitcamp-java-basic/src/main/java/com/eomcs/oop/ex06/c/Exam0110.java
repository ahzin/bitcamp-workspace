// 오버라이딩(overriding) - 준비
package com.eomcs.oop.ex06.c;

public class Exam0110 {
  public static void main(String[] args) {
    A obj1 = new A();
    //필드
    obj1.name = "홍길동";

    obj1.print(); //A클래스의 print() 호출
  }
}
