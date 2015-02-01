//
//  divide_op.c
//  
//
//  Division without divide operator
//  Created by Love Bisaria on 2/1/15.
//
//

#include <stdio.h>
#include <stdlib.h>

int divide(int nu, int de);
char *decimal_to_binary(int n);

int main(){
    
    int result = divide(10,5 );
    printf("Quotient: %d\n",result);
    return 0;
}

int divide(int nu, int de) {
    
    int temp = 1;
    int quotient = 0;
    
    char *temp_p = NULL , *nu_p = NULL , *de_p = NULL , *quot_p = NULL;
    
    temp_p = decimal_to_binary(temp);
    nu_p   = decimal_to_binary(nu);
    de_p   = decimal_to_binary(de);
    
    printf("__Initial Values__   nu: %s, de: %s, temp: %s\n", nu_p, de_p, temp_p);
    while (de <= nu) {
        de <<= 1;
        temp <<= 1;
    }
    
    temp_p = decimal_to_binary(temp);
    nu_p   = decimal_to_binary(nu);
    de_p   = decimal_to_binary(de);
    
    printf("__After First Loop__ nu: %s, de: %s, temp: %s\n", nu_p, de_p, temp_p);
    printf("nu: %d, de: %d, temp: %d\n", nu, de, temp);
    
    while (temp > 1) {
        de >>= 1;
        temp >>= 1;
        
        if (nu >= de) {
            nu -= de;
            printf("%d %d\n",quotient,temp);
            quotient += temp;
        }
    }
    
    return quotient;
}

char *decimal_to_binary(int n)
{
    int c, d, count;
    char *pointer;
    
    count = 0;
    pointer = (char*)malloc(32+1);
    
    if ( pointer == NULL )
        exit(EXIT_FAILURE);
    
    for ( c = 31 ; c >= 0 ; c-- )
    {
        d = n >> c;
        
        if ( d & 1 )
            *(pointer+count) = 1 + '0';
        else
            *(pointer+count) = 0 + '0';
        
        count++;
    }
    *(pointer+count) = '\0';
    
    return  pointer;
}
