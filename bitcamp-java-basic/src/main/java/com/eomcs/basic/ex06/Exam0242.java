package com.eomcs.basic.ex06;

public class Exam0242 {
  enum Level {
    GUEST, MEMBER, ADMIN
  }

  public static void main(String[] args) {
    Level lv = Level.ADMIN;

    switch(lv) {
      case GUEST:
        System.out.println("조회만 가능합니다.");
        break;
      case MEMBER:
        System.out.println("조회 및 글 작성이 가능합니다.");
        break;
      case ADMIN:
        System.out.println("다른 회원의 글을 변경/삭제할 수 있습니다.");
        break;
    }
  }

}
