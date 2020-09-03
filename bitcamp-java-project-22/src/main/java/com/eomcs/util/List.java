package com.eomcs.util;

public class List<E> {
  protected int size;

  public int size() {
    return this.size;
  }

  public boolean add(E e) {
    // 서브 클래스에서 구현하는 방법이 다르다.
    // 따라서 수퍼 클래스에서는 구현하지 않는다.
    // 서브클래서에서 오버라이딩 하게한다.
    // 그럼 굳이 수퍼 클래스에 이 메서드를 둘 필요가 있는가?
    // => 서브 클래스들이 갖춰야 할 기능을 정의한다는 면에서 의미가 있다.
    // => 즉 서브 클래스들은 반드시 수퍼 클래스의 기능(반드시 갖춰야 할 기능)을 갖도록 강제한다.
    return false;
  }

  public void add(int index, E element) {
  }

  public E get(int index) {
    return null;
  }

  public E set(int index, E element) {
    return null;
  }

  public E remove(int index) {
    return null;
  }

  public Object[] toArray() {
    return null;
  }

  public E[] toArray(E[] arr) {
    return null;
  }

}
