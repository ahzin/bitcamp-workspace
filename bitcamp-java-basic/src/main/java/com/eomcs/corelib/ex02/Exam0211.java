// Wrapper 클래스 - 생성자 vs valueOf()
package com.eomcs.corelib.ex02;

public class Exam0211 {
  public static void main(String[] args) {
    //새 인스턴스 생성
    Integer i1 = new Integer(127);
    Integer i2 = new Integer(127);
    System.out.println(i1 == i2); //false

    Integer i3 = Integer.valueOf(127);
    Integer i4 = Integer.valueOf(127);
    System.out.println(i3 == i4); //true
    System.out.println(i3 == i1); //false

    Integer i5 = Integer.valueOf(-128);
    Integer i6 = Integer.valueOf(-128);
    System.out.println(i5 == i6); //true
    //범위 -128~127 외의 수는 무조건 새 인스턴스를 생성

    Integer i7 = Integer.valueOf(128);
    Integer i8 = Integer.valueOf(128);
    System.out.println(i7 == i8); //false


  }
}


