package TD6.pokemon;

public class TestPokemon {
    public static void main(String[] args) {

        Pokemon tabPKM[] = new Pokemon[8];

        //fire
        PokemonFEU Infernape = new PokemonFEU("Infernape", 1.2, 55., 356, 45, 4);
        PokemonFEU Ninetales = new PokemonFEU("Ninetales", 1.1, 19.9, 350, 26, 4);

        //Electric
        PokemonELECTRIK Ampharos = new PokemonELECTRIK("Ampharos", 1.4, 61.5, 384, 32, 2, 0, 95);
        PokemonELECTRIK RaichuA = new PokemonELECTRIK("Raichu Alolan Form", .7, 21., 324, 37, 2, 0, 105);

        //water
        PokemonEAU Ludicolo = new PokemonEAU("Ludicolo", 1.5, 55., 364, 45, 2);
        PokemonEAU Froakie = new PokemonEAU("Froakie", .3, 7., 286, 20, 2);
        
        //grass
        PokemonPLANTE Roselia = new PokemonPLANTE("Roselia", .3, 2., 304, 14);
        PokemonPLANTE Torterra = new PokemonPLANTE("Torterra", 2.2, 310., 394, 44);

        tabPKM[0] = Infernape;
        tabPKM[1] = Ninetales;
        tabPKM[2] = Ampharos;
        tabPKM[3] = RaichuA;
        tabPKM[4] = Ludicolo;
        tabPKM[5] = Froakie;
        tabPKM[6] = Roselia;
        tabPKM[7] = Torterra;

        for (int i = 0; i < tabPKM.length; i++) {
            System.out.println(tabPKM[i].toString());
        }
        
        Infernape.attack(Ludicolo); 
        Ludicolo.attack(Froakie); 
        Froakie.attack(Infernape); 
        Torterra.attack(Roselia);
        Roselia.attack(RaichuA);
        RaichuA.attack(Ninetales);
        Ninetales.attack(Roselia);
        Torterra.attack(Roselia);

        System.out.println("=========================================================================");

        for (int i = 0; i < tabPKM.length; i++) {
            System.out.println(tabPKM[i].toString());
        }


        System.out.println("Hello Pokeworld !");
    
    }
}
