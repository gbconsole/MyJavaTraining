package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// constructor purpose		
		BankAccount acc1=new BankAccount();
		acc1.accountNumber="1234567";
		//acc1.name="Roger Hue";
		//Encapsulation with public API method
		acc1.setName("Rogue Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("67655647657");
		System.out.println("SSN: "+acc1.getSsn());
		acc1.balance=10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1200);
		acc1.deposit(3000);
		acc1.withdraw(2500);
		
		//Polymorphism through overriding ->override toString() method.
		System.out.println(acc1.toString());
		
		//Polymorphism through overloading -> call same constructor class with different argument
		BankAccount acc2=new BankAccount("Checking Account");
		acc2.accountNumber="1234567";
		BankAccount acc3=new BankAccount("Savings Account",1200.55);
		acc3.accountNumber="1234567";
		acc3.checkBalance();
		
		//Demo for inheritance
		CDAccount cd1=new CDAccount();
		cd1.balance=6000;
		cd1.interestRate="4.5";
		//cd1.name="Juan";
		cd1.accountType="CD Account";
		cd1.accountNumber="745876038";
		System.out.println(cd1.toString());
		cd1.compound();
		
	}

}
