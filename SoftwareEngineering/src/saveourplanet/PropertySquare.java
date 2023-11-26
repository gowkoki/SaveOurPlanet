/**
 * 
 */
package saveourplanet;

/**
 * @author Jonathan
 *
 */
public class PropertySquare extends Square {
	
	private String propertyDescription;
	private Player propertyOwner;
	private int purchaseCost;
	private int minorDevelopmentCost;
	private int majorDevelopmentCost;
	private int rentNoUpgrade;
	private int rentUpgrade1;
	private int rentUpgrade2;
	private int rentUpgrade3;
	private int rentUpgrade4;
	private int upgradeStage;
	

	/**
	 * 
	 */
	public PropertySquare() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param squareName
	 * @param squarePosition
	 */
	

	/**
	 * @return the propertyDescription
	 */
	public String getPropertyDescription() {
		return propertyDescription;
	}

	/**
	 * @param propertyDescription
	 * @param purchaseCost
	 * @param minorDevelopmentCost
	 * @param majorDevelopmentCost
	 * @param rent
	 */


	/**
	 * @param propertyDescription the propertyDescription to set
	 */
	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	/**
	 * @param squareName
	 * @param squarePosition
	 * @param propertyDescription
	 * @param purchaseCost
	 * @param minorDevelopmentCost
	 * @param majorDevelopmentCost
	 * @param rentNoUpgrade
	 * @param rentUpgrade1
	 * @param rentUpgrade2
	 * @param rentUpgrade3
	 * @param rentUpgrade4
	 */
	public PropertySquare(String squareName, int squarePosition, String propertyDescription, 
			int purchaseCost, int minorDevelopmentCost,
			int majorDevelopmentCost, int rentNoUpgrade, int rentUpgrade1
			, int rentUpgrade2, int rentUpgrade3, int rentUpgrade4) {
		super(squareName, squarePosition);
		this.propertyDescription = propertyDescription;
		this.purchaseCost = purchaseCost;
		this.minorDevelopmentCost = minorDevelopmentCost;
		this.majorDevelopmentCost = majorDevelopmentCost;
		this.rentNoUpgrade = rentNoUpgrade;
		this.rentUpgrade1 = rentUpgrade1;
		this.rentUpgrade2 = rentUpgrade2;
		this.rentUpgrade3 = rentUpgrade3;
		this.rentUpgrade4 = rentUpgrade4;
		this.upgradeStage = 0;
		this.propertyOwner = null;
	}

	
	
	/**
	 * @return the propertyOwner
	 */
	public Player getPropertyOwner() {
		return propertyOwner;
	}

	/**
	 * @param propertyOwner the propertyOwner to set
	 */
	public void setPropertyOwner(Player player) {
		
		
		this.propertyOwner = player;
	}

	/**
	 * @return the purchaseCost
	 */
	public int getPurchaseCost() {
		return purchaseCost;
	}

	/**
	 * @param purchaseCost the purchaseCost to set
	 */
	public void setPurchaseCost(int purchaseCost) {
		this.purchaseCost = purchaseCost;
	}

	/**
	 * @return the minorDevelopmentCost
	 */
	public int getMinorDevelopmentCost() {
		return minorDevelopmentCost;
	}

	/**
	 * @param minorDevelopmentCost the minorDevelopmentCost to set
	 */
	public void setMinorDevelopmentCost(int minorDevelopmentCost) {
		this.minorDevelopmentCost = minorDevelopmentCost;
	}

	/**
	 * @return the majorDevelopmentCost
	 */
	public int getMajorDevelopmentCost() {
		return majorDevelopmentCost;
	}

	/**
	 * @param majorDevelopmentCost the majorDevelopmentCost to set
	 */
	public void setMajorDevelopmentCost(int majorDevelopmentCost) {
		this.majorDevelopmentCost = majorDevelopmentCost;
	}	

	public int getRentNoUpgrade() {
		return rentNoUpgrade;
	}

	public void setRentNoUpgrade(int rentNoUpgrade) {
		this.rentNoUpgrade = rentNoUpgrade;
	}

	public int getRentUpgrade1() {
		return rentUpgrade1;
	}

	public void setRentUpgrade1(int rentUpgrade1) {
		this.rentUpgrade1 = rentUpgrade1;
	}

	public int getRentUpgrade2() {
		return rentUpgrade2;
	}

	public void setRentUpgrade2(int rentUpgrade2) {
		this.rentUpgrade2 = rentUpgrade2;
	}

	public int getRentUpgrade3() {
		return rentUpgrade3;
	}

	public void setRentUpgrade3(int rentUpgrade3) {
		this.rentUpgrade3 = rentUpgrade3;
	}

	public int getRentUpgrade4() {
		return rentUpgrade4;
	}

	public void setRentUpgrade4(int rentUpgrade4) {
		this.rentUpgrade4 = rentUpgrade4;
	}

	@Override
	public String toString() {
		return  super.toString() + "Property Description: " + propertyDescription + "Purchase Cost: " + purchaseCost
				+ "Minor Development Cost: " + minorDevelopmentCost + "Major Development Cost: " + majorDevelopmentCost
				+ "Base Rent: " + rentNoUpgrade + "Rent: Tier 1 cost: "+rentUpgrade1
				+"Rent: Tier 2 cost: "+rentUpgrade2+ "Rent: Tier 3 cost: "+ rentUpgrade3
				+ "Rent: Major Upgrade Cost: "+rentUpgrade4;
	}

	public int getUpgradeStage() {
		return upgradeStage;
	}

	public void setUpgradeStage(int upgradeStage) {
		this.upgradeStage = upgradeStage;
	}
	
	

}
