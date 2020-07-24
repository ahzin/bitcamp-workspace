package com.eomcs.pms;

public class App2 {

  public static void main(String[] args) {
    System.out.println("[프로젝트]");
    
    java.util.Scanner keyInput = new java.util.Scanner(System.in);

    System.out.print("번호? ");
    int no = keyInput.nextInt();
    keyInput.nextLine();

    System.out.print("프로젝트명? ");
    String project_title = keyInput.nextLine();

    System.out.print("내용? ");
    String contents = keyInput.nextLine();

    System.out.print("시작일? ");
    java.sql.Date startDate = java.sql.Date.valueOf(keyInput.nextLine());
    
    
        
    System.out.print("종료일? ");
    java.sql.Date endDate = java.sql.Date.valueOf(keyInput.nextLine());

    System.out.print("만든이? ");
    String who = keyInput.nextLine();

    System.out.print("팀원? ");
    String team_mate = keyInput.nextLine();

    keyInput.close();



    System.out.println("----------------------------------------");
    System.out.printf("번호: %d\n", no);
    System.out.printf("이름: %s\n", project_title);
    System.out.printf("이메일: %s\n", contents);
    System.out.printf("암호: %s\n", startDate.toString()); //양식을 맞춰야 오류가 뜨지 않는다.
    System.out.printf("사진: %s\n", endDate.toString()); //yyyy-mm-dd
    System.out.printf("전화: %s\n", who);
    System.out.printf("가입일: %s\n",team_mate);
  }
}
