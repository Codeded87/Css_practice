#include<iostream>
using namespace std;
int fun(int);
int main(){
	printf("Enter the option ");
	int x;
	cin>>x;
	int z = fun(x);
}

int fun(int n){
	switch(n){
		case 1:return 1;
		case 2: return 2;
		case 3:return 3;
		default: printf("invalid option");
	}
	return 8;
}
