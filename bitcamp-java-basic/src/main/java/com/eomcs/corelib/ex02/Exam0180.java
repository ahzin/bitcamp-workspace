// String - 다양한 생성자 활용
package com.eomcs.corelib.ex02;

public class Exam0180 {
  public static void main(String[] args) throws Exception {

    String s1 = new String();
    System.out.println(s1); //빈 문자열 출력

    String s2 = new String("Hello");
    System.out.printf("s2 = %s\n", s2);

    char[] chars = {'H','e','l','l','o'};
    String s3= new String(chars); //char 배열로 String 생성
    System.out.printf("s3 = %s\n", s3);

    byte[] bytes =   // 문자 코드 값이 저장된 바이트 배열로 String 인스턴스 생성
      {(byte) 0xb0, (byte) 0xa1, (byte) 0xb0, (byte) 0xa2, 0x30, 0x31, 0x32, 0x41, 0x42, 0x43};
    String s4 = new String(bytes);
    System.out.printf("s4=%s\n", s4); //한글 깨짐 s4=����012ABC
    String s5 = new String(bytes, "euc-kr");
    System.out.printf("s5=%s\n", s5); //한글 안깨짐 s5=가각012ABC

    byte[] bytes2 =
      {(byte) 0xac, (byte) 0x00, (byte) 0xac, (byte) 0x01, 0x00, 0x61, 0x00, 0x62, 0x00, 0x63};

    // 바이트 배열에 들어 있는 코드는 무슨 문자표로 작성했는지 정확하게 알려줘야 한다.
    // 그래야 자바의 문자 코드로 제대로 변경할 수 있을 것이다.
    String s6 = new String(bytes2, "utf-16");
    System.out.printf("s6=%s\n", s6);

    byte[] bytes3 = {(byte) 0xea, (byte) 0xb0, (byte) 0x80, (byte) 0xea, (byte) 0xb0, (byte) 0x81,
        0x61, 0x62, 0x63};

    String s7 = new String(bytes3, "utf-8");
    System.out.printf("s7=%s\n", s7);

  }
}


