package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class ProjectHandler {
  //프로젝트 데이터
  static class Project{
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String owner;
    String members;
  }
  static final int LENGTH = 100;

  Project[] list = new Project[LENGTH];
  int size = 0;

  MemberHandler memberHandler;
  public ProjectHandler(MemberHandler memberHadndler) {
    this.memberHandler = memberHandler;
  }
  //  MemberHandler memberHandler = new MemberHandler();가 안되는 이유
  //    인스턴스가 저장된 값이 넘어오질 않음.
  //    따라서, 기본생성자가 아닌 멤버목록을 갖고있는 바깥에서 받아와야 함


  public void add() {

    System.out.println("[프로젝트 등록]");

    Project project = new Project();

    project.no = Prompt.inputInt("번호? ");
    project.title = Prompt.inputString("프로젝트명? ");
    project.content = Prompt.inputString("내용? ");
    project.startDate = Prompt.inputDate("시작일? ");
    project.endDate = Prompt.inputDate("종료일? ");

    while (true) {
      String name = Prompt.inputString("만든이?(취소: 빈 문자열) ");

      if (name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      } else if (memberHandler.findByName(name) != null) {
        project.owner = name;
        break;
      }

      System.out.println("등록된 회원이 아닙니다.");
    }

    StringBuilder members = new StringBuilder();
    while (true) {
      String name = Prompt.inputString("팀원?(완료: 빈 문자열) ");

      if (name.length() == 0) {
        break;
      } else if (memberHandler.findByName(name) != null) {
        if (members.length() > 0) {
          members.append(",");
        }
        members.append(name);
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }
    project.members = members.toString();

    this.list[size++] = project;
  }

  public void list() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < this.size; i++) {
      Project project = this.list[i];
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n",
          project.no,
          project.title,
          project.startDate,
          project.endDate,
          project.owner,
          project.members);
    }
  }
}
