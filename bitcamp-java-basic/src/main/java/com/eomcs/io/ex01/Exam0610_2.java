// 디렉토리에 들어있는 파일(디렉토리) 목록을 꺼낼 때 필터 적용하기
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0610_2 {
  public static void main(String[] args) {
    // 1) 현재 폴더의 모든 파일 또는 모든 디렉토리 이름을 출력하라!
    // 2) 파일 이름 뿐만아니라 디렉토리일 경우 d 파일일 경우 -를 앞에 출력하라.
    File file = new File(".");
    File[] files = file.listFiles();
    for (File f : files) {
      System.out.printf("%s %s\n",
          f.isDirectory() ? "d" : "-",
              f.getName());
    }
  }
}


