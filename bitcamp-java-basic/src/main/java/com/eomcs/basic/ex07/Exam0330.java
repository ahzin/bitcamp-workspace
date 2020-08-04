package com.eomcs.basic.ex07;
//call by reference
public class Exam0330 {
  static void swap(int[] arr) {
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
    //swap(): arr[0]=100, arr[1]=200
    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
    //swap(): arr[0]=200, arr[1]=100
  }

  public static void main(String[] args) {
    int[] arr = new int[] {100,200};
    swap(arr);
    System.out.printf("main(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
    //main(): arr[0]=200, arr[1]=100

  }
}
