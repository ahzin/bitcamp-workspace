package com.eomcs.basic.ex06;

//# 흐름 제어문 - break와 continue 활용
//
public class Exam0321 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    // 1부터 20까지의 짝수 구하기
    while(count++ < 20) {
      if(count %2 !=0) {
        continue;
      }
      System.out.println(count);
    }
    System.out.println("------------------------");

    // 1부터 100까지의 짝수의 합은?
    // => continue 사용 전
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count % 2 == 0) {
        sum += count;
      }
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);

    System.out.println("------------------------");

    // => continue 사용 후
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count % 2 == 1)
        continue; // 다음 문장을 실행하지 않고 즉시 조건 검사로 이동한다.
      sum += count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);
  }
}
