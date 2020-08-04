package com.eomcs.basic.ex07;

//# 메서드 : JVM 메모리
// 로컬변수를 stack방식으로 관리한다.(FIFO)
public class Exam0411 {


  public static void main(String[] args) {
    int a = 100;
    System.out.println("main() >> "+a);
    m1(a);
    System.out.println(a + "  << main()");
  }

  static void m1(int a) {
    //main의 a = 100 값이 넘어옴
    a += 100; // a = 200, main이랑 상관 없음
    System.out.println("m1() >> "+a);
    m2(a); //m2로 이동
    System.out.println(a + "  << m1()"); // a = 200 => 제거되고 main으로 돌아감.
  }

  static void m2(int a) {
    //m1의 a = 200값이 넘어옴
    a += 100; //a = 300, m1이랑 상관 없음
    System.out.println("m2() >> "+a);
    m3(a);
    System.out.println(a + "  << m2()"); // a = 300 => 제거되고 m1으로 돌아감.
  }

  static void m3(int a) {
    a += 100; // m2의 a = 300 값이 넘어옴
    System.out.println("m3(): " +a); // a = 400 => m2로 돌아감.
  }


}
