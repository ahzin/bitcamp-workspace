package com.eomcs.pms;
import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    System.out.printf("[%s]\n", "작업");

    Scanner keyInput = new Scanner(System.in);
    final int LENGTH = 100;
    int no[] = new int[LENGTH];
    String title[] = new String[LENGTH];
    String content[] = new String[LENGTH];
    Date endDate[] = new Date[LENGTH];
    String status[] = new String[LENGTH];
    String manager[] = new String[LENGTH];
    int count = 0;

    for(int i = 0 ; i < LENGTH; i++) {

      count ++;

      System.out.printf("프로젝트? ");
      title[i] = keyInput.nextLine();

      System.out.printf("번호: ");
      String str = keyInput.nextLine(); //문자로 일단 받고
      no[i] = Integer.parseInt(str); //숫자로 바꿈

      System.out.printf("내용? ");
      content[i] = keyInput.nextLine();

      System.out.printf("완료일? ");
      endDate[i] = Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      status[i] = keyInput.nextLine();
      for(int i = 0; i < count ; i ++) {
        for(i = 0; i < count; i++) {
          if(status.equals("0")) {
            status[i] = "신규";
          }else if(status.equals("1")) {
            status[i] = "진행중";
          }else {
            status[i] = "완료";
          }


          System.out.printf("담당자? ");
          manager[i] = keyInput.nextLine();

          System.out.println();
          System.out.print("계속 입력하시겠습니까?(y/N)");
          String response = keyInput.nextLine();

          if(!response.equalsIgnoreCase("y")) {
            break;
          }
          System.out.println();
        }

        keyInput.close();


        System.out.println("----------------------------------------");

        for(int i = 0; i < count ; i ++) {

          System.out.printf("%s, %d, %s, %s, 상태 : %s, %s, %s\n"
              , title[i], no[i], content[i], endDate[i], status[i], manager[i]);
        }


      }
    }
