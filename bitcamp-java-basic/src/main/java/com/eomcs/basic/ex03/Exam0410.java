package com.eomcs.basic.ex03;

//# 문자 리터럴
public class Exam0410 {
  public static void main(String[] args) {
    //자바 문자를 메모리에 저장할 때 unicoode 규칙에따라 2byte코드로 저장
    //'A' =>0x0041
    //'B' =>0x0042
    //'1' =>0x0031
    System.out.println('A'); 
    System.out.println('가');
    System.out.println('\u0041'); //unicode값을 직접지정한 A
    System.out.println('\u4eba'); 

  }
}

//문자를 메모리에 저장하려면, 2진수로 바꿀 수 있어야한다.
//문자를 2진수로 바꾸는 규칙, [문자집합-Character Set]라고 한다.
//문자 집합에는 여러 규칙이 있다.

// - ASCII(America Standard code for Information Interchange) 7bit
    //영어 대소문자, 숫자, 특수문자 등
    //'A' => 100_0001 = 0x41
    //'B' => 100_0010 = 0x42
    //'1' => 011_0001 = 0x31
    //'2' => 011_0002 = 0x32
    //한글(11172자)은 정의되어 있지 않다.

// - ISO-8859-1 8bit
    //ASCII + 유럽문자

// - EUC-KR(KSC-5601) 16bit
    //한글 2350자에 대한 규칙 추가
    //'가' => 10110000_10100001 = 0xb0a1
    //'각' => 10110000_10100010 = 0xb0a2
    //현대 통용되는 한글 음절 11172자를 모두 표현할 수 없다.

// - Unicode(ISO-10646) 16bit
    //영어, 한글 모두 2byte로 표현
    //일반적으로 통용되는 대부분의 국가의 문자를 담고 있다.
    //'A' => 0x0041
    //'B' => 0x0042
    //'1' => 0x0031
    //'2' => 0x0032
    //'가' => 0xac00
    //'각' => 0xac01
    //영어를 2byte로 표현하기 때문에 비효율적
    //한글은 새로 정의했기 때문에 EUC-KR과 호환되지 않는다.

// - UTF-8(Universal Coded Character Set + Transformation Format – 8-bit) 8~32bit
    //Unicode 문자에 따라 1~4byte로 변환한다.
    //ISO-8859-1(영어,숫자,특수문자) : 1byte로 표현한다.
        //'A' => 0x0041
        //'B' => 0x0042
        //'1' => 0x0031
    //한글은 3byte로 표현한다.
        //변환규칙 : 1110xxxx 10xxxxxx 10xxxxxx
        //'가' => 0xac00(1010/1100_00/000000, Unicode) 
            //  => 11101010_10110000_10000000
            //  => 0xEAB080(UTF-8)
    //문자에 따라 byte 크기가 다르다.
    //기존의 ISO-8850-1은 1byte로 표현한다.
    //한글은 규칙에 따라 3byte로 변환한다.

