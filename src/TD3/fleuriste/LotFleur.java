package TD3.fleuriste;

public class LotFleur {

    private int quantite;
    private Fleur Fleur;

    public LotFleur(Fleur nomFleur, int quantiteFleur) {
        this.quantite = quantiteFleur;
        this.setFleur(nomFleur);
    }

  	public int getQuantite() {
  		return quantite;
  	}
  	
  	public Fleur getFleur() {
  		return Fleur;
  	}
  	
  	public double getPrix() {
  		return this.getFleur().getPrix() * this.getQuantite();
  	}

  	public void setQuantite(int quantite) {
  		this.quantite = quantite;
  	}
  	
  	public void setFleur(Fleur fleur) {
  		Fleur = fleur;
  	}
  	
  	@Override
  	public String toString() {
  		return this.getFleur().toString() + " Le lot de " + this.getQuantite() + " " + this.getFleur().getNom() + "s coute donc " + this.getPrix() + "€.";
  	}






}
