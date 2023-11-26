package saveourplanet;

import java.util.*;

/**
 * Group 7 -Steven Millis, Farhad Panahi, Christina Marie Rankin, Jonathan
 * Williamson-Deronja, Gowthami Kumaresn
 * 
 * The Board class to create and manage the Game Board and related functions.
 */
public class Board {
	public static List<Square> squareDisplayer = new ArrayList<>();// square details
	public static List<PropertySquare> propertySquare = new ArrayList<>();// property square

	public static Map<Integer, Square> squares = new HashMap<>();// square details {

	// default constructor
	public Board() {
		squareData();
	}

	private void squareData() {

		// Start Square
		StartSquare s1 = new StartSquare("START SQUARE, UN Headquarters : New York", 1);

		// PropertySquares
		// squareName squarePosition propertyDescription
		// purchaseCost minorDevelopmentCost majorDevelopmentCost rent 1,2,3,4,5

		/*
		 * Purchase: price 60, pay to use 2 Upgrade1: price 50, pay to use 10 Upgrade2:
		 * price 50, pay to use 30 Upgrade3: price 50, pay to use 90 Major4: price 50,
		 * pay to use 160
		 */
		PropertySquare s2 = new PropertySquare(
				"California: Vertical Agriculture", 2, "Dream of Californication ..."
						+ "Revolutionise food production by supporting " + "Controlled Environment Agriculture .",
				60, 50, 50, 2, 10, 30, 90, 160);

		/*
		 * Purchase: price 60, pay to use 4 Upgrade1: price 50, pay to use 20 Upgrade2:
		 * price 50, pay to use 60 Upgrade3: price 50, pay to use 180 Major4: price 50,
		 * pay to use 320
		 */

		PropertySquare s4 = new PropertySquare("Texas: Soil Research", 4,
				"Green Fingers ..." + "Support sustainable agriculture through " + "soil regeneration projects", 60, 50,
				50, 4, 20, 60, 180, 320);
		/*
		 * Purchase: price 180 pay to use 14 Upgrade1: price 100, pay to use 70
		 * Upgrade2: price 100, pay to use 200 Upgrade3: price 100, pay to use 550
		 * Major4: price 100, pay to use 750
		 */

		PropertySquare s6 = new PropertySquare(
				"Spain: Solar Farm", 6, "Here comes the sun ..." + "Promote renewable energy "
						+ "usage in Spain through " + "the development of solar farms.",
				180, 100, 100, 14, 70, 200, 550, 750);

		/*
		 * Purchase: price 180 pay to use 14 Upgrade1: price 100, pay to use 70
		 * Upgrade2: price 100, pay to use 200 Upgrade3: price 100, pay to use 550
		 * Major4: price 100, pay to use 750
		 */

		PropertySquare s7 = new PropertySquare(
				"Sweden: Hydroelectricity", 7, "The Way of Water ..." + "Promote renewable energy "
						+ "usage in Sweden through the d" + "Development of hydroelectric dams.",
				180, 100, 100, 14, 70, 200, 550, 750);

		/*
		 * 9. UK: Wind (Energy) Purchase: price 200 pay to use 16 Upgrade1: price 100,
		 * pay to use 80 Upgrade2: price 100, pay to use 220 Upgrade3: price 100, pay to
		 * use 600 Major4: price 100, pay to use 800
		 */

		PropertySquare s9 = new PropertySquare("UK: Wind Farm", 9, "Wild is the wind!..." + "Promote renewable "
				+ "energy usage in the UK " + "through the development of wind farms.", 200, 100, 100, 16, 80, 220, 600,
				800);

		/*
		 * Purchase: price 350, pay to use 35 Upgrade1: price 200, pay to use 175
		 * Upgrade2: price 200, pay to use 500 Upgrade3: price 200, pay to use 1100
		 * Major4: price 200, pay to use 1300
		 */

		PropertySquare s11 = new PropertySquare(
				"China: Rail Infrastructure", 11, "Choo Choo!\n" + "\n" + "Support Chinese rail infrastructure"
						+ " to promote cleaneer, greener" + ", public travel.",
				350, 200, 200, 35, 175, 500, 1110, 1300);

		/*
		 * Purchase: price 400, pay to use 50 Upgrade1: price 200, pay to use 200
		 * Upgrade2: price 200, pay to use 600 Upgrade3: price 200, pay to use 1400
		 * Major4: price 200, pay to use 1700
		 */

		PropertySquare s13 = new PropertySquare("India: Electric Vehicles", 13,
				"Electrification.\n" + "\n" + "Support India's growing Electric " + "Vehicle production, "
						+ "to promote cleaner travel," + " one quarter mile at a time.",
				400, 200, 200, 50, 200, 600, 1400, 1700);

		/*
		 * Purchase: price 260, pay to use 35 Upgrade1: price 150, pay to use 110
		 * Upgrade2: price 150, pay to use 330 Upgrade3: price 150, pay to use 800
		 * Major4: price 150, pay to use 975
		 */

		PropertySquare s15 = new PropertySquare(
				"Kenya: Wildlife Preservation", 15, "Hakuna Matata!\n" + "\n" + "Help preserve and "
						+ "promote wildlife in Kenya " + "through environmental initiatives.",
				260, 150, 150, 35, 110, 330, 800, 975);

		/*
		 * SAME STATS AS ABOVE
		 */

		PropertySquare s17 = new PropertySquare("Congo: Forest Preservation", 17, "Breath Happy!\n" + "Help support "
				+ "sustainable forestry " + "through education and " + "communal responsibility.", 260, 150, 150, 35,
				110, 330, 800, 975);
		/*
		 * Purchase: price 280, pay to use 24 Upgrade1: price 150, pay to use 120
		 * Upgrade2: price 150, pay to use 360 Upgrade3: price 150, pay to use 850
		 * Major4: price 150, pay to use 1025
		 */

		PropertySquare s18 = new PropertySquare("Egypt: River Cleanup", 18,
				"Cleaning the Nile one kilo at a time !\n" + "Support efforts removing inorganic waste and "
						+ "pollution, to promote" + " the health of wellbeing " + "of both people and wildlife; ",
				280, 150, 150, 24, 120, 360, 850, 1025);

		// Penalty Square; name, position, cfPenalty

		PenaltySquare s3 = new PenaltySquare("Coal Mine", 3, 200);
		PenaltySquare s12 = new PenaltySquare("Oil Spill ", 12, 200);

		// Recylcing Square - name , pos ,desc, positive

		RecyclingSquare s10 = new RecyclingSquare("Recycling Square", 10,
				"Recycling plants help to reduce" + " carbon footprint" + " by not wasting reusable materials", -200);

		// squareName squarePosition positiveChanceDescription
		// negativeChanceDescription positiveEffect negativeEffect
		ChanceSquare s8 = new ChanceSquare("Chance Square", 8);

		ChanceSquare s16 = new ChanceSquare("Chance Square", 16);

		// Jail square Creation

		JailSquare s5 = new JailSquare("Jail", 5);

		// Go to Jail Creation -- method to be created

		GoToJailSquare s14 = new GoToJailSquare("Go to jail", 14);

		squareDisplayer.add(s1);
		squareDisplayer.add(s3);
		squareDisplayer.add(s5);
		squareDisplayer.add(s8);
		squareDisplayer.add(s10);
		squareDisplayer.add(s12);
		squareDisplayer.add(s14);
		squareDisplayer.add(s16);

		propertySquare.add(s2);
		propertySquare.add(s4);
		propertySquare.add(s6);
		propertySquare.add(s7);
		propertySquare.add(s9);
		propertySquare.add(s11);
		propertySquare.add(s13);
		propertySquare.add(s15);
		propertySquare.add(s17);
		propertySquare.add(s18);

		for (Square s : squareDisplayer) {
			squares.put(s.getSquarePosition(), s);
		}

		for (Square s : propertySquare) {
			squares.put(s.getSquarePosition(), s);
		}

	}

