#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */




bubble_sort(int A[],int n){
	
	
	for(int i = 0;i<n;i++){
		for(int j =0;j<n-1 ;j++){
				
				if(A[j] > A[j+1]){
					int temp;
					temp = A[j];
					A[j] = A[j+1];
					A[j + 1] = temp;
				}
			
		}
	}
		for(int i=0;i<n;i++){
		printf("%d\n",A[i]);
	}
	
}








int main(int argc, char** argv) {
	
	int A[] = {10,23,2,32,54,4};
	int n = 6;
	for(int i=0;i<n-1;i++){
		printf("%d\n",A[i]);
	}
	bubble_sort(A,6);
	
	return 0;
}
