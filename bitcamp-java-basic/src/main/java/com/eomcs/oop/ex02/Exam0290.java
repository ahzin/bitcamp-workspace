package com.eomcs.oop.ex02;

import com.eomcs.util.Calculator3;

public class Exam0290 {

  public static void main(String[] args) {
    // 식 1)  2 + 3 - 1 * 7 / 3 = ? 을 계산 (단, 연산자 우선순위가 없다는 가정)
    // 식 2)  3 * 2 + 7 /4 -5 =?

    //식 1과 2를 동시에 계산할 수 있을까?
    // => 불가하다 !
    // => Calculator는 result 변수를 한 개만 관리하기 때문에
    //      동시에 여러 개의 식 결과를 따로 관리할 수 없다.
    //식 1과 2를 동시에 계산하려면 result변수를 2개 준비해야한다.

    Calculator3 c1 = new Calculator3();
    Calculator3 c2 = new Calculator3();


    //식 1
    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);

    printResult(c1.result);

    //식 2
    c2.plus(3);
    c2.multiple(2);
    c2.plus(7);
    c2.divide(4);
    c2.minus(5);

    printResult(c2.result);

    //result변수는 1개이기 때문에 동시에 계산하지 못한다.
    //계산이 끝난 후, 다시 result변수를 0으로 초기화해서 사용해야한다.
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
