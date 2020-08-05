package com.eomcs.oop.ex02;

import com.eomcs.util.Calculator;

public class Exam0210 {

  public static void main(String[] args) {
    // 2 + 3 - 1 * 7 / 3 = ? 을 계산 (단, 연산자 우선순위가 없다는 가정)
    int result = 0;
    Calculator.plus(2);
    Calculator.plus(3);
    Calculator.minus(1);
    Calculator.multiple(7);
    Calculator.devide(3);

    printResult(Calculator.result);

  }

  public static void printResult(int value) {
    System.out.println("****************");
    System.out.printf("***> 결과 = %d\n", value);
    System.out.println("****************");
  }
}


/*
 * 클래스 문법
 * 1) 유지보수가 쉽도록 서로 관련된 일을 하고, 메서드를 한 블록으로 묶는다.
 * 2) 특정 상황에 맞는 데이터를 다루기 쉽도록 메모리를 설계한다.
 *      (= 새 데이터 타입을 정의)
 */
