// Object 클래스의 메서드를 오버라이딩 하기 - hashCode()
package com.eomcs.corelib.ex01;

public class Exam0145 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = kor + eng + math;
      this.aver = this.sum / 3f;
    }

    // 인스턴스가 다르더라도 데이터가 같으면 같은 해시 값을 리턴하도록 오버라이딩
    @Override
    public int hashCode() {
      //모든 값을 문자열로 만들어 붙여서 Sring클래스에 있는 hashCode() 사용
      String value = String.format("%s, %d, %d, %d, %d, %.1f",
          this.name, this.kor, this.eng, this.math, this.sum, this.aver);

      return value.hashCode();
    }
  }
  public static void main(String[] args) {
    Score s1 = new Score("홍길동", 100, 100, 100);
    Score s2 = new Score("홍길동", 100, 100, 100);
    Score s3 = new Score("홍길동", 100, 100, 99);
    Score s4 = new Score("홍길봉", 100, 100, 100);

    //인스턴스는 모두 다름
    System.out.println(s1 == s2); //false
    System.out.println(s1 == s3); //false
    System.out.println(s1 == s4); //false
    System.out.println(s2 == s3); //false
    System.out.println(s2 == s4); //false
    System.out.println(s3 == s4); //false

    //같은 해시코드 리턴
    System.out.println(s1.hashCode()); //-1322253297
    System.out.println(s2.hashCode()); //-1322253297

    System.out.println(s3.hashCode()); //-1328150375

    System.out.println(s4.hashCode()); //832814303
  }
}







