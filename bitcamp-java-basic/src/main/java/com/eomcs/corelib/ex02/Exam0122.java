// String - String.equals() vs Object.equals()
package com.eomcs.corelib.ex02;

public class Exam0122 {

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
    System.out.println(m1 == m2); //false, 인스턴스 다름
    System.out.println(m1.equals(m2)); //false, Member 오버라이딩 안함

  }
}


