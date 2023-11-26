package saveourplanet;

import static saveourplanet.GameManager.scanner;

/**
 *  to hold long strings
 */
public class StringUtil {

	public static final String introductionMessage = "Welcome to Save Our Planet:\n" + "Introduction:\n"
			+ "Our planet is under threat due to climate change. "
			+ "It is your mission to reduce the planets carbon emissions.\n"
			+ "You are ready to travel around the world and build up the already existing "
			+ "economy in an environmentally sustainable way.\n"
			+ "Through this text based board game you and your fellow "
			+ "influencers will start from the UN (United Nations).\n"
			+ "You will take turns to move around the world "
			+ "where your actions will have an impact on your carbon footprint.\n"
			+ "The winner of this game will be the influencer who reduces their "
			+ "carbon footprint to zero or has the lowest balance at the end of the game.\n";

	public static final String instructionsSettingUpTheGame = "Setting up the game\n" + "\n"
			+ "The game allows for 2-4 players (inclusive).\n" + "The game is turn based.\n"
			+ "The game length maximium number of turns is fixed at 10, 20 or 30 turns.\n"
			+ "Player names should be unique with no duplicates.\n"
			+ "Player names will have at least one character and a maximium of 16 characters.\n" + "\n";

	public static final String instructionsPlayingTheGame = "Playing the Game\n" + "\n"
			+ "Save Our Planet is a turn based board game which the players play in sequential turns.\n"
			+ "The board will display the current state of the game at the beginning of the turn.\n"
			+ "The current player will throw two virtual six sided dice to move around the board.\n"
			+ "All players will start the game at the United Nations tile.\n" + "\n"
			+ "The game system will tell the current player where they have landed and the current\n"
			+ "obligations or opportunities available to them in a list.\n"
			+ "The Game will notify the player when resources change after each action.\n" + "\n"
			+ "This game uses the proxy 'carbon footprint' to reflect and measure the impact of greenhouse gas emissions on the planet.\n"
			+ "All players will start the game with a 1500 carbon footprint.\n" + "\n"
			+ "The winner of the game is determined by:\n"
			+ "The first player to reduce their carbon footprint balance to zero, thereby saving the planet, or\n"
			+ "the player with the lowest carbon footprint when the game reaches the maximium turn limit, or\n"
			+ "the player with the lowest carbon footprint when the players choose to quit the game early.\n" + "\n";

	public static final String instructionsTheBoardLayout = "The Board\n" + "\n"
			+ "The board consists of 18 tiles layed out in a loop.\n"
			+ "10 tiles on the board are locations around the world, grouped into fields linked by a common theme.\n"
			+ "Two fields consisting of two tiles and another two fields consisting of three tiles.\n"
			+ "Agricultural Tiles = 2 & 4 (cheapest field)\n" + "Energy Tiles = 6, 7 & 9\n"
			+ "Transport Tiles = 11 & 13 (most expensive field)\n" + "Environment Tiles = 15,17 & 18\n"
			+ "If a player owns all the tiles within a field they can upgrade the tile.\n"
			+ "Note: They do not have to be on the tile to upgrade it.\n"
			+ "A player can upgrade a tile with 3 minor improvements followed by 1 further major improvement.\n" + "\n";

