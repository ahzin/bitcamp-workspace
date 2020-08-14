// String - equals(), hashCode()
package com.eomcs.corelib.ex02;

public class Exam0150 {

  static class Member{
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

  public static void main(String[] args) {
    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("홍길동", 20);

    System.out.println(m1 == m2); //false

    System.out.printf("%x, %x\n", m1.hashCode(), m2.hashCode());
    //a09ee92, 30f39991

    System.out.printf("%s,\n %s\n", m1.toString(), m2.toString());
    //com.eomcs.corelib.ex02.Exam0150$Member@a09ee92,
    //com.eomcs.corelib.ex02.Exam0150$Member@30f39991

    System.out.printf("%b\n", m1.equals(m2)); //false

    System.out.println("------------------------------");

    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1 == s2); //false

    System.out.printf("%x, %x\n", s1.hashCode(), s2.hashCode());
    //toString()오버라이딩, 보관된 문자열 리턴
    //42628b2, 42628b2

    System.out.printf("%s,\n %s\n", s1.toString(), s2.toString());
    //Hello,
    //Hello

    System.out.printf("%b\n", s1.equals(s2)); //true

  }

}


