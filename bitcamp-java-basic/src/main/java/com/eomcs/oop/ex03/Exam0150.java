package com.eomcs.oop.ex03;

public class Exam0150 {

  static class Car{

    //클래스 필드
    //모든 인스턴스가 공유하는 값을 저장하는 용도
    static int count;

    //인스턴스 필드
    //개별적으로 관리 되어야 할 값을 저장하는 용도
    String model;
    String no; // 자동차번호
    int cc;
  }

  public static void main(String[] args) {

    Car c1 = new Car();
    Car c2 = new Car();

    c1.model = "티코";
    c1.no = "40-1111";
    c1.cc = 980;
    Car.count++;

    c2.model = "소나타";
    c2.no = "50-2222";
    c2.cc = 1980;
    Car.count++;

    System.out.printf("%s %s %d\n", c1.model, c1.no, c1.cc);
    System.out.printf("%s %s %d\n", c2.model, c2.no, c2.cc);
    System.out.println(Car.count);

  }
}
