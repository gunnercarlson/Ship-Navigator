//Gunner Carlson
import java.util.Scanner;
public class ShipNavigator {

	public static void main(String[] args) {
		
		CruiseShip cruise1 = new CruiseShip();
		CruiseShip cruise2 = new CruiseShip();
		CargoShip cargo1 = new CargoShip();
		
		Scanner key = new Scanner(System.in);
		System.out.println("Welcome to the ShipNavigator!\n");
		System.out.println("Enter the name of the first cruise ship: ");
		cruise1.setShipName(key.nextLine());
		System.out.println("Enter its launch date (mm/dd/yyyy): ");
		cruise1.setLaunchDate(key.nextLine());
		System.out.println("Enter the ship's passenger capacity: ");
		cruise1.setPassengerCapacity(key.nextInt());
		System.out.println("How many crew members are on this ship?");
		cruise1.setNumCrewMembers(key.nextInt());
		
		System.out.println("\nCreating a cruise ship...");
		System.out.println("Printing the ship's details:\n\n"+cruise1.toString());
		
		key.nextLine();
		System.out.println("\nEnter the name of the second cruise ship:");
		cruise2.setShipName(key.nextLine());
		System.out.println("Enter its launch date (mm/dd/yyyy): ");
		cruise2.setLaunchDate(key.nextLine());
		System.out.println("Enter the ship's passenger capacity: ");
		cruise2.setPassengerCapacity(key.nextInt());
		System.out.println("How many crew members are on this ship?");
		cruise2.setNumCrewMembers(key.nextInt());
		
		System.out.println("\nCreating the second cruise ship...");
		System.out.println("Printing the ship's details:\n\n"+cruise2.toString());
		
		key.nextLine();
		System.out.println("\nEnter the name of the cargo ship:");
		cargo1.setShipName(key.nextLine());
		System.out.println("Enter its launch date (mm/dd/yyyy): ");
		cargo1.setLaunchDate(key.nextLine());
		System.out.println("Enter the ship's tonnage (DWT): ");
		cargo1.setTonnage(key.nextDouble());
		System.out.println("Enter the maximum speed of the ship (MPH): ");
		cargo1.setMaxSpeed(key.nextInt());
		
		System.out.println("\nCreating the cargo ship...");
		System.out.println("Printing the ship's details:\n\n"+cargo1.toString());

		System.out.println("Thank you!");
	}
}