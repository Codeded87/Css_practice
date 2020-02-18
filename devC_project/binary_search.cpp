#include<iostream>

int binary_search(int A[],int n,int value);

int main(){
	int A[] = {1,2,3,4,5,6,7,8,9,};
	int n = 9;
	int value =59;
	int pos = binary_search(A,n,value);
	printf("%d",A[pos]);


}

int binary_search(int A[],int n,int value){
	
	int l = 0; 
	int h = n;
	int mid = 0;
	int key = value;
	mid = l + h / 2;
	while(l<= h){
	
	if(value  == A[mid]){
		return mid;
	}
	if(key <A[mid]){
		h = mid -1;
	}
	else{
		 l = mid + 1 ;
	}
	mid = l + h / 2;
}
return 0;	
}
