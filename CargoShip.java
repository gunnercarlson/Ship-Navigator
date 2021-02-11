//Gunner Carlson
public class CargoShip extends Ship implements CargoShipInterface{
	
	//Instance variables
	private double tonnage;
	private int maxSpeed;
	
	//Default constructor
	public CargoShip() {
		super();
		this.tonnage = 10;
		this.maxSpeed = 200;
	}
	
	//Paramaeterized constructor
	public CargoShip(String xShipName, String xLaunchDate, double xTonnage, int xMaxSpeed) {
		super(xShipName, xLaunchDate);
		this.setTonnage(xTonnage);
		this.setMaxSpeed(xMaxSpeed);
	}
	
	//Accessors and mutators
	public double getTonnage() {
		return this.tonnage;
	}
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	public void setTonnage(double xTonnage) {
		this.tonnage = xTonnage;
	}
	public void setMaxSpeed(int xMaxSpeed) {
		this.maxSpeed = xMaxSpeed;
	}
	
	//Other method
	public String toString() {
		return "Ship's name: "+this.getShipName()+"\nTonnage: "+this.getTonnage()+"\nMaximum speed: "+this.getMaxSpeed();
	}
}