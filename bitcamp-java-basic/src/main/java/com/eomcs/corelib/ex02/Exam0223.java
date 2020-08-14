// Wrapper 클래스 - auto-boxing/auto-unboxing 응용

package com.eomcs.corelib.ex02;

public class Exam0223 {

  static class Member{
    String name;
    String tel;

    public Member(String name, String tel) {
      this.name = name;
      this.tel = tel;
    }

    @Override
    public String toString() {
      return name + "," + tel;
    }
  }

  public static void main(String[] args) {
    int i = 100;
    Member member = new Member("홍길동", "010-0000-0000");

    String str = new String("Hello");

    Object obj;
    obj = member; //다형적 변수 문법에 따라 상위 클래스의 레퍼런스에 저장할 수 있다.
    obj = str; // 다형적 변수 문법에 따라 상위클래스에 레퍼런스에 저장할 수 있다.
    obj = i; // auto-boxing 규칙에 따라 Integer.valueOf(i) 문장으로 변환한다.

    Integer obj2 = (Integer)obj;

    System.out.println(i); //100
    System.out.println(obj); //100

  }
}


