// Wrapper 클래스 - wrapper 객체 생성
package com.eomcs.corelib.ex02;

public class Exam0230 {
  public static void main(String[] args) {
    //Heap에 인스턴스 생성
    Integer obj1 = new Integer(100);
    Integer obj2 = new Integer(100);
    System.out.println(obj1 == obj2); //false

    //auto-boxing, 범위 -128~+127
    Integer obj3 = 100;
    Integer obj4 = 100;
    System.out.println(obj3 == obj4); //true

    Integer obj5 = Integer.valueOf(100);
    Integer obj6 = Integer.valueOf(100);
    System.out.println(obj5 == obj6); //true

    System.out.println(obj3 == obj5); //auto-boxing으로 생성된 객체끼리도 true

    //auto=boxing의 범위를 넘어가는 경우 새 객체를 만들고 캐시에 보관하지 않음
    Integer obj7 = 128;
    Integer obj8 = 128;
    Integer obj9 = 128;
    System.out.println(obj7 == obj8); //false
    System.out.println(obj7 == obj9); //false
    System.out.println(obj8 == obj9); //false

    //따라서 String처럼 equls()로 비교
    System.out.println(obj7.equals(obj8)); //true

  }
}


