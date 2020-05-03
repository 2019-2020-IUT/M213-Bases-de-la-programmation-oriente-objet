package pokemons;

import java.util.Comparator;

public class CompareAlpha implements Comparator<Joueur>{
	public int compare(Joueur j, Joueur j2) {
		return j.getNom().compareTo(j2.getNom());
	}
}
