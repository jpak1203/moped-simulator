package moped;

public class TestDrive {

	public static void main(String[] args) {
		System.out.println("Thanks for jumping on the moped.\nWe're currently parked outside Dr. Rossinsky DDS's office at\n10th St. and 5th Ave.\nMay I say you look dashing.\nSay 'help' anytime you are in need of assistance\nor if you would like to see a list of the comamnds.");
		System.out.println("-------------------------------------");
		Moped myMoped = new Moped();
		myMoped.movement();
	}
}
