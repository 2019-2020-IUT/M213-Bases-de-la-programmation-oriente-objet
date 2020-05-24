package TD3.segment;

/********************************************************************************************
 * 		@author			JunkJumper															*
 * 		@license		https://creativecommons.org/licenses/by/4.0/  License CC BY 4.0		*
 * 		@since 			File available since 24/05/2020										*
 ********************************************************************************************/

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import TD1.point.Point;

public class SegmentTest {

	private Point un = new Point(3, 6);
	private Point deux = new Point(1, 8);
	private Segment seg1 = new Segment(2, 4, 6, 3);
	private Segment seg2 = new Segment(un, deux);
	private Segment seg3 = new Segment(1, 6, un);
	private Segment seg4 = new Segment(deux, 7, 3);
	private Segment seg5 = new Segment(1, 8, 7, 3);
	
	@Test
	public void testEquals() {
		assertFalse(seg1.equals(seg2));
		assertFalse(seg3.equals(seg4));
		assertTrue(seg4.equals(seg5));
	}
	
	@Test
	public void testToString() {
		assertEquals("[(X = 2.0 - Y = 4.0) - (X = 6.0 - Y = 3.0)]",seg1.toString());
		assertEquals("[(X = 3.0 - Y = 6.0) - (X = 1.0 - Y = 8.0)]", seg2.toString());
	}
	
	@Test
	public void testClone() throws CloneNotSupportedException {
		Segment s = new Segment();
		s = (Segment) seg3.clone();
		assertTrue(s.equals(seg3));
	}
}
