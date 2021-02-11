//Gunner Carlson
public class CruiseShip extends Ship implements CruiseShipInterface{
	
	//Instance variables
	private int passengerCapacity;
	private int numCrewMembers;
	
	//Default constructor
	public CruiseShip() {
		super();
		this.passengerCapacity = 1000;
		this.numCrewMembers = 200;
	}
	
	//Parameterized constructor()
	public CruiseShip(String xShipName, String xLaunchDate, int xPassengerCapacity, int xNumCrewMembers) {
		super(xShipName, xLaunchDate);
		this.setPassengerCapacity(xPassengerCapacity);
		this.setNumCrewMembers(xNumCrewMembers);
	}
	
	//Accessors and mutators
	public int getPassengerCapacity() {
		return this.passengerCapacity;
	}
	public int getNumCrewMembers() {
		return this.numCrewMembers;
	}
	public void setPassengerCapacity(int xPassengerCapacity) {
		this.passengerCapacity = xPassengerCapacity;
	}
	public void setNumCrewMembers(int xNumCrewMembers) {
		this.numCrewMembers = xNumCrewMembers;
	}
	
	//Other method
	public String toString() {
		return "Ship name: "+this.getShipName()+"\nPassenger capacity: "+this.getPassengerCapacity()+"\nNumber of crew members: "+this.getNumCrewMembers();
	}
}