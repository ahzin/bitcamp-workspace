package com.eomcs.algorithm.data_structure.linkedlist;

public class MyLinkedListTest {

  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();

    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");

    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    //Exception in thread "main" java.lang.IndexOutOfBoundsException: 인덱스가 유효하지 않습니다.
    //System.out.println(list.get(-1));
    //System.out.println(list.get(-4));
    System.out.println("================");

    print(list); // aaa, bbb, ccc, ddd,

    System.out.println("================");

    list.add(2, "eee"); // aaa, bbb, eee, ccc, ddd,
    list.add(0, "fff"); // fff, aaa, bbb, eee, ccc, ddd,
    list.add(6, "ggg"); // fff, aaa, bbb, eee, ccc, ddd, ggg
    list.add("hhh");
    print(list);

    System.out.println("================");

    System.out.println(list.remove(4)); //ccc 삭제
    print(list); //fff, aaa, bbb, eee, ddd, ggg, hhh
    System.out.println(list.remove(0)); //fff 삭제
    print(list); //aaa,bbb,eee,ddd,ggg,hhh,
    System.out.println(list.remove(5)); //hhh 삭제
    print(list); //aaa,bbb,eee,ddd,ggg,

    System.out.println("================");

    System.out.println(list.set(1, "xxx")); //bbb 를 xxx 교체
    print(list); //aaa, xxx, eee, ddd, ggg
    System.out.println(list.set(0, "yyy")); //aaa 를 yyy 교체
    print(list); //yyy,xxx,eee,ddd,ggg,
    System.out.println(list.set(4, "zzz")); //ggg 를 zzz 교체
    print(list); //yyy,xxx,eee,ddd,zzz,

    print2(list.toArray());

    System.out.println("================");


  }

  static void print(MyLinkedList list) {
    for(int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + ",");
    }
    System.out.println();
  }

  static void print2(Object[] arr) {
    for(Object obj : arr) {
      System.out.print(obj + ",");
    }
    System.out.println();
  }

}
