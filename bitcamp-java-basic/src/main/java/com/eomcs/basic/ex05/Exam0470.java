package com.eomcs.basic.ex05;

//# 비트 이동 연산자 : 응용 III
//
public class Exam0470 {
  public static void main(String[] args) {
    final int CSS               = 0x01; // 0000 0001
    final int HTML              = 0x02; // 0000 0010
    final int PHP               = 0x04; // 0000 0100
    final int PYTHON            = 0x08; // 0000 1000
    final int JAVASCRIPT        = 0x10; // 0001 0000
    final int JAVA              = 0x20; // 0010 0000
    final int CPP               = 0x40; // 0100 0000
    final int C                 = 0x80; // 1000 0000

    int d1 = C | JAVA | PYTHON | HTML; // 0000 0000 1000 0111
    //    1000 0000 C
    //  | 0010 0000 JAVA
    //  | 0000 1000 PYTHON
    //  | 0000 0010 HTML
    //------------------------
    //    1010 1010
    
    // 정수 값에서 특정 비트의 값만 검사하는 방법
    // 1010 1010 (여러 프로그래밍 언어에 대해 설정된 값)
    //
    // CPP 언어를 할 줄 아는지 검사하기
    //     1010 1010
    //   & 0100 0000 (CPP 값을 조사하려는 값과 AND 한다.)
    //   ----------------------  
    //     0000 0000   
    //
    // AND 결과 값을 검사 값과 같은지 비교하면 된다.
    //     0000 0000 (결과값)
    //     0100 0000 (CPP 여부를 조사하는 값)
    // => 결과 값과 조사한 값이 같지 않으면 해당 비트가 0이라는 의미다.

    System.out.printf("CSS          : %b\n", (d1 & CSS) == CSS);
    System.out.printf("HTML         : %b\n", (d1 & HTML) == HTML);
    System.out.printf("PHP          : %b\n", (d1 & PHP) == PHP);
    System.out.printf("Python       : %b\n", (d1 & PYTHON) == PYTHON);
    System.out.printf("JavaScript   : %b\n", (d1 & JAVASCRIPT) == JAVASCRIPT);
    System.out.printf("Java         : %b\n", (d1 & JAVA) == JAVA);
    System.out.printf("C++          : %b\n", (d1 & CPP) == CPP);
    System.out.printf("C            : %b\n", (d1 & C) == C);
    
    System.out.println("===============================================");
    
    System.out.printf("CSS          : %b\n", (d1 & CSS) > 0);
    System.out.printf("HTML         : %b\n", (d1 & HTML) > 0);
    System.out.printf("PHP          : %b\n", (d1 & PHP) > 0);
    System.out.printf("Python       : %b\n", (d1 & PYTHON) > 0);
    System.out.printf("JavaScript   : %b\n", (d1 & JAVASCRIPT) > 0);
    System.out.printf("Java         : %b\n", (d1 & JAVA) > 0);
    System.out.printf("C++          : %b\n", (d1 & CPP) > 0);
    System.out.printf("C            : %b\n", (d1 & C) > 0);
     
    

  }
}






















