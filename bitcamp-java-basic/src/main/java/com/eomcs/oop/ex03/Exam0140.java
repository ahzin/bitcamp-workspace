package com.eomcs.oop.ex03;

public class Exam0140 {

  static class A{ //메소드 안에 선언된 변수는 static을 가질 수 없다.
    static int v1; //클래스 변수
    int v2; //인스턴스 변수
  }

  public static void main(String[] args) {
    //클래스 변수는 클래스가 로딩되는 시점에 Method Area에 생성된다.
    //클래스가 로딩되는 때는?
    //  로딩되지 않은 클래스를 사용할 때
    //  클래스 변수(스태틱 변수)를 사용하거나, 클래스 메서드(스태틱 메서드)를 사용하려 할 때
    //
    A.v1 = 100; // A클래스 로딩

    A p = new A();
    p.v2 = 200;

    A p2 = new A();
    p2.v2 = 300;

    System.out.printf("A.v1=%d, p.v2=%d, p2.v2=%d\n", A.v1, p.v2, p2.v2);



    //인스턴스 변수는 new로 인스턴스를 생성할 때 마다 Heap에 생성된다.
    A obj1 = new A();
    A obj2 = new A();

    obj1.v2 = 200;
    obj2.v2 = 300;

    System.out.println(A.v1); //100
    System.out.println(obj1.v1); //100
    System.out.println(obj1.v2); //200
    System.out.println(obj1.v2); //200
    System.out.println(obj2.v2); //300


  }
}
