//
//  triangle_generator.c
//
//  Given a array
//  {{ 4,7,3,6,7}}
//
//  construct a triangle like
//  {{81}}
//  {{40,41}}
//  {{21,19,22}}
//  {{11,10,9,13}}
//  {{ 4,7,3,6,7}}
//  
//
//  Created by Love Bisaria on 1/14/15.
//
//

#include <stdio.h>
#include <stdlib.h>

void display_elements(int *arr , int size);

int main(){
    
    int *arr = NULL , size = -1;
    
    printf("Enter the number of elements..!!\n");
    scanf("%d" , &size);
    
    arr = (int*)malloc(sizeof(int) * size);
    
    printf("Enter Array elements..!!\n");
    
    for (int i = 0; i < size ; i++) {
        scanf("%d" , (arr+i));
    }
    
    display_elements(arr , size);
}

void display_elements(int *arr , int size){
    
    for(int i = 0; i < size ; i++){
        printf("%d ",*(arr+i));
    }
    
    printf("\n");
}

void gen_row(int *arr , int size){
    
}
