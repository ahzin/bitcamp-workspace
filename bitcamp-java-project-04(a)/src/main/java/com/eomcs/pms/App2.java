package com.eomcs.pms;
import java.sql.Date;
import java.util.Scanner;


public class App2 {

  public static void main(String[] args) {    
    Scanner keyInput = new Scanner(System.in);
    System.out.println("[프로젝트]");

    final int MAX_LENGTH = 5;
    int[] no = new int[MAX_LENGTH];
    String[] projectTitle = new String[MAX_LENGTH];
    String[] contents = new String[MAX_LENGTH];
    Date[] startDate = new Date[MAX_LENGTH];
    Date[] endDate = new Date[MAX_LENGTH];
    String[] whose = new String[MAX_LENGTH];
    String[] team_mate = new String[MAX_LENGTH];
    
    int count = 1;

    for (int i = 0 ; i < MAX_LENGTH; i++) {
      count ++;
      
      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();
      
      System.out.print("제목? ");
      projectTitle[i] = keyInput.nextLine();
      
      System.out.print("내용? ");
      contents[i] = keyInput.nextLine();
      
      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(keyInput.nextLine());
      
      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyInput.nextLine());
      
      System.out.print("만든사람? ");
      whose[i] = keyInput.nextLine();
      
      System.out.print("팀원? ");
      team_mate[i] = keyInput.nextLine();
      

      System.out.println();
      
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      
      if (response.equalsIgnoreCase("y")==false) {
        break; //반복문을 멈춰라.
      }
    }

    keyInput.close();
    System.out.println("---------------------------");
    
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", 
          no[i], projectTitle[i], contents[i], whose[i], team_mate[i], 
          startDate[i].toString(), endDate[i].toString());
    }
    
  }
}

