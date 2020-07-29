package com.eomcs.basic.ex05.assignment;
import java.util.Scanner;
//# 과제1 : 다음 int변수에 들어 있는 값을
//          다음과 같이 첫 바이트부터 끝 바이트까지 16진수로 순서대로 출력하라!
//실행 예)
//입력? 2,864,434,397
//출력
//aa
//bb
//cc
//dd
//
public class Test3_연습 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int value = input.nextInt();
    
    System.out.println(Integer.toHexString(value));
    //0xff
    //000000000_000000000_0000000000_11111111
    System.out.println(Integer.toHexString(value>>24 &0xff));
    System.out.println(Integer.toHexString(value>>16 &0xff));
    System.out.println(Integer.toHexString(value>>8 &0xff));
    System.out.println(Integer.toHexString(value&0xff));//4안해도 마지막 4bit만 비교
  }
}








