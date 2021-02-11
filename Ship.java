//Gunner Carlson
public class Ship implements ShipInterface{
	
	//Instance variables
	private String shipName;
	private String launchDate;
	
	//Default constructor
	public Ship() {
		this.shipName = "Titanic";
		this.launchDate = "05/31/1911";
	}
	
	//Parameterized constructor
	public Ship(String xShipName, String xLaunchDate) {
		this.setShipName(xShipName);
		this.setLaunchDate(xLaunchDate);
	}
	
	//Accessors and mutators
	public String getShipName() {
		return this.shipName;
	}
	public String getLaunchDate() {
		return this.launchDate;
	}
	public void setShipName(String xShipName) {
		this.shipName = xShipName;
	}
	public void setLaunchDate(String xLaunchDate) {		
		String year = xLaunchDate.substring(xLaunchDate.length()-4);
		int launchYear = Integer.parseInt(year);
		if(launchYear >= 1990 && launchYear <= 2019) {
			this.launchDate = xLaunchDate;
		}else {
			System.out.println("Date input is not accepted!");
		}
	}
	
	//Other method
	public String toString() {
		return "Ship's name: "+this.getShipName()+"\nLaunch Date: "+this.getLaunchDate();
	}
}