package oop;

public class BankAccount implements IRate {
	String accountNumber;
	//static means -> belong to the class, not the object.
	//final means -> constant can not change, often see together with static (final static xxx;)
	private final static String routingNumber="01237648";
	private String name;
	String ssn;
	String accountType;
	double balance=0;
	
	//constructor purpose
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//Overloading purpose below: -> call same method name with different argument
	
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: "+accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("NEW ACCOUNT: "+accountType);
		System.out.println("INITIAL DEPOSIT OF: $"+initDeposit);
		String Msg="";
		if(initDeposit<1000) {			
			Msg="ERROR: minimum deposit must be at least $1,000";
		}else {
			System.out.println("Thank for you initial deposit of: $"+initDeposit);
			balance=balance+initDeposit;
		}
		System.out.println(Msg);
	}
	
	//Getter and Setter
	//Allow the user to define a name with Encapsulation feature.
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
		
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//interface method
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}

	public void deposit(double amount) {
		balance=balance+amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance=balance+amount;
		showActivity("WITHDRAW");
	}
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: "+activity);
		System.out.println("YOUR NEW BALANCE IS: $"+balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: "+balance);
	}
	
	void getStatus() {
		
	}
	
	public String toString() {
		return "[ "+name+". "+accountNumber+". BALANCE: $"+balance+" ]";
	}
}
