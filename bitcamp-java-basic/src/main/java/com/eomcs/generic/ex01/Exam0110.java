package com.eomcs.generic.ex01;

public class Exam0110 {
  //제너릭 문법이 없다면 각 타입의 객체를 저장하기 위해
  // 각 타입에 대한 클래스를 정의해야 한다.

  static class MemberBox{
    Member value;

    public void set(Member value) {
      this.value = value;
    }

    public Member get() {
      return value;
    }
  }

  static class StringBox{
    String value;

    public void set(String value) {
      this.value = value;
    }

    public String get() {
      return value;
    }
  }

  static class IntegerBox {
    Integer value;

    public void set(Integer value) {
      this.value = value;
    }

    public Integer get() {
      return value;
    }
  }

  public static void main(String[] args) {
    //Member 객체를 저장하려면 MemberBox를 사용
    MemberBox box1 = new MemberBox();
    box1.set(new Member("홍길동", 20)); //값 저장
    Member m = box1.get(); //값 꺼내기
    System.out.println(m);

    //String 객체를 저장하려면 StringBox를 사용
    StringBox box2 = new StringBox();
    box2.set(new String("Hello"));
    String str = box2.get();
    System.out.println(str);

    //Integer 객체를 저장하려면 IntegerBox를 사용
    IntegerBox box3 = new IntegerBox();
    box3.set(100); //auto-boxing : Integer.valueOf(100)
    int i = box3.get(); //auto-boxing : box3.get().intValue()
    System.out.println(i);
  }
}

// 이렇게 객체를 저장하려면 각 객체의 타입 별로 Box 클래스를 생성해야 한다.
// 문제는 이런 식으로 코딩을 하면 타입 별로 만들어야 할 Box 클래스가 무한정으로 늘어난다.
// 즉 같은 일을 하는 클래스임에도 불구하고
// 다루는 객체의 타입이 다르다는 이유만으로
// 여러 개의 유사 클래스를 반복적으로 정의해야 하는 문제가 발생한다.
// 해결책?
// => 다양한 타입의 객체를 저장할 수 있도록 다형성의 다형적 변수 특징을 이용하여
//    값을 저장하는 인스턴스 변수를 Object 타입으로 정의한다.
// => Exam0111.java 소스를 확인해보라!







