package com.eomcs.util;

public class Calculator{

  //클래스를 Method Area에 로딩할 때, static 영역에 변수를 따로 생성한다.
  // => Heap에 생성하는 것이 아니다.
  public static int result = 0;

  public static void plus(int value) {
    result += value;
  }

  public static void minus(int value) {
    result -= value;
  }

  public static void multiple(int value) {
    result *= value;
  }

  public static void devide(int value) {
    result /= value;
  }

}