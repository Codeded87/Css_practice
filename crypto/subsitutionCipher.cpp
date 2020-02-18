#include<stdio.h>
#include<stdlib.h>
int main(){

int args[256],str[256];
int start=0;
int j=0;
bool found=false;

while(start!=256){


read:
j=rand() % 256;
printf("%d\n",j);/*
if(j>=0){
		printf("check1\n");
			for(int i=0;i<256;i++){
				printf("check2\n ");/*
			if(args[i]==j){
						printf("Checkn3\n");
					goto read;}
			}printf("check4\4");
			args[start]=j;
			++start;			
			
}	}	//}
else{
goto read;}
}*/}
start=0;
while(start!=256){printf("%d",args[start]);start++;}
}