/**
 * 
 */
package saveourplanet;

import java.util.Random;

/**
 * @author Jonathan
 *
 */
public class ChanceSquare extends Square{

	
	
	/**
	 * 
	 */
	public ChanceSquare() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param squareName
	 * @param squarePosition
	 * @param positiveChanceDescription
	 * @param negativeChanceDescription
	 * @param positiveEffect
	 * @param negativeEffect
	 */
	public ChanceSquare(String squareName, int squarePosition) {
		super(squareName, squarePosition);
		
	}


	public static void chanceSquare(Player p) {

		Random random = new Random();

		int chanceDecision =  random.nextInt(10);
		chanceDecision++;
		System.out.println("You drew chance card number: "+chanceDecision+" and here is what You get:\n");

		switch (chanceDecision) {
			case 1:

				System.out.println("Hot stuff. Catastrophic global warming leads to crop failure.  \r\n"
						+ "\r\n"
						+ "Carbon footprint increases by 100. ");
				p.setCarbonFootPrint(p.getCarbonFootPrint()+100);
				System.out.println("New Carbon footprint: "+p.getCarbonFootPrint());
				break;

			case 2:

				System.out.println("I predict a riot. Public apathy against high environmental taxes.  \r\n"
						+ "\r\n"
						+ "Carbon footprint increases by 75. ");
				p.setCarbonFootPrint(p.getCarbonFootPrint()+75);
				System.out.println("New Carbon footprint: "+p.getCarbonFootPrint());
				break;

			case 3:

				System.out.println("Faking it. A company is caught faking CO2 emissions.  \r\n"
						+ "\r\n"
						+ "Carbon footprint increases by 50. ");
				p.setCarbonFootPrint(p.getCarbonFootPrint()+50);
				break;

			case 4:

				System.out.println("Twitter storm. You are criticized for saving the planet one private jet at a time.  \r\n"
						+ "\r\n"
						+ "Carbon footprint increases by 25. ");
				p.setCarbonFootPrint(p.getCarbonFootPrint()+25);
				System.out.println("New Carbon footprint: "+p.getCarbonFootPrint());
				break;

			case 5:

				System.out.println("Godzilla attacks. Natural disaster has led to much needed repairs. /r/n"
						+ "Carbon footprint increased by 10. ");
				p.setCarbonFootPrint(p.getCarbonFootPrint()+10);
				System.out.println("New Carbon footprint: "+p.getCarbonFootPrint());
				break;

			case 6:

				System.out.println("Cowboys and beans. Move to a plant-based diet. \r\n"
						+ "\r\n"
						+ "Carbon footprint is reduced by 75.  ");
				p.setCarbonFootPrint(p.getCarbonFootPrint()-75);
				System.out.println("New Carbon footprint: "+p.getCarbonFootPrint());
				break;

			case 7:

				System.out.println("Electric dreams. Investment in green public transport \r\n"
						+ "\r\n"
						+ "Carbon footprint is reduced by 50.  ");
				p.setCarbonFootPrint(p.getCarbonFootPrint()-50);
				System.out.println("New Carbon footprint: "+p.getCarbonFootPrint());
				break;

			case 8:

				System.out.println("Work smarter, not harder. International efficiency standards agreed.  \r\n"
						+ "\r\n"
						+ "Carbon footprint is reduced by 75. \r\n"
						+ "  ");
				p.setCarbonFootPrint(p.getCarbonFootPrint()-75);
				System.out.println("New Carbon footprint: "+p.getCarbonFootPrint());
				break;

			case 9:
				System.out.println("The public decides. The election was won on green policies. \r\n"
						+ "\r\n"
						+ "Carbon footprint is reduced by 50. ");
				p.setCarbonFootPrint(p.getCarbonFootPrint()-50);
				System.out.println("New Carbon footprint: "+p.getCarbonFootPrint());
				break;

			case 10:
				System.out.println("UN climate change conference. Historic agreement to limit global CO2 emissions.  \r\n"
						+ "\r\n"
						+ "Carbon footprint is reduced by 200.");
				p.setCarbonFootPrint(p.getCarbonFootPrint()-200);
				System.out.println("New Carbon footprint: "+p.getCarbonFootPrint());
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + chanceDecision);
		}


	}



	@Override
	public String toString() {
		return  super.toString() ;
	}
	
	
	

}

