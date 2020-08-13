// hash code 응용 II - MyKey의 hashCode()와 equals() 오버라이딩 하기
package com.eomcs.corelib.ex01;

import java.util.HashMap;

public class Exam0153 {

  static class MyKey{
    //필드
    String contents;

    //생성자
    public MyKey(String contents) {
      this.contents = contents;
    }
    @Override
    public String toString() {
      return "MyKey [ contents = " + contents + " ] " ;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((contents == null) ? 0 : contents.hashCode());
      return result;
    }
    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      MyKey other = (MyKey) obj;
      if (contents == null) {
        if (other.contents != null)
          return false;
      } else if (!contents.equals(other.contents))
        return false;
      return true;
    }
  }


  public static void main(String[] args) {
    HashMap<MyKey,Student>map = new HashMap<>();

    MyKey k1 = new MyKey("oki");
    MyKey k2 = new MyKey("doki");
    MyKey k3 = new MyKey("yo");
    MyKey k4 = new MyKey("haha");
    MyKey k5 = new MyKey("hehe");

    map.put(k1, new Student("홍길동", 20, false));
    map.put(k2, new Student("임꺽정", 25, true));
    map.put(k3, new Student("유관순", 24, true));
    map.put(k4, new Student("안중근", 23, true));
    map.put(k5, new Student("윤봉길", 22, false));

    System.out.println(map.get(k1)); //Student [name=홍길동, age=20, working=false]
    System.out.println(map.get(k2)); //Student [name=임꺽정, age=25, working=true]
    System.out.println(map.get(k3)); //Student [name=유관순, age=24, working=true]
    System.out.println(map.get(k4)); //Student [name=안중근, age=23, working=true]
    System.out.println(map.get(k5)); //Student [name=윤봉길, age=22, working=false]

    //key객체를 써서 꺼낼 수도 있다.
    System.out.println();
    MyKey k6 = new MyKey("haha");
    System.out.println(map.get(k6)); //Student [name=안중근, age=23, working=true]

    System.out.println(k4 == k5); //인스턴스 다름, false
    System.out.printf("k4(%s), k6(%s)\n", k4, k6);
    //k4(MyKey [ contents = haha ] ), k6(MyKey [ contents = haha ] )
    System.out.println(k4); //MyKey [ contents = haha ]
    System.out.println(k6); //MyKey [ contents = haha ]
    System.out.println(k4.equals(k6)); //true


  }

}








