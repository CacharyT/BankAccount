import java.util.Scanner;

/*
 * Cachary Tolentino
 * 10/13/2022
 * This program will create a bank account w/ several methods
 */

public class bankAccount {

    //Method that will print a menu to the user
    public static int menu(){

        //User inptut variable
        int choice;

        //Scanner object
        Scanner scan = new Scanner(System.in);

        //Print menu
        System.out.println("Welcome to the Bank Account Tester!");
        System.out.println("-----------------------------------");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Print Balance");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        //Takes in user input
        choice = scan.nextInt();

        //Returns user input
        return choice;
    }


    //Create a method that will interact with the user based on their choice
    public static void interactMenu(bankAccount account){
        //Gets the user's choice
        int choice = menu();

        //Helper method
        //Checks and process the user's choice
        if(choice == 1){
            System.out.println("Enter the amount you want to deposit: ");
            Scanner scan = new Scanner(System.in);
            int deposit = scan.nextInt();
            account.deposit(deposit);
            System.out.println(account.printBalance());
            interactMenu(account);
        }
        else if(choice == 2){
            System.out.println("Enter the amount you want to withdraw: ");
            Scanner scan = new Scanner(System.in);
            int withdraw = scan.nextInt();
            account.withdraw(withdraw);
            System.out.println(account.printBalance());
            interactMenu(account);
        }
        else if(choice == 3){
            System.out.println(account.printBalance());
            interactMenu(account);
        }
        else if(choice == 0){
            System.out.println("Thank you for using the Bank Account Tester!");
        }
        else{
            System.out.println("Invalid choice. Please try again.");
        }
    }

    //create a method that will allow the user to interact with the menu 
    //make a switch case here for user interaction

    //Delcaring variables for bankAccount object
    private double currentBalance = 0;
    private String userName = "";

    //Constructor for bankAccount object
    public bankAccount(){
        this.userName = "No Name";
        this.currentBalance = 0;
    }
    
    public bankAccount(String name, double balance){
        this.userName = name;
        this.currentBalance = balance;
    }
    
    public bankAccount(String name){
        this.userName = name;
        this.currentBalance = 0;
    }
   
    public bankAccount(double balance){
        this.userName = "No Name";
        this.currentBalance = balance;
    }


    //Getter & Setter
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public String printBalance(){
        return "Your balance is $" + currentBalance;   
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    //Deposit and Withdraw methods
    public void deposit(double amount){
        this.currentBalance += amount;
    }

    public void withdraw(double amount){
        this.currentBalance -= amount;
    }

    public void monthlyFee(double fee){
        withdraw(fee);
    }




    //Creating a methid that will calculate the interest on the balance using compound interest
    public void compoundInterest(double p, int t, double r, int n){
        double amount = p * Math.pow(1 + (r/n), n*t);
        double roundedAMount = Math.round(amount * 100.0) / 100.0;
        double compInterest = amount - p;
        System.out.println("The compound interest is: " + compInterest);
        System.out.println("Amount after " + t + " years: " + amount);
    }
}