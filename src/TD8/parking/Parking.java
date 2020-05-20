package parking;
import vehicule.Voiture;
import java.util.HashMap;

public class Parking {
	int taille;
	HashMap<Integer, Voiture> parking = new HashMap<Integer, Voiture>();

	public Parking(int nbplace, HashMap<Integer, Voiture> park) { 
	taille = nbplace;
	parking = park;
	}
	public void garer(Voiture v, int place) throws IndexOutOfBoundsException, IllegalStateException{
		if(place>taille || place<0)
			throw new IndexOutOfBoundsException("Place inexistante"); 
		if(parking.get(place)==null) { 
			parking.put(place, v);
	}else { 
		throw new IllegalStateException("Place occupé");
		}
	}
	public Voiture liberer(int place) throws IndexOutOfBoundsException{
		Voiture voit = parking.get(place);
		parking.remove(place);
		return voit;
	}
	public int chercher(Voiture v) throws IllegalStateException {
		for (int i = 0; i < parking.size(); i++) {
			if(parking.get(i).equals(v)) {
				return i;
			}else {
				throw new IllegalStateException("Place inexistante");
			}
		}
		System.out.println("Voiture non présente");
		return 0;
	}
	
	public String toString() {
		for (int i = 0; i < parking.size()-1; i++) {
			System.out.println("Place : " + i + " Voiture " + parking.get(i));
		} 
		return "Place : " + taille + " Voiture" + parking.get(taille);
	}
}
