#include<iostream>
using namespace std;

int main(){
	int sum =0;
	int A[] ={1,2,3,4,5,6,7,4};
	for(auto x:A){
	sum = sum +x;
	}
	cout<<sum;
}
