import java.util.Scanner;

class Bank {
    float Balance = 9500;
    int PIN = 9510;
    Scanner sc = new Scanner(System.in);

    public void checkPin() {
        System.out.println("Enter your PIN: ");
        //Scanner sc = new Scanner(System.in);
        int enteredPIN = sc.nextInt();
        if (enteredPIN == PIN) {
            menu();
        } else {
            System.out.println("Enter the valid PIN");
        }

    }

    public void menu() {
        System.out.println("Enter your Choice:");
        System.out.println("1.Check account balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit money");
        System.out.println("4.Exit");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                return;
            default:
                System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter amount to withdraw money");
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient");
        } else {
            Balance = Balance - amount;
            System.out.println("Money withdrawl Successful");
        }
        menu();
    }

    public void depositMoney() {
        System.out.println("Enter the amount to deposit");
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposited Successfully");
        menu();
    }
}

public class SimpleBankingApplication {
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.checkPin();
    }
}