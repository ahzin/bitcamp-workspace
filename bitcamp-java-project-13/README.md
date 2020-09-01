# 13 - 생성자가 필요한 이유

**생성자(Constructor)**는 인스턴스를 사용하는데 문제가 없도록 
인스턴스 필드를 유효한 값으로 초기화시키는 일을 한다.

이번 훈련에서는 *생성자* 를 사용하지 않는 경우의 문제점을 확인하고,
*생성자* 를 적용해야 하는 상황을 이해하는 경험해보자. 

## 훈련 목표

- 인스턴스의 필드를 유효한 값으로 초기화시키지 않을 때 문제점을 확인한다.
- 생성자의 용도 이해한다.
- 생성자를 이용하여 인스턴스를 사용하기 전에 필요한 값들을 준비할 수 있다.

## 훈련 내용

- 생성자를 통해 의존 객체를 강제로 주입하게 만든다.
- ProjectHandler와 TaskHandler에서 사용할 MemberHadler를 강제로 주입하게 한다.

## 실습

### 1단계 - 의존 객체를 주입하지 않알을 때 발생되는 문제를 확인한다. 
- App클래스에서 ProjectHandler 객체를 생성할 때,
  의존 객체인 Taskhandler"를 설정하는 코드를 주석으로 처리한다.
- App클래스의 ProjectHandler 의 의존객체를 Memberhabdler설정을 주석으로
-  와 TaskHandler의


핸들러 객체의 필수 입력 값인 keyboard를 반드시 설정하게 만들라!

- LessonHandler.java
    - 기본 생성자 대신에 파라미터로 keyboard를 받는 생성자를 추가한다.
- MemberHandler.java
    - 기본 생성자 대신에 파라미터로 keyboard를 받는 생성자를 추가한다.
- BoardHandler.java
    - 기본 생성자 대신에 파라미터로 keyboard를 받는 생성자를 추가한다.
- App.java
    - 핸들러의 인스턴스를 생성할 때 파라미터의 값으로 keyboard 객체를 넘긴다.
    
    
## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/handler/BoardHandler.java 변경
- src/main/java/com/eomcs/lms/handler/LessonHandler.java 변경
- src/main/java/com/eomcs/lms/handler/MemberHandler.java 변경
- src/main/java/com/eomcs/lms/App.java 변경
    