package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;

public class App {

  public static void main(String[] args) {

    BoardHandler boardHandler = new BoardHandler();

    BoardHandler boardHandler2 = new BoardHandler();

    // 세 번째, 네 번째, 다섯 번째, 여섯 번째 게시판에서 다룰 변수를 각각 준비한다.
    BoardHandler boardHandler3 = new BoardHandler();
    BoardHandler boardHandler4 = new BoardHandler();
    BoardHandler boardHandler5 = new BoardHandler();
    BoardHandler boardHandler6 = new BoardHandler();

    MemberHandler memberHandler = new MemberHandler();

    // ProjectHandler를 생성할 때 필요로 하는 의존 객체를 전달한다.
    // 생성자를 명확하게 적용하면, 객체를 생성하는 개발자에게
    // 인스턴스 사용에 필요한 값이나 의존 객체 주입을 강제할 수 있다.
    ProjectHandler projectHandler = new ProjectHandler(memberHandler);
    //projectHandler.memberHandler = memberHandler;

    TaskHandler taskHandler = new TaskHandler(memberHandler);
    //taskHandler.memberHandler = memberHandler;

    // 인스턴스를 사용하는데 필요한 의존 객체 주입을 누락하더라도
    //컴파일러는 알 수가 없다.
    // 실행할 때 비로서 의존 객체가 누락된 문제가 발생할 것이다.

    loop:
      while (true) {
        String command = Prompt.inputString("명령> ");

        switch (command) {
          case "/member/add": memberHandler.add(); break;
          case "/member/list": memberHandler.list(); break;
          case "/project/add": projectHandler.add(); break;
          case "/project/list": projectHandler.list(); break;
          case "/task/add": taskHandler.add(); break;
          case "/task/list": taskHandler.list(); break;
          case "/board/add": boardHandler.add(); break;
          case "/board/list": boardHandler.list(); break;
          case "/board2/add": boardHandler2.add(); break;
          case "/board2/list": boardHandler2.list(); break;
          case "/board3/add": boardHandler3.add(); break;
          case "/board3/list": boardHandler3.list(); break;
          case "/board4/add": boardHandler4.add(); break;
          case "/board4/list": boardHandler4.list(); break;
          case "/board5/add": boardHandler5.add(); break;
          case "/board5/list": boardHandler5.list(); break;
          case "/board6/add": boardHandler6.add(); break;
          case "/board6/list": boardHandler6.list(); break;
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

    Prompt.close();
  }
}
