// Object 클래스 - 자바 최상위 클래스
package com.eomcs.corelib.ex01;

//클래스를 정의할 때 수퍼 클래스를 지정하지 않으면
//컴파일러는 자동으로 Object를 상속 받는다.
public class Exam0110 /*extends Object*/ {
  static class My{
    //extends Object 자동으로 상속
  }

  public static void main(String[] args) {

    My obj = new My();

    System.out.println(obj instanceof My); //true
    System.out.println(obj instanceof Object); //true
    //System.out.println(Obj instanceof String); 오류!

    System.out.println(obj.toString()); //com.eomcs.corelib.ex01.Exam0110$My@a09ee92
    System.out.println(obj.hashCode()); //168423058
    System.out.println(obj.equals("Hello")); //false

  }

}

// Object 클래스의 주요 메서드
// 1) toString()
//    => 클래스이름과 해시코드를 리턴한다.
// 2) equals()
//    => 같은 인스턴스인지 검사한다.
// 3) hashCode()
//    => 인스턴스를 식별하는 값을 리턴한다.
// 4) getClass()
//    => 인스턴스의 클래스 정보를 리턴한다.
// 5) clone()
//    => 인스턴스를 복제한 후 그 복제 인스턴스를 리턴한다.
// 6) finalize()
//    => 가비지 컬렉터에 의해 메모리에서 해제되기 직전에 호출된다.
//







