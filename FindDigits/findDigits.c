#include <inttypes.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <stdint.h>
#include <stdio.h>


typedef struct node{
    
    uint64_t val;
    struct node *next;
} Node;

void toDigits(Node *head);
int mathOperation( uint64_t num1 , int num2);



int main(int argc , char* argv[]) {
    
    int input_count = 0, temp = 0 ;
    char b[20];
   // uint64_t value=0;
    Node *head  = NULL , *temp_node = NULL , *cur = NULL;
    
    
    memset(b, 0 , sizeof(b));
    
    scanf("%d" , &input_count);
    
    
    if(input_count < 1 ||input_count > 15 ){
        printf("Count out of bounds!! .... Exiting!!\n");
        return(0);
    }
   	
    while(temp < input_count){
        
        temp_node = (Node*) malloc(sizeof(Node));
        
        scanf("%s" , b);
        temp_node->val = atoi(b);
        
        if(temp_node->val <= 0 ||temp_node->val >= 10000000000){
            free(temp_node);
            temp_node = NULL;
        }
        
        temp_node->next = NULL;
        
        if(head == NULL){
            cur  = head = temp_node;
        }
        
        else{
            cur->next = temp_node;
            cur = temp_node;
        }
        
        
        temp++;
        
    }
    
    toDigits(head);
    
    return 0;
}


void toDigits(Node *head){
    
    uint64_t temp ,value;
    int flag;
    int dig;
    int counter;
    
    Node *cur = head;
    
    while (NULL != cur) {
        value = cur->val;
        temp = value;
        counter = 0;
        
        do{
            
	    flag = 0;
            dig = temp % 10 ;
            if(0 != dig)
            	flag = mathOperation(value , dig);
            
            if (1 == flag) {
                counter++;
            }
            
            
            
            temp = temp / 10;
            
        } while(temp != 0);
        
        printf("%d\n",counter);
        
        cur = cur->next;
        
    }
    
}

int mathOperation( uint64_t num1 , int num2){
    if ((num1 % num2)){
        return 0 ;
    }
    
    else{
        return 1 ;
    }
}