	// buyProperty functionality. to be implemented by Farhad.
	public static void buyProperty(PropertySquare square, Player player) {
		System.out.println("buying...");
		square.setPropertyOwner(player);
		player.setCarbonFootPrint(player.getCarbonFootPrint() + square.getPurchaseCost());
		player.ownsProperty = true;
		player.propertiesOwned.add(square);
		System.out.println("You have bought " + square.getSquareName() + " for " + square.getPurchaseCost());
		System.out.println("Your New carbon footprint is " + player.getCarbonFootPrint());
	}

	// pay rent functionality.
	public static void payRent(Player player) {
		String payer = player.getPlayerName();
		PropertySquare property = (PropertySquare) squares.get(player.getCurrentPosition());
		Player owner = property.getPropertyOwner();
		String reciever = owner.getPlayerName();
		int rent = 0;
		switch (property.getUpgradeStage()) {
		case 0:
			rent = property.getRentNoUpgrade();
			break;
		case 1:
			rent = property.getRentUpgrade1();
			break;
		case 2:
			rent = property.getRentUpgrade2();
			break;
		case 3:
			rent = property.getRentUpgrade3();
			break;
		case 4:
			rent = property.getRentUpgrade4();
			break;
		default:
			break;
		}
		if (!payer.equalsIgnoreCase(reciever)) {
			int payerCurrentCarbonfootPrint = player.getCarbonFootPrint();
			int ownerCurrentCarbonfootPrint = owner.getCarbonFootPrint();

			player.setCarbonFootPrint(payerCurrentCarbonfootPrint + rent);
			owner.setCarbonFootPrint(ownerCurrentCarbonfootPrint - rent);
			System.out.println("Rent paid.... your carbonfootprint will increase by " + rent + "");
			System.out
					.println(player.getPlayerName() + " , your New carbonfootprint is " + player.getCarbonFootPrint());
			System.out.println(owner.getPlayerName() + " , your New carbonfootprint is " + owner.getCarbonFootPrint());
		} else {
			System.out.println("You landed on your own place :)");
		}

	}

