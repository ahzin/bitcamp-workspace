package com.eomcs.basic.ex06;

//# 흐름 제어문 - for 반복문
//
public class Exam0410 {
  public static void main(String[] args) {
    // for (변수선언 및 초기화; 조건; 증감문) 문장;
    // for (변수선언 및 초기화; 조건; 증감문) {문장1; 문장2; ...}

    // for 문의 전형적인 예
    loop:
      for (int i = 2; i <= 9; i++) {
        for(int j = 1; j <= 9; j++) {
          System.out.printf("%d x %d = %d\n", i, j, i*j);
          if (i == 5 && j == 5) {
            //break;// => 5 * 5 까지만 출력하고 break 후 6단으로 넘어감.
            //break loop; // 5 * 5 까지만 출력하고 아예 for문을 break
            continue loop; //다음 문장도 실행하지 말고 다음i++로 실행
            //5랑 6단 사이에  -----가 없는 것을 확인가능.
          }
        }
        System.out.println("---------------------");
      }
  // 실행 순서
  // 1) 변수초기화  => int i = 1
  // 2) 조건 => i <= 10
  // 3) 문장 => System.out.print(i + " ")
  // 4) 변수증가문 => i++
  // 조건이 참인 동안 2 ~ 4를 반복한다.

  // for 문에서 선언한 변수는 그 for 문 안에서만 사용할 수 있다.
  //System.out.println(i); // 컴파일 오류!
  }
}
