package com.dxc.PMS.dao;

import java.util.ArrayList;
import java.util.List;

import com.dxc.PMS.model.Passenger;

public class PassengerDAOImpl implements PassengerDAO {
	List<Passenger>allPassengers= new ArrayList<Passenger>();

	@Override
	public Passenger getPassenger(int pnrNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passenger> getAllPassengers() {
		// TODO Auto-generated method stub
		return allPassengers;
	}

	@Override
	public void addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		allPassengers.add(passenger);
	}

	@Override
	public void deletePassenger(int pnrNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePassenger(Passenger passenger) {
		// TODO Auto-generated method stub

	}

}
