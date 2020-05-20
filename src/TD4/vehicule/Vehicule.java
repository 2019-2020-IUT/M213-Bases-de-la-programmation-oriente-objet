package TD4.vehicule;

public class Vehicule {
	protected String marque;
	protected int dateAchat;
	protected double prixAchat;
	protected double prixCourant;
	
	public Vehicule() {
		marque = "";
		dateAchat = 0;
		prixAchat = 0;
		prixCourant = 0;
	}
	
	public Vehicule(String s, int d, double pA) {
		this.marque = s;
		dateAchat = d;
		prixAchat = pA;
		prixCourant = 0;
	}
	
	public void calculPrix(int y) {
		int previousY = this.dateAchat - y;
		this.prixCourant = this.prixAchat - ((this.prixAchat/100) * previousY);
	}
	
	public void affiche() {
		System.out.println(""+this.marque+" "+this.dateAchat+" "+this.prixAchat+" "+prixCourant);
	}
	
}
