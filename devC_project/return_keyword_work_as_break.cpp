#include<iostream>
using namespace std;
int fun(int);
int fun2(){
	printf("Enter the option ");
	int x=1;	
	printf("option");
	int z = fun(x);
	printf("%d",z);
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
