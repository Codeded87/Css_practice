#include<iostream>
class Reatangle{
public :
int width;
int height;
};
void setData(Reatangle *test,int w,int h){
test->width  = w;
test->height = h;
}
void display(Reatangle *test){
printf("%d width\n",test->width);
printf("%d height\n",test->height);
}
int main(){

Reatangle r;
setData(&r,2,3);
display(&r);
}

