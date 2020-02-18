import java.util.Scanner;

public class OperatorAssignment{
    public static void main(String args[]){


            //creating object of scanner class
            Scanner sc = new Scanner(System.in);



        //operators 
        //Arithmetic operators
                
                //Addition operators

                byte firstNumber = 0, secondNumber = 0, totalAdditon = 0;

                //taking input from the user
                 System.out.println("Enter the first Number");
                 firstNumber  = sc.nextByte();

                 System.out.println("Enter the second number");
                 secondNumber = sc.nextByte();

                 //Addition of the number 

                 totalAdditon = firstNumber + secondNumber;

                 //output of the Addition 
                 System.out.println("the sum of the number first"+firstNumber+"second"+secondNumber+"is"+totalAdditon);

                //Subtraction operator

                int first_number_for_subtration=0, second_number_subtration, total_value_After_subtraction=0;

                //taking input from the user

                System.out.println("Enter the first number for subtration");
                first_number_for_subtration = sc.nextInt();

                System.out.println("Enter the seconf number for the subtration");
                second_number_subtration = sc.nextInt();

                //subtration output

                total_value_After_subtraction = first_number_for_subtration - second_number_subtration;
                System.out.println("the subtration of the number first "+first_number_for_subtration+"second"+second_number_subtration+"is"+total_value_After_subtraction);



                //multiplication operator


                long first_number_for_Multiplication = 0, second_number_for_multiplication = 0, total__value_after_multiplication = 0;
                
                //taking input from the user

                System.out.println("Enter the first value for multiplication");
                first_number_for_Multiplication = sc.nextLong();

                System.out.println("Enter the second value for multiplication");
                seconf_number_for_multiplication = sc.nextLong();

                //output the value of addition
                total__value_after_multiplication = first_number_for_Multiplication + second_number_for_multiplication;

                System.out.println("first number for the multiplication"+first_number_for_Multiplication+"second number"+second_number_for_multiplication+"and the multiplied value is "+total__value_after_multiplication);


                //division operator

                short divisor_number = 0; dividend_number = 0; quotient_number=0;

                System.out.println("Enter the  ");
                




































        






    }
}