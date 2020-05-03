package comparable;

import java.util.*;

public class main {

	public static void main(String[] args) {
		
		Personne bart = new Etudiant("Bart", 15, "2nde");
		Personne tom = new Etudiant("Tom", 13, "4eme");
		Personne max = new Etudiant("Max", 18, "Terminale");
		Personne thibault = new Enseignant("Tibault", 41, "Mathematiques");


		List <Personne> w = new ArrayList<Personne>();
		w.add(bart);
		w.add(tom);
		w.add(max);
		w.add(thibault);

		for (Personne p : w){
			System.out.println(p.toString());
		}

		Collections.sort(w);

		System.out.println("===================");

		for (Personne p : w){
			System.out.println(p.toString());
		}

		


		System.out.println("Hello World !");

	}

}
