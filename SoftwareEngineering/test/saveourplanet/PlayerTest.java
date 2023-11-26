package saveourplanet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
	Player player;
	String validLowerPlayerName, validMidPlayerName, validHigherPlayerName, invalidLowerPlayerName,
			invalidHigherPlayerName;
	int carbonFootPrint;
	int currentPosition;

	@BeforeEach
	void setUp() throws Exception {
		player = new Player();
		validLowerPlayerName = "A";
		validMidPlayerName = "ABCDEFGH";
		validHigherPlayerName = "ABCDEFGHIJKLMNOP";
		invalidLowerPlayerName = " ";
		invalidHigherPlayerName = "ABCDEFGHIJKLMNOPQLM";

		carbonFootPrint = 1500;

		currentPosition = 5;

	}
	// constructor with valid input

	@Test
	void testPlayerConstructorWithArgsValid() {
		Player player = new Player(validMidPlayerName, carbonFootPrint, currentPosition);
		assertEquals(validMidPlayerName, player.getPlayerName());
		assertEquals(carbonFootPrint, player.getCarbonFootPrint());
		assertEquals(currentPosition, player.getCurrentPosition());

	}

	// valid player name
	@Test
	void testGetSetPlayerNameValid() {
		player.setPlayerName(validLowerPlayerName);
		assertEquals(validLowerPlayerName, player.getPlayerName());

		player.setPlayerName(validMidPlayerName);
		assertEquals(validMidPlayerName, player.getPlayerName());

		player.setPlayerName(validHigherPlayerName);
		assertEquals(validHigherPlayerName, player.getPlayerName());

	}

	// carbonfootprints
	@Test
	void testGetSetCarbonFootPrint() {
		player.setCarbonFootPrint(carbonFootPrint);
		assertEquals(carbonFootPrint, player.getCarbonFootPrint());
	}

	// player position
	@Test
	void testGetSetCurrentPosition() {
		player.setCurrentPosition(currentPosition);
		assertEquals(currentPosition, player.getCurrentPosition());
	}

}
