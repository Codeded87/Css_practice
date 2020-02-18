import java.util.Scanner;

class Account {

    Scanner sc;

    static long accoutnnumberinfo = 100000000;
    private double accountBalance = 0.0;

    private long accountNumber;

    // set account balance

    public void setAccoutBalance() {
        System.out.println("Do you want to deposit any amount: ");
        System.out.println("Press Y for Yes N for No: ");
        char x = sc.next().charAt(0);
        double amt = 0.0;
        if (x == 'y' || x == 'Y') {
            System.out.println("Enter the amount");
            amt = sc.nextDouble();
            this.accountBalance = amt;
        } else {
            this.accountBalance = amt;
        }

    }

    // check balance
    public void getAccountBalance() {
        System.out.println("this is the current accout balance of your account number" + this.accountNumber + "is"
                + this.accountBalance);
    }

    // create account
    public void getAccountNumber() {

        accountNumber = accoutnnumberinfo;

        accoutnnumberinfo++;

        setAccoutBalance();

        System.out.println("Do you check your account balance: ");
        System.out.println("Press Y for Yes N for No: ");
        char x = sc.next().charAt(0);
        if (x == 'y' || x == 'Y') {
            getAccountBalance();

        } else {
            System.out.println("thanks for creating the account");
        }

    }

}