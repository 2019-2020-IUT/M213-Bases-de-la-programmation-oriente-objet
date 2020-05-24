package TD2.jourDeLaSemaine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class jourSemaineTest {

	JourSemaine j1 = new JourSemaine();
	JourSemaine j2 = new JourSemaine(2);
	JourSemaine j3 = new JourSemaine("vendredi");
	
	@Test
	public void testToString() {
		assertEquals("lundi", j1.toString());
		assertEquals("mercredi", j2.toString());
		assertEquals("vendredi", j3.toString());
	}
	
	@Test
	public void testVeille() {
		JourSemaine j = j2.veille();
		assertEquals("mardi", j.toString());
		j = j1.veille();
		assertEquals("dimanche", j.toString());
	}
	
	@Test
	public void testLendemain() {
		JourSemaine j = new JourSemaine(6);
		j = j.lendemain();
		assertEquals("lundi", j.toString());
		j = j3.lendemain();
		assertEquals("samedi", j.toString());
	}
	
}
