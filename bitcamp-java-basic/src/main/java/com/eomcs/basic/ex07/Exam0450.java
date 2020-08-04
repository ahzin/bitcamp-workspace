package com.eomcs.basic.ex07;

public class Exam0450 {
  static int sum(int value) {
    if (value == 1) {
      return 1;
    }
    return value + sum(value-1);
  }
  //JVM Stack 메모리의 사용
  //0) 시작
  //1) main()
  //2) main() => sum(5)
  //          => 5 + sum(4)
  //                 => 4 + sum(3)
  //                        => 3 + sum(2)
  //                               => 2 + sum(1)
  //                                      => 1
  //3) main()
  //4) 종료!

  public static void main(String[] args) {
    System.out.println(sum(5));
  }

}
