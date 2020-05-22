package TD1.point;

/********************************************************************************************
 * 		@author			JunkJumper															*
 * 		@license		https://creativecommons.org/licenses/by/4.0/  License CC BY 4.0		*
 * 		@since 			File available since 22/05/2020										*
 ********************************************************************************************/

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestPoint {

	private final Point p1 = new Point(4, 8);
	private final Point p2 = new Point(5, 1);
	private Point pT; //"pT" for "pointTest"
	
	@Test
	public void testEquals() {
		pT = new Point(4, 8);
		assertFalse(p1.equals(p2));
		assertTrue(pT.equals(p1));
	}
	
	@Test
	public void testToString() {
		assertEquals("(X = 4.0 - Y = 8.0)", p1.toString());
		assertEquals("(X = 5.0 - Y = 1.0)", p2.toString());
	}
	
	@Test
	public void testClone() {
		pT = p1.clone();
		assertTrue(pT.equals(p1));
	}	
	
	@Test
	public void testProjectionX() {
		assertEquals(new Point(0, 8), p1.projY());
	}
	
	@Test
	public void testProjectionY() {
		assertEquals(new Point(5, 0), p2.projX());
	}
	
	@Test
	public void testCalculdistance() {
		assertEquals(7.0710678118654755, p1.getDistance(p2));
	}
	
	@Test
	public void testSetLocationsWithCoord() {
		pT = new Point();
		pT.setLocation(3, 9);
		assertEquals(3., pT.getX());
		assertEquals(9., pT.getY());
	}
	
	@Test
	public void testSetLocationsWithPoint() {
		pT = new Point();
		pT.setLocation(p2);
		assertEquals(5., pT.getX());
		assertEquals(1., pT.getY());
	}
	
	@Test
	public void testTranslate() {
		pT = new Point(p1);
		pT.translate(3, -2);
		assertEquals(7, pT.getX());
		assertEquals(6, pT.getY());
	}
}