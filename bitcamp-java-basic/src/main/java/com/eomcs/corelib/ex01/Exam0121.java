// Object 클래스 - toString() 을 오버라이딩 할 때
package com.eomcs.corelib.ex01;

public class Exam0121 {
  static class My{
    String name;
    int age;
    //toString()을 오버라이딩해서 인스턴스의 현재 값을 간단히 확인

    @Override
    public String toString() {
      return "My [neme=" + name + ", age = " + age + "]";
    }
  }

  public static void main(String[] args) {
    My obj1 = new My();

    obj1.name = "홍길동";
    obj1.age = 25;

    System.out.println(obj1.toString()); //My [neme=홍길동, age = 25]
    System.out.println(obj1);//My [neme=홍길동, age = 25]
  }

  // println()의 파라미터 값으로 문자열을 넘겨주지 않으면,
  // println() 내부에서 파라미터로 넘어온 객체에 대해 toString() 호출한 후
  // 그 리턴 값을 출력한다.
  // 따라서 그냥 객체(주소)를 넘겨줘도 된다.


}







