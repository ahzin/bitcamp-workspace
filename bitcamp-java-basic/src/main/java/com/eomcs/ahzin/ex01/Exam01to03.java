package com.eomcs.ahzin.ex01; //package명은 경로 .으로 구분
/* 
multi-line 주석
*/
// one-line 주석

public class Exam01to03 { //public class명은 파일명과 동일해야한다. -> 유지보수 용이
    public static void main(String[] args){ //명렁어 실행 최소 요구사항
        //출력하기 : System.out.println(출력값);  
        System.out.println(100); //정수
        System.out.println(1278_3406); //2진수
        System.out.println(07_7); //8진수
        System.out.println(0xffaa); //16진수
        System.out.println(3.14); //부동소수점
        System.out.println(314e-2); //부동소수점
        System.out.println(0B0_000_0001); //문자_ 삽입하기, 맨앞 혹은 맨뒤 삽입 불가->0B_00000000
        System.out.println('A'); //문자
        System.out.println("ABC"); //문자열 
        System.out.println(true); //boolean (true) or (false)

        //메모리에 대한 표기
        //자바 정수값을 저장하는 기본 메모리 크기 : 4byte
        System.out.println(21_4748_3647);
        System.out.println(-21_4748_3647); 
        
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
    
    @Override //annotation - 기존 기능을 재정의하는 것이 맞는지 검사하는 명령
    public String toString(){
        return "test";
    }
}

/*
컴파일하기
javac -d bin/main -encoding UTF-8 [파일경로]
출력하기
java -cp(classpath) bin [package명]
*/