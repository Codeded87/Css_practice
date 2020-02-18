#include<iostream>

int interpolation_search(int A[],int low,int high,int value){
	printf("%d value\n",value);
	printf("%d high\n",A[high]);
	printf("%d low\n",A[low]);
//	int m = ((value - A[low]) % (A[high] -A[low]));
//	printf(" this is the first evaluation%d m is the value\n\n\n",m);
	int mid;
	printf("this is the mid value %d mid \n",mid);
	while(low<=high){
		mid = low  + (A[high] - A[low] ) *  ((value - A[low]) / (A[high] -A[low]));
	if(A[mid] == value){
		return mid;
	}if(value< A[mid]){
		high = mid -1;
	}else{
		low = mid + 1;
	}
}
return -1;
}

int main(){
	int A[] = {1,3,5,7,9,11,13,15,17,19,21};
	int n = 10;
	int value = 13;
	int z = interpolation_search(A,0,n,value);
	if(z!= -1){
		printf("%d found",A[z]);
	}else{
		printf("not found");
	}
}
