package org.emp;

public class SingleInheritanceB extends SingleInheritanceA{
	
	
	
	public static void addEmpl() {
		
		System.out.println("Address is :"
				+ "32.Kurinji nagar,"
				+ "Vandalur, "
				+ "Chennai-48");
		
	}
public static void phoneNum() {
	
	System.out.println("Phone Number is : 983434545");
	
}

	public static void main(String []args) {
		
		
		SingleInheritanceB b=new SingleInheritanceB();
	
	b.idNum();
	b.name();
		
	
		
	}
	
	
	
}
