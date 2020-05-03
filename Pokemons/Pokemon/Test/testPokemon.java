import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import pokemons.Joueur;
import pokemons.PokemonEAU;
import pokemons.PokemonELECTRIK;
import pokemons.PokemonFEU;
import pokemons.PokemonPLANTE;

class testPokemon {
	//test Pokemons
	PokemonPLANTE celebi = new PokemonPLANTE("Celebi", 0.6, 5.0, 100, 50);
	PokemonFEU hooh = new PokemonFEU("Ho-Oh", 3.8, 199.0, 106, 52, 2);
	PokemonEAU kyogre = new PokemonEAU("Kyogre", 4.5, 352.0, 100, 30, 7);
	PokemonELECTRIK electhor = new PokemonELECTRIK("Electhor", 1.6, 52.6, 90, 15, 2, 2, 90);

	@Test
	void testAffiche() {
		assertEquals("Pokemon Celebi de type PLANTE (5.0 kg, 0.6 m, 100 pts de vie, 50 force de combat)"
				, celebi.affiche());
		assertEquals("Pokemon Ho-Oh de type FEU (199.0 kg, 3.8 m, 106 pts de vie, 52 force de combat, 199.0 kg, 3.8 m, 106 pts de vie, 52 force de combat, 2 pattes)", 
				hooh.affiche());
		assertEquals("Pokemon Kyogre de type EAU (352.0 kg, 4.5 m, 100 pts de vie, 30 force de combat, 7 nageoires)",
				kyogre.affiche());
		assertEquals("Pokemon Electhor de type ELECTRIK (52.6 kg, 1.6 m, 90 pts de vie, 15 force de combat, 2 pattes, 2 ailes, 90.0 mA)", 
				electhor.affiche());
	}

	@Test
	void testCalulerVitesse() {
		assertEquals(3.3333333333333335 , celebi.calculerVitesse());
		assertEquals(11.94 , hooh.calculerVitesse());
		assertEquals(98.56 , kyogre.calculerVitesse());
		assertEquals(18.0, electhor.calculerVitesse());
	}
	
	@Test
	void testAttaque() {
		celebi.attaque(hooh);
		assertEquals(81, hooh.getPv());
		hooh.attaque(celebi);
		assertEquals(0, celebi.getPv());
		kyogre.attaque(electhor);
		assertEquals(60, electhor.getPv());
		electhor.attaque(kyogre);
		assertEquals(70, kyogre.getPv());
	}
}
