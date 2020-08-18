package com.eomcs.algorithm.data_structure.stack;

public class MyStackTest {
  public static void main(String[] args) {
    MyStack stack = new MyStack();
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");
    System.out.println("==> " + stack.peek()); //ccc
    stack.push("ddd");
    stack.push("eee");

    print(stack); //aaa,bbb,ccc,ddd,eee,

    System.out.println(stack.pop()); //eee
    System.out.println(stack.pop()); //ddd
    System.out.println("==> " + stack.peek()); //ccc
    System.out.println(stack.pop()); //ccc
    System.out.println(stack.pop()); //bbb
    System.out.println(stack.pop()); //aaa
    System.out.println(stack.pop()); //예외 발생

  }

  static void print(MyStack stack) {
    for(int i = 0; i < stack.size(); i++) {
      System.out.print(stack.get(i)+",");
    }
    System.out.println();
  }
}
