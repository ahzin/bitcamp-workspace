/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
[입력] 
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
[출력]
첫째 줄에 A+B를 출력한다.
*/


import java.util.Scanner; //Scanner클래스를 위해 추가

class baekjoon_1000 { 
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int num1, num2;
        int sum = 0;

        System.out.println("첫번째 정수를 입력하시오: ");
        num1 = input.nextInt();

        System.out.println("두번째 정수를 입력하시오: ");
        num2 = input.nextInt();

        sum = num1 + num2 ;

        System.out.println("합계는 "+sum+"입니다.");

    }
}


