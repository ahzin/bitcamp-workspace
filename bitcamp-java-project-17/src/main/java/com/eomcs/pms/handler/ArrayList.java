package com.eomcs.pms.handler;

import java.util.Arrays;

//ArrayList가 다룰 객체의 타입을 변수(파라미터)로 받는다 => 타입 파라미터
public class ArrayList<E> { //타입 정보를 받는 변수 Element

  static final int DEFAULT_CAPACITY = 3;
  Object[] list;
  int size = 0;

  public ArrayList() {
    list = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int initialCapacity) {
    if (initialCapacity <= DEFAULT_CAPACITY) {
      list = new Object[DEFAULT_CAPACITY];
    } else {
      list = new Object[initialCapacity];
    }
  }

  public void add(E Obj) {
    if (size == list.length) {
      int oldCapacity = list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      list = Arrays.copyOf(list, newCapacity);
      System.out.printf("==> 새 배열을 %d 개 생성하였음!\n", newCapacity);
    }
    list[size++] = Obj;
  }

  public E[] toArray(Class<E[]> arrayType) { //지정된 타입 정보
    return Arrays.copyOf(list, size, arrayType);
  }
}




