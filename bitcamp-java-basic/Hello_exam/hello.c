#include <stdio.h>
#include <stdlib.h>

//컴파일 : gcc -o hello hello.c
//실행 : ./hello        


int main(){
    int i[]= {100,200,300};
    printf("%d, %d, %d\n", i[0], i[1], i[2]);
    
    int *p;

    //p = &i[0]; 배열의 시작주소
    p = i;
    printf("%d\n", *(p+1)); //4byte 씩 증가(한 단위) -> 1byte 증가 아님!
    
    int *p2 = (int*)malloc(sizeof(int)*3); //sizeof - int의크기
    
    *(p2+0) = 110;
    *(p2+1) = 220;
    *(p2+2) = 330;
    
    printf("%d, %d, %d\n", *(p2+0), *(p2+1), *(p2+2));
    printf("%d, %d, %d\n", p2[0], p2[1], p2[2]);
    
    printf("%d\n", *(p2+3));    
    
    free(p2); //메모리 반납
    
    printf("%d, %d, %d\n", *p2, *(p2+1), *(p2+2));
    
    
    
    int *x1;
    x1 = (int*) malloc(12); // 예 - 100번지
    x1 = (int*) malloc(120); // 예 - 200번지
    //100번지는 주소를 잃어 버려 사용할 수 없다.
    //dangling object = garbage
    
    free(x1); //메모리해제, 200번지 주소는 무효하다.
    
    x1[0] = 34; //x1은 무효한 주소를 갖고 있다.
    //무효한 주소를 dangling pointer라고 한다.
    
    return 0;
}