package basic;

public class SalaryCalculator {
	public static void main (String[] args) {
		
		//Declare a variable
		String career;
		System.out.println("Program is starting");
		
		//Define a variable
		career="Software Developer";
		System.out.println("My careeer is: "+career);
		
		//Declare and define
		int hoursPerWeek=40;
		int weeksPerYear=50;
		double rate=42.50;
		career="Web Developer";
		
		double salary = hoursPerWeek*weeksPerYear*rate;
		System.out.println("My salary as a "+career+" as a rate of $"+rate+" per hour is $"+salary+" per year.");
	}
}
