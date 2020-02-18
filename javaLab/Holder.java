import java.util.Scanner;

public class Holder {

    static Scanner sc;

    public static void allAccount() {

    }

    public static void createAccount() {
        sc = new Scanner(System.in);
        Account obj = new Account();

        obj.getAccountNumber();

    }

    public static void checkBalance() {

    }

    public static void main(final String args[]) {

        System.out.println("Press 1 to check number of account exist in your bank");
        System.out.println("press 2 to create a bank account of any holder ");
        System.out.println("press 3 to check someone's accout balance");

        byte option = 1;
        option = sc.nextByte();

        while (option != 0) {
            switch (option) {
            case 1:
                allAccount();
                break;
            case 2:
                createAccount();
                break;
            case 3:
                checkBalance();
                break;
            default:
                System.out.println("Invalide option");
                break;
            }

            System.out.println("Press 1 to check number of account exist in your bank");
            System.out.println("press 2 to create a bank account of any holder ");
            System.out.println("press 3 to check someone's accout balance");
            System.out.println("press 0 to quit");

            option = sc.nextByte();

        }

    }
}