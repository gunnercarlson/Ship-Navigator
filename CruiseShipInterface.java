//Gunner Carlson
public interface CruiseShipInterface extends ShipInterface{
	
	//List of methods
	public int getPassengerCapacity();
	public int getNumCrewMembers();
	public void setPassengerCapacity(int xPassengerCapacity);
	public void setNumCrewMembers(int xNumCrewMembers);
	public String toString();
}