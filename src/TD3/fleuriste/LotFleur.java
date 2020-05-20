package fleuriste;

public class LotFleur {

    private int quantite;
    private Fleur Fleur;

//getters
	public int getQuantite() {
		return quantite;
	}
	
	public Fleur getFleur() {
		return Fleur;
	}

//setters
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public void setFleur(Fleur fleur) {
		Fleur = fleur;
	}

//instructions
    public LotFleur(Fleur nomFleur, int quantiteFleur) {
        this.quantite = quantiteFleur;
        this.setFleur(nomFleur);
    }









}
