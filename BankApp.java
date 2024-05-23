import java.util.Scanner;

public class BankApp {
    // Variable to store the balance
    private static double balance = 0.0;
    
    // Scanner object to read user input
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean exit = false;
        
        while (!exit) {
            // Display the main menu
            System.out.println("Welcome to the Simple Banking Application");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the Simple Banking Application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.Try again.");
            }
        }
        
        sc.close();
    }
    
    // Method to handle deposits
    private static void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited INR." + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    // Method to handle withdrawals
    private static void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew INR." + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.Current balance :INR." + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    // Method to check the balance
    private static void checkBalance() {
        System.out.println("Your current balance is INR." + balance);
    }
}
