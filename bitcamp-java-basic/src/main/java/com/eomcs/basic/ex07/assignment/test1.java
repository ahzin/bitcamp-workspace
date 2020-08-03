package com.eomcs.basic.ex07.assignment;

//# 과제 : 단위행렬을 출력하시오
//
public class test1 {
  public static void main(String[] args) {
    int[][] arr = new int[6][6];

    //단위 행렬이 되도록 배열을 초기화시키시오.
    /*
    for(int i = 1; i <=5; i++) {
      for(int j = 1; j <=5 ; j++) {
        arr[i][j] = (i / j) * (j / i);
      }

    }
     */
    //배열이 단위 행렬이 되도록 각 항목을 0 또는 1로 설정한다.

    System.out.println("------------------------------");
    for(int i = 1; i <= 5; i++)
      arr[i][i] = 1;
    System.out.println();
  }
}
