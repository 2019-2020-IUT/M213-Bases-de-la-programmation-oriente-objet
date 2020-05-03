package pokemons;
import java.io.*;
import java.util.*;

public class Partie {
	//atributs
	private ArrayList<Joueur> joueurs;
	private ArrayList<Pokemon> pokemons;
	
	//getters
	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}
	
	//méthode
	public void creerPokemons(String s) throws IOException, FileNotFoundException, InputMismatchException {
		Scanner pokemon = new Scanner(new File (s));
		ArrayList<Pokemon> pokemons= new ArrayList<Pokemon>();
		while (pokemon.hasNextLine()) 
		{
			String str = pokemon.nextLine();
			Scanner scn = new Scanner(str);
			scn.useDelimiter("\\s* \\s*");
			String nom = scn.next();
			String type = scn.next();
			double taille = Double.parseDouble(scn.next());
			double poids = Double.parseDouble(scn.next());
			int pv = Integer.parseInt(scn.next());
			int pc = Integer.parseInt(scn.next());
			
			switch (type) {
			case "Eau" :
				int nbNageoires = Integer.parseInt(scn.next()); 
				PokemonEAU p1 = new PokemonEAU(nom, taille, poids, pv, pc, nbNageoires) ;
				pokemons.add(p1);
				break;
			case "Plante" : 
				PokemonPLANTE p2 = new PokemonPLANTE(nom, taille, poids, pv, pc);
				pokemons.add(p2); 
				break;
			case "Feu" :
				int nbPattes = Integer.parseInt(scn.next());
				PokemonFEU p3 = new PokemonFEU(nom, taille, poids, pv, pc, nbPattes);
				pokemons.add(p3);
				break;
			case "Electrik" :
				int nb_Pattes = Integer.parseInt(scn.next());
				int nbAiles = Integer.parseInt(scn.next());
				int intensite = Integer.parseInt(scn.next());
				PokemonELECTRIK p4 = new PokemonELECTRIK(nom, taille, poids, pv, pc, nb_Pattes, nbAiles, intensite);
				pokemons.add(p4);
				break;	
			}
			scn.close();
		}
		pokemon.close();
		this.pokemons = pokemons;
		
	}
	
	public void ajouterJoueur(Joueur j) {
		ArrayList<Joueur> joueurs= new ArrayList<Joueur>();
		joueurs.add(j);
		this.joueurs = joueurs;
		System.out.println(joueurs.toString());
	}
	
	public String toString() {
		System.out.println();
		System.out.println("Et voici la liste des pokemons disponibles : ");
		for (int j=0; j< pokemons.size(); j++) {
			System.out.println(pokemons.get(j).affiche());
		}
		return "";
	}
}
