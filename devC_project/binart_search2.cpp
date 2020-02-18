

#include<iostream>
using namespace std;

int binary_search(int A[],int n,int value){
	cout<<"into the function";
	int l = 0, h = n, mid;
	mid = l + h /2;
	while(l<=h){
		
		if(A[mid] == value){
			return mid;
		}
		if(A[mid] < value){
			l = mid + 1;
		}else{
			h = mid -1 ;
		}
		mid = (l + h) /2;
	}
	return 0;
	
}
int fun(){
	int A[] = {1,2,3,4,5,6,7,8,9};
	int n = 9;
	int value = 8;
	int x = binary_search(A,n,value);
	if(x != NULL){
		printf("Value found %d",A[x]);
	}else{
		printf("Value not found");
	}
}
