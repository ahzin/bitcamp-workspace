package com.eomcs.basic.ex06;
//switch문
public class Exam0210 {
  public static void main(String[] args) {
    final int DEVELOPER = 1;
    final int GENERAL_MANAGER = 2;
    final int BUILDING_MANAGER = 3;


    int type = GENERAL_MANAGER;

    if(type == DEVELOPER) {
      System.out.println("정보처리기사 자격증");
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == GENERAL_MANAGER) {
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == BUILDING_MANAGER) {
      System.out.println("이력서");
    } else {
      System.out.println("잘못된 지원입니다.");
    }
    System.out.println("--------------------------");


    switch(type) { //변수명
      case DEVELOPER:
        System.out.println("정보처리기사 자격증");
        System.out.println("졸업증명서");
        System.out.println("이력서");
        break;
      case GENERAL_MANAGER:
        System.out.println("졸업증명서");
        System.out.println("이력서");
        break;
      case BUILDING_MANAGER:
        System.out.println("이력서");
        break;
      default:
        System.out.println("잘못된 지원입니다.");
    }
    System.out.println("--------------------------");

    int score = 70;
    switch(score) {
      case 100:
      case 90:
        System.out.println("A");
        break;
      case 80:
      case 70:
        System.out.println("B");
      case 60:
      case 50:
        System.out.println("C");
      default:
        System.out.println("F");
    }

    System.out.println("--------------------------");

    String value = "developer";
    switch(value) { // byte/ short/ int / char 4byte 이하 정수만 가능 + 문자열
      case "developer":
        break;
      case "manager":
        break;
      default :
    }

    int value3 = 100;
    final int x = 200;
    switch(value3) {
      case 100:
        break;
      case 100 +3:
        break;
      case x:
        break;

    }

    System.out.println("--------------------------");

    Job type2 = Job.DEV;

    switch (type2) {
      case DEV:
        break;
      case GM:
        break;
      case BM:
        break;
    }
  }


  enum Job{
    DEV, GM, BM



  }
}
