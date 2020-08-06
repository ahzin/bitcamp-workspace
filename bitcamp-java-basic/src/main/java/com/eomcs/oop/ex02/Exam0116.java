package com.eomcs.oop.ex02;
import com.eomcs.oop.ex02.util.Score;

public class Exam0116 {

  public static void main(String[] args) {

    Score s1;
    s1 = new Score();
    // Score s1 = new Score();
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 87;
    s1.compute();
    //Score.computerScore(s1)의 (s1)파라미터로 주지 말고,
    //앞으로 던져서 s1.computerScore()로 더 직관적으로 볼 수 있음.

    Score s2 = new Score();
    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 100;
    s2.math = 100;
    s2.compute();


    printScore(s1);
    System.out.println();
    printScore(s2);

  }

  //고정되는 출력값이 아니기 때문에
  //Score 안에서 관리하지 않는다.
  static void printScore(Score s) {
    System.out.printf("%s : %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}