	// upgrade property functionality
	public void upgradeProperty(Player player) {

		int areaToDevelop = 0;
		String decision;
		int newUpgradeStage = 0;

		boolean upgradeNow = upgradeValidation(player);

		if (upgradeNow) {
			System.out.println(player.getPlayerName() + " Do you want to develop your owned areas? (y/n)");
			decision = GameManager.scanner.next();
			GameManager.scanner.nextLine();
			if (decision.equalsIgnoreCase("y") || decision.equalsIgnoreCase("yes")) {
				do {

					System.out.println("Which square index do you want to develop?");
					areaToDevelop = GameManager.scanner.nextInt();
					PropertySquare ps = (PropertySquare) squares.get(areaToDevelop);

					if (ps.getUpgradeStage() < 4) {

						ps.setUpgradeStage(ps.getUpgradeStage() + 1);
						newUpgradeStage = ps.getUpgradeStage();

						if (newUpgradeStage <= 3) {
							System.out.println(
									"You choose " + ps.getSquareName() + " it costs " + ps.getMinorDevelopmentCost()
											+ " for a stage " + newUpgradeStage + " minor development.");
							System.out.println("Are you sure you want to develop? (y/n)");

							decision = GameManager.scanner.next();
							GameManager.scanner.nextLine();
							if (decision.equalsIgnoreCase("y") || decision.equalsIgnoreCase("yes")) {
								int currentCarbonfootPrint = player.getCarbonFootPrint();
								int newCarbonfootPrint = currentCarbonfootPrint + ps.getMinorDevelopmentCost();

								player.setCarbonFootPrint(newCarbonfootPrint);

								System.out.println(
										player.getPlayerName() + " Your asset is now at stage " + ps.getUpgradeStage());

								System.out.println(player.getPlayerName() + " Your current carbon foot print is "
										+ player.getCarbonFootPrint());

							}

						} else if (newUpgradeStage == 4) {
							System.out.println(
									"You choose " + ps.getSquareName() + " it costs " + ps.getMinorDevelopmentCost()
											+ " for a stage " + newUpgradeStage + " minor development.");
							System.out.println("Are you sure you want to develop? (y/n)");

							decision = GameManager.scanner.next();
							GameManager.scanner.nextLine();

							if (decision.equalsIgnoreCase("y") || decision.equalsIgnoreCase("yes")) {
								int currentCarbonfootPrint = player.getCarbonFootPrint();
								int newCarbonfootPrint = currentCarbonfootPrint + ps.getMajorDevelopmentCost();

								player.setCarbonFootPrint(newCarbonfootPrint);
								System.out.println(
										player.getPlayerName() + " Your asset is now at stage " + ps.getUpgradeStage());

								System.out.println(player.getPlayerName() + " Your current carbon foot print is "
										+ player.getCarbonFootPrint());
							}

						}

					} else if (ps.getUpgradeStage() == 4) {
						System.out.println("This area is at max level, please select another ... ");

					} else {
						System.out.println("This is not your Property, Kindly select your Property");
					}

				} while (newUpgradeStage == 0);

			} else {
				System.out.println("\n" + player.getPlayerName() + " Doesn't want to develop in this turn");
			}

		} else {
			System.out.println("Sorry, unable to upgrade your property");
		}

	}

	// upgrade validation
	private boolean upgradeValidation(Player player) {
		boolean upgradeNow = false;

		if (player.ownsProperty) {
			if (player.propertiesOwned.contains(squares.get(2)) && player.propertiesOwned.contains(squares.get(4))) {
				upgradeNow = true;
				System.out.println("Now you can upgrade the Blue property ");
				player.displayOwnedProperties(2, 4, 0);

			}

			if (player.propertiesOwned.contains(squares.get(6)) && player.propertiesOwned.contains(squares.get(7))
					&& player.propertiesOwned.contains(squares.get(9))) {
				upgradeNow = true;
				System.out.println("Now you can upgrade the yellow property ");
				player.displayOwnedProperties(6, 7, 9);
			}
			if (player.propertiesOwned.contains(squares.get(11)) && player.propertiesOwned.contains(squares.get(13))) {
				upgradeNow = true;
				System.out.println("Now you can upgrade the orange property ");
				player.displayOwnedProperties(11, 13, 0);
			}
			if (player.propertiesOwned.contains(squares.get(15)) && player.propertiesOwned.contains(squares.get(17))
					&& player.propertiesOwned.contains(squares.get(18))) {
				upgradeNow = true;
				System.out.println("Now you can upgrade the green property ");
				player.displayOwnedProperties(15, 17, 18);
			}

		}

		return upgradeNow;

	}

}
