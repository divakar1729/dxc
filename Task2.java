package Assign;

import java.util.Scanner;

public class Task2 {
	Scanner sc=new Scanner(System.in);
	int num1,num2;
	
	public void display()
	{
	

	System.out.println("Please enter Year");
	num1=sc.nextInt();
	if(num1%4==0) {
	System.out.println(num1+" is a leap year");
	}
	else {
		System.out.println(num1+" is not a leap year");
	}
	}

	public static void main(String args[]) {
		
		Task2 d=new Task2();
		d.display();
	}

}