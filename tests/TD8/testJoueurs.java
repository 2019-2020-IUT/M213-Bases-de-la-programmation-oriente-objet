import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import pokemon.*;

import org.junit.jupiter.api.Test;

class testJoueurs {

        Joueur j1 = new Joueur("JunkJumper");
        Joueur j2 = new Joueur("Rival");

        PokemonELECTRIK p1 = new PokemonELECTRIK("Pikachu",0.5,5.,50,10,4,0,10);
        PokemonPLANTE p2 = new PokemonPLANTE("Herbizarre",0.5,5.,50,10);
        PokemonEAU p3 = new PokemonEAU("Carapuce",0.5,5.,50,10,0);
        PokemonFEU p4  = new PokemonFEU("Salameche",0.5,5.,50,10,4);
        

    
    @AfterEach 
    public void nettoyer() { 
        j1 = null; 
        j2 = null;
    }

    @Test
    public void test()
    {
    	j1.attrapePokemon(p1);
        j2.attrapePokemon(p2);
        j2.attrapePokemon(p4);
        System.out.println("Debut du combat contre le rival :");
        System.out.println(p1.getNom()+" a "+p1.getPv()+" pv");
        System.out.println(p2.getNom()+" a "+p2.getPv()+" pv");
        do {

            j1.attack(j2);
            j2.attack(j1);
            System.out.println(p1.getNom()+" a "+p1.getPv()+" pv");
            System.out.println(p2.getNom()+" a "+p2.getPv()+" pv");
        }while ((p1.getPv() > 0) &&  (p2.getPv() > 0));

    }
}