// Wrapper 클래스 - auto-boxing/auto-unboxing 응용
package com.eomcs.corelib.ex02;

public class Exam0224 {
  static class Member{
    String name;
    String tel;

    //    public Member(String name, String tel){
    //      this.name = name;
    //      this.tel = tel;
    //    }

    @Override
    public String toString() {
      return name + "," + tel;
    }
  }

  public static void main(String[] args) {
    //primitive data type과 클래스를 구분하여 메서드를 정의
    print(100); //정수 : 100
    print(new Member()); //회원 null, null

    printObject(100); //100
    printObject(new Member()); //null, null
  }

  static void print(int i) {
    System.out.print("정수 : ");
    System.out.println(i);
  }

  static void print(Member m) {
    System.out.print("회원 : ");
    System.out.println(m);
  }

  static void printObject(Object obj) {
    System.out.println(obj);
  }

}


