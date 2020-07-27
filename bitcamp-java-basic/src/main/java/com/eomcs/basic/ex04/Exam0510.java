package com.eomcs.basic.ex04;

public class Exam0510 {
  public static void main(String[] args) {
    
    int[] p = new int[3]; // = C언어의 (int*)malloc(sizeof(int)*3);
    // p
    // 배열의 주소를 담는 변수, [레퍼런스]라고 한다.
    
    //new int[3] : int변수를 연속해서 3개 확보한다.
    //메모리를 확보한 후, 리턴 값은 그 메모리의 시작주소이다.
    
    //배열의 개수 알아내기 - .length
    System.out.println(p.length);
    //배열의 주소가 없는 상태에서 사용하지 말기
    int[] x;
    //x = null;
    //System.out.println(p.length);
    
    //배열에 값 저장
    p[0] = 100;
    p[1] = 200;
    p[2] = 300;
    
    System.out.printf("%d, %d, %d\n", p[0], p[1], p[2]);
    //p[3] = 400; - 오류 ! 예외발생 범위를 넘어갈 수 없다.
    //runtime exception
    
    int sum = 0;
    for (int i = 0; i < p.length; i++) {
      sum = sum + p[i];
    }
    System.out.println(sum);
    
    //배열 레퍼런스를 선언하는 방법
    int[] p2; //자바에서 주로 사용하는 방식
    int p3[]; //C언어 방식도 사용가능, 단 갯수를 지정할 수 없다.
    
    //p2 = 100; 컴파일 오류!
    p2 = p ; //p 레퍼런스에 저장된 주소를 p2 레퍼런스에 복사한다.
    p2[1]= 1000;
    System.out.println(p[1]);
    
    //new 명령으로 확보한 메모리 : 인스턴스(instance)
    //인스턴스에 주소를 저장하는 변수 : 레퍼런스(reference)
    p = new int[4];
    p[1] = 2000;
    System.out.printf("%d %d\n", p[1], p2[1]);
   
    //System.out.println(p3[1]); 컴파일 오류 ! 존재하지 않는 것은 쓸 수 없다.
    
    //자바는 primitive type을 제외한 모든 변수는 레퍼런스이다.
    //하물며 배열 변수도.
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean bool;
    char c;
    
    //자바는 주소값을 출력할 수 없다.
    
    //레퍼런스 변수의 주소값을 0으로 초기화 하기
    //p2 = 0; 직접적으로 초기화 선언 불가
    p2 = null; //주소 변수(레퍼런스)를 0으로 초기화시키려면 [null]을 사용한다.
    //System.out.println(p2[0]); : java.lang.NullPointerException : 주소 없졍
    
    int k1;
    //System.out.println(k1); : 변수를 초기화시키지 않고 사용하면 컴파일 오류!
    
    int[] k2 = new int[3];
    //new 명령으로 메모리를 준비할 때, 모든 메모리는 0으로 자동 초기화된다.
    //따라서 따로 초기화할 필요없이 바로 사용할 수 있다.
    System.out.println(k2[0]);
    System.out.println(k2[1]);
    System.out.println(k2[2]);

    //배열 생성 후 즉시 초기화하기
    int[] k3 = new int[] {100,200,300};
    //{}안에 값을 넣을 수 있는 int 배열을 만든 후, 그 배열에 값을 넣는다.
    //배열의 갯수를 지정해서는 안된다. 문법 오류임.
    
    int[] k4;
    k4 = new int[] {10,20};
    
    int[] k5 = {11, 12, 13}; // ==> new int[] {11, 12, 13}
    
    //int[] k6;
    //k6 = {111, 222, 333}; ==> 컴파일 오류 ! 변수 선언 없이는 생략 불가.
    
    int[] x1 = new int[3];
    int[] x2 = new int[4];
    int[] x3 = x1; // reference count 2//1
    x2 = x1; // x2는 x1과 같은 주소를 가지게 된다. reference count 3//0
    //x2가 가리켰던 int[4] 배열 메모리의 주소를 잃어버려 더 이상 사용할 수 없다.
    //인스턴스를 가리키는 레퍼런스가 없다 => 메모리를 사용 불가 => 쓰레기(garbage)
    //가비지 : JVM이 자동으로 해지시킨다. 단, 바로 해지시키는게 아니라 다음조건에 해당될 때.
    //  1) 메모리가 부족할 때
    //  2) 시스템이 오랫동안 한가할 때
    //  결론 ==> 언제 가비지를 메모리에서 해지시킬 지, 알 수 없다.
    //          ==> 메모리 해제는 JVM에 맡긴다. 
    //               ==> Garbage Collector : 가비지를 찾아 해제시킨다.
    
    System.gc(); //가능하다면 빠른 시일 내에 가비지를 수집해 줄 것을 요구 !
    // 주의 !
    // => gc()를 호출한다고 해서 바로 가비지 컬렉터가 동작하는 것은 아님.
    // => 가비지 컬렉터의 실행을 앞당겨달라고 요청하는 것이다.
    // => 그 요구를 수용할지 여부는 JVM의 판단에 달려있다.
    // => 따라서 gc()를 호출하면 가비지 컬렉터가 바로 실행된다고 생각하면 안된다.
    // 호출할 생각하지 말기.
    
    
    
  }
}
