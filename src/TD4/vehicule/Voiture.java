package TD4.vehicule;

public class Voiture extends Vehicule {
	protected double cylindree;
	protected int nbPorte;
	protected double puissance;
	protected double kilometrage;
	
	public Voiture() {
		cylindree = 0;
		nbPorte = 0;
		puissance = 0;
		kilometrage = 0;		
	}
	
	public Voiture(String marque, int date, double prixac, double cyl, int nbP, double pui, double kilo) {
		cylindree = cyl;
		nbPorte = nbP;
		puissance = pui;
		kilometrage = kilo;	
		this.marque = marque;
		dateAchat = date;
		prixAchat = prixac;
		prixCourant = 0;
	}
	
	
	public void calculePrix(int annee) {
		int anneesPass = (annee - this.dateAchat)*2;
		double pourcentagekm = Math.floor(this.kilometrage/10000);
		boolean malus = false;
		boolean bonus = false; 
		if (this.marque == "fiat" || this.marque == "renaud") {
			malus = true;
		} else if (this.marque == "ferrari" || this.marque == "mclaren") {
			bonus = true;
		} 
		
		this.prixCourant = this.prixAchat - ((this.prixAchat/100) * anneesPass);
		this.prixCourant -= ((this.prixAchat/100)*(pourcentagekm*5));
		if (malus)
			this.prixCourant -= (this.prixAchat/100)*10;
		
		if (bonus) 
			this.prixCourant += (this.prixAchat/100)*20;
		
		if (this.prixCourant < 0) {
			this.prixCourant = 0;
		} else if (this.prixCourant > this.prixAchat) {
			this.prixCourant = this.prixAchat;
		}
		
	}
	
	public void affiche() {
		System.out.println("Marque : "+this.marque+" Date: "+this.dateAchat+" Prix d'achat "+this.prixAchat+" Prix Courant :"+this.prixCourant+" Cylindree "+this.cylindree+" Nb Portes "+this.nbPorte+" Puissance "+this.puissance+" Kilometrage "+this.kilometrage);
	}
}
