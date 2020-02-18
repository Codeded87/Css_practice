public class StaticTest{

public static void fun(){
System.out.printf("hello");}



public static void main(String args[]){

StaticTest.fun();
Test.fun2();
Test.x=8;
System.out.println(""+Test.x);


Test obj = new Test();
obj.z=78;
System.out.println(""+obj.z);

}

}


class Test{
	int  z; 
	static int x;
	public static void fun2(){
		System.out.printf("world");
	}
}