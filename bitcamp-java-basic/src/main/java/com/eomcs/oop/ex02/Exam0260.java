package com.eomcs.oop.ex02;
import com.eomcs.util.Calculator3;

public class Exam0260 {
  public static void main(String[] args) {
    // 2 + 3 - 1 * 7 / 3 = 9

    Calculator3 c1 = new Calculator3();
    //Exam0250보다 더 직관적으로 알 수 있다.
    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);

    printResult(c1.result);
  }

  public static void printResult(int value) {
    System.out.println("****************");
    System.out.printf("***> 결과 = %d\n", value);
    System.out.println("****************");
  }
}
