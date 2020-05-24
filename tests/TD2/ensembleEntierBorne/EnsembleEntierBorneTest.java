package TD2.ensembleEntierBorne;

/********************************************************************************************
 * 		@author			JunkJumper															*
 * 		@license		https://creativecommons.org/licenses/by/4.0/  License CC BY 4.0		*
 * 		@since 			File available since 24/05/2020										*
 ********************************************************************************************/

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class EnsembleEntierBorneTest {

	private EnsembleEntierBorne e1 = new EnsembleEntierBorne(20);
	private EnsembleEntierBorne e2 = new EnsembleEntierBorne(16);
	private EnsembleEntierBorne e3 = new EnsembleEntierBorne(18);


	@Test
	public void testAdd() {
		e1.add(3);
		e1.add(5);
		e1.add(9);
		e1.add(14);
		e1.add(18);
		
		assertTrue(e1.doesContains(3));
		assertTrue(e1.doesContains(5));
		assertTrue(e1.doesContains(9));
		assertTrue(e1.doesContains(14));
		assertTrue(e1.doesContains(18));
	}
	
	@Test
	public void testRemove() {
		
		e2.add(1);
		e2.add(2);
		e2.add(3);
		e2.add(4);
		e2.add(5);
		e2.add(6);
		e2.add(7);
		e2.add(8);
	
		assertTrue(e2.doesContains(1));
		assertTrue(e2.doesContains(2));
		assertTrue(e2.doesContains(3));
		assertTrue(e2.doesContains(4));
		assertTrue(e2.doesContains(5));
		assertTrue(e2.doesContains(6));
		assertTrue(e2.doesContains(7));
		assertTrue(e2.doesContains(8));

		e2.remove(2);
		e2.remove(5);
		e2.remove(8);

		assertFalse(e2.doesContains(2));
		assertFalse(e2.doesContains(5));
		assertFalse(e2.doesContains(8));
	}
	
	@Test
	public void testToString() {
		e2.add(1);
		e2.add(2);
		e2.add(3);
		e2.add(4);
		e2.add(5);
		e2.add(6);
		e2.add(7);
		e2.add(8);
		
		assertEquals("{1, 2, 3, 4, 5, 6, 7, 8}", e2.toString());
	}
	
	@Test
	public void testIntersect() {
		e1.add(3);
		e1.add(5);
		e1.add(9);
		e1.add(14);
		e1.add(18);
		
		e2.add(1);
		e2.add(3);
		e2.add(4);
		e2.add(5);
		e2.add(7);
		e2.add(9);
		e2.add(15);
		
		e3 = e1.intersect(e2);
		
		assertTrue(e3.doesContains(3));
		assertTrue(e3.doesContains(5));
		assertTrue(e3.doesContains(9));
		
		
		
	}
}
