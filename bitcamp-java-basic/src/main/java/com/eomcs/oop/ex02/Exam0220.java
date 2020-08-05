package com.eomcs.oop.ex02;

public class Exam0220 {

  static class Calculator{

    static int plus(int a, int b) {
      return a + b;
    }
    static int minus(int a, int b) {
      return a - b;
    }
    static int multiple(int a, int b) {
      return a * b;
    }
    static int divide(int a, int b) {
      return a / b;
    }
  }


  public static void main(String[] args) {

    // 2 + 3 - 1 * 7 / 3 = 9
    int result = 0;
    result = Calculator.plus(2,3);
    result = Calculator.minus(result,1);
    result = Calculator.multiple(result,7);
    result = Calculator.divide(result,3);

    printResult(result);

  }


  public static void printResult(int value) {
    System.out.println("****************");
    System.out.printf("***> 결과 = %d\n", value);
    System.out.println("****************");
  }
}
