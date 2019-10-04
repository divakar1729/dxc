package com.dxc.PMS.client;

import java.util.Scanner;

import com.dxc.PMS.model.Passenger;
import com.dxc.PMS.dao.PassengerDAO;
import com.dxc.PMS.dao.PassengerDAOImpl;
public class Main {
	public static void main(String[] args) {
		
		PassengerDAO passengerDAO=new PassengerDAOImpl();
		while(true) {
			System.out.println("M E N U");
			System.out.println("1.Add the passengers:");
			System.out.println("2.Get all the passengers:");
			System.out.println("3.E X I T");
			Scanner scanner=new Scanner(System.in);
			int choice=0;
			System.out.println("Please enter your choice:(1-3)");
			choice=scanner.nextInt();
			switch(choice) {
			  case 1:
	                System.out.println("Please enter pnr number :");
	                int pnrNumber = scanner.nextInt();
	                System.out.println("Please enter passenger name :");
	                String passengerName = scanner.next();
	                System.out.println("Please enter source :");
	                String source = scanner.next();
	                System.out.println("Please enter destination :");
	                String destination = scanner.next();
	                System.out.println("Please enter fare :");
	                int fare = scanner.nextInt();
	 
	                Passenger passenger = new Passenger(pnrNumber, passengerName, source,destination,fare);
	 
	                passengerDAO.addPassenger(passenger);
	                break;
	            case 2:
	 
	                System.out.println(passengerDAO.getAllPassengers());
	                break;
	            case 3:
	                System.out.println("Thanks for using my app");
	                System.exit(0);
	            default:
	                System.out.println("R U drunk milk. Please enter (1-3)");
	            }
	        }
	 
	}
}
