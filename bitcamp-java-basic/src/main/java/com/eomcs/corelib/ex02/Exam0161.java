// String - mutable vs immutable 객체
package com.eomcs.corelib.ex02;

public class Exam0161 {
  public static void main(String[] args) {
    //StringBuffer 객체는 mutable, 데이터 변경 가능

    StringBuffer buf = new StringBuffer("Hello");
    System.out.println(buf); //Hello
    buf.replace(2, 4, "xxxxxxx"); //원본을 바꾼 => (start, end, 문자열)
    //배열 2번쨰부터 4번째까지를, xxxxxx로 바꿔라
    System.out.println(buf); //Hexxxxxxx
  }
}


