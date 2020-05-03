package boite;

import java.awt.*;

public class Objet {
	Color couleur;
	
	public Objet() {
		couleur = Color.white;
	}
	
	public Objet(Color c) {
		couleur = c;
	}
	
	public void changeCouleur(Color c) {
		if (!couleur.equals(c))
			couleur = c;
		else
			System.out.println("L'objet est déjà de couleur "+c);
	}
	
	public void changeCouleur2(Color c) {
		if (couleur.equals(c))
			throw new RuntimeException("Même couleur");
		couleur = c;
	}
	
	public boolean equals(Object o) {
		Objet currentO = (Objet) o;
		return (currentO.couleur.equals(couleur));
	}
	
	public String toString() {
		return "Objet "+couleur;
	}

}
