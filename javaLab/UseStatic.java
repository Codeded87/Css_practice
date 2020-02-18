public class UseStatic
{   static int a = 3;
    static int b;
    static void meth(int x){
        System.out.printf("x=\n"+x);
        System.out.println("a\n"+a);
        System.out.println("b\n"+b);
    }
    static{
        System.out.println("static block initialized");
        b = a * 4;
    }
    public static void main(String args[]){
        meth(32);
    }
}