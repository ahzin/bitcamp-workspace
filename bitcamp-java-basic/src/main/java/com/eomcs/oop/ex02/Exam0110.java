package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score1;

public class Exam0110 {



  public static void main(String[] args) {
    Score1 s1 = new Score1("김갑돌", 100, 90, 80);
    Score1 s2 = new Score1("김갑수", 100, 100, 80);

    printScore(s1);
    System.out.println();
    printScore(s2);

  }

  static void printScore(Score1 s) {
    System.out.printf("%s : %d %d %d %d %.1f",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }

}
