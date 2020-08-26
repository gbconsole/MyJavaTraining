package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name+" is walking");
	}
	void eat() {
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name+" is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1=new Person();
		
		person1.name="Joe";
		person1.email="joe@testemail.com";
		person1.phone="987487387";
		
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2=new Person();
		person2.name="Sarah";
		person2.sleep();
	}

}
