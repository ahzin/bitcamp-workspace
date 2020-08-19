# 11 - 클래스 필드와 클래스 메서드의 한계

**클래스 필드(스태틱 필드)**는 클래스를 로딩할 때 생성된다.
클래스는 최초 사용 시점에 **한 번만 로딩**되기 때문에 스태틱 필드도 **한 번만 생성**된다.

이번 훈련에서는 이런 스태틱 필드의 구동 특성을 이해하고 
그에 따른 한계가 무엇인지 알아 볼 것이다. 

## 훈련 목표

- 클래스 필드의 한계를 이해한다.
- 클래스 필드 상태에서 기능을 확장하는 방법과 그 문제점을 확인한다.

## 훈련 내용

- 프로젝트 참여자들이 의견을 나눌 게시판을 추가한다.
  - 게시글을 등록하고 목록을 조회한다.
- 여러 개의 게시판을 추가한다.
  - 질문/답변 게실판, 일반 게시판, 공지사항 등

## 실습

### 1단계 - 게시글 입력을 처리한다

다음과 같이 게시글을 입력하는 기능을 추가한다.

```console
명령> /board/add
[새 게시글]
번호? 1
제목? 제목입니다.
내용? 내용입니다.
작성자? 홍길동
게시글을 등록하였습니다.

명령>
```

- 게시글 관리 작업을 수행할 클래스 `BoardHandler`를 만든다.
- 게시글 데이터를 위한 새 데이터 타입 `Board`을 정의한다.
- 게시글 입력을 처리할 메서드 `add()`를 정의한다.
- App 클래스에 *게시글 입력 명령* `/board/add`에 대한 처리를 추가한다.

#### 작업 파일 

- com.eomcs.pms.handler.BoardHandler  클래스 추가
  - 백업: BoardHandler_a.java
- com.eomcs.pms.App 변경
  - 백업: App_a.java


### 2단계 - 게시글 목록 출력을 처리한다.

다음과 같이 게시물(번호, 제목, 등록일, 작성자, 조회수) 목록을 출력하는 기능을 추가한다.


```
명령> /board/list
[게시글 목록]
1, 제목1, 홍길동, 2020-01-10, 0
2, 제목2, 임꺽정, 2020-01-20, 12
3, 제목3, 유관순, 2020-01-30, 7
```

- 게시글에 등록일 `registeredDate`과 조회수 `viewCount` 필드를 추가한다.
- `add()`에서 게시글을 입력을 처리할 때 등록일과 조회수를 설정한다.
- 게시글 목록을 처리할 메서드 `list()`를 정의한다.
- App 클래스에 *게시글 목록 조회 명령* `/board/list`에 대한 처리를 추가한다.

#### 작업 파일 

- com.eomcs.pms.handler.BoardHandler.Board 중첩 클래스 변경 
  - 등록일 과 조회수를 저장할 필드를 추가한다
- com.eomcs.pms.handler.BoardHandler 클래스 변경
  - add() 메서드 변경
  - list() 메서드 추가
- com.eomcs.pms.App 변경
  - 백업: App_b.java


### 3단계 - 새 게시판을 추가한다.

`BoardHandler`의 `Board[]` 배열은 클래스 필드(스태틱 필드)이기 때문에 
한 개 게시판의 게시물 목록만 관리할 수 있다.
다른 게시판을 만들려면 새로 `BoardHandler`와 똑 같은 클래스를 만들어야 한다. 

다음과 같이 동작하도록 새 클래스를 정의한다.

```
명령> /board2/add
번호? 1
내용? 게시글1
저장하였습니다.

명령> /board2/add
번호? 2
내용? 게시글2
저장하였습니다.

명령> /board/add
번호? 100
내용? 게시글100
저장하였습니다.

명령> /board2/list
1, 게시글1                  , 2019-01-01, 0
2, 게시글2                  , 2019-01-01, 0

명령> /board/list
100, 게시글100              , 2019-01-01, 0
```

- `BoardHandler`를 복제하여 `BoardHandler2` 클래스를 정의한다.
- `/board2/add`와 `/board2/list` 명령을 처리하도록 App 클래스를 변경한다.

#### 작업 파일 

- com.eomcs.pms.handler.BoardHandler2 클래스 추가
- com.eomcs.pms.App 변경
  - 백업: App_c.java
  
### 4단계 - 새 게시판을 4개 더 추가한다.

다음과 같이 동작하도록 새 클래스를 정의한다.

```
명령> /board3/add
...
명령> /board4/add
...
명령> /board5/add
...
명령> /board6/add
...
명령> /board3/list
...
명령> /board4/list
...
명령> /board5/list
...
명령> /board6/list
...
```

#### 작업 파일 

- com.eomcs.pms.handler.BoardHandler3 클래스 추가
- com.eomcs.pms.handler.BoardHandler4 클래스 추가
- com.eomcs.pms.handler.BoardHandler5 클래스 추가
- com.eomcs.pms.handler.BoardHandler6 클래스 추가
- com.eomcs.pms.App 변경

## 실습 결과

