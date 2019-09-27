package Assign;

import java.util.Scanner;

public class Task4 {
	Scanner sc=new Scanner(System.in);
	char ch;
	
	public void display()
	{
	

	System.out.println("Please enter a character");
	ch=sc.next().charAt(0);
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')) {
	System.out.println("Entered character is a vowel");
	}
	else {
		System.out.println("Enterd character is not a vowel");
	}
}

	public static void main(String args[]) {
		
		Task4 d=new Task4();
		d.display();
	}

}