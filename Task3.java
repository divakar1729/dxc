package Assign;

import java.util.Scanner;

public class Task3 {
	Scanner sc=new Scanner(System.in);
	int num1,num2;
	
	public void display()
	{
	

	System.out.println("Please enter numbers to be swapped");
	num1=sc.nextInt();
	
	num2=sc.nextInt();

	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println("the swapped numbers are "+num1+","+num2);
	}

	public static void main(String args[]) {
		
		Task3 d=new Task3();
		d.display();
	}

}