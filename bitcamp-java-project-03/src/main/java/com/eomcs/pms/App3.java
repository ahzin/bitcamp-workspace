package com.eomcs.pms;

public class App3 {

  public static void main(String[] args) {
    System.out.printf("[%s]\n", "작업");
    
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    
    System.out.printf("프로젝트? ");
    String project_title = keyInput.nextLine();
    
    System.out.printf("번호: ");
    String str = keyInput.nextLine(); //문자로 일단 받고
    int no = Integer.parseInt(str); //숫자로 바꿈

    System.out.printf("내용? ");
    String contents = keyInput.nextLine();

    System.out.printf("완료일? ");
    java.sql.Date completedDate = java.sql.Date.valueOf(keyInput.nextLine());

    System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      String status = keyInput.nextLine();

      //int status = Integer.valueOf(keyInput.nextLine());

    System.out.printf("담당자? ");
    String project_manager = keyInput.nextLine();

    keyInput.close();
    
    System.out.println("----------------------------------------");
    System.out.printf("프로젝트: %s\n", project_title);
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("완료일: %s\n", completedDate.toString());
    System.out.print("상태: ");
    
//    if (status.equals("0")) {
//      System.out.println("신규");
//    } else if (status.equals("1")) {
//      System.out.println("진행중");
//    } else {
//      System.out.println("완료");
//    }
    
    switch (status) {
      case "1":
        System.out.println("진행중");
        break;
      case "2":
        System.out.println("완료");
        break;
      default:
        System.out.println("신규");
    }    
    
    System.out.printf("담당자: %s\n", project_manager);
  }
}
