//
//  combination_klen.c
//
//  Given a set of characters and a positive
//  integer k, print all possible strings of
//  length k that can be formed from the given set.
//
//  Created by Love Bisaria on 1/19/15.
//
//

#include <stdio.h>
#include <string.h>

void print_all_str(char *set , int k);
void print_all_k_len(char *set , char *prefix , int n , int k);

int main(){
    
    //printf("First test..!!\n");
    char set[] = {'0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' , '\0'};
    print_all_str(set , 4);
}

void print_all_str(char *set , int k){
    
    //printf("In print_all_str..!!\n");
    int n = strlen(set);
    print_all_k_len(set , "" , n , k);
    
}

void print_all_k_len(char *set , char *prefix , int n , int k){
    
    //printf("In print_all_k_len strings..!!\n");
    //printf("set: %s, prefix: %s, n: %d, k: %d\n",set , prefix , n, k);
    
    if(0 == k){
        printf("%s\n" , prefix);
        return;
    }
    
    for (int i = 0; i < n; ++i) {
        
        //printf("Value of i: %d\n" , i);
        char newprefix[100] = "";
        strcat(newprefix , prefix);
        //printf("newprefix(before): %s\n" , newprefix);
        int len = strlen(newprefix);
        newprefix[len++] = set[i];
        newprefix[len] = '\0';
        //printf("newprefix(after): %s\n" , newprefix);
        print_all_k_len(set , newprefix , n , (k-1));
        
    }
    
}
