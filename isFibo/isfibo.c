//
//  isfibo.c
//  
//
//  Created by Love Bisaria on 12/15/14.
//
//

#include <stdio.h>
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

typedef struct node{
  
    int64_t value;
    struct node *next;
    
}Node;

Node *head ;

void readElements(int);
int isPerfectSquare(int64_t sqrValue);

int main(){
    
    int input_count , flag=0;
    Node *temp_node = NULL;
    int64_t sqrValue = 0;
 
    scanf("%d" , &input_count);

    if((input_count < 1 )||(input_count > 100000)){
        printf("Total number of Inputs out of Range ..!!\n");
        return 1;
    }
    
    readElements(input_count);

    /*Reading the elements from the list*/
    
    temp_node = head;

    while(temp_node != NULL){
    	
        sqrValue = 5*pow(temp_node->value , 2);
        flag = (isPerfectSquare(sqrValue+4) || isPerfectSquare(sqrValue-4));
        
        if(flag == 1){
            printf("IsFibo\n");
        }
        else{
            printf("IsNotFibo\n");
        }
        
        temp_node = temp_node->next;
        
    }   
    
    
    
    return 0;
    
}


void readElements(int input_count){
    
    int temp = 0;
    int64_t val = 0;
    Node *temp_node =NULL , *cur = NULL;
    char b[20];
    
    
    while (temp < input_count) {
    
        scanf("%s" , b);
        val = atol(b);
        
        if(val < 0 || val >10000000000)
            continue;
        
        temp_node = (Node*) malloc(sizeof(Node));
        
        temp_node->value = val;
        temp_node->next = NULL;
        
        if(head == NULL){
            head = cur = temp_node;
        }
        else{
            cur->next = temp_node;
            cur = temp_node;
        }
        
        temp++;
        
    }
    
}

int isPerfectSquare(int64_t sqrValue){
    
    int64_t s = 0;
    
    s = sqrt(sqrValue);
    
    return(s*s == sqrValue);
    
}
