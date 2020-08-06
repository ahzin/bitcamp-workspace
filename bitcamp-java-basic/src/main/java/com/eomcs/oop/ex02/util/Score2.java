package com.eomcs.oop.ex02.util;

//다른 클래스에서 사용할 수 있도록 public
//바깥으로 뺄 때는 static을 뺀다.

public class Score2{
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

  public void init(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

}
