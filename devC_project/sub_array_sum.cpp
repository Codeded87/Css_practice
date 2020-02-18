#include<iostream>


void test(int A[],int n,int sum){
    int sub_sum=0;
    for(int i=0;i<n;i++){
    	sub_sum = 0;
        for(int j=i;j<n;j++){
        	if(sub_sum > sum){
        		continue;
			}
            if(sub_sum == sum){
                printf(" %d sum are equal %d \n",sum ,sub_sum);
                printf("%d i index and %d j index",i,j);
            }else{
                sub_sum = sub_sum + A[j];
            }
        }       
    }
 
}

void fun(){
	 printf("Enter the size of the array");
   int n = 0;
   scanf("%d",&n);
	   int arr[n];
   printf("Enter the sum number");
   int sum = 0;
   scanf("%d",&sum);
 	printf("Enter the array element");
	 for(int i=0;i<n;i++){
	 	scanf("%d",&arr[i]);
	 }  
 
    test(arr,n,sum);
}


int main(){
    
printf("Enter the number of case:");
int z = 0;
scanf("%d",&z);
for(int i=0;i<z;i++){
	fun();
}
  
}
