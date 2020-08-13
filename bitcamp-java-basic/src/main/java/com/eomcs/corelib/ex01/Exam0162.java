// Object 클래스 - getClass() 와 배열의 항목 이름
package com.eomcs.corelib.ex01;

public class Exam0162 {

  public static void main(String[] args) {
    //배열의 클래스 정보
    String[] obj = new String[10];
    Class<?> classInfo = obj.getClass();
    System.out.println(classInfo.getName()); //[Ljava.lang.String;


    // 배열 항목의 타입 정보
    Class<?> comptTypeInfo = classInfo.getComponentType();

    System.out.println(comptTypeInfo.getName()); //java.lang.String

    System.out.println(obj.getClass().getComponentType().getName()); //java.lang.String

  }
}







