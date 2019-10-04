package com.dxc.PMS.model;

public class Passenger {
	private int pnrNumber;
	private String passengerName;
	private String source;
	private String destination;
	private int fare;
	
	public Passenger() {
		super();
	}
	
	
	public Passenger(int pnrNumber, String passengerName, String source, String destination, int fare) {
		super();
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + fare;
		result = prime * result + ((passengerName == null) ? 0 : passengerName.hashCode());
		result = prime * result + pnrNumber;
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (fare != other.fare)
			return false;
		if (passengerName == null) {
			if (other.passengerName != null)
				return false;
		} else if (!passengerName.equals(other.passengerName))
			return false;
		if (pnrNumber != other.pnrNumber)
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		return true;
	}
	public int getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(int pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "Passenger [pnrNumber=" + pnrNumber + ", passengerName=" + passengerName + ", source=" + source
				+ ", destination=" + destination + ", fare=" + fare + "]";
	}
	
	
	

}
