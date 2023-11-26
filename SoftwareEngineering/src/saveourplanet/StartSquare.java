/**
 * 
 */
package saveourplanet;

/**
 * @author Jonathan
 *
 */
public class StartSquare extends Square {

	/**
	 * 
	 */
	public StartSquare() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param squareName
	 * @param squarePosition
	 */
	public StartSquare(String squareName, int squarePosition) {
		super(squareName, squarePosition);
		// TODO Auto-generated constructor stub
	}
	
	public static void startSquare(Player player) {
		System.out.println("You have passed the start square, so your carbon footprint increases by 200.");
		player.setCarbonFootPrint(player.getCarbonFootPrint()+200);
	}
	@Override
	public String toString() {
		return  super.toString() ;
	}
}

