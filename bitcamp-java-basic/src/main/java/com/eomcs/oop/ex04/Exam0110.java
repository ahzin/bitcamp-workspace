package com.eomcs.oop.ex04;
import java.util.Calendar;
import java.util.Date;

public class Exam0110 {
  public static void main(String[] args) throws Exception{
    //String도 클래스이기 때문에, new를 통해 인스턴스 생성
    String s1 = new String(); //빈 문자열
    //String s1 = null; //주소없음, 인스턴스 없음
    System.out.println("=>"+s1);

    String s2 = new String("Hello!"); //String 리터럴을 받는 생성자를만듬
    System.out.println("=>"+s2); //문자열 + 문자열주소 ? 당연히 불가.
    //문자열 주소가 문자열을 꺼내서 결합시켜서 출력시킨다.

    char[] chars = new char[] {'H','E','L','L','O','!'};
    String s3 = new String(chars); //String 인스턴스를 초기화 시킨 것을 받음
    System.out.println("=>"+s3);

    byte[] bytes = new byte[] {
        0x41, //A => 0041
        0x42, //B => 0042
        //byte : -128(ff) ~ +127(7f)
        (byte)0xEA, (byte)0xB0, (byte)0x80, //가 => AC00
        (byte)0xEA, (byte)0xB0, (byte)0x81 //각 => AC01
    };
    String s4 = new String(bytes, "UTF-8");
    System.out.println("=>"+s4);

    byte[] bytes2 = new byte[] {
        0x41,
        0x42,
        (byte)0xB0, (byte)0xA1, //가
        (byte)0xB0, (byte)0xA2, //각
        (byte)0xB6, (byte)0xCA, //똘
        (byte)0x8C, (byte)0x63, //똠
        (byte)0xB6, (byte)0xCB  //똥
    };
    String s5 = new String(bytes2, "MS949");
    //MS949는 EUC-KR(2350자) + x = 11172자
    System.out.println("=>"+s5);

    Date d1 = new Date(); //아무 값을 안주면, 현재 날짜와 시분초로 초기화된다.
    System.out.println(d1); // System.out.println(d1.toString());
    //아규먼트가 primitive type이나 String 타입이 아니면,
    //인스턴스에 대해 toString()을 호출하여 그 리턴 값을 출력한다.

    //Java의 모든 클래스에 대해서 .toString()을 호출할 수 있다.

    int[] arr = new int[] {100, 200, 300};
    System.out.println(arr.toString());
    System.out.println(arr);
    // 출력 : [I@5f184fc6 <= 메모리 주소값 아님, hash code임

    int a =100;
    //System.out.println(a.toString);
    //아규먼트가 primitive type, .toString() 불가!
    System.out.println(a);

    Date d2 = new Date(100000);
    System.out.println(d2);

    Date d3 = new Date(120, 8, 10);
    System.out.println(d3);

    //클래스 중에서는 생성자를 공개하지 않은 경우가 있다.
    //    Calendar c1 = new Calendar();
    //이런 클래스의 인스턴스를 만들려면 보통 두가지 방법을 사용한다.
    // 1) 다른 클래스의 도움을 받는다.
    // 2) 해당 클래스에서 제공하는 클래스메서드(스태틱메서드)를 사용한다.
    Calendar c1 = Calendar.getInstance();
    System.out.println(c1); //c1.toString()의 리턴값을 출력

    Car car1 = new Car();
    Car car2 = new Car();
    System.out.println(car1 == car2);
    car1.model = "티코";
    car1.cc = 980;
    car2.model = "소나타";
    car2.cc = 1980;
    System.out.println(car1.model);
    System.out.println(car2.model);

    //Car2 car3 = new Car2();
    Car2 car3 = Car2.getInstance();
    Car2 car4 = Car2.getInstance();
    System.out.println(car3 == car4);
    car3.model = "비트카";
    System.out.println(car4.model);


  }
}

//패키지멤버 클래스
class Car{
  String model;
  int cc;
}

class Car2{
  String model;
  int cc;
  static Car2 obj;

  private Car2() {
  }
  static Car2 getInstance() {
    //보통 생성자를 private로 만든경우는
    //Instance를 한개만 생성하도록 제한하고 싶을 때 주로 사용한다.
    if( obj == null) {
      obj =  new Car2();
    }
    return obj;
  }
}