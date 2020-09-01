// 제네릭(Generic) 문법 정리 - 제네릭 파라미터
package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0223 {

  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}
  /*
   *   Object
   *     |
   *     A
   *    / \
   *   B1 B2
   *   |
   *   C
   */

  public static void main(String[] args) {
    // m1(ArrayList<A>)
    // => B1 타입에 대해서만 ArrayList 객체를 파라미터로 넘길 수 있다.
    // => B1의 하위 타입은 불가능
    //

    ArrayList list = new ArrayList(); //모든 타입의 객체를 다 저장할 수 있다.
    list.add(new B1());
    list.add(new String());
    list.add(new java.util.Date());
    list.add(new StringBuffer());

    //전달하는 것은 허용
    m1(list); // 컴파일 오류는 아니지만, 타입을 지정하지 않는 것은 바람직하지 않다.
    // 왜?
    // => 타입을 지정하지 않은 ArrayList는 B1이 아닌 다른 타입의 객체가 들어갈 수 있다.
    // => 그런데 m1()에서는 B1만 들어 있을 것이라 확신하고 ArrayList를 사용할 것이다.
    // => 그러면 m1() 실행하는 중에 get()을 호출할 때 형변환 문제가 발생할 것이다.
    //
    //m1(new ArrayList<Object>()); // 컴파일 오류!
    //m1(new ArrayList<A>()); // 컴파일 오류!
    //m1(new ArrayList<B1>()); // OK!
    //m1(new ArrayList<B2>()); // 컴파일 오류!
    //m1(new ArrayList<C>()); // 컴파일 오류!
  }

  static void m1(ArrayList<B1> list) {
    // 컴파일러는 파라미터로 넘어온 ArrayList가  어떤 타입이든 간에
    // 문법적으로 A 타입의 값만 다룬다.
    //list.add(new Object()); // 컴파일 오류!
    //list.add(new A()); // 컴파일 오류!
    list.add(new B1());
    //list.add(new B2()); // 컴파일 오류!
    list.add(new C());
  }
}








