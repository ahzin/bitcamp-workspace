// Wrapper 클래스 - wrapper 객체의 값 비교
package com.eomcs.corelib.ex02;

public class Exam0231 {
  public static void main(String[] args) {
    Integer obj1 = Integer.valueOf(100);
    Integer obj2 = 100;
    System.out.println(obj1 == obj2); //true

    Integer obj3 = Integer.valueOf(128);
    Integer obj4 = 128;
    System.out.println(obj3 == obj4); //false

    //new 연산자는 값이 같더라도 인스턴스가 따로 생성되기 때문에
    //== 연산자를 사용해서 비교하면 안되고, equls()로 호출한다.
    Integer obj5 = new Integer(100);
    Integer obj6 = new Integer(100);
    System.out.println(obj5 == obj6); //false
    System.out.println(obj5.equals(obj6)); //true

  }
}