- src/main/java/com/eomcs/pms/handler/BoardHandler.java 추가
- src/main/java/com/eomcs/pms/handler/BoardHandler2.java 추가
- com.eomcs.pms.handler.BoardHandler3 클래스 추가
- com.eomcs.pms.handler.BoardHandler4 클래스 추가
- com.eomcs.pms.handler.BoardHandler5 클래스 추가
- com.eomcs.pms.handler.BoardHandler6 클래스 추가
- src/main/java/com/eomcs/pms/App.java 변경


# 12 - 인스턴스 필드와 인스턴스 메서드가 필요한 이유
** 인스턴스 필드(non-static field)**는 new명령을 통해 heap 영역에 생성된다.
개별적으로 다뤄야 할 값이라면 인스턴스 필드로 선언하라.

인스턴스 필드를 다루는 메서드는 **인스턴스 메서드(non-static method)**로 선언한다.
인스턴스 메서드는 호출할 때 반드시 유효한 레퍼런스(인스턴스 주소)가 있어야 한다.
레퍼런스는 인스턴스 메서드의 내장(built in) 로컬 변수인 this에 저장된다.

이번 훈련에서는 클래스 필드/메서드 대신 인스턴스 필드/메서드를 사용하여
여러 개의 게시글을 다루는 연습을 할 것이다.
이를 통해 인스턴스 필드/메서드의 쓰임새를 확인한다.

## 훈련 목표

- 인스턴스 필드와 인스턴스 메서드를 사용할 수 있다.
- 스태틱 필드와 인스턴스 필드의 차이점과 용도를 설명할 수 있다.
- 스태틱 메서드와 인스턴스 메서드의 차이점과 용도를 설명할 수 있다.

## 훈련 내용

- 여러 개의 게시판을 다루기 위해 BoardHandler의 필드와 메서드를 인스턴스 멤버로 전환한다.
- 기존의 MemberHandler,ProjectHandler,TaskHandler도 필드와 메서드를 인스턴스 멤버로 전환한다.

## 실습

### 1단계 - BoardHandler의 스태틱 멤버를 인스턴스 멤버로 전환한다.

- 게시글 목록(Board 인스턴스 목록)을 저장할 배열을 인스턴스 필드로 변경한다.
- 등록된 게시글 개수를 저장하는 변수를 인스턴스 필드로 변경한다.
- 게시글 등록과 목록 조회를 다루는 메서드를 인스턴스 메서드로 변경한다.

### 작업 파일
- com.eomcs.pms.habdler.BoardHandler 클래스 변경
- com.eomcs.pms.App 클래스 변경

### 2단계 - BoardHandler의 인스턴스 멤버를 사용하여 게시글 등록/목록조회를 처리한다.

- 게시글 보관할 인스턴스를 생성한다.
- 인스턴스를 가지고 등록과 목록조회를 처리한다.

### 3단계 - 여러개의 게시판을 다룰 때도 BoardHandler를 사용한다.

- 각 게시판을 위한 인스턴스 변수를 따로 생성한다.
- 이전에 만들었던 BoardHandlerX 클래스를 삭제한다.

#### 작업 파일

- com.eomcs.pms.App 클래스 변경
- com.eomcs.pms.handler.BoardHandler2 클래스 삭제
- com.eomcs.pms.handler.BoardHandler3 클래스 삭제
- com.eomcs.pms.handler.BoardHandler4 클래스 삭제
- com.eomcs.pms.handler.BoardHandler5 클래스 삭제
- com.eomcs.pms.handler.BoardHandler6 클래스 삭제

### 4단계 - 회원 관리와 프로젝트 관리, 작업 관리에도 향후 확장성을 고려해 인스턴스 멤버로 전환한다.

- MemberHandler의 스태틱 멤버를 인스턴스 멤버로 전환한다.
- ProjectHandler의 스태틱 멤버를 인스턴스 멤버로 전환한다.
- TaskHandler의 스태틱 멤버를 인스턴스 멤버로 전환한다.

#### 작업 파일

- com.eomcs.pms.App 클래스 변경
- com.eomcs.pms.handler.MemberHandler 클래스 변경
- com.eomcs.pms.handler.ProjectHandler 클래스 변경
  - MemberHandler의 인스턴스 가리킬 레퍼런스를 추가한다.
  - MemberHandler의 인스턴스를 받는 생성자를 추가한다. 
- com.eomcs.pms.handler.TaskHandler 클래스 변경
  - MemberHandler의 인스턴스 가리킬 레퍼런스를 추가한다.
  - MemberHandler의 인스턴스를 받는 생성자를 추가한다. 


## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/handler/BoardHandler.java 변경
- src/main/java/com/eomcs/lms/handler/ProjectHandler.java 변경
- src/main/java/com/eomcs/lms/handler/MemberHandler.java 변경
- src/main/java/com/eomcs/lms/handler/BoardHandler2.java 삭제
- src/main/java/com/eomcs/lms/handler/BoardHandler3.java 삭제
- src/main/java/com/eomcs/lms/handler/BoardHandler4.java 삭제
- src/main/java/com/eomcs/lms/handler/BoardHandler5.java 삭제
- src/main/java/com/eomcs/lms/handler/BoardHandler6.java 삭제
- src/main/java/com/eomcs/lms/App.java 변경

