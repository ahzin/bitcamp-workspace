package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class TaskHandler {

  static class Task{
    int no;
    String content;
    Date deadline;
    String owner;
    String status;
  }

  static final int LENGTH = 100;

  Task[] list = new Task[LENGTH];
  int size = 0;

  MemberHandler memberHandler;
  public TaskHandler(MemberHandler memberHadndler) {
    this.memberHandler = memberHandler;
  }

  public void add() {
    System.out.println("[작업 등록]");

    Task task = new Task();

    task.no = Prompt.inputInt("번호? ");
    task.content= Prompt.inputString("내용? ");
    task.deadline = Prompt.inputDate("마감일? ");
    task.status= Prompt.inputString("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
    task.owner= Prompt.inputString("담당자? ");

    list[size++] = task;
  }

  public void list() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < size; i++) {
      Task task = list[i];
      String stateLabel = null;
      switch (task.status) {
        case "1":
          stateLabel = "진행중";
          break;
        case "2":
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          task.no,
          task.content,
          task.deadline,
          stateLabel,
          task.owner);
    }
  }

}