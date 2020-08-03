package com.eomcs.pms;
import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    class Task{
      String project;
      int no;
      String content;
      Date endDate;
      String state;
      String manager;
    }
    Scanner keyInput = new Scanner(System.in);
    final int LENGTH = 100;
    int count = 0;

    Task[] tasks = new Task[LENGTH];

    System.out.printf("[%s]\n", "작업");

    for(int i = 0 ; i < LENGTH; i++) {

      Task t = new Task();

      System.out.printf("프로젝트? ");
      t.project = keyInput.nextLine();

      count ++;

      System.out.printf("번호: ");
      String str = keyInput.nextLine(); //문자로 일단 받고
      t.no = Integer.parseInt(str); //숫자로 바꿈

      System.out.printf("내용? ");
      t.content = keyInput.nextLine();

      System.out.printf("완료일? ");
      t.endDate = Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      t.state = keyInput.nextLine();

      System.out.printf("담당자? ");
      t.manager = keyInput.nextLine();

      tasks[i] = t;

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;

      System.out.println();
    }

    keyInput.close();


    System.out.println("----------------------------------------");

    System.out.println("");

    for(int i = 0; i < count ; i ++) {
      Task t = tasks[i];

      String stateTitle;
      switch (t.state) {
        case "0":
          stateTitle = "신규";
          break;
        case "1":
          stateTitle = "진행중";
          break;
        default:
          stateTitle = "완료";
      }

      System.out.printf("%d, %s, %s, %s, %s\n"
          , t.no, t.content, t.endDate, stateTitle, t.manager);
    }


  }
}
