package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class MemberHandler {
  static class Member{
    int no;
    String name;
    String email;
    String password;
    String photo;
    String tel;
    Date registerDate;
  }

  static final int LENGTH = 100;
  static Member[] list = new Member[LENGTH];
  //왼쪽의 레퍼런스 배열만 static으로 만들어짐
  static int size = 0;


  public static void add() {
    System.out.println("[회원 등록]");

    Member m = new Member(); //기본 생성자 호출

    m.no = Prompt.inputInt("번호? ");
    m.name = Prompt.inputString("이름? ");
    m.email = Prompt.inputString("이메일? ");
    m.password = Prompt.inputString("암호? "); //m레퍼런스가 가르키는 인스턴스(객체)의 password필드에 값을 저장
    m.photo = Prompt.inputString("사진? ");
    m.tel = Prompt.inputString("전화? ");
    m.registerDate = new java.sql.Date(System.currentTimeMillis());

    list[size++] = m;

  }

  public static void list() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      Member m = list[i];
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          m.no, m.name, m.email, m.tel, m.registerDate);
    }
  }

}
