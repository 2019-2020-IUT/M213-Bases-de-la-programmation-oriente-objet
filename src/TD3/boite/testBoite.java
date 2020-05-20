package boite;

import java.awt.Color;

public class testBoite {

	public static void main(String[] args) {
		Boite b1 = new Boite(Color.green); 
		Boite b2 = new Boite(Color.green, new Objet(Color.red));
		Boite b3 = new Boite(Color.green, new Boite(Color.blue));
		Boite b4 = new Boite(Color.green, new Boite(Color.blue));
		b4.ajouteBoite(new Boite(Color.yellow));
		Boite b5 = new Boite(Color.green, new Objet(Color.red));
		b5.ajouteBoite(new Boite(Color.blue));
		try {
			b2.getObjet().changeCouleur2(Color.red);
		} catch(RuntimeException e) {
			e.getMessage();
		}
	}
	
	
}
