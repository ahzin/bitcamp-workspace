// Worker 구현체 사용
package com.eomcs.oop.ex09.a.before;

public class Exam01 {

  public static void main(String[] args) {
    BlueWorker w1 = new BlueWorker();
    WhiteWorker w2 = new WhiteWorker();
    JubuWorker w3 = new JubuWorker();

    w1.doFight();
    w2.doZingZing();
    w3.doSsingSsing();
    //호출할 때 일관성이 없다.

  }
}



