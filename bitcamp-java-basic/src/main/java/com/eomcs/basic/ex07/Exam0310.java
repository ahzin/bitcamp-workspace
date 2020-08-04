package com.eomcs.basic.ex07;
//call by value vs. call by reference
public class Exam0310 {

  static class Person{ //클래스 정의 : 새 데이터타입을 만듦 => 새 메모리를 설계함
    String name;
    int age;
    boolean working;
  }

  public static void main(String[] args) {
    int a = 200;

    m1(a); //call by value
    //메소드호출 => 로컬변수, 호출이 끝나면 사라짐

    System.out.println(a); //200

    a = 300;
    m1(a);
    System.out.println(a); //300

    System.out.println("-----------------------------");

    int arr[] = new int[3];// new 명령으로생성하는 변수 Heap이 따로 생성.
    arr[0] = 100;
    arr[1] = 200;
    arr[2] = 300;
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    System.out.println();

    m2(arr); //call by reference
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    Person p; //그 메모리에 저장할 주소 변수, p는 local변수
    p = new Person(); //null로 자동 초기화
    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);
    //null, 0, false
    m3(p); //call by reference
    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);
    //홍길동, 25, true
  }

  static void m1(int a) {
    a = 100;
  }

  static void m2(int[] arr) {
    arr[0] *=2;
    arr[1] *=3;
    arr[2] *=4;
  }

  static void m3(Person p) {
    p.name = "홍길동";
    p.age = 25;
    p.working = true;
  }

}

// 시험지 :
// 1. 다음 계산을 수행하라.
//  a 변수에 100을 넣어라.
//  b 변수에 200을 넣어라.
//  a와 b를 더해 그 결과를 출력하라.