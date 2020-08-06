package com.eomcs.oop.ex03;

public class Exam0420 {
  static class SmartPhone{

    int voulme;
    int bright;
    int contrast;

    public SmartPhone() {
      //기본 생성자
      System.out.println("SmartPhone() 생성자 호출됨!");
    }

  }
  public static void main(String[] args) {
    SmartPhone obj1 = new SmartPhone();
  }

}
