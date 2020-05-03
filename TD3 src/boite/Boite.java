package boite;

import java.awt.Color;

public class Boite {
	final private int BOITEMAX = 5;
	private Color couleur;
	private Objet contenu;
	private Boite[] bContent = new Boite[15];
	private int nbB = 0;
	
	
	
	public Boite(Color col) {
		couleur = col;
		contenu = null;
	}
	
	public Boite(Color col, Objet obj) {
		couleur = col; 
		contenu = obj;
	}
	
	public Boite(Color col, Boite box) {
		couleur = col; 
		bContent[nbB] = box;
		nbB += 1;
	}
	
	public Boite(Color col, Boite box, Objet obj) {
		couleur = col;
		contenu = obj; 
		bContent[nbB] = box;
		nbB += 1;
	}
	
	public Color getColor() {
		return couleur; 
	}
	
	public Objet getObjet() {
		return contenu; 
	}
	
	public boolean contientObjet(Objet obj) {
		return obj == contenu;
	}
	
	public boolean estVide() {
		return contenu ==null && nbB == 0; 
	}
	
	public void ajouteBoite(Boite B) {
		if (nbB+1 >= 5) 
			throw new RuntimeException("Maximum déjà atteint");
		bContent[nbB] = B;
		nbB += 1;
	}
	
	
	
	
	
	
	
}
