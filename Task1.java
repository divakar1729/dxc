package Assign;

import java.util.Scanner;

public class Task1 {
	Scanner sc=new Scanner(System.in);
	int num1,num2;
	
	public void display()
	{
	

	System.out.println("Please enter first number");
	num1=sc.nextInt();
	System.out.println("Please enter Second number");
	num2=sc.nextInt();
	if((num1<0)||(num2<0)) {
	System.out.println("Can't add negative no's");
	}
	else {
		System.out.println("their sum is"+(num1+num2));
	}
	
	}
	

	public static void main(String args[]) {
		
		Task1 d=new Task1();
		d.display();
	}

}

	