// Worker 구현체 사용
package com.eomcs.oop.ex09.a.after;

// 작업:
// 1) worker 객체의 사용 규칙을 정의한다.
//    => Worker 인터페이스 정의
// 2) 클래스를 정의할 때 Worker 규칙에 따라 만든다.
//    => BlueWorker, WhiteWorker, JubuWorker 클래스 변경
// 3) worker를 사용하는 측에서는 Worker 인터페이스에 정의된 대로 메서드를 호출한다.
//    => Exam01 클래스 변경
//
public class Exam01 {
  public static void main(String[] args) {
    Worker w1 = new BlueWorker();
    Worker w2 = new WhiteWorker();
    Worker w3 = new JubuWorker();

    //인터페이스를 구현하지 않은 클래스의 인스턴스 주소는 저장불가
    //예) Worker w4 = new String(); => 컴파일 오류

    //동일한 사용규칙에 따라 메서드를 호출할 수 있어, 일관성 유지가 가능, 유지보수에 좋다.
    w1.execute();
    w2.execute();
    w3.execute();


    //참고!
    Worker w;
    //인터페이스 레퍼런스 : 해당 인터페이스에 따라 작성된 클래스의 인스턴스 주소를 저장
    // w레퍼런스를 표현 하는 방법은 다음과 같다.
    // Worker 사용규칙에 따라 작성된 클래스의 인스턴스 주소를 저장하는 변수 w
    // Worker 인터페이스를 구현한 클래스의 인스턴스 주소를 저장하는 변수 w
    // Worker 구현체의 인터페이스 주소를 저장하는 변수 w
    // Worker 구현 객체를 저장하는 변수 w
    // Worker 객체를 저장하는(가리키는) 변수 w
  }
}

//프로그램을 짜다가 인터페이스를 만나게 되면,
// 누가 호출자이고 누가 피호출자인지 확인
// 본인이 맡은 개발 일이 호출자를 만드는 것인지, 피호출자를 만드는 것인지 확인


