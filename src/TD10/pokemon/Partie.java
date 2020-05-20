package pokemon;

import java.io.*;
import java.util.*;

/*
    new PokemonFEU(String n, double t, double p, int pv, int pc, int g)
    new PokemonEAU(String n, double t, double p, int pv, int pc, int g)
    new PokemonELECTRIK(String n, double t, double p, int pv, int pc, int g, int a, double i)
    new PokemonPLANTE(String n, double t, double p, int pv, int pc)
*/

public class Partie {

    public static void main(String[] args) {

        ArrayList<Pokemon> listePKM = new ArrayList<Pokemon>();

        try {

            FileReader lecturePkm = new FileReader("-ListePokemon.txt");
            BufferedReader bufferPkm = new BufferedReader(lecturePkm);

            while (bufferPkm.ready()) {
                String displayLine = bufferPkm.readLine();
                String[] tabs = displayLine.split(" ");

                String typePKM = tabs[1];

                // nom - type - taille - poids - pv - pc

                switch (typePKM) {
                case "Feu":
                    PokemonFEU pF = new PokemonFEU(tabs[0], Double.parseDouble(tabs[2]), Double.parseDouble(tabs[3]),
                            Integer.parseInt(tabs[4]), Integer.parseInt(tabs[5]), Integer.parseInt(tabs[6]));
                    listePKM.add(pF);
                    // On créer ici un pokemon feu que l'on ajoute à notre ArrayList
                    break;

                case "Eau":
                    PokemonEAU pE = new PokemonEAU(tabs[0], Double.parseDouble(tabs[2]), Double.parseDouble(tabs[3]),
                            Integer.parseInt(tabs[4]), Integer.parseInt(tabs[5]), Integer.parseInt(tabs[6]));
                    listePKM.add(pE);
                    // On créer ici un pokemon feu que l'on ajoute à notre ArrayList
                    break;

                case "Plante":
                    PokemonPLANTE pP = new PokemonPLANTE(tabs[0], Double.parseDouble(tabs[2]),
                            Double.parseDouble(tabs[3]), Integer.parseInt(tabs[4]), Integer.parseInt(tabs[5]));
                    listePKM.add(pP);
                    // On créer ici un pokemon feu que l'on ajoute à notre ArrayList
                    break;

                case "Electrik":
                    PokemonELECTRIK pEl = new PokemonELECTRIK(tabs[0], Double.parseDouble(tabs[2]),
                            Double.parseDouble(tabs[3]), Integer.parseInt(tabs[4]), Integer.parseInt(tabs[5]),
                            Integer.parseInt(tabs[6]), Integer.parseInt(tabs[7]), Double.parseDouble(tabs[8]));
                    listePKM.add(pEl);
                    // On créer ici un pokemon feu que l'on ajoute à notre ArrayList
                    break;

                default:
                    System.err.println("Erreur");
                    break;
                }
                
            }
            System.out.println(listePKM.toString());
            
            bufferPkm.close();
            lecturePkm.close();

        } catch (FileNotFoundException e) {

            System.err.println("Fichier non trouve");

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Fichier indisponible");
        }

    }
}