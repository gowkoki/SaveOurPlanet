package saveourplanet;

import static saveourplanet.ChanceSquare.chanceSquare;
import static saveourplanet.GoToJailSquare.jailMethod;
import static saveourplanet.JailSquare.justVisiting;
import static saveourplanet.PenaltySquare.penaltyImplementationCoalMine;
import static saveourplanet.PenaltySquare.penaltyImplementationOilSpill;
import static saveourplanet.StringUtil.introductionMessage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Group 7 -Steven Millis, Farhad Panahi, Christina Marie Rankin, Jonathan
 * Williamson-Deronja, Gowthami Kumaresn
 *
 */

public class GameManager {

	public static Scanner scanner;

	public static int gameLength = 0;

	public static final int BOARD_SIZE = 18;
	public static final int MIN_PLAYERS = 2;
	public static final int MAX_PLAYERS = 4;
	public static final int START_SQUARE_PASSING_TAX = 200;

	public static final int INITIAL_CARBON_FOOT_PRINT = 1500;

	public static List<Player> players = new ArrayList<>();// player details

	public static Board board = new Board();// Board

	public static void main(String[] args) {
		System.out.println(introductionMessage);
		startGame();
	}

	// this method starts the game and prompts the user to choose between
	// instructions, playing the game, or quitting and then calls the appropriate
	// method
	private static void startGame() {
		int input = 0;
		// boolean invalidInput = true;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				do {

					System.out.println("If you are you ready to begin the game, enter 1");
					System.out.println("If you would like more instructions, enter 2");
					System.out.println("If you would like to quit, enter 3");
					input = scanner.nextInt();
					scanner.nextLine();

					if (input < 1 || input > 3) {
						System.out.println("Invalid option, please try again");

					}

				} while (input < 1 || input > 3);
			} catch (InputMismatchException e) {
				System.out.println("Enter valid Input, please try again");
			}

			if (input == 1) {
				players = new ArrayList<>(); // resetting the player arraylist
				Board.squareDisplayer = new ArrayList<>(); // resetting the squareDisplayer
				boolean shouldContinue = playTheGame();
				if (shouldContinue) {
					continue;
				}
			} else if (input == 2) {
				StringUtil.instructionsMenu();
				continue;
			} else if (input == 3) {
				if (confirmQuit()) {
					scanner.close();
					return;
				}

			} else {
				// invalidInput = true;
			}

		}

	}

	// starts the game and calls functions to set up the game and take turns.
	private static boolean playTheGame() {

		gameSetup();
		takeTurn();
		displayEndGameLeaderboard();
		// we're done with the game, asking if they want to play again

		System.out.println("\nDo you wish to play again?  If yes, press y and enter.");
		System.out.println("To quit, enter any other key.");
		String answer = scanner.nextLine();
		if (answer.equalsIgnoreCase("y")) {
			System.out.println("Nice! Returning to main menu..."); // shall we play a game? :)
			return true;
		}
		return false;
	}

	private static void gameSetup() {
		System.out.println("Welcome to Save Our Planet");
		int playerCount = getPlayerCount();
		gameLength = getGameLength();
		ArrayList<String> playerNames = getPlayerNames(playerCount);
		Board board = new Board();
		playerData(playerNames);
		//

	} // end of game setup

	// creates Player objects and adds them to the players arraylist
	private static void playerData(ArrayList<String> playerNames) {
		for (int i = 0; i < playerNames.size(); i++) {
			Player player = new Player();
			player.setPlayerName(playerNames.get(i));
			player.setCurrentPosition(1);
			player.setCarbonFootPrint(INITIAL_CARBON_FOOT_PRINT);
			players.add(player);
		}
	}

	private static int getPlayerCount() {

		int playerCount = 0;
		do {
			System.out.println("Enter the number of players for this game (Minimium 2, Maximium 4)");
			try {
				playerCount = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("Invalid input. Please enter a number between 2 and 4 inclusive");
				scanner.nextLine();
				System.out.println();
				continue;
			}
			scanner.nextLine();
			System.out.println();
			if (playerCount < MIN_PLAYERS || playerCount > MAX_PLAYERS) {
				System.out.println("Invalid input. Please enter a number between 2 and 4 inclusive");
			}
		} while (playerCount < MIN_PLAYERS || playerCount > MAX_PLAYERS);
		return playerCount;

	}

	private static int getGameLength() {

		boolean sizeRangeCheck;

		int gameLength = 0;
		do {
			sizeRangeCheck = true;
			System.out.println("Enter the number of turns for this game, enter 10, 20 or 30");
			try {
				gameLength = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("Invalid input.");
				sizeRangeCheck = false;
			}
			scanner.nextLine();
			System.out.println();
			if (gameLength != 10 && gameLength != 20 && gameLength != 30 && gameLength != 1) {// TODO added for testing
																								// fast/end game, remove
																								// gameLength != 1 later
				sizeRangeCheck = false;
				System.out.println("You have entered an invalid number.");
			}
		} while (!sizeRangeCheck);
		return gameLength;

	}

	// gets the player names and checks for duplicates and invalid names from the
	// user.
	private static ArrayList<String> getPlayerNames(int playerCount) {
		ArrayList<String> playerNames = new ArrayList<>();
		for (int i = 1; i <= playerCount; i++) {

			boolean nameCheck = true;
			do {
				System.out.println("Enter name of player " + i + ": ");
				String name = scanner.nextLine();
				if (name == null || name == "" || name.length() < 1 || name.length() > 16) {
					nameCheck = false;
					System.out.println("Invalid name entered. Enter a name between 1 and 16 characters");
				} else if (playerNames.contains(name)) {
					nameCheck = false;
					System.out.println("Duplicate name entered. Enter another name between 1 and 16 characters");
				} else {
					nameCheck = true;
					playerNames.add(name);

				}
			} while (!nameCheck);

		}

		return playerNames;
	}

	/**
	 * Roll Dice
	 * 
	 * @return int[] value
	 */

	public static int[] rollDice() {
		int[] dice = new int[2];

		Random random = new Random();

		int die1 = random.nextInt(6) + 1;

		int die2 = random.nextInt(6) + 1;
		dice[0] = die1;
		dice[1] = die2;
		System.out.println("You have rolled " + die1 + " and " + die2 + " for a total of " + (die1 + die2) + " Moves");
		return dice;
	}

	/**
	 * Players each turn
	 */

	public static void takeTurn() {
		int turnCount = 1;
		boolean shouldQuit = false;
		do {
			for (Player player : players) {
				System.out.println("*****************************************");
				System.out.println("It is " + player.getPlayerName() + "'s turn");
				System.out.println("You are currently on square " + player.getCurrentPosition() + "\nYou are in "
						+ board.squares.get(player.getCurrentPosition()).getSquareName()
						+ "\nYour Carbon Footprint balance is " + player.getCarbonFootPrint());
				System.out.println("\n" + player.getPlayerName() + ", press any key to roll the dice");
				scanner.nextLine();//

				int[] dice = rollDice();
				int diceValue = dice[0] + dice[1];
				if (!player.isInJail) {

					player.updatePlayerPosition(diceValue);

					System.out.println(player);

					int playerPosition = player.getCurrentPosition();
					Square square = board.squares.get(playerPosition);
					square.displaySquareDetails();

					switch (playerPosition) {

					case 2:
					case 4:
					case 6:
					case 7:
					case 9:
					case 11:
					case 13:
					case 15:
					case 17:
					case 18:
						// property square
						propertyValidation(player);
						break;
					case 3:
						// penalty -- coal
						penaltyImplementationCoalMine(player);
						break;
					case 12:
						// penalty square -- oil
						penaltyImplementationOilSpill(player);
						break;
					case 5:
						// jail square
						justVisiting(player);
						break;
					case 8:
					case 16:
						chanceSquare(player);
						break;
					case 10:
						// recycle square
						recycleReward(player);
						break;
					case 14:
						// go to jail square
						jailMethod(player);
						break;

					default:
						break;
					}
				} else {
					// check if player conviction duration ended
					if (player.convictionDuration >= 2) {
						player.isInJail = false;
						System.out.println(player.getPlayerName() + "! You have served your sentence. "
								+ "Pay your fine and You are free to go. ");
						player.setCarbonFootPrint(player.getCarbonFootPrint() + 200);

						// check if player rolled doubles
					} else if (dice[0] == dice[1]) {
						player.isInJail = false;
						System.out.println("You are lucky and rolled doubles and are now free to move from next turn");

						// check if player wants to pay fine
//					}else {
//						System.out.println(player.getPlayerName() +"! Do you want to pay the fine? (y/other)");
//						String answer = scanner.nextLine();
//						if (answer.equalsIgnoreCase("y")) {
//							player.isInJail = false;
//							player.setCarbonFootPrint(player.getCarbonFootPrint() + 75);
//						} else {
//							jailMethod(player);
//						}
					} else {
						jailMethod(player);
					}

				}

				board.upgradeProperty(player);

				// TODO - Add in other land on tile options here (can integrate this code into
				// that also)
				System.out.println("Quit Game?/Continue Game? (y/any other key)");// temp message - change later
				String answer = scanner.nextLine();//
				if (answer.equalsIgnoreCase("y")) {
					System.out.println("Player has chosen to end the game.");
					shouldQuit = true;
				}

			}
			turnCount++;

		} while ((turnCount <= gameLength) && !shouldQuit);
	}

	/**
	 * checking the property is available to buy
	 *
	 * @param player
	 */
	public static void propertyValidation(Player player) {
		String userInput;
		PropertySquare property;
		property = (PropertySquare) board.squares.get(player.getCurrentPosition());

		if (property.getPropertyOwner() == null) {

			System.out.println(property.getSquareName() + " is available, Would you like to buy? (Press Y/N )");
			userInput = scanner.next();
			scanner.nextLine();
			if (userInput.equalsIgnoreCase("Y")) {
				board.buyProperty(property, player);

			} else {
				System.out.println("Continuing the game...");
			}

		} else {

			board.payRent(player);
		}

	}

	public static void displayEndGameLeaderboard() {
		// get list of players and sort based on carbon footprint
		// display in order of lowest first

		List<Player> sortedPlayers = players.stream().sorted(Comparator.comparingInt(Player::getCarbonFootPrint))
				.collect(Collectors.toList());

		System.out.println("\nGame finished");
		System.out.println("The overall winner is:  " + sortedPlayers.get(0).getPlayerName() + "!");

		System.out.println("\nOverall Leaderboard:");
		for (int i = 0; i < sortedPlayers.size(); i++) {
			System.out.println((i + 1) + ": " + sortedPlayers.get(i).getPlayerName() + ", Carbon FootPrint: "
					+ sortedPlayers.get(i).getCarbonFootPrint());
		}
	}

	public static boolean confirmQuit() {
		System.out.println("Are you sure you want to quit? If yes, press y and enter.");
		System.out.println("To return to the game, enter any other key");
		String answer = scanner.nextLine();
		if (answer.equalsIgnoreCase("y")) {
			System.out.println("Quitting the game. See you later"); // Thank you for playing Wing Commander :)
			return true;
		}
		System.out.println("Returning to the game.\n");
		return false;
	}

	/*
	 * enables chance to play a role
	 */

	public static void recycleReward(Player p) {

		System.out.println("Reduce, reuse, recycle! Your efforts have led to a 100 reduction in carbon footprint");
		p.setCarbonFootPrint(p.getCarbonFootPrint() - 100);
		System.out.println("New Carbon footprint: " + p.getCarbonFootPrint());
	}

}
