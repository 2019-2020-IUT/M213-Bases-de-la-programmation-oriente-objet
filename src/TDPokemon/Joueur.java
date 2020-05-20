package pokemons;
import java.util.*;

public class Joueur {
	private String nom;
	private int niveau;
	private int nbPoints;
	private ArrayList<Pokemon> collection;
	
	//constructeur
	public Joueur(String nom) {
		this.nom = nom;
		this.niveau = 1;
		this.nbPoints = 0; 
		collection = new ArrayList<Pokemon>();
	}
	
	//Getters
	public ArrayList<Pokemon> getCollection() {
		return collection;
	} 
	
	public String getNom() {
		return nom;
	}
	
	public int getNiveau() {
		return niveau;
	}

	public int getnbPoints() {
		return nbPoints;
	}

	//méthodes
	public void attraperPokemon(Pokemon p) {
		this.collection.add(p);
		System.out.println(this.nom + " à attraper " + p.getNom());
	}
	
	public void transfererPokemon(Pokemon p) {
		this.collection.remove(p);
		System.out.println(this.nom + " à transférer " + p.getNom());
	}
	
	public double vitesseMoyenne() {
		double resultat = 0;
		for (Pokemon p : collection) 
			resultat += p.calculerVitesse();
		return resultat / collection.size();
	}
	
	public double vitesseMoyenneTYPE(String t) {
		double resultat = 0;
		int compteur = 0;
		for (Pokemon p : collection) {
			if (p.getType().getDescription().equals(t)) {
				resultat += p.calculerVitesse();
				compteur++;
			}
		}
		return resultat / compteur;
	}
	
	public String toString() {
		System.out.println("Joueur " + this.nom + ", niveau " + this.niveau + 
				"\rNombre de points : " + this.nbPoints + 
				"\rPossède : ");
		for (int i=0; i<collection.size(); i++) {
			System.out.println(collection.get(i).affiche());
		}
		return "";
	}
	
	public void gagnerNiveau() {
		this.niveau ++;
		System.out.println(this.nom + " gagne un niveau, niveau actuelle : " + this.getNiveau());
	}
}
