package Assign;

import java.util.Scanner;

public class Product {

 String productName;
 int productId;
 int productQuantity;
 int productPrice;

	

	Scanner sc=new Scanner(System.in);
	

	public void input() {
		System.out.println("Enter the product name:");
		productName=sc.next();
		
		System.out.println("Enter the product Id:");
		productId=sc.nextInt();
		
		System.out.println("Enter the product Quantity:");
		productQuantity=sc.nextInt();
		
		System.out.println("Enter the product Price:");
		productPrice=sc.nextInt();
		
		if((productId<0)) {
			System.out.println("product id  can't be negative");
			System.out.println("Enter the product Id:");
			productId=sc.nextInt();
		}
		if((productQuantity<0)) {
			System.out.println("product quantity can't be negative");
			System.out.println("Enter the product Quantity:");
			productQuantity=sc.nextInt();
		}
		if((productPrice<0)) {
			System.out.println("product price can't be negative");
			System.out.println("Enter the product Price:");
			productPrice=sc.nextInt();}
		
	}

	

	
	@Override
	public String toString() {
		return "[productName=" + productName + ", productId=" + productId + ", productQuantity="
				+ productQuantity + ", productPrice=" + productPrice + "]";
	}




	public static void main(String[] args) {
		
	Product d5[]=new Product[5];
	for(int i=0;i<d5.length;i++) {
	d5[i]=new Product();
		}
		for(int i=0;i<d5.length;i++) {
			d5[i].input();
		}
		for(int i=0;i<d5.length;i++) {
			System.out.println(d5[i]);
			System.out.println("\n");
		}
		
		
		// TODO Auto-generated method stub
		

	}
	
}
