package com.eomcs.util;

public interface List<E> {
  // 사용 규칙이기 때문에 모든 메서드는 추상 메서드
  // 공개되어야 하기 때문에 public

  public abstract boolean add(E e);

  public abstract void add(int index, E element);

  public abstract E get(int index);

  E set(int index, E element);

  E remove(int index);

  Object[] toArray();

  E[] toArray(E[] arr);

  int size();

}
