package vehicule;

public class Avion extends Vehicule {
	protected String moteur; 
	protected int heuresVol;
	
	public Avion() {
		moteur = "Moteur"; 
		heuresVol = 0;
	}
	
	public Avion(String marque, int date, double prixac, String moteur, int heures) {
		this.moteur = moteur; 
		heuresVol = heures;
		this.marque = marque;
		dateAchat = date;
		prixAchat = prixac;
		prixCourant = 0;
	}
	
	public void calculePrix(int annee) {
		double pourcentage; 
		if (moteur == "hélice") {
			pourcentage = 10*Math.floor(this.heuresVol/100);
		} else {
			pourcentage = 10* Math.floor(this.heuresVol/1000);
		}
		super.prixCourant = super.prixAchat - ((super.prixAchat/100) * pourcentage);
		if (super.prixCourant < 0) {
			super.prixCourant = 0;
		}
	}
	
	public void affiche() {
		System.out.println(""+this.marque+" "+this.dateAchat+" "+this.prixAchat+" "+prixCourant+" "+this.moteur+" "+this.heuresVol);
	}
}
