package oop;

public class MyBankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBankAccount acc1=new MyBankAccount("7946753674",1000);
		MyBankAccount acc2=new MyBankAccount("8768769584",2500);
		MyBankAccount acc3=new MyBankAccount("9274957648",2300);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}	
}

class MyBankAccount implements IInterest{
	//properties of bank account
	private static int iD=1000;  //static means own by class not by object.
	private String accountNumber; // iD + 2 digit random + first 2 of SSN
	private static final String routingNumber="00786893";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public MyBankAccount(String SSN, double initDeposit) {
		balance=initDeposit;
		System.out.println("New Account Created");
		this.SSN=SSN;
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random=(int) (Math.random()*100);
		accountNumber=iD+""+random+SSN.substring(0,2);
		System.out.println("Your Account Number: "+accountNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void payBill(double amount) {
		System.out.println("Paying bill: "+amount);
		balance=balance-amount;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit: "+amount);
		balance=balance+amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Your balance is $"+balance);
	}

	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance=balance*(1+rate/100);
		showBalance();
	}
	
	public String toString() {
		return "[Name: "+name+" ]\n[Account Number: "+accountNumber+"]\n[Routing Number: "+routingNumber+"]\n[Balance: "+balance+"]";
	}
}
