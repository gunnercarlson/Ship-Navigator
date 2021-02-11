//Gunner Carlson
public interface CargoShipInterface extends ShipInterface{
	
	//List of methods
	public double getTonnage();
	public int getMaxSpeed();
	public void setTonnage(double xTonnage);
	public void setMaxSpeed(int xMaxSpeed);
	public String toString();
}