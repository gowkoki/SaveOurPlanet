/**
 * 
 */
package saveourplanet;

/**
 * @author Jonathan
 *
 */
public class RecyclingSquare extends Square {

	
	private String recylingDescription;
	private int positiveEffect;
	/**
	 * 
	 */
	public RecyclingSquare() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param squareName
	 * @param squarePosition
	 */
	public RecyclingSquare(String squareName, int squarePosition, 
			String recyclingDescription, int positiveEffect) {
		super(squareName, squarePosition);
		
		this.setRecylingDescription(recyclingDescription);
		this.setPositiveEffect(positiveEffect);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the recylingDescription
	 */
	public String getRecylingDescription() {
		return recylingDescription;
	}

	/**
	 * @param recylingDescription the recylingDescription to set
	 */
	public void setRecylingDescription(String recylingDescription) {
		this.recylingDescription = recylingDescription;
	}

	/**
	 * @return the positiveEffect
	 */
	public int getPositiveEffect() {
		return positiveEffect;
	}

	/**
	 * @param positiveEffect the positiveEffect to set
	 */
	public void setPositiveEffect(int positiveEffect) {
		this.positiveEffect = positiveEffect;
	}

	@Override
	public String toString() {
		return  super.toString()+"Recycling Description: "+ recylingDescription + "Your carbon footprint is reduced by ... " + positiveEffect
				;
	}
	
	

}
