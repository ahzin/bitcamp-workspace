#include <stdio.h>
#include <stdlib.h>

int main(){
    int age = 20;
    printf("age = %d \n", age); //20

    int* pAge = malloc(4);
    *pAge = 200;
    printf("age = %d \n", *pAge); //200
    return 0;
}