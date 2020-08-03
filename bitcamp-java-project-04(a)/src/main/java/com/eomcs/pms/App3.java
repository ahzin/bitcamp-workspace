package com.eomcs.pms;
import java.sql.Date;
import java.util.Scanner;

public class App3 {

  static String status;
  static int count = 0;
  static Scanner keyInput = new Scanner(System.in);


  public static void main(String[] args) {
    System.out.println("[작업]");

    final int MAX_LENGTH = 5;
    String[] projectTitle = new String[MAX_LENGTH]; //프로젝트
    int[] no = new int[MAX_LENGTH]; //번호
    String[] contents = new String[MAX_LENGTH]; //내용
    Date[] endDate = new Date[MAX_LENGTH]; //완료일
    String[] manager = new String[MAX_LENGTH]; //담당자
    int count = 1;

    for (int i = 0 ; i < MAX_LENGTH; i++) {
      count ++;
      System.out.print("프로젝트? ");
      projectTitle[i] = keyInput.nextLine();

      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("내용? ");
      contents[i] = keyInput.nextLine();

      System.out.print("완료일? ");
      endDate[i] = Date.valueOf(keyInput.nextLine());

      inputStatus();
      keyInput.nextLine();

      System.out.print("담당자? ");
      manager[i] = keyInput.nextLine();
      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();

      if (response.equalsIgnoreCase("y")==false) {
        break;
      }
    }

    keyInput.close();
    System.out.println("---------------------------");

    for (int i = 0; i < count; i++) {
      System.out.printf("%s, %d, %s, %s, %s\n",
          projectTitle[i], no[i], contents[i], endDate[i].toString(),  manager[i]);
      printStatus();
    }
  }



  static void inputStatus() {
    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    status = keyInput.nextLine();
  }

  static void printStatus() {
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
  }
}
