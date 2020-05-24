package TD3.fleuriste;

public class Fleur {
	private String nom;
	private double prix;
	
	public Fleur(String n, double p) {
		this.nom = n;
		this.prix = p;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Fleur(this.nom, this.prix);
	}
	
	public String getNom() {
		return this.nom;
	}

	public double getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return "1 " + this.getNom() + " a un prix unitaire de " + this.getPrix() + "€.";
	}
	
}
