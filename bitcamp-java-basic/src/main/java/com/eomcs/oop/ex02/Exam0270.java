package com.eomcs.oop.ex02;

import com.eomcs.util.Calculator3;

public class Exam0270 {
  //식 2개 연산하기
  // 식 1) 2 + 3 - 1 * 7 / 3 = ?
  // 식 2) 3 * 2 + 7 / 4 - 5 = ?

  public static void main(String[] args) {
    Calculator3 c1 = new Calculator3();
    Calculator3 c2 = new Calculator3();

    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);

    c2.plus(3);
    c2.multiple(2);
    c2.plus(7);
    c2.divide(4);
    c2.minus(5);

    printResult(c1.result);
    printResult(c2.result);

  }


  public static void printResult(int value) {
    System.out.println("****************");
    System.out.printf("***> 결과 = %d\n", value);
    System.out.println("****************");
  }
}
