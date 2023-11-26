/**
 * 
 */
package saveourplanet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author jdogg
 *
 */
class PropertySquareTest {
	
	PropertySquare pS1;
	Player playerValid;
	String propertyDescriptonValid;
	String squareNameValid;
	int  purchaseCostValid, minorDevCostValid, majorDevCostValid, rentNoUpgradeValid,
	rentUpgrade1Valid, rentUpgrade2Valid, rentUpgrade3Valid, rentUpgrade4Valid,
	upgradeStageValid, squarePositionValid;
	
	
	
	/*
	 *  . private String propertyDescription;
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
	 * 
	 */
	

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		pS1 = new PropertySquare();
		propertyDescriptonValid ="P";
		purchaseCostValid =1;
		minorDevCostValid =2;
		majorDevCostValid =3;
		rentNoUpgradeValid =2;
		rentUpgrade1Valid =2;
		rentUpgrade2Valid =2;
		rentUpgrade3Valid =2;
		rentUpgrade4Valid =2;
		upgradeStageValid =2;
		squareNameValid ="I";
		squarePositionValid=2;
		
		
	}

	@Test
	void testGetSetMajorDevCost() {
		
		pS1.setMajorDevelopmentCost(majorDevCostValid);
		int i = majorDevCostValid;
		assertEquals(pS1.getMajorDevelopmentCost(),majorDevCostValid);
		
	}
	
	@Test
	void testGetSetMinorDevCost() {
		pS1.setMinorDevelopmentCost(minorDevCostValid);
		int i = minorDevCostValid;
		assertEquals(pS1.getMinorDevelopmentCost(),minorDevCostValid);
	}
	
	@Test
	void testGetSetRentT4() {
		pS1.setRentUpgrade4(rentUpgrade4Valid);
		int e = rentUpgrade4Valid;
		assertEquals(pS1.getRentUpgrade4(), e);
	}
		
	@Test
	void testGetSetRentT3() {
		pS1.setRentUpgrade3(rentUpgrade3Valid);
		int d = rentUpgrade3Valid;
		assertEquals(pS1.getRentUpgrade3(), d);
		
	}
	@Test
	void testGetSetRentT2() {

		pS1.setRentUpgrade2(rentUpgrade2Valid);
		int c = rentUpgrade2Valid;
		assertEquals(pS1.getRentUpgrade2(), c);
		
	}
	@Test
	void testGetSetRentT1() {
		pS1.setRentUpgrade1(rentUpgrade1Valid);
		int b = rentUpgrade1Valid;
		assertEquals(pS1.getRentUpgrade1(),b);
	}
	@Test
	void testGetSetRentNoUpgrade() {
		pS1.setRentNoUpgrade(rentNoUpgradeValid);
		int a = rentNoUpgradeValid;
		assertEquals(pS1.getRentNoUpgrade(),a);
	}	
		
	
	@Test
	void testGetSetUpgradeStage() {
		pS1.setUpgradeStage(upgradeStageValid);
		int i = upgradeStageValid;
		assertEquals(pS1.getUpgradeStage(),i );
	}
	
	@Test
	void testGetSetSquareName(){
		
		pS1.setSquareName(squareNameValid);
		String s = squareNameValid;
		assertEquals(pS1.getSquareName(), s);
		
	}
	@Test
	void testGetSetSquarePosition(){
		
		pS1.setSquarePosition(squarePositionValid);
		int i = squarePositionValid;
		assertEquals(pS1.getSquarePosition(), i);
		
	}
	

}
