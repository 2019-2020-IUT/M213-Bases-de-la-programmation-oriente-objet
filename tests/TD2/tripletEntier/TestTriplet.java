package TD2.tripletEntier;

/********************************************************************************************
 *         @author            JunkJumper                                                    *
 *         @license        https://creativecommons.org/licenses/by/4.0/  License CC BY 4.0  *
 *         @since             File available since 22/05/2020                               *
 ********************************************************************************************/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTriplet {

	private TripletEntier t1 = new TripletEntier(4, 3, 3);
	private TripletEntier t2 = new TripletEntier(4, 4, 2);
	private TripletEntier t3 = new TripletEntier(4, 5, 1);
	private TripletEntier t4 = new TripletEntier(3, 5, 2);
	private TripletEntier t5 = new TripletEntier(1, 2, 3);
	
	@Test
	void testSomme() {

		assertEquals(10, t1.somme());
		assertEquals(10, t2.somme());
		assertEquals(10, t3.somme());
		assertEquals(10, t4.somme());
		assertEquals(6, t5.somme());

		System.out.println("Test Somme Passe correctement !");

	}

	@Test
	void testMoyenne() {
		assertEquals(2., t5.moyenne(), 0.00000001);
		assertEquals(3.3333332538604736, t4.moyenne(), 0.00000001);
		assertEquals(3.3333332538604736, t3.moyenne(), 0.00000001);
		assertEquals(3.3333332538604736, t2.moyenne(), 0.00000001);
		assertEquals(3.3333332538604736, t1.moyenne(), 0.00000001);

		System.out.println("Test des sommes Passe correctement !");	
	}


	@Test
	void testConcatenantion() {
		assertEquals("433", t1.concatenation());
		assertEquals("442", t2.concatenation());
		assertEquals("451", t3.concatenation());
		assertEquals("352", t4.concatenation());
		assertEquals("123", t5.concatenation());

		System.out.println("Test des concatenations Passe correctement !");		
	}


	@Test
	void testToSting() {
		assertEquals("[4,3,3]", t1.toString());
		assertEquals("[4,4,2]", t2.toString());
		assertEquals("[4,5,1]", t3.toString());
		assertEquals("[3,5,2]", t4.toString());
		assertEquals("[1,2,3]", t5.toString());

		System.out.println("Test du toString Passe correctement !");		
	}

	@Test
	void testEquals() {
		assertEquals(true, t1.equals(t1));
		assertEquals(true, t2.equals(t2));
		assertEquals(true, t3.equals(t3));
		assertEquals(true, t4.equals(t4));
		assertEquals(true, t5.equals(t5));

		assertEquals(false, t1.equals(t2));
		assertEquals(false, t2.equals(t3));
		assertEquals(false, t3.equals(t1));
		assertEquals(false, t4.equals(t5));
		assertEquals(false, t5.equals(t1));

		System.out.println("Test des equals Passe correctement !");		
	}

}
