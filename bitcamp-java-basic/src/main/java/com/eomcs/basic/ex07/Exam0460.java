package com.eomcs.basic.ex07;

public class Exam0460 {
  static int sum(int value) {
    if (value == 1) {
      return 1;
    }
    return value = sum(value -1 );
  }
  public static void main(String[] args) {
    System.out.println(sum(1000000));
    //스택 오버플로
  }

}
