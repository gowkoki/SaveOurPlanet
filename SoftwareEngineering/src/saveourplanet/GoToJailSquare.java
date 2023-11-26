/**
 * 
 */
package saveourplanet;

/**
 * @author Jonathan
 *
 */
public class GoToJailSquare extends Square {

	/**
	 * 
	 */
	public GoToJailSquare() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param squareName
	 * @param squarePosition
	 */
	public GoToJailSquare(String squareName, int squarePosition) {
		super(squareName, squarePosition);
		// TODO Auto-generated constructor stub
	}


	public static void jailMethod(Player player) {
		if (player.convictionDuration == 1) {
			System.out.println("You have been sent to jail ... \n" +
					"You will be in jail for 2 turns."
					+"\nUnless you pay a fine of 200 carbon footprints or you roll a double");
		}

		player.isInJail = true;
		player.convictionDuration++;


		player.setCurrentPosition(5);
		player.setCarbonFootPrint(player.getCarbonFootPrint()+ 75);
		System.out.println("New Carbon footprint: "+player.getCarbonFootPrint());

	}


	@Override
	public String toString() {
		return  super.toString() + "Your crimes against nature will"
				+ " not go unpunished "
				+ "... GO TO JAIL!" ;
	}

	
	// method needed
}
