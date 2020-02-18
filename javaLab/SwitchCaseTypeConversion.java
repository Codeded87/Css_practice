import java.util.Scanner;
public class SwitchCaseTypeConversion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int option = 0;
        int i=10;
        byte b;
        float f;
        short s;
        double d;
        System.out.printf("Enter 1 for int converion to byte");
        System.out.println("Enter 2 for float   conversion to byte");
        System.out.println("Enter 3 for byte conversion short");
        System.out.println("Enter 4 for double conversion to byte");
        
        while(option != -1){

        System.out.println("Enter -1 ton quit");
        int option = sc.nextInt();
        

        switch(option){
            case 1: System.out.println("Enter the value that has to type case "); 
                    i = sc.nextInt();
                    b = (byte)i;
                    System.out.println("Value after coversion "+b);
                    break;
            case 2:
                    System.out.println("Enter the value that has to type case "); 
                    f = sc.nextFloat();
                    b = (byte)f;
                    System.out.println("Value after coversion "+b);
                    break;
            case 3:
                    System.out.println("Enter the value that has to type case "); 
                    b = sc.nextByte();
                    s = (short)i;
                    System.out.println("Value after coversion "+s);
                    break;
            case 4:
                    System.out.println("Enter the value that has to type case "); 
                    d = sc.nextDouble();
                    b = (byte)d;
                    System.out.println("Value after coversion "+b);
                    break;
            default :System.out.println("Invalid option");break;
        }
        }
        
    }
}