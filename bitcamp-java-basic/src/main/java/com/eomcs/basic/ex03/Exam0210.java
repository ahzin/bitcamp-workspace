// Exam0210.java
// 주제 : 정수 literal - 다양한 기수법으로 정수 표현하기
//출력 명령문  System.out.println(값);
package com.eomcs.basic.ex03;

class Exam0210 {
    public static void main(String[] args) {
    //10진수
    System.out.println(100);

    //8진수 - 앞이 0으로 시작되어야 한다.
    System.out.println(0144);

    //2진수 - 메모리 상태를 직설적으로 확인, 0B 또는 0b를 앞에 사용
    System.out.println(0B1100100);   
    System.out.println(0b1100100);   
    System.out.println(0b0110_0100);  

    //16진수 - 2진수를 간결하게 표현, 0X 또는 0x를 앞에 사용
    System.out.println(0x64);
    System.out.println(0X64);
    System.out.println(0X064);    
    }
}
