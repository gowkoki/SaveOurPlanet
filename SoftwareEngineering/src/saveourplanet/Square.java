
package saveourplanet;

/**
 * Group 7 -Steven Millis, Farhad Panahi, Christina Marie Rankin, Jonathan
 * Williamson-Deronja, Gowthami Kumaresn
 */

//to be made abstract
public abstract class Square {

    /**
     * Default constructor
     */
    public Square() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Constructor with parameters
     *
     * @param squareName
     * @param squarePosition
     */
    public Square(String squareName, int squarePosition) {

        this.setSquareName(squareName);
        this.setSquarePosition(squarePosition);
    }

    private String squareName;
    private int squarePosition;

    /**
     * Getters and Setters
     */
    public String getSquareName() {
        return squareName;
    }

    public void setSquareName(String squareName) {
        this.squareName = squareName;
    }

    public int getSquarePosition() {
        return squarePosition;
    }

    public void setSquarePosition(int squarePosition) {
        this.squarePosition = squarePosition;
    }

    @Override
    public String toString() {
        return "Square name: " + squareName + "     Square Position: " + squarePosition;
    }

    // display the square info
    public void displaySquareDetails() {
        System.out.println("You landed on "
                + this.squareName + ".");
    }
}



