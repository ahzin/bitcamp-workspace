// hash code 응용 - HashSet 과 hashCode()
package com.eomcs.corelib.ex01;

import java.util.HashSet;

public class Exam0150 {

  static class Student{
    String name;
    int age;
    boolean working;

    public Student(String name, int age, boolean working) {
      this.name = name;
      this.age = age;
      this.working = working;
    }
  }

  public static void main(String[] args) {
    Student s1 = new Student("홍길동", 20, false);
    Student s2 = new Student("홍길동", 20, false);
    Student s3 = new Student("홍길봉", 21, true);
    Student s4 = new Student("홍길웅", 22, true);

    System.out.println(s1 == s2); //false

    System.out.println(s1.hashCode()); //168423058
    System.out.println(s2.hashCode()); //821270929
    System.out.println(s3.hashCode()); //1160460865
    System.out.println(s4.hashCode()); //1247233941
    System.out.println("=======================");

    //해시셋(집합)에 객체를 보관
    HashSet<Student> set = new HashSet<Student>();
    set.add(s1);
    set.add(s2);
    set.add(s3);
    set.add(s4);

    //해시셋(집합)에 보관된 객체를 꺼냄
    Object[] list = set.toArray();
    for(Object obj:list) {
      Student std = (Student) obj;
      System.out.printf("%s, %d, %s\n", std.name, std.age, std.working ? "재직중" : "실업중");
      //      홍길봉, 21, 재직중
      //      홍길동, 20, 실업중 -중복!
      //      홍길동, 20, 실업중 -중복!
      //      홍길웅, 22, 재직중
    }
  }
}


//HashSet
//집합의 기능을 수행하여, 중복값을 저장할 수 없다.
//저장할 때 객체의 해시코드로 중복 여부를 검사, 해시값이 다르면 다른 값으로 취급한다.
//또한 해시코드로 값을 저장할 인덱스를 결정하기 때문에 값을 꺼낼 때 저장한 순서대로 꺼낼 수 없다.

// 현재 예제의 문제점?
// => s1과 s2는 같은 데이터를 갖고 있지만, 다른 해시 코드를 리턴하기 때문에
//    HashSet 입장에서는 s1과 s2를 다른 값으로 취급한다.
// => 그래서 s1과 s2 모두 HashSet에 보관된 것이다.
//
// 해결책?
// => Student 클래스에서 hashCode()를 오버라이딩 하여
//    같은 데이터에 대해 같은 해시코드를 리턴하도록 만들어야 한다.




