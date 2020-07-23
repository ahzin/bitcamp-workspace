//변수선언
//데이터를 저장할 메모리를 확보하는 명령
package com.eomcs.basic.ex04;

public class Exam0110 {
  public static void main(String[] args) {
    int i;
    int i2;
    int i3;
    int x, y, z;

    i  = 100; //  = assignment 연산자
//   L-Value = R-Value
//메모리,변수  값,메모리(L-Value에는 값이 올 수 없다.
    
//문장(Statement)변수선언, 메서드 선언, 클래스, 조건문, 반복문 등.
    //표현식(Expression) : 결과를 생성하는 리턴 문장 => R-Value에 위치
    x = i;
    y = i * x ;
    
    byte b1 = 10 ; // [00001010]
    byte b2 = 12 ; // [00001100]
    b1 = b2 ; //b1 => [00001100]
    
    i = b1 ; // [00000000_00000000_00000000_00001100]
    
    //b2 = i; 컴파일에러, 오버플로우
    b2 = (byte) i ; //잘려도 상관없으니까 넣어라(강제)
    
    //initialize(초기화)
    int a = 100;
    int b = 200;
    int aa, bb = 100, cc = 200, dd;
    
    byte xx = 10; // 00001010
    xx = 12; // 00001100
    xx = 78; // 01001110
    
    
  }
}
