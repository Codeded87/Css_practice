#include<stdio.h>
#include<stdlib.h>
void asciiNotFound();
void asciiFound(int pos);
void RandomExist();
void RandomNotFound(int z);
int j,k;
	int asciiArray[256],RandomArray[256];
	char str[256]="aaaaaaaaa";
	int startAscii=0;
	int startRandom=0;
int main(){
//	printf("check 1\n");
	for(int i=0;i<4;i++){
	//	printf("check wild\n");
		for(int i=0;i<256;i++){
		//	printf("check loop \n");
		if(str[k]!=asciiArray[i]){
			//printf("check again %100d\n",i);
			if(i==255){
				printf("%d",i);
				asciiArray[startAscii]=str[k];startAscii++;
				asciiNotFound();}
		}
		else{
			printf("ascii found");
			asciiFound(i);
		}
		}
		printf("%d",k++);
	}
	for(int i=0;i<4;i++){
	printf("%c\n",asciiArray[i]);
	printf("%d\n",RandomArray[i]);
}}

void asciiNotFound(){
	printf("ascii not found");
	int j=0;
	j=rand() % 256;
	for(int i=0;i<256;i++){
		if(j!=RandomArray[i]){
			if(i==255){printf("random not found\n");
				RandomNotFound(j);break;
			}
		}else{
			RandomExist();
		}
	}
}
void asciiFound(int y){
	printf("asscii found\n");
	if(RandomArray[y]!=NULL){printf("ok");}
	else{asciiNotFound();
}}
void RandomNotFound(int z){
	printf("random not found\n");
	RandomArray[startRandom]=z;startRandom++;
}
void RandomExist(){
	printf("random exist\n");
	asciiNotFound();
}


