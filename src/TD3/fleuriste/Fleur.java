package fleuriste;

public class Fleur {
	String nom;
	double prix;
	
	public Fleur(String nomf, double prix) {
		this.nom = nomf;
		this.prix = prix;
	}
	
	public Fleur clone() {
		return (new Fleur(this.nom, this.prix));
	}
	
	public String getNom() {
		return this.nom;
	}
}
