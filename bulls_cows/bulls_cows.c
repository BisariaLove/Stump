//
//  bulls_cows.c
//  
//
//  Created by Love Bisaria on 1/2/15.
//
//

#include <stdio.h>
#include <string.h>
int bulls_cows(char *a , char *b , int *cows , int *bulls);

int main(){
    
    char a[100] , b[100];
    int cows = -1 , bulls = -1;
    
    printf("Enter the word for A..\n");
    scanf ("%[^\n]%*c", a);
    printf("Enter the word for B.. \n");
    scanf ("%[^\n]%*c", b);
    
    bulls_cows(a , b , &cows , &bulls);
    
    return 0;
}

int bulls_cows(char *a , char *b , int *cows , int *bulls){
    
    //printf("A's String: %sB's String: %s\n", a , b);
    //printf("Cow : %d\nBulls: %d\n" , *cows , *bulls);
    
    int  len = -1 , i = 0;

    if((NULL == a) || (NULL == b))
        return -1;
    
    if(0 == strcmp(a , b)){
        
        *cows = 0;
        *bulls = strlen(a);
    }
    
    
    len = ((strlen(a) > strlen(b)) ? strlen(b) : strlen(a));
    
    while (i<len) {
        
        
        
        i++;
    }
    
    return 1;
    
}

