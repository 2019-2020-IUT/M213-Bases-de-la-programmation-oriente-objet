package fleuriste;

public class Fleur {

    private String nom;
    private double prix;
    
//getters

	public String getNom() {
		return nom;
	}

    public void setNom(String nom) {
        this.nom = nom;
    }

//setters
    
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
//instructions
    
    public Fleur(String nomFleur, double prixFleur) {
        this.nom = nomFleur;
        this.prix = prixFleur;
    }

}
