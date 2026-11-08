
import java.util.Scanner;

class BankAccount {
    double balance = 5000;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount!");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void checkBalance() {
        System.out.println("Available Balance: " + balance);
    }
}

class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.println("===== ATM MACHINE =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            account.checkBalance();
        } else if (choice == 2) {
            System.out.print("Enter deposit amount: ");
            double amount = sc.nextDouble();
            account.deposit(amount);
        } else if (choice == 3) {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("Invalid Choice!");
        }

        account.checkBalance();

        sc.close();
    }
}
