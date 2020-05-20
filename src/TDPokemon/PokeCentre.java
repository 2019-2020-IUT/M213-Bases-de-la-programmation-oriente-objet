package pokemons;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class PokeCentre {

	public static void main(String[] args) {
		
		try {
			//creation Partie
			Partie p = new Partie();
			p.creerPokemons("../ListePokemon.txt");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Entrez nom Joueur 1");
			String nomj1 = sc.next();
			System.out.println("Entrez nom Joueur 2");
			String nomj2 = sc.next();
			Joueur j1 = new Joueur(nomj1);
			p.ajouterJoueur(j1);
			Joueur j2 = new Joueur(nomj2);
			p.ajouterJoueur(j2);

			System.out.println(p.toString());
			
			//Choix des pokémons
				//pour j1
			for (int j=0; j<5; j++) {
				System.out.println(j1.getNom() + " entrez le nom d'un pokemon que vous souhaitez attraper");
				String nom = sc.next();
				for (int i=0; i<p.getPokemons().size(); i++) {
					if (p.getPokemons().get(i).getNom().equals(nom)) { //cherche le pokemon dans la liste
						j1.attraperPokemon(p.getPokemons().get(i));
					} 
				}
				System.out.println("Voulez-vous ajouter un autre Pokémon ? (oui/non)");
				String reponse = sc.next();
				if (reponse.equals("non")) { 
					j = 6;
					}	
			}
			System.out.println(j1.getNom() + " votre collection de Pokemon est complète !");
			System.out.println(j1.toString());
			System.out.println();
			
				//pour j2
			for (int j=0; j<6; j++) {
				System.out.println(j2.getNom() + " entrez le nom d'un pokemon que vous souhaitez attraper");
				String nom = sc.next();
				for (int i=0; i<p.getPokemons().size(); i++) {
					if (p.getPokemons().get(i).getNom().equals(nom)) { //cherche le pokemon dans la liste
						j2.attraperPokemon(p.getPokemons().get(i));
					} 
				}
				System.out.println("Voulez-vous ajouter un autre Pokémon ? (oui/non)");
				String reponse = sc.next();
				if (reponse.equals("non")) { 
					j = 6;
					}	
			}
			System.out.println(j2.getNom() + " votre collection de Pokemon est complète !");
			System.out.println(j2.toString());
			System.out.println();
			
			//Combats !!!
			System.out.println("Le combat peut commencé !!!");
			Pokemon attaquant = null;
			Pokemon deffenseur = null;
			System.out.println(j1.getNom() + " quel pokémon voulez-vous mettre en jeux ? ");
			String p1 = sc.next();
			for (int i=0; i < j1.getCollection().size(); i++) {
				if (j1.getCollection().get(i).getNom().equals(p1)) {
					attaquant = j1.getCollection().get(i);
				}		
			}
			System.out.println(j2.getNom() + " quel pokémon voulez-vous mettre en jeux ?");
			String p2 = sc.next();
			for (int j=0; j < j2.getCollection().size(); j++) {
				if (j2.getCollection().get(j).getNom().equals(p2)) {
					deffenseur = j2.getCollection().get(j);
				}		
			}
			
			while (attaquant.getPv() > 0 && deffenseur.getPv() > 0) {
				if (attaquant.calculerVitesse() > deffenseur.calculerVitesse()) {
					attaquant.attaque(deffenseur);
					deffenseur.attaque(attaquant);
				}else {
					deffenseur.attaque(attaquant);
					attaquant.attaque(deffenseur);
				}
				
				if (attaquant.getPv() <= 0) {
					System.out.println();
					System.out.println(attaquant.getNom() + " est vaincu");
					System.out.println();
					j1.getCollection().remove(attaquant);
					if (j1.getCollection().size() > 0) {
						System.out.println(j1.getNom() + " quel pokémon voulez-vous remettre en jeux ?");
						String pokemon = sc.next();
						for (int i=0; i < j1.getCollection().size(); i++) {
							if (j1.getCollection().get(i).getNom().equals(pokemon)) {
								attaquant = j1.getCollection().get(i);
							}		
						}
					}
				}	
				if (deffenseur.getPv() <= 0) {
					System.out.println();
					System.out.println(deffenseur.getNom() + " est vaincu");
					System.out.println();
					j2.getCollection().remove(deffenseur);
					if (j2.getCollection().size() > 0) {
						System.out.println(j2.getNom() + " quel pokémon voulez-vous remettre en jeux ?");
						String pokemon = sc.next();
						for (int i=0; i < j2.getCollection().size(); i++) {
							if (j2.getCollection().get(i).getNom().equals(pokemon)) {
								deffenseur = j2.getCollection().get(i);
							}		
						}
					}
				}		
			}
			
			System.out.println("Fin de partie !");
			if (j1.getCollection().size() > 0) {
				System.out.println(j1.getNom() + " est vainceur !");
			}else System.out.println(j2.getNom() + " est vainceur !");

			sc.close();

		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
