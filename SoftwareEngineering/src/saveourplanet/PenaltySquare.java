/**
 * 
 */
package saveourplanet;

/**
 * @author Jonathan
 *
 */
public class PenaltySquare extends Square{

	private int penalty;
	// penalty to be applied to player, can be changed to method
	
	
	/**
	 * 
	 */
	public PenaltySquare() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param squareName
	 * @param squarePosition
	 */
	public PenaltySquare(String squareName, int squarePosition, int penalty) {
		super(squareName, squarePosition);
		
		this.setPenalty(penalty);
	}



	public static void penaltyImplementationCoalMine(Player p) {

		System.out.println("Coal mine operation fails to meet regulation.  Take on 100 carbon footprints");
		p.setCarbonFootPrint(p.getCarbonFootPrint()+100);
		System.out.println("New Carbon footprint: "+p.getCarbonFootPrint());
	}

	public static void penaltyImplementationOilSpill(Player p) {

		System.out.println("Save the seals! Your oil rig has exploded!!!  Take on 100 carbon footprints");
		p.setCarbonFootPrint(p.getCarbonFootPrint()+100);
		System.out.println("New Carbon footprint: "+p.getCarbonFootPrint());
	}

	/**
	 * @return the penalty
	 */
	public int getPenalty() {
		return penalty;
	}

	/**
	 * @param penalty the penalty to set
	 */
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	
	

}
