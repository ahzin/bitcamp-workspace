package com.eomcs.util;


// 추상클래스로 선언함으로써
// - 직접 인스턴스를 생성하지 못하게 막는다.
// - 서브클래스를 만들어 써야한다.

public abstract class AbstractList<E> {
  protected int size;

  public int size() {
    return this.size;
  }

  //추상 메서드
  // 서브클래스마다 구현 애용이 다를 수 잇다면 추상 메서드로 선언한다.
  // 서브 클래스에서 구체적인 실행을구현하라는 의미다.
  // 또는 서브 클래스에게 구현하도록 강제하고 싶을 때도 추상 메서드로 선언한다.
  // 수퍼 클래스에서 추상 메서드의 의미는
  //    해당 역할을 수행하는데 반드시 있어야 하는 기능을 정의하는데 의미가 잇다.
  public abstract boolean add(E e) ;

  public abstract void add(int index, E element) ;

  public abstract E get(int index) ;

  public abstract E set(int index, E element) ;

  public abstract E remove(int index) ;

  public abstract Object[] toArray() ;

  public abstract E[] toArray(E[] arr) ;

}
