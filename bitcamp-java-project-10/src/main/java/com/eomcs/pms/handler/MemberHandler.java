package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class MemberHandler {
  //회원데이터
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

  //다른 패키에서도 이 메서드를 사용할 수 있도록
  //public으로 사용범위를 공개한다.
  public static void add() {
    System.out.println("[회원 등록]");

    Member member= new Member(); //기본 생성자 호출
    //member 레퍼런스가 가르키는 인스턴스(객체)의 필드에 값을 저장
    member.no = Prompt.inputInt("번호? ");
    member.name = Prompt.inputString("이름? ");
    member.email = Prompt.inputString("이메일? ");
    member.password = Prompt.inputString("암호? ");
    member.photo = Prompt.inputString("사진? ");
    member.tel = Prompt.inputString("전화? ");
    member.registerDate = new java.sql.Date(System.currentTimeMillis());

    list[size++] = member;

  }

  public static void list() {
    System.out.println("[회원 목록]");

    for (int i = 0; i < size; i++) {
      Member member = list[i];
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          member.no,
          member.name,
          member.email,
          member.tel,
          member.registerDate);
    }
  }

  public static Member findByName(String name) {
    for(int i = 0; i < size; i++) {
      Member member = list[i];
      if(member.name.equals(name)) {
        return member;
      }
    }
    return null;
  }

}