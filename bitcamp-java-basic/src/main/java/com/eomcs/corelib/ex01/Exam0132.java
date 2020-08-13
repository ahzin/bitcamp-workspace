// Object 클래스 - equals()에 대하여
package com.eomcs.corelib.ex01;



public class Exam0132 {
  static class Member{
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

  public static void main(String[] args) {

    Member m1 = new Member("홍길동", 25);
    Member m2 = new Member("홍길동", 25);

    System.out.println(m1 == m2); //false, 다른 인스턴스
    System.out.println();

    String s1 = new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s1 == s2); //false, 다른 인스턴스

    System.out.println(s1.equals(s2));
    //true, String클래스에서 toString()을 오버라이딩해서
    //인스턴스가 다르더라도 문자열이 같으면 true를 리턴하도록 toString()을 재정의

  }

}







