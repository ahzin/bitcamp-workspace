// Wrapper 클래스 - 종류
package com.eomcs.corelib.ex02;

public class Exam0210 {
  public static void main(String[] args) {
    // 자바는 primitive data type의 값을 다룰 때 기본 연산자 외에
    // 좀 더 다양한 방법으로 다루기 위해
    // primitive data type에 대응하는 클래스를 제공한다.
    // 예)
    byte xx = 100;
    Byte b = new Byte((byte)100);               // ==> byte
    Short s = new Short((short)20000);          // ==> short
    Integer i = new Integer(3000000);           // ==> int
    Long l = new Long(60000000000L);            // ==> long
    Float f = new Float(3.14f);                 // ==> float
    Double d = new Double(3.14159);             // ==> double
    Boolean bool = new Boolean(true);           // ==> boolean
    Character c = new Character((char)0x41);    // ==> char

    // 이렇게 primitive data type에 대응하여 만든 클래스를
    // primitive data를 포장하는 객체라고 해서
    // "랩퍼(wrapper) 클래스"라 부른다.

    // 래퍼 클래스의 주요 용도:
    // => primitive data type의 값을 객체로 주고 받을 때 사용한다.
    // => primitive data type의 값을 객체에 담아 전달하고 싶다면
    //    언제든 wrapper 클래스의 인스턴스를 만들면 된다.

    // Wrapper 클래스의 인스턴스를 생성할 때는 생성자 대신 클래스 메서드를 사용하라.
    Byte b2 = Byte.valueOf((byte)100);
    Short s2 = Short.valueOf((short)20000);
    Integer i2 = Integer.valueOf(3000000);
    Long l2 = Long.valueOf(60000000000L);
    Float f2 = Float.valueOf(3.14f);
    Double d2 = Double.valueOf(3.14159);
    Boolean bool2 = Boolean.valueOf(true);
    Character c2 = Character.valueOf((char)0x41);
  }

  void m1(Object value) {
    System.out.printf("value=%s\n", value);
  } //모든 객체를 받을 수 있다

  // 만약에 wrapper 클래스가 없다면 다음과 같이
  // 정수를 받는 메서드와 부동소수점을 받는 메서드,
  // 논리값을 받는 메서드를 따로따로 정의해야 한다.
  // => 이런 불편함을 없애기 위해 Wrapper 클래스를 만들었다.
  // => 즉, primitive type을 객체와 함께 다룰 수 있도록 만든 문법이다.

  void m2(long value) {
    System.out.printf("value=%s\n", value);
  }  //byte, short, int, long, char

  void m3(double value) {
    System.out.printf("value=%s\n", value);
  }  // float, double

  void m4(boolean value) {
    System.out.printf("value=%s\n", value);
  }  // boolean

}






