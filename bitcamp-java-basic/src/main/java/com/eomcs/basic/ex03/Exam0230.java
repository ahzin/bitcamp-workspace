// 주제 : 메모리 크기에 따른 표기법

package com.eomcs.basic.ex03;

class Exam0230 {
    public static void main(String[] args) {
    //자바 정수값을 저장하는 기본 메모리 크기 : 4byte
    System.out.println(21_4748_3647);
    System.out.println(-21_4748_3647); 

    //System.out.println(21_4748_3648);
    //System.out.println(-21_4748_3649); 
    
    //8byte 메모리를 사용하는 정수 literal - L(또는 l)
    System.out.println(21_4748_3648L);
    System.out.println(-21_4748_3649L); 

    System.out.println(1); //4byte 메모리를 사용하는 1
    System.out.println(1L); //8byte 메모리를 사용하는 1

    System.out.println(Integer.MAX_VALUE); //4byte 정수 최대
    System.out.println(Integer.MIN_VALUE); //4byte 정수 최소

    System.out.println(Long.MAX_VALUE); //8byte 정수 최대
    System.out.println(Long.MIN_VALUE); //8byte 정수 최소
    }
}
