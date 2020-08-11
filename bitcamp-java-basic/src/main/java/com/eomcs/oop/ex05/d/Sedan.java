package com.eomcs.oop.ex05.d;
//상속
public class Sedan extends Car { //Sedan은 Car을 확장한다. - Sub(Child) Class
  boolean sunroof;
  boolean auto;

  public Sedan(String model, String maker, int capacity, boolean sunroof, boolean auto) {
    this.sunroof = sunroof;
    this.auto = auto;

    //Car class의 상속을 받아 사용할 수 있다.
    //기존 코드를 가져온다고 생각하지만, 아니다.
    //링크정보를 가지고 있음
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;
  }


}
