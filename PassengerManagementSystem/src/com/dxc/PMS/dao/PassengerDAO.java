package com.dxc.PMS.dao;

import java.util.List;

import com.dxc.PMS.model.Passenger;

public interface PassengerDAO {
	
	public Passenger getPassenger(int pnrNumber);
	public List<Passenger>getAllPassengers();
	public void addPassenger(Passenger passenger);
	public void deletePassenger(int pnrNumber);
	public void updatePassenger(Passenger passenger);	
	

}
