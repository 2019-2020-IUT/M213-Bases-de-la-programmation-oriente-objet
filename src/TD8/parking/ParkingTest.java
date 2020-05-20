package parking;

import java.util.HashMap;
import vehicule.Voiture;

public class ParkingTest {
	public static void main(String[] args) {
		HashMap<Integer, Voiture> carpark = new HashMap<Integer, Voiture>();
		Voiture v1 = new Voiture("Peugeot", 2005, 13400.00, 1.4, 5, 4.0, 12000);
		Voiture v2 = new Voiture("Porsche", 2010, 160000.00, 3.6, 2, 25.0, 8320);
		Voiture v3 = new Voiture("Fiat", 1999, 8400.00, 1.2, 3, 5.0, 125000);
		Parking P1 = new Parking(50, carpark);
		try {
		P1.garer(v1, 0);
		P1.garer(v2, 1);
		P1.garer(v3, 2);
		System.out.println("Place v2 : " + P1.chercher(v2));
		P1.liberer(1);
		System.out.println(P1.chercher(v2));
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		P1.toString();
	}
}
