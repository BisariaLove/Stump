//
//  gray_code_gen.c
//
//  Generate a grey code sequence given the number of digits as input.
//  eg: input=2 output= 00 01 11 10
//  use minimum space and time complexity
//
//  Created by Love Bisaria on 1/30/15.
//
//

#include<stdio.h>
#include<math.h>
#include <string.h>     /* strcat */
#include <stdlib.h>     /* strtol */

int *array,counter = 0;

void byte_to_binary(int x,int n)
{
    static char b[9];
    b[0] = '\0';
    
    int z;
    for (z = 128; z > 0; z >>= 1)
    {
        strcat(b, ((x & z) == z) ? "1" : "0");
    }
    int i = 8-n;
    while(i<8){
        printf("%c",b[i]);
        i++;
    }
}

void greycode(int n )
{
    int k,i;
    array[counter++]=0;
    array[counter++]=1;
    for(i=1 ; i < n; i++){
        k = counter -1;
        while(k>=0){
            array[counter++] = array[k--] | 1<<i;
        }
    }
    
}
int main()
{
    int n,i;
    printf("\nEnter n\n");
    scanf("%d",&n);
    array = (int*)malloc(pow(2,n)*sizeof(int));
    greycode(n);
    printf("\n------------------------greycode------------------------------\n");
    for(i=0;i<counter;i++){
        byte_to_binary(array[i],n);
        printf("\n");
    }
    
    return 0;
}
