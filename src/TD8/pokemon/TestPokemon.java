package pokemon;

public class TestPokemon {
    @SuppressWarnings("unused")
	public static void main(String[] args) {

        //fire
        PokemonFEU Infernape = new PokemonFEU("Infernape", 1.2, 55., 356, 45, 4);
        PokemonFEU Ninetales = new PokemonFEU("Ninetales", 1.1, 19.9, 350, 26, 4);
        PokemonFEU Salameche  = new PokemonFEU("Salameche",0.5,5.,50,10,4);

        //Electric
        PokemonELECTRIK Ampharos = new PokemonELECTRIK("Ampharos", 1.4, 61.5, 384, 32, 2, 0, 95);
        PokemonELECTRIK RaichuA = new PokemonELECTRIK("Raichu Alolan Form", .7, 21., 324, 37, 2, 0, 105);
        PokemonELECTRIK Voltali = new PokemonELECTRIK("Voltali", 1.8, 47.3, 120, 130, 4, 0, 12);
        PokemonELECTRIK Pikachu = new PokemonELECTRIK("Pikachu", 0.9, 5.3, 90, 50, 4, 0, 12);

        //water
        PokemonEAU Ludicolo = new PokemonEAU("Ludicolo", 1.5, 55., 364, 45, 2);
        PokemonEAU Froakie = new PokemonEAU("Froakie", .3, 7., 286, 20, 2);
		PokemonEAU Aquali = new PokemonEAU("Aquali", 2.1, 56.3, 140, 90, 3);
        PokemonEAU Carapuce = new PokemonEAU("Carapuce",0.5,5.,50,10,0);
        
        //grass
        PokemonPLANTE Roselia = new PokemonPLANTE("Roselia", .3, 2., 304, 14);
        PokemonPLANTE Torterra = new PokemonPLANTE("Torterra", 2.2, 310., 394, 44);
		PokemonPLANTE Phylali = new PokemonPLANTE("Phylali", 1.6, 28.5, 130, 70);
        PokemonPLANTE Herbizarre = new PokemonPLANTE("Herbizarre",0.5,5.,50,10);



        Joueur JunkJumper = new Joueur("JunkJumper");
        Joueur Mkel = new Joueur("Mkel");
        
        JunkJumper.attrapePokemon(Infernape);
        JunkJumper.attrapePokemon(Ampharos);
        JunkJumper.attrapePokemon(Ludicolo);
        JunkJumper.attrapePokemon(Roselia);
        JunkJumper.attrapePokemon(Torterra);
        JunkJumper.attrapePokemon(RaichuA);

        JunkJumper.relachePokemon(Torterra);
        JunkJumper.relachePokemon(RaichuA);

        Mkel.attrapePokemon(Ampharos);
        Mkel.attrapePokemon(RaichuA);
        Mkel.attrapePokemon(Voltali);
        Mkel.attrapePokemon(Pikachu);
        Mkel.attrapePokemon(Infernape);
        Mkel.attrapePokemon(Ninetales);
        Mkel.attrapePokemon(Salameche);
        
        Mkel.relachePokemon(Voltali);
        Mkel.relachePokemon(Pikachu);
        Mkel.relachePokemon(Infernape);
        Mkel.relachePokemon(Ninetales);






        System.out.println(JunkJumper.toString());
        System.out.println(Mkel.toString());
        
        System.out.println("Hello Pokeworld !");
    
    }
}
