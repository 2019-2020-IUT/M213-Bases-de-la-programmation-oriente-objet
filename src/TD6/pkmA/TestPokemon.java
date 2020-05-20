package pkmA;


public class TestPokemon {

	public static void main(String[] args) {
		Pokemon pikachu = new PokemonELECTRIK("Pikachu", 0.9, 5.3, 90, 50, 4, 0, 12);
		Pokemon aquali = new PokemonEAU("Aquali", 2.1, 56.3, 140, 90, 3);
		
		pikachu.attaquer(aquali);
		assert aquali.getPv() == 40;
		
		PokemonELECTRIK voltali = new PokemonELECTRIK("Voltali", 1.8, 47.3, 120, 130, 4, 0, 12);
		PokemonPLANTE phylali = new PokemonPLANTE("Phylali", 1.6, 28.5, 130, 70);
		Pokemon phyl = phylali;
		
		phylali.attaquer(voltali);	
		
		aquali.attaquer(phyl);
		System.out.println(voltali.toString());
	}

}
