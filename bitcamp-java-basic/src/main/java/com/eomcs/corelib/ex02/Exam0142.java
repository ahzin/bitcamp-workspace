// String - 다형적 변수와 형변환
package com.eomcs.corelib.ex02;

public class Exam0142 {
  public static void main(String[] args) {
    Object obj = new String("Hello");
    //obj가 String 객체를 가리켜도, Object에 선언한 멤버만 사용가능

    //String 클래스의 메서드를 호출하고 싶다면,

    //(1) 그 타입으로 obj를 형변환
    String str = ((String) obj).toLowerCase();
    System.out.println(str); //hello

    //(2) 그 타입의 레퍼런스에 저장한 다음 사용
    String x1 = (String)obj;
    str = x1.toLowerCase();
    System.out.println(str); //hello
  }
}


