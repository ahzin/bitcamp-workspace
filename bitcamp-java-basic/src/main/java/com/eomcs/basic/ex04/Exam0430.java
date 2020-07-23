package com.eomcs.basic.ex04;

public class Exam0430 {
  public static void main(String[] args) {
    char c;
    
    c = 0;
    c = 65535;
    //c = -1; 에러!
    //c = 65536; 에러!
    
    c = 65; //A
    System.out.println(c);
    c = 0x42; //B
    System.out.println(c);
    c = 0b0100_0011; //C
    System.out.println(c);
    short s = 65;
    System.out.println(s);
    
    c = '헐'; // ''연산자는 문자의 유니코드 값을 리턴.
    System.out.println(c);
    
    int i = '헐';
    System.out.println(i);
    
    for (int x = 65; x < 80; x++) {
      System.out.println((char)x);
    }
    
    boolean b1, b2;
    b1 = true;
    b2 = false;
    System.out.println(b1);
    System.out.println(b2);
    //논리값은 정수로 다룰 수 없다. ex) i = b1; or b1 = 1; - 오류!
    
    
    
  }
}
