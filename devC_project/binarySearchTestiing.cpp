#include<iostream>
using namespace std;
int binary_search(int A[],int n,int value);
int main(){
	int A[] = {3,6,8,12,14,17,25,29,31,36,42,47,53,55,62};
	
	int value  = 8;
	int n = 15;
	int pos = binary_search(A,n,value);
	printf("what");
	printf("%d",pos);
}

int binary_search(int A[],int n,int value){
	int l,h,key;
	l=0,h=n,key=value;
	int mid = l + h /2;
	while(l<=h){
		if(key == A[mid]){
			return mid;
		}
		if(A[mid] < key){
			l = mid + 1;
		}else{
			h = mid - 1;
		}
	}
	return 0;
	
}
