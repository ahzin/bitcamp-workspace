package com.eomcs.oop.ex02.util;

//다른 클래스에서 사용할 수 있도록 public
//바깥으로 뺄 때는 static을 뺀다.

public class Score4{
  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float aver;

  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }

  //생성자 만들기
  //리턴타입은 적지 않고, 클래스 이름과 동일하게 만들기
  public Score4(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;

    this.compute();
  }

}
