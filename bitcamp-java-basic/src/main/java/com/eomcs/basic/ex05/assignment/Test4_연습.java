package com.eomcs.basic.ex05.assignment;
//# 과제: 다음 int 변수에 들어 있는 값을
//          각 자릿수의 10진수 값을 역순으로 출력하라.  
//실행 예)
//값 : 23459876
//6
//7
//8
//9
//5
//4
//3
//2
import java.util.Scanner;
public class Test4_연습 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.close();
    
    System.out.println("===입력받은 정수를 한자리 씩 역으로 출력하기===");
    //역순
    while(n > 0) {
      System.out.println(n%10); // 1의 자리수
      n /= 10; //출력후 자리수 줄이기
    }

    }

  }











