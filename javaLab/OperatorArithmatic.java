import java.util.Scanner;
public class OperatorArithmatic{
    public static void main(String args[]){
        int sum =0,div=0,mul=0,mod=0;
        //arithmatic operator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int sub=0;
        int num = sc.nextInt();

        System.out.println("Enter the second number");

        int num2 = sc.nextInt();

        System.out.println("Enter the operator to perform calculation");
        char c = sc.next().charAt(0);

        switch(c){
            case '+': sum = num + num2;System.out.printf("this is the sum of %d the value of%d and %d",sum,num,num2 );break;
          
            case '-':sub = num - num2;System.out.printf("this is the subtracted value of %d and the value is %d and %d ",sub,num,num2);break;

            case '*':mul = num * num2;System.out.printf("this is the Multiplied value of %d and the value is %d and %d ",mul,num,num2);break;
            case '/':div = num / num2;System.out.printf("this is the Divide value of %d and the value is %d and %d ",div,num,num2);break;
            case '%':mod = num % num2;System.out.printf("this is the Modulo value of %d and the value is %d and %d ",mod,num,num2);break;
            
            
            
              default : System.out.printf("Invalid option");break; 
        }
    


    }
}