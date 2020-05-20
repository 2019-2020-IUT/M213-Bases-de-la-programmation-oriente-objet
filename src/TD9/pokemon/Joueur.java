package pokemon;

import java.util.*;
import java.lang.Math;

public class Joueur implements Comparable<Joueur> {

    private String nom;
    private int niveau;         //Nombre pokemon captures
    private int nbPoints;       //Nombre pokemon actuel
    private ArrayList<Pokemon> pokemon;
	
    public Joueur() {
        
        this.nom = null;
        this.niveau = 1;
        this.nbPoints = 0;
        this.pokemon = new ArrayList<Pokemon>();
    }
    
    public Joueur(String s) {
        this.nom = s;
        this.niveau = 1;
        this.nbPoints = 0;
        this.pokemon = new ArrayList<Pokemon>();
    }

    public String toString() {
        return "================================================================================\n" + "Le joueur " + this.nom + " a " + this.niveau + " pokemons!\nLes pokemons qu'il possede sont : " + this.pokemon.toString() + "\n================================================================================";
    }

    public int compareTo(Joueur j)
    {
        return this.getNom().compareTo(j.getNom());
    }
    
    public double vitesseMoyenne() {
        
        if(pokemon.isEmpty())
        {
            return 0;
        }

        double moyenne = 0.;

        for (Pokemon p : pokemon) {
            moyenne += p.calculerVitesse();
        }
        
        return moyenne/pokemon.size();
    }
    
    public double vitesseMoyenne(String s) {
    int count = 0;

        if(pokemon.isEmpty())
        {
            return 0;
        }

        double moyenne = 0.;

        for (Pokemon p : pokemon) {
            
            if(p.getType().getDescription().equals(s))
            {
                moyenne += p.calculerVitesse();
                count++;
            }
        }
        return moyenne/count;
    }

    public void attrapePokemon(Pokemon p){
        this.niveau++;
        this.nbPoints++;
        this.pokemon.add(p);
        
    }

    public void relachePokemon(Pokemon p) {
        this.nbPoints--;
        this.pokemon.remove(p);
    }
    
    public void attack(Object obj) {
        Joueur j = (Joueur)obj;
        int x = (int)Math.random()*this.getPokemon().size();
        int y = (int)Math.random()*j.getPokemon().size();
        this.pokemon.get(x).attack(this.pokemon.get(y));
        j.pokemon.get(y).attack(this.pokemon.get(x));
    }
    
    public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public int getNbPoints() {
		return nbPoints;
	}
	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}
	public ArrayList<Pokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(ArrayList<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}

    
    
}
