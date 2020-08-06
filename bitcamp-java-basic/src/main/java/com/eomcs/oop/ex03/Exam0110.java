package com.eomcs.oop.ex03;

public class Exam0110 {
  public static void main(String[] args) {
    class A{
      //인스턴스 변수 : heap에 준비되는 변수
      //인스턴스 : new명령을 통해 생성,
      //            new 명령을 실행하기 전까지는 인스턴스 변수는 존재하지 않는다.
      //static이 붙지 않음
      int v1;
      boolean v2;
    }

    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A(); //생성된 메모리를 인스턴스 또는 객체라고 한다.

    //레퍼런스이름.객체의변수명 <= Heap으로 찾아가는 방법
    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;

    System.out.printf("%d %d %d\n", obj1.v1, obj2.v1, obj3.v1);
  }
}