	public static final String instructionsTheBoardTiles = "\n" + "1. United Nations\n"
			+ "The current players carbon footprint will increase by 200 on passing or landing on Start tile.\n" + "\n"
			+ "2. California: Vertical Agriculture (Agricultural)\n" + "Purchase: price 60, pay to use 2\n"
			+ "Upgrade1: price 50, pay to use 10\n" + "Upgrade2: price 50, pay to use 30\n"
			+ "Upgrade3: price 50, pay to use 90\n" + "Major4: price 50, pay to use 160\n" + "\n"
			+ "3. Coal Mine (Penalty Card)\n"
			+ "Current player lands on a tile Penalty Card which then triggers a random/ fixed negative event.\n"
			+ "\n" + "4. Texas: Soil Research (Agricultural)\n" + "Purchase: price 60, pay to use 4\n"
			+ "Upgrade1: price 50, pay to use 20\n" + "Upgrade2: price 50, pay to use 60\n"
			+ "Upgrade3: price 50, pay to use 180\n" + "Major4: price 50, pay to use 320\n" + "\n"
			+ "5. Jail/ Just Visiting - A shared tile.\n"
			+ "In Jail: The player has two turns to throw a double to escape jail.\n"
			+ "If they are unsuccessful, the player will receive a 200 carbon footprint fine.\n"
			+ "Just Visiting: This tile will do nothing when you land on it.\n" + "\n" + "6. Spain: Solar (Energy)\n"
			+ "Purchase: price 180 pay to use 14\n" + "Upgrade1: price 100, pay to use 70\n"
			+ "Upgrade2: price 100, pay to use 200\n" + "Upgrade3: price 100, pay to use 550\n"
			+ "Major4: price 100, pay to use 750\n" + "\n" + "7. Sweden: Hydro (Energy)\n"
			+ "Purchase: price 180 pay to use 14\n" + "Upgrade1: price 100, pay to use 70\n"
			+ "Upgrade2: price 100, pay to use 200\n" + "Upgrade3: price 100, pay to use 550\n"
			+ "Major4: price 100, pay to use 750\n" + "\n" + "8. Chance\n"
			+ "The current player lands on a Chance tile, which then triggers a random event.\n" + "\n"
			+ "9. UK: Wind (Energy)\n" + "Purchase: price 200 pay to use 16\n" + "Upgrade1: price 100, pay to use 80\n"
			+ "Upgrade2: price 100, pay to use 220\n" + "Upgrade3: price 100, pay to use 600\n"
			+ "Major4: price 100, pay to use 800\n" + "\n" + "10. Recycle\n"
			+ "Recycle gives player the option to give 10% of their carbon footprint to selected player of choice.\n"
			+ "\n" + "11. China: Rail (Transport)\n" + "Purchase: price 350, pay to use 35\n"
			+ "Upgrade1: price 200, pay to use 175\n" + "Upgrade2: price 200, pay to use 500\n"
			+ "Upgrade3: price 200, pay to use 1100\n" + "Major4: price 200, pay to use 1300\n" + "\n"
			+ "12. Oil spill (Penalty Card)\n"
			+ "Current player lands on a tile Penalty Card which then triggers a random/ fixed negative event.\n"
			+ "\n" + "13. India: Electric Vehicles (Transport)\n" + "Purchase: price 400, pay to use 50\n"
			+ "Upgrade1: price 200, pay to use 200\n" + "Upgrade2: price 200, pay to use 600\n"
			+ "Upgrade3: price 200, pay to use 1400\n" + "Major4: price 200, pay to use 1700\n" + "\n"
			+ "14. Go to Jail\n" + "The player will move to the In Jail tile.\n"
			+ "Player lands on tile and is sent backwards on board directly to In Jail tile.\n"
			+ "The player does not pass the United Nations (start square) and does not collect 200 carbon footprint.\n"
			+ "\n" + "15. Kenya: Wildlife Preservation (Environmental)\n" + "Purchase: price 260, pay to use 35\n"
			+ "Upgrade1: price 150, pay to use 110\n" + "Upgrade2: price 150, pay to use 330\n"
			+ "Upgrade3: price 150, pay to use 800\n" + "Major4: price 150, pay to use 975\n" + "\n" + "16. Chance\n"
			+ "The current player lands on a Chance tile, which then triggers a random event.\n" + "\n"
			+ "17. Congo: Forest Planting (Environmental)\n" + "Purchase: price 260, pay to use 35\n"
			+ "Upgrade1: price 150, pay to use 110\n" + "Upgrade2: price 150, pay to use 330\n"
			+ "Upgrade3: price 150, pay to use 800\n" + "Major4: price 150, pay to use 975\n" + "\n"
			+ "18. Egypt River Cleanup (Environmental)\n" + "Purchase: price 280, pay to use 24\n"
			+ "Upgrade1: price 150, pay to use 120\n" + "Upgrade2: price 150, pay to use 360\n"
			+ "Upgrade3: price 150, pay to use 850\n" + "Major4: price 150, pay to use 1025\n" + "\n";



	public static void instructionsMenu() {
		System.out.println("Game Instructions - Save Our Planet\n" + "\n"
				+ "Climate change the greatest threat the world has ever faced, UN expert warns.\n"
				+ "This game seeks to educate players on actions that individuals, corporations and\n"
				+ "governments are required to take to drastically reduce greenhouse gas emissions.\n");

		int inputInst;
		do {
			System.out.println("What would you like to learn about:");
			System.out.println("1. Setting up the game.");
			System.out.println("2. Playing the game");
			System.out.println("3. The Board Layout");
			System.out.println("4. The Board Tiles");
			System.out.println("5. Return to Game");
			System.out.println("Enter option 1,2,3 or 4 to proceed");

			inputInst = scanner.nextInt();

			switch (inputInst) {

				case 1:
					System.out.println(instructionsSettingUpTheGame);
					break;
				case 2:
					System.out.println(instructionsPlayingTheGame);
					break;
				case 3:
					System.out.println(instructionsTheBoardLayout);
					break;
				case 4:
					System.out.println(instructionsTheBoardTiles);
					break;
				case 5:
					System.out.println("Returning to the game");
					break;
				default:
					System.out.println("Invalid option keyed, please try again");
			}
		} while (inputInst != 5);

	}

}
