package assingnofjava2024;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Testing Account class
        Account account1 = new Account(123456, 1000.0, "sakariye ");
        account1.deposit(500.0);
        account1.withdraw(200.0);
        System.out.println("Account Balance: $" + account1.checkBalance());
        account1.printTransactionHistory();

        // Testing SavingsAccount class
        SavingsAccount savingsAccount1 = new SavingsAccount(2345, 100.0, "wizz axmed", 500.0);
        savingsAccount1.applyMonthlyInterestRate(5.0);
        System.out.println("Savings Account Balance: $" + savingsAccount1.checkBalance());
    }

	}


