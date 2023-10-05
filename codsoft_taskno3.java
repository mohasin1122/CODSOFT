
import java.util.Scanner;

//  represent the user's bank account
class BA {
    private double balance;

    public BA(double initialBalance) {
        this.balance = initialBalance;
    }

    public double gbalance() {
        return balance;
    }

    public void deposit(double money) {
        balance += money;
    }

    public boolean withdraw(double money) {
        if (money <= balance) {
            balance -= money;
            return true;
        }
        return false;
    }
}

// ATM class to represent the ATM machine
class ATM {
    private BA BA;

    public ATM(BA BA) {
        this.BA = BA;
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Select option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the money to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (BA.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance .");
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    BA.deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;
                case 3:
                    System.out.println(" your Account balance is" + BA.gbalance());
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        sc.close();
    }
}

public class codsoft_taskno3 {
    public static void main(String[] args) {
        BA userAccount = new BA(1000.0); // Initial balance of $1000
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
