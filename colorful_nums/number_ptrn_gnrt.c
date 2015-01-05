//
//  number_ptrn_gnrt.c
//  
//
//  Created by Love Bisaria on 1/4/15.
//
//

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

typedef struct  node{
    
    int data;
    struct  node *next;
    
}LLNode;

LLNode* create_all_pattern(int num);
int get_dig_count(int num);
void insert_end(LLNode **head , int val);
void print_list(LLNode *head);

int main(){
    
    int num;
    
    printf("Enter a number..\n");
    scanf("%d" , &num);
    LLNode *head = create_all_pattern(num);
    
    printf("Printing the List of patterns..\n");
    print_list(head);
    
    
    return 0;
}

LLNode* create_all_pattern(int num){
    
    int dig_count , count = 1 , a , dig, new_dig_count , divisor;
    LLNode *head = NULL;
    
    dig_count = get_dig_count(num);
    
    while (count < dig_count) {
        a = num;
        divisor = (int)pow(10,count);
        
        do{
            dig = a % divisor;
            insert_end(&head , dig);
            a = a/10;
            new_dig_count = get_dig_count(a);
            
        }while ((a != 0) && (count <= new_dig_count));
        
        count++;
    }
    return head;
}

int get_dig_count(int num){
    
    int a = num , dig_count = 0;
    
    do{
        a = a/10;
        dig_count++;
    }while(a != 0);
    
    return dig_count;
    
}

void insert_end(LLNode **head , int val){
    
    LLNode  *temp = NULL , *last = *head;
    
    temp = (LLNode*) malloc(sizeof(LLNode));
    
    if(temp == NULL){
        perror("Memory allocation not sucessful!!..\n");
    }
    
    temp->data = val;
    temp->next = NULL;
    
    if((*head) == NULL){
        *head = temp;
    }else{
        
        while (last->next != NULL) {
            last = last->next;
        }
        last->next = temp;
    }
}

void print_list(LLNode *head){
    
    LLNode *temp = NULL;
    
    temp = head;
    
    while (temp!= NULL) {
        
        printf("Data: %d\n" ,temp->data );
        temp = temp->next;
        
    }
    
}

