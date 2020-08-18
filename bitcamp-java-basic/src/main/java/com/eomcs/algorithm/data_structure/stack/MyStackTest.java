package com.eomcs.algorithm.data_structure.stack;

public class MyStackTest {
  public static void main(String[] args) {
    MyStack stack = new MyStack();
    stack.add("aaa");
    stack.add("bbb");
    System.out.println("-->" + stack.peek()); //bbb
    stack.add("ccc");
    stack.add("ddd");
    stack.add("eee");
    print(stack);

    System.out.println(stack.pop()); //eee
    System.out.println(stack.pop()); //ddd
    System.out.println("-->" + stack.peek()); //ccc
    System.out.println(stack.pop()); //ccc
    System.out.println(stack.pop()); //bbb
    System.out.println(stack.pop()); //aaa
    System.out.println("-->" + stack.peek()); //null
    //Exception in thread "main" java.util.EmptyStackException
    System.out.println(stack.pop()); //Exception in thread "main" java.util.EmptyStackException

  }

  static void print(MyStack stack) {
    for(int i = 0; i < stack.size(); i++) {
      System.out.print(stack.get(i) + ",");
    }
    System.out.println();
  }
}
