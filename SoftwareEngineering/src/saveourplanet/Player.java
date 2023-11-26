package saveourplanet;

import java.util.ArrayList;
import java.util.List;

/**
 * Group 7 -Steven Millis, Farhad Panahi, Christina Marie Rankin, Jonathan
 * Williamson-Deronja, Gowthami Kumaresn The Player Class used to create each
 * Player in the beginning and Manage during the game.
 */

public class Player {

	// constants for the player name minimum and maximum allowed number of
	// characters.
	private final static int MIN_NUM_CHARATERS = 1;
	private final static int MAX_NUM_CHARATERS = 16;

	// instance variables for the Player.
	private String playerName;
	private int carbonFootPrint;
	private int currentPosition;
	public boolean isInJail = false;

	public int convictionDuration = 1;
	public boolean ownsProperty = false;
	public List<PropertySquare> propertiesOwned = new ArrayList<>();

	// default constructor
	public Player() {
	}

	/**
	 * @param playerName
	 * @param carbonFootPrint
	 * @param currentPosition
	 */
	public Player(String playerName, int carbonFootPrint, int currentPosition) {
		super();
		this.playerName = playerName;
		this.carbonFootPrint = carbonFootPrint;
		this.currentPosition = currentPosition;
	}

	public void updatePlayerPosition(int diceValue) {
		int newPosition = currentPosition + diceValue;

		if (newPosition > GameManager.BOARD_SIZE) {

			newPosition -= GameManager.BOARD_SIZE;
			setCurrentPosition(newPosition);
			StartSquare.startSquare(this);

		} else {
			setCurrentPosition(newPosition);
		}

	}

	// getters and setters
	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPostion) {
		this.currentPosition = currentPostion;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		if (playerName.length() >= MIN_NUM_CHARATERS && playerName.length() <= MAX_NUM_CHARATERS) {
			this.playerName = playerName;
		} else {
			System.out.println("Name should be at least " + MIN_NUM_CHARATERS + "charachter long and no more than "
					+ MAX_NUM_CHARATERS + "charachters");
		}
	}

	public int getCarbonFootPrint() {
		return carbonFootPrint;
	}

	public void setCarbonFootPrint(int carbonFootPrint) {
		this.carbonFootPrint = carbonFootPrint;
	}

	@Override
	public String toString() {
		return "Player Name                 :" + this.playerName + "\n" + "Player New Position         :"
				+ this.currentPosition + "\n" + "Player New Carbon Footprint :" + this.carbonFootPrint + "\n";
	}

	public void displayOwnedProperties(int property1, int property2, int property3) {
		System.out.println(playerName + " you own " + propertiesOwned.size() + " properties:");
		for (PropertySquare property : propertiesOwned) {
			if (property.getSquarePosition() == property1 || property.getSquarePosition() == property2
					|| property.getSquarePosition() == property3)
				System.out.println("Property Name : " + property.getSquareName() + " | Position :"
						+ property.getSquarePosition() + " | Upgrade Stage : " + property.getUpgradeStage());

		}
	}

}
