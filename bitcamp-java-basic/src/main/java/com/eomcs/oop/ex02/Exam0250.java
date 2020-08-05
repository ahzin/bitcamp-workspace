package com.eomcs.oop.ex02;
import com.eomcs.util.Calculator2;

public class Exam0250 {
  public static void main(String[] args) {
    // 2 + 3 - 1 * 7 / 3 = 9

    Calculator2 c1 = new Calculator2();

    Calculator2.plus(c1, 2);
    Calculator2.plus(c1, 3);
    Calculator2.minus(c1, 1);
    Calculator2.multiple(c1, 7);
    Calculator2.divide(c1, 3);

    printResult(c1.result);
  }

  public static void printResult(int value) {
    System.out.println("****************");
    System.out.printf("***> 결과 = %d\n", value);
    System.out.println("****************");
  }
}
