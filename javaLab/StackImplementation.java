class Stack{
    private int pos;
    private int stck[] = new int[10];
    
    public void push(int item){
        if(tos==9)
        System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }
    int pop(){
        if(tos<0){
        System.out.println("stack underflow");
        return 0;}
        else{
            return stck[tos--];
        }
    }
}

class TestStack{
    public static void main(String args[]){
        Stack mystack1 = new Stack();
    }
}