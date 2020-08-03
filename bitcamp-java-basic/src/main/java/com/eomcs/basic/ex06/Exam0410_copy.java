package com.eomcs.basic.ex06;
import java.util.ArrayList;
import java.util.Date;

//# 흐름 제어문 - for 반복문
//
public class Exam0410_copy {
  public static void main(String[] args) {
    ArrayList scores = new ArrayList();
    scores.add(100);
    scores.add(3.14f);
    scores.add("오호라");
    scores.add(true);
    scores.add('헐');
    scores.add(new Date());



    for (int i =0; i < scores.size(); i++) {
      System.out.println(scores.get(i));
    }
    //for (Object value : scores) {
    // System.out.println(value);
    //}

  }
}

