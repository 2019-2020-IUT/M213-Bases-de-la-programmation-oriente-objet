package pokemon;

import java.util.*;

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
        
        ArrayList<Pokemon> l1 = new ArrayList<Pokemon>();
        ArrayList<Pokemon> l2 = new ArrayList<Pokemon>();

        l1.add(Infernape);
        l1.add(Ludicolo);
        l1.add(Roselia);
        l1.add(Ampharos);

        l2.add(Voltali);
        l2.add(Salameche);
        l2.add(Froakie);
        l2.add(Herbizarre);
        l2.add(Torterra);
        l2.add(Carapuce);
        l2.add(Ninetales);

        JunkJumper.setPokemon(l1);
        Mkel.setPokemon(l2);
        
        System.out.println("===== Collection 1 : =====");;
        for (Pokemon pokemon : l1) {
            System.out.println(pokemon.toString());
        }
        
        System.out.println("===== Collection 2 : =====");;
        for (Pokemon pokemon : l2) {
            System.out.println(pokemon.toString());
        }

        Collections.sort(l1);
        Collections.sort(l2);

        JunkJumper.setNiveau(4);
        Mkel.setNiveau(7);

        System.out.println("\n Tri par nom effectue");

        System.out.println("===== Collection 1 : =====");;
        for (Pokemon pokemon : l1) {
            System.out.println(pokemon.toString());
        }
        
        System.out.println("===== Collection 2 : =====");;
        for (Pokemon pokemon : l2) {
            System.out.println(pokemon.toString());
        }

        ArrayList<Joueur> lj = new ArrayList<Joueur>();

        lj.add(JunkJumper);
        lj.add(Mkel);

        for (Joueur joueur : lj) {
            System.out.println(joueur.toString());
        }
        
        Collections.sort(lj);
        System.out.println("\n Tri par nom effectue");
        for (Joueur joueur : lj) {
            System.out.println(joueur.toString());
        }







        System.out.println("Hello Pokeworld !");
    
    }
}
