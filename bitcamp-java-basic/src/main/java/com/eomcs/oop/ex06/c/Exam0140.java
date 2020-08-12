// 오버라이딩(overriding) - 필드 오버라이딩
package com.eomcs.oop.ex06.c;

public class Exam0140 {
  public static void main(String[] args) {
    A4 obj1 = new A4();
    obj1.name = "홍길동";
    obj1.age = "20";
    //obj1.super.age = 20 ; 컴파일 오류!

    obj1.print(); //super클래스의 print지만, 제일 가까운' A3로 감
    //'홍길동(0)'님 반갑습니다!
    // A3의 age를 저장한적이 없기 때문에 age가 0이 나온다.

    obj1.print3();
    //'홍길동(20, 0)'님 반갑습니다!
    //obj1.age = "20"; 저장했기 때문에 age는 20이 된다.
    //현재 클래스의 인스턴스 변수

    // this.필드명 => 현재 클래스에서 해당 필드를 찾는다.
    //                  없으면 상위 클래스로 따라 올라가면서 찾는다.
    // super.필드명 => 상위 클래스에서부터 해당 필드를 찾는다.
    //                  없으면 계속 상위 클래스로 따라 올라간다.

    obj1.test();
  }
}









