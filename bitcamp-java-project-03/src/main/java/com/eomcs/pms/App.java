package com.eomcs.pms;
//import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    System.out.println("[회원]");
    
    //콘솔에서 사용자의 입력을 받는 도구를 준비한다.
    // 키보드 input stream(=alike 수도관) : System.in
    // input stream에서 data를 읽어 적절한 타입으로 리턴하는 도구 : Scanner
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    
    System.out.print("번호? ");
    int no = keyInput.nextInt(); //정수값 받기-입력값 중에서 숫자만 뽑아간다.
    keyInput.nextLine(); //숫자 뒤에 남아있는 CR/LF 값 읽어서 버리기.
    
    System.out.print("이름? ");
    String name = keyInput.nextLine();
    
    System.out.print("이메일?");
    String email = keyInput.nextLine();

    System.out.print("암호?");
    String password = keyInput.nextLine();

    System.out.print("사진?");
    String photo = keyInput.nextLine();

    System.out.print("전화?");
    String tel = keyInput.nextLine();

    long currentMillis = System.currentTimeMillis(); //1970-1-1 00:00:00에서 
    java.sql.Date now = new java.sql.Date(currentMillis);
    

    keyInput.close();
    
    System.out.println("----------------------------------------");
    System.out.printf("번호: %d\n", no);
    System.out.printf("이름: %s\n ", name);
    System.out.printf("이메일: %s\n ", email);
    System.out.printf("암호: %s\n ", password);
    System.out.printf("사진: %s\n ", photo);
    System.out.printf("전화: %s\n ", tel);
    System.out.printf("가입일: %s\n ", now.toString()); //yyyy-mm-dd format을 return

  }
}
