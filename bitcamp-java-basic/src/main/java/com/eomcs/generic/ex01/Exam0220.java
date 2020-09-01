// 제네릭(Generic) 문법 정리 - 제네릭 파라미터
package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0220 {

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
    // m1(ArrayList)
    // => 제네릭의 타입을 지정하지 않으면 Object 타입과 같기 때문에
    //    다음과 같이 다양한 종류의 ArrayList를 파라미터로 넘길 수 있다.
    m1(new ArrayList());
    m1(new ArrayList<A>());
    m1(new ArrayList<B1>());
    m1(new ArrayList<B2>());
    m1(new ArrayList<C>());
  }


  //제네릭의 타입을 지정하지 않으면
  //위와 같이 특정 타입으로 제한하는 문법이 무용지물이 된다.
  //따라서 제네릭으로 선언된 클래스를 사용할 때는 반드시 타입 파라미터 값을 지정하라.
  static void m1(ArrayList list) {
    list.add(new Object());
    list.add(new A());
    list.add(new B1());
    list.add(new B2());
    list.add(new C());

  }
}








