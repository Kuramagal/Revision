package org.emp;
import java.util.*;
	

public class Scannerr {

	public static void main (String []args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your Name");
	String name = s.nextLine();
	System.out.println("Name is: " +name);
	System.out.println("Enter your Phone Number");
	int phoneNo =s.nextInt();
	
	System.out.println("Your Phone Number is: "  +phoneNo);
	
	System.out.println("Enter your Genter");
	char genter =s.next().charAt(0);
	
	System.out.println("Your Genter is: "  +genter);
	


	}
	
	
	
}
