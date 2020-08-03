package com.eomcs.basic.ex07;

// # 메서드 : 가변 파라미터
//
public class Exam0250 {

  // 가변 파라미터
  // [리턴타입] 메서드명(타입... 변수) {...}
  // => 0 개 이상의 값을 받을 때 선언하는 방식.
  // => 메서드 내부에서는 배열처럼 사용한다.
  //
  // 다음은 hello()를 호출할 때 String 값을 0개 이상 전달할 수 있다.
  static void hello(String... names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s님 반갑습니다.\n", names[i]);
    }
  }

  static void m(String name, int a, int b, int c) {
    System.out.printf("%s의 총점은 %d, 평균은 %d입니다.\n",name, a+b+c, (a+b+c)/3);
  }

  static void m2(String name, int[] scores) {
    int sum = 0;
    for(int i=0; i<scores.length; i++) {
      sum += scores[i];
    }
    int aver = 0;
    if(scores.length>0) {
      aver = sum /  scores.length;
    }
    System.out.printf("%s의 총점은 %d, 평균은 %d입니다.\n",name, sum, aver);
  }

  static void m3(String name, int...scores) { //가변 파라미터를 배열로 받는다.
    int sum = 0;
    for(int i=0; i<scores.length; i++) {
      sum += scores[i];
    }
    int aver = 0;
    if(scores.length>0) {
      aver = sum /  scores.length;
    }
    System.out.printf("%s의 총점은 %d, 평균은 %d입니다.\n",name, sum, aver);
  }

  //가변 파라미터는 무조건 맨 끝에 와야한다.
  //static void m4(int...scores, String name) {
  //}

  //가변 파라미터는 여러개 선언할 수 없다.
  //static void m5(int...scores, int...scores2) {
  //}


  //가변 파라미터 중간에 다른 타입의 변수가 오더라도
  //가변 파라미터를 한개 초과하여 둘 수 없다.

  static void m4(int[] scores, String[] titles, String name){
    if(scores.length != titles.length) {
      System.out.println("과목 수와 점수의 개수가 다릅니다.");
      return;
    }
    System.out.println(name+"님 점수!");
    for (int i= 0; i <scores.length; i++) {
      System.out.printf("%s=%d점\n",titles[i],scores[i]);
    }
  }


  public static void main(String[] args) {

    m("홍길동",80,85,90);
    System.out.println("-------------------");

    m2("홍길동", new int[] {80,85,95,90,100});
    System.out.println("-------------------");

    m3("홍길동", new int[] {});
    System.out.println("-------------------");

    m4(new int[] {100,90,80}, new String[] {"국어","영어","수학"}, "홍길동");

    hello(); // 이 경우 names 배열의 개수는 0이다.
    System.out.println("-------------------");

    hello("홍길동"); // 이 경우 names 배열의 개수는 1이다.
    System.out.println("-------------------");

    hello("홍길동", "임꺽정", "유관순"); // 이 경우 names 배열의 개수는 3이다.
    System.out.println("-------------------");

    // 가변 파라미터 자리에 배열을 직접 넣어도 된다.
    String[] arr = {"김구", "안중근", "윤봉길", "유관순"};

    hello(arr);
    System.out.println("-------------------");

    // hello("홍길동", 20, "오호라"); // 다른 타입은 안된다. 컴파일 오류!
  }
}
