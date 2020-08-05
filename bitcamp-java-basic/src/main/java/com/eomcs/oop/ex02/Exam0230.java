package com.eomcs.oop.ex02;

public class Exam0230 {
  static class Calculator{

    static int result = 0;    //내부에서 관리하기 위해 result를 static을 붙여 데려옴

    static void plus(int value) {
      result += value;
    }
    static void minus(int value) {
      result -= value;
    }
    static void multiple(int value) {
      result *= value;
    }
    static void divide(int value) {
      result /= value;
    }
  }


  public static void main(String[] args) {

    // 2 + 3 - 1 * 7 / 3 = 9
    //result가 main() -> Calculator()로 이동
    Calculator.plus(2);
    Calculator.plus(3);
    Calculator.minus(1);
    Calculator.multiple(7);
    Calculator.divide(3);
    printResult(Calculator.result);

  }


  public static void printResult(int value) {
    System.out.println("****************");
    System.out.printf("***> 결과 = %d\n", value);
    System.out.println("****************");
  }
}
