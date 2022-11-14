package org.emp;

import java.util.Scanner;

public class TotalMark {

	public static void main (String[]args) {
		
	Scanner sc=new Scanner(System.in);	
	
	System.out.println("Enter Tamil Mark");
	int tamil=sc.nextInt();
	System.out.println("Tamil Mark  " +tamil );
		

	System.out.println("Enter English Mark");
	int eng=sc.nextInt();
	System.out.println("English Mark  " +eng );	
	

	System.out.println("Enter Maths Mark");
	int math=sc.nextInt();
	System.out.println("Maths Mark  " +math );	
	
	System.out.println("Enter Science Mark");
	int sci=sc.nextInt();
	System.out.println("Science Mark  " +sci );	
	

	System.out.println("Enter SocialScience Mark");
	int sosci=sc.nextInt();
	System.out.println("SocialScience Mark  " +sosci );	
	
	int N = 5,totalMarks=0;
	float percentage;
	int marks []= {tamil, eng,math,sci,sosci};

	 for (int i = 0; i < N; i++) {
         totalMarks += marks[i];
     }
	
	System.out.println("Total Mark = " +totalMarks);
	
	 percentage = (totalMarks / (float)N);
     System.out.println(
         "Total Percentage : " + percentage + "%");
	

	}
		
}
