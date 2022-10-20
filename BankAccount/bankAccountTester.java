public class bankAccountTester {
    public static void main(String[] args) {

        System.out.println("Welcome to the Bank Account Tester!");

        //Creating a bankAccount object
        bankAccount account1 = new bankAccount("Cachary", 1000);

        System.out.println(account1.getUserName());
        System.out.println(account1.getCurrentBalance());

        //Testing deposit and withdraw method
        account1.deposit(100);
        System.out.println(account1.printBalance());
        account1.withdraw(500);
        System.out.println(account1.printBalance());
        account1.monthlyFee(5);
        System.out.println(account1.printBalance());

        //Testing menu

        bankAccount.interactMenu(account1);

    }
}
