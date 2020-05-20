package pokemons;
import java.util.Comparator;

public class CompareNiveau implements Comparator<Joueur> {
	public int compare(Joueur j1, Joueur j2) {
		if (j1.getNiveau() > j2.getNiveau())
			return -1;
		else return 0;
	}
}
