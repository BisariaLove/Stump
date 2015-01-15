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
void gen_row(int *arr , int size);

int main(){
    
    int *arr = NULL , size = -1;
    
    printf("Enter the number of elements..!!\n");
    scanf("%d" , &size);
    
    arr = (int*)malloc(sizeof(int) * size);
    
    printf("Enter Array elements..!!\n");
    
    for (int i = 0; i < size ; i++) {
        scanf("%d" , (arr+i));
    }
    
    gen_row(arr , size);
    display_elements(arr , size);
}

void display_elements(int *arr , int size){
    
    for(int i = 0; i < size ; i++){
        printf("%d ",*(arr+i));
    }
    
    printf("\n");
}

void gen_row(int *arr , int size){
    
    if(size > 0){
        int *new_arr = (int*)malloc(sizeof(int) * (size-1));
        
        for (int i = 0; i < (size-1) ; i++) {
            *(new_arr + i) = *(arr + i) + *(arr + (i+1));
        }
        //display_elements(new_arr , (size - 1));
        gen_row(new_arr , (size - 1));
        display_elements(new_arr , (size - 1));
        return;

    }
    
}