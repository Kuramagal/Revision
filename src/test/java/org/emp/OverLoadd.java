package org.emp;

public class OverLoadd {

	// no of arguments
	private void empDetail(String name,int id) {
		
		System.out.println("Name - Theivamani, id -5768");
	}

	
private void empDetail(String name,int id, long salary) {
	
	System.out.println("Name - Theivamani, id -5768, Salary - 20,000");
}


//different data type

private void empDetail(long phone) {
	System.out.println("Phone Number - 984065789");
}
private void empDetail(String name) {
	
	System.out.println("Name - Theivamani");
}


public static void main (String[]args) {
	
	OverLoadd e=new OverLoadd();
	e.empDetail(null);
	e.empDetail(null, 0);
	e.empDetail(null, 0, 0);
	e.empDetail(0);
	
}

}
