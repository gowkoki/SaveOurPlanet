/**
 * 
 */
package saveourplanet;

/**
 * @author Jonathan
 *
 */
public class JailSquare extends Square {

	
	/**
	 * 
	 */
	public JailSquare() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param squareName
	 * @param squarePosition
	 */
	public JailSquare(String squareName, int squarePosition) {
		super(squareName, squarePosition);
		
	}

	public static void justVisiting(Player player){
		System.out.println(player.getPlayerName() + "! You have landed on a jail square. But since you are just a visitor you won't be held here.");
	}


	@Override
	public String toString() {
		return  super.toString() ;
	}
	
	

}

