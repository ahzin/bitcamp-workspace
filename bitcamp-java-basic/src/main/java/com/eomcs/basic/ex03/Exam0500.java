package com.eomcs.basic.ex03;

//# 논리값 리터럴
public class Exam0500 {
  public static void main(String[] args) {
    //참을 표현할 때는 true, 거짓을 표현할 때는 false (소문자)
    System.out.println(true); 
    System.out.println(false); 

    //비교 연산의결과는 논리값
    System.out.println(4 < 5); 
    System.out.println(4 > 5); 

    //논리 연산의 결과는 논리값
    System.out.println(true&&false); 
    System.out.println(true||false); 

    //작은 따옴표가 알려준 유니코드 값 비교
    System.out.println(65 == 'A'); 
    System.out.println(65 == 'B'); 

    //숫자를 true/false로 변환할 수 없다.
    //System.out.println((boolean)1); 컴파일 오류 !
    
  }
}
