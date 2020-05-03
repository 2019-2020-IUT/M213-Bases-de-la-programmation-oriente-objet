package vehiculev2;

import java.util.Calendar;

public class GestionVehicule {

	public static void main (String [] args) {
		Vehicule v1 = new Velo (17); // nb vitesses
		Vehicule v2 = new Voiture (40.5, 5); // capacité réservoir, nb Places
		Vehicule v3 = new Camion (100.0, 100.0); // capacité réservoir, volume
		System.out.println ("Vehicules : "+"\n" +v1 +"\n" +v2 +"\n" +v3 +"\n");
		/*
		 * v2.approvisionner (35.0) ; // litres d’essence v3.approvisionner (70.0);
		 * v1.transporter ("Dijon ", "Valence ") ; v2.transporter (5, 300) ;
		 * v3.transporter (" des tuiles", 1000) ; }
		 */
	}
}