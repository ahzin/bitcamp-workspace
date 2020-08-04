package com.eomcs.basic.ex07;

public class Exam0421 {
  public static void main(String[] args) throws Exception {
    int[] moneys = new int[] {100,200,300};
    float[] totals = new float[moneys.length];

    //호출하는 쪽에서 결과를 담을 배열을 주는 경우
    compute(moneys, totals, 0.0089f);

    for(int i = 0; i < moneys.length; i++) {
      System.out.printf("%d => %.1f\n", moneys[i], totals[i]);
    }
    System.out.println("------------------------------------");

    float[] result;
    //메서드 쪽에서 결과를 담을 배열을 만들어 리턴하는 경우

    result = compute2(moneys, 0.0089f);

    for(int i = 0; i < moneys.length; i++) {
      System.out.printf("%d => %.1f\n", moneys[i], result[i]);
    }
  }


  static void compute(int[] moneys, float[] totals, float interest) {
    for(int i=0; i < moneys.length; i++) {
      totals[i] = moneys[i] + (moneys[i] * interest);
    }
  }


  static float[] compute2(int[] moneys, float interest) {
    float[] totals = new float[moneys.length];
    for(int i=0; i < moneys.length; i++) {
      totals[i] = moneys[i] + (moneys[i] * interest);
    }
    return totals;
  }


}
