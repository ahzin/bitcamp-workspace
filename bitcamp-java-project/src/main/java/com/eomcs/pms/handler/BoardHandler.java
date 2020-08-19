package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;
//게시물 데이터
public class BoardHandler {
  static class Board {
    int no; //번호
    String title; //제목
    String content; //내용
    String writer; //작성자
    Date registerdDate; //등록일
    int viewCount; //조회수
  }

  //공통으로 사용할 값을 보관하는 변수는 스태틱 멤버(클래스 멤버)로 만든다.
  static final int LENGTH = 100;

  //개별적으로 값을 보관해야 하는 변수는 인스턴스 멤버(non-static 멤버)로 만든다.
  Board[] list = new Board[LENGTH];
  int size = 0;

  public void add() {
    System.out.println("[새 게시글]");

    Board board= new Board();
    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.writer = Prompt.inputString("작성자? ");
    board.registerdDate = new java.sql.Date(System.currentTimeMillis());
    board.viewCount = 0;

    this.list[size++] = board;
    System.out.println("저장하였습니다.");
  }

  public void list() {
    System.out.println("[회원 목록]");

    for (int i = 0; i < size; i++) {
      Board board = list[i];
      // 번호, 제목, 등록일, 작성자, 조회수
      System.out.printf("%d, %s, %s, %s, %d\n",
          board.no,
          board.title,
          board.registerdDate,
          board.writer,
          board.viewCount);
    }
  }

}
