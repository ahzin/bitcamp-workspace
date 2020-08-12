package com.eomcs.oop.ex06.c;

public class A2 extends A {
  int age;

  //기존 print()는 name만 출력
  void print2() { //새로 추가된 age도 출력할 수 있도록 print2() 메소드를 새로 만듬
    System.out.printf("'%s(%d)'님 반갑습니다!\n", this.name, this.age);
  }
}
