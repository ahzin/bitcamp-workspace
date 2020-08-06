package com.eomcs.oop.ex03;

public class Exam0421 {
  static class SmartPhone{

    int voulme;
    int bright;
    int contrast;

    //생성자가 한 개라도 있으면 기본 생성자가 자동으로 생성되지 않는다.
    public SmartPhone(int a) {
      //기본 생성자
      System.out.println("SmartPhone(int) 생성자 호출됨!");
    }

  }
  public static void main(String[] args) {
    //SmartPhone obj1 = new SmartPhone(); => 에러!
    //SmartPhone obj1 = new SmartPhone(3.14); => 에러!

    SmartPhone obj1 = new SmartPhone(100);
  }

}
