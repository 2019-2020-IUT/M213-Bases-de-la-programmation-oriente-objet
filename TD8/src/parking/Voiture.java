package parking;

public class Voiture {
	private int nbPorte;
	private double puissance;
	private double kilometrage;
	private String marque;
	private double prix;
	
	public Voiture() {
		nbPorte = 0;
		puissance = 0;
		kilometrage = 0;
		this.marque = null;
	}
	
	public Voiture(String marque, int date, double prixac, double cyl, int nbP, double pui, double kilo) {
		nbPorte = nbP;
		puissance = pui;
		kilometrage = kilo;	
		this.marque = marque;
	}


	public int getNbPorte() {
		return nbPorte;
	}

	public void setNbPorte(int nbPorte) {
		this.nbPorte = nbPorte;
	}

	public double getPuissance() {
		return puissance;
	}

	public void setPuissance(double puissance) {
		this.puissance = puissance;
	}

	public double getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public void affiche() {
		System.out.println(" Marque : "+this.marque+"\n Nb Portes : "+this.nbPorte+"\n Puissance "+this.puissance+"\n Kilometrage "+this.kilometrage+"\n Prix :"+this.prix+" €");
	}
}
