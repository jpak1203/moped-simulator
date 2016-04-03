package moped;

import java.util.Scanner;

public class Moped {
	public String position = "South";
	public String direction = "straight on";
	public int street = 10;
	public int avenue = 5;
	public int gas = 20;
	
	public String response() {
		Scanner user = new Scanner(System.in);
		System.out.println("What would you like to do?");
		String response = user.nextLine();
		return response;
	}
	
public void movement () {
	String response = response();
	
	while (gas > 0) {
		
		if (position.equals("South")) {
			if ((response.equalsIgnoreCase("go left")) && (direction.equals("straight on")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				avenue -= 1;
				gas -= 1;
				position = "East";
				direction = "straight on";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
				
			}
			else if ((response.equalsIgnoreCase("go right")) && (direction.equals("straight on")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				avenue +=1;
				gas -= 1;
				position = "West";
				direction = "straight on";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if ((response.equalsIgnoreCase("go left")) && (direction.equals("back up")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				avenue -= 1;
				gas -= 1;
				position = "West";
				direction = "back up";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if ((response.equalsIgnoreCase("go right")) && (direction.equals("back up")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				avenue += 1;
				gas -= 1;
				position = "East";
				direction = "back up";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}	
			else if (response.equalsIgnoreCase("straight on") && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				street -= 1;
				gas-= 1;
				position = "South";
				direction = "straight on";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if (response.equalsIgnoreCase("back up") && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				street += 1;
				gas -= 1;
				position = "South";
				direction = "back up";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if (response.equalsIgnoreCase("fill 'er up")) {
				gas = 20;
				System.out.println("Gas is back to 20/20");
				response = response();
			}
			else if (response.equalsIgnoreCase("how we doin?")) {
				System.out.println("Gas: " + gas + "/20 gallons");
				response = response();
			}
			else if (response.equalsIgnoreCase("park")) {
				System.out.println("You have parked on " + street + " St. " + avenue + " Ave.");
				break;
			}	
			else if (response.equalsIgnoreCase("help")) {
				System.out.println("Possbile actions are:\n'go left',\n'go right',\n'straight on',\n'back up',\n'how we doin?',\n'fill 'er up',\n'park',\n'go to Petite Abeille'");
				response = response();
			}	
			else if (response.equalsIgnoreCase("go to Petite abeille")) {
				if ((street < 17) && (avenue < 6)) {
					while (street != 17) {
						street += 1;
						gas -= 1;
						position  = "North";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue += 1;
						gas -= 1;
						position = "West";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else if ((street < 17) && (avenue > 6)) {
					while (street != 17) {
						street += 1;
						gas -= 1;
						position = "North";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue -= 1;
						gas -= 1;
						position = "East";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else if ((street > 17) && (avenue < 6)) {
					while (street != 17) {
						street -= 1;
						gas -= 1;
						position = "South";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}	
					}	
					while (avenue != 6) {
						avenue += 1;
						gas -= 1;
						position = "West";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}	
					response = response();
				}	
			
				else if ((street > 17) && (avenue > 6)) {
					while (street != 17) {
						street -= 1;
						gas -= 1;
						position = "South";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue -= 1;
						gas -= 1;
						position = "East";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else {
					System.out.println("Sorry you do not have the gas for that trip");
					response = response();
				}
			}
			else {
				response = response();
			}
		}
		if (position == "East") {
			if ((response.equalsIgnoreCase("go left")) && (direction.equals("straight on")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				street += 1;
				gas -= 1;
				position = "North";
				direction = "straight on";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if ((response.equalsIgnoreCase("go right")) && (direction.equals("straight on")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				street -=1;
				gas -= 1;
				position = "South";
				direction = "straight on";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if ((response.equalsIgnoreCase("go left")) && (direction.equals("back up")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				street += 1;
				gas -= 1;
				position = "South";
				direction = "back up";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if ((response.equalsIgnoreCase("go right")) && (direction.equals("back up")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				street -= 1;
				gas -= 1;
				position = "North";
				direction = "back up";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if (response.equalsIgnoreCase("straight on") && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				avenue -= 1;
				gas-= 1;
				position = "East";
				direction = "straight on";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if (response.equalsIgnoreCase("back up") && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				avenue += 1;
				gas -= 1;
				position = "East";
				direction = "back up";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if (response.equalsIgnoreCase("fill 'er up")) {
				gas = 20;
				System.out.println("Gas is back to 20/20");
				response = response();
			}
			else if (response.equalsIgnoreCase("how we doin?")) {
				System.out.println("Gas: " + gas + "/20 gallons");
				response = response();
			}
			else if (response.equalsIgnoreCase("park")) {
				System.out.println("You have parked on " + street + " St. " + avenue + " Ave.");
				break;
			}
			else if (response.equalsIgnoreCase("help")) {
				System.out.println("Possbile actions are:\n'go left',\n'go right',\n'straight on',\n'back up',\n'how we doin?',\n'fill 'er up',\n'park',\n'go to Petite Abeille'");
				response = response();
			}
			else if (response.equalsIgnoreCase("go to Petite abeille")) {
				if ((street < 17) && (avenue < 6)) {
					while (street != 17) {
						street += 1;
						gas -= 1;
						position  = "North";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue += 1;
						gas -= 1;
						position = "West";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else if ((street < 17) && (avenue > 6)) {
					while (street != 17) {
						street += 1;
						gas -= 1;
						position = "North";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue -= 1;
						gas -= 1;
						position = "East";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else if ((street > 17) && (avenue < 6)) {
					while (street != 17) {
						street -= 1;
						gas -= 1;
						position = "South";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue += 1;
						gas -= 1;
						position = "West";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else if ((street > 17) && (avenue > 6)) {
					while (street != 17) {
						street -= 1;
						gas -= 1;
						position = "South";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue -= 1;
						gas -= 1;
						position = "East";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else {
					System.out.println("Sorry you do not have the gas for that trip");
					response = response();
				}
			}
			else {
				response = response();
			}
		}

		if (position == "North") {
			if ((response.equalsIgnoreCase("go left")) && (direction.equals("straight on")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				avenue += 1;
				gas -= 1;
				position = "West";
				direction = "straight on";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if ((response.equalsIgnoreCase("go right")) && (direction.equals("straight on")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				avenue -=1;
				gas -= 1;
				position = "East";
				direction = "straight on";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if ((response.equalsIgnoreCase("go left")) && (direction.equals("back up")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				avenue += 1;
				gas -= 1;
				position = "East";
				direction = "back up";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if ((response.equalsIgnoreCase("go right")) && (direction.equals("back up")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				avenue -= 1;
				gas -= 1;
				position = "West";
				direction = "back up";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if (response.equalsIgnoreCase("straight on") && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				street += 1;
				gas-= 1;
				position = "North";
				direction = "straight on";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if (response.equalsIgnoreCase("back up") && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				street -= 1;
				gas -= 1;
				position = "North";
				direction = "back up";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if (response.equalsIgnoreCase("fill 'er up")) {
				gas = 20;
				System.out.println("Gas is back to 20/20");
				response = response();
			}
			else if (response.equalsIgnoreCase("how we doin?")) {
				System.out.println("Gas: " + gas + "/20 gallons");
				response = response();
			}
			else if (response.equalsIgnoreCase("park")) {
				System.out.println("You have parked on " + street + " St. " + avenue + " Ave.");
				break;
			}
			else if (response.equalsIgnoreCase("help")) {
				System.out.println("Possbile actions are:\n'go left',\n'go right',\n'straight on',\n'back up',\n'how we doin?',\n'fill 'er up',\n'park',\n'go to Petite Abeille'");
				response = response();
			}
			else if (response.equalsIgnoreCase("go to Petite abeille")) {
				if ((street < 17) && (avenue < 6)) {
					while (street != 17) {
						street += 1;
						gas -= 1;
						position  = "North";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue += 1;
						gas -= 1;
						position = "West";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else if ((street < 17) && (avenue > 6)) {
					while (street != 17) {
						street += 1;
						gas -= 1;
						position = "North";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue -= 1;
						gas -= 1;
						position = "East";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else if ((street > 17) && (avenue < 6)) {
					while (street != 17) {
						street -= 1;
						gas -= 1;
						position = "South";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue += 1;
						gas -= 1;
						position = "West";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else if ((street > 17) && (avenue > 6)) {
					while (street != 17) {
						street -= 1;
						gas -= 1;
						position = "South";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue -= 1;
						gas -= 1;
						position = "East";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else {
					System.out.println("Sorry you do not have the gas for that trip");
					response = response();
				}
			}
			else {
				response = response();
			}
		}
		
		if (position == "West") {
			if ((response.equalsIgnoreCase("go left")) && (direction.equals("straight on")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				street -= 1;
				gas -= 1;
				position = "South";
				direction = "straight on";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if ((response.equalsIgnoreCase("go right")) && (direction.equals("straight on")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				street +=1;
				gas -= 1;
				position = "North";
				direction = "straight on";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if ((response.equalsIgnoreCase("go left")) && (direction.equals("back up")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				street -= 1;
				gas -= 1;
				position = "North";
				direction = "back up";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if ((response.equalsIgnoreCase("go right")) && (direction.equals("back up")) && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				street += 1;
				gas -= 1;
				position = "South";
				direction = "back up";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if (response.equalsIgnoreCase("straight on") && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				avenue += 1;
				gas-= 1;
				position = "West";
				direction = "straight on";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if (response.equalsIgnoreCase("back up") && (avenue <= 10) && (avenue >= 1) && (street <= 200) && (street >= 1)) {
				avenue -= 1;
				gas -= 1;
				position = "West";
				direction = "back up";
				System.out.println("You are on " + street + " St. " + avenue + " Ave.");
				if (gas == 0) {
					System.out.println("You are out of gas!");
					break;
				}
				System.out.println("You have " + gas + "/20 gallons remaining");
				if (street == 79 && avenue == 8) {
					System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
				}
				if (street == 74 && avenue == 1) {
					System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
				}
				if (street == 12 && avenue == 4) {
					System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
				}
				if (street == 3 && avenue == 6) {
					System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
				}
				response = response();
			}
			else if (response.equalsIgnoreCase("fill 'er up")) {
				gas = 20;
				System.out.println("Gas is back to 20/20");
				response = response();
			}
			else if (response.equalsIgnoreCase("how we doin?")) {
				System.out.println("Gas: " + gas + "/20 gallons");
				response = response();
			}
			else if (response.equalsIgnoreCase("park")) {
				System.out.println("You have parked on " + street + " St. " + avenue + " Ave.");
				break;
			}
			else if (response.equalsIgnoreCase("help")) {
				System.out.println("Possbile actions are:\n'go left',\n'go right',\n'straight on',\n'back up',\n'how we doin?',\n'fill 'er up',\n'park',\n'go to Petite Abeille'");
				response = response();
			}
			else if (response.equalsIgnoreCase("go to Petite abeille")) {
				if ((street < 17) && (avenue < 6)) {
					while (street != 17) {
						street += 1;
						gas -= 1;
						position  = "North";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue += 1;
						gas -= 1;
						position = "West";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else if ((street < 17) && (avenue > 6)) {
					while (street != 17) {
						street += 1;
						gas -= 1;
						position = "North";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue -= 1;
						gas -= 1;
						position = "East";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else if ((street > 17) && (avenue < 6)) {
					while (street != 17) {
						street -= 1;
						gas -= 1;
						position = "South";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue += 1;
						gas -= 1;
						position = "West";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else if ((street > 17) && (avenue > 6)) {
					while (street != 17) {
						street -= 1;
						gas -= 1;
						position = "South";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					while (avenue != 6) {
						avenue -= 1;
						gas -= 1;
						position = "East";
						direction = "straight on";
						System.out.println("You are on " + street + " St. " + avenue + " Ave.");
						if (street == 79 && avenue == 8) {
							System.out.println("The American Museum of Natural History! \n Explore various exhibits on our history!");
						}
						if (street == 74 && avenue == 1) {
							System.out.println("Memorial Sloan Kettering Cancer Center! \n 'It's time to treat how the world treats cancer.'");
						}
						if (street == 12 && avenue == 4) {
							System.out.println("The Strand Bookshop! \n 'Home to 18 miles of books.'");
						}
						if (street == 3 && avenue == 6) {
							System.out.println("Fay Da Bakery! \n Enjoy our delicious pastries and drinks.");
						}
						if (gas <= 0) {
							System.out.println("You are out of gas!");
							break;
						}
					}
					response = response();
				}
				else {
					System.out.println("Sorry you do not have the gas for that trip");
					response = response();
				}
			}
			else {
				response = response();
			}
		}
	}
}

}