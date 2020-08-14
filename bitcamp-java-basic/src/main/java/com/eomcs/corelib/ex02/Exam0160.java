// String - mutable vs immutable 객체
package com.eomcs.corelib.ex02;

public class Exam0160 {
  public static void main(String[] args) {
    //String 객체는 immutable객체(한번 객체에 담으면 변경불가)
    String s1 = new String("Hello");

    String s2 = s1.replace('l', 'x'); //원본데이터를 변경하지 않고, 새로운 String객체를 만든다.
    System.out.printf("%s : %s\n", s1, s2); //Hello : Hexxo

    String s3 = s1.concat(", world");
    System.out.printf("%s : %s\n", s1, s3);//Hello : Hello, world

  }
}





