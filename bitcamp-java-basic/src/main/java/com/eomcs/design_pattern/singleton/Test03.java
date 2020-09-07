// Singleton 적용
package com.eomcs.design_pattern.singleton;

class Kimbap {
  String type; //참치,김치,기본 등등
  int num; //내용물 갯수

  // 인스턴스 주소를 받을 클래스 필드를 선언한다.
  private static Kimbap instance;

  private Kimbap() {}

  // 2) 인스턴스를 생성해주는 메서드를 정의한다.
  public static Kimbap getInstance() {
    if (Kimbap.instance == null) {
      // 아직 인스턴스를 생성한 적이 없다면 즉시 인스턴스를 생성한다.
      Kimbap.instance = new Kimbap();
    }

    // 기존에 변수에 저장된 인스턴스 주소를 리턴한다.
    return Kimbap.instance;
  }
}

public class Test03 {
  public static void main(String[] args) {

    //다음 코드는 컴파일 오류
    //Kimbap bap 1 = new kimbap();

    Kimbap bap2 = Kimbap.getInstance();
    Kimbap bap3 = Kimbap.getInstance();

    if (bap2 != bap3)
      System.out.println("내용물이 다른 김밥!");
    else
      System.out.println("내용물이 같은 김밥!");
  }
}








