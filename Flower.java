import java.util.Scanner;

public class Flower {
	Scanner scnr = new Scanner(System.in);
	
	
	//instance variables
	private int numOfPedals;
	private boolean isPoisonous;
	private String name;
	
	//constructors
	public Flower() {
		numOfPedals = 0;
		isPoisonous = false;
		name = "";
	}
	
	public Flower(int numOfPedals, String name) {
		this.numOfPedals = numOfPedals;
		this.name = name;
	}
	
	public Flower(int numOfPedals, String name, boolean isPoisonous) {
		this.numOfPedals = numOfPedals;
		this.name = name;
		this.isPoisonous = isPoisonous;
	}
	
	//getter methods
	public int getNumOfPedals() {
		return numOfPedals;
	}
	
	public boolean checkIfPoisonous() {
		return isPoisonous;
	}
	
	public String getName() {
		return name;
	}
	
	//setter methods
	public void setNumOfPedals(int newNumPedals) {
		numOfPedals = newNumPedals;
	}
	
	public void setPoisonStatus(boolean poisonStatus) {
		isPoisonous = poisonStatus;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	//method that returns a boolean
	public boolean poisonExperiment() {
		System.out.println("After your experiment, did you discover a previously unknown poisonous quality to this flower? (y/n): ");
		String input = scnr.nextLine();
		//convert to char to save memory
		char response = input.charAt(0);
		
		switch(response) {
		case 'y':
			isPoisonous = true;
			System.out.println("Your new findings about this flower have been documented.");
			break;
		case 'n':
			System.out.println("Thank you for checking the safety of this flower.");
			break;
		default:
			System.out.println("Invalid response, try again.");
			poisonExperiment();
			break;
		}
		
		return isPoisonous;
	}
	
	//method that returns a String
	public String toString() {
		
		String poisonDialogue;
		if(isPoisonous == true) {
			poisonDialogue = "Yes";
		}
		else {
			poisonDialogue = "No";
		}
		
		String result = "";
		result += "Flower Name: " + name + "\nNumber of Pedals Observed: " + numOfPedals + "\nIs It Poisonous? " + poisonDialogue + "\n";
		
		return result;
	}
}//end of Flower class
