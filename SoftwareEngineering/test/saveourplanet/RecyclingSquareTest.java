package saveourplanet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecyclingSquareTest {
	// test data
	RecyclingSquare recycle;
	String squareName;
	int squarePosition;
	String recylingDescription;
	int positiveEffect;

	@BeforeEach
	void setUp() throws Exception {
		recycle = new RecyclingSquare();
		squareName = "Recycle";
		squarePosition = 2;
		recylingDescription = "square description";
		positiveEffect = 12;
	}

	// constructor
	@Test
	void testRecyclingSquarewithConst() {
		RecyclingSquare recycle = new RecyclingSquare(squareName, squarePosition, recylingDescription, positiveEffect);
		assertEquals(squareName, recycle.getSquareName());
		assertEquals(squarePosition, recycle.getSquarePosition());
		assertEquals(recylingDescription, recycle.getRecylingDescription());
		assertEquals(positiveEffect, recycle.getPositiveEffect());

	}

	// square Name
	@Test
	void testGetSetSquareName() {
		recycle.setSquareName(squareName);
		assertEquals(squareName, recycle.getSquareName());
	}

	// square position
	@Test
	void testGetSetSquarePosition() {
		recycle.setSquarePosition(squarePosition);
		assertEquals(squarePosition, recycle.getSquarePosition());
	}

	// recyling description
	@Test
	void testGetSetRecylingDescription() {
		recycle.setRecylingDescription(recylingDescription);
		assertEquals(recylingDescription, recycle.getRecylingDescription());
	}

	// position effect
	@Test
	void testGetSetPositiveEffect() {
		recycle.setPositiveEffect(positiveEffect);
		assertEquals(positiveEffect, recycle.getPositiveEffect());
	}

}
