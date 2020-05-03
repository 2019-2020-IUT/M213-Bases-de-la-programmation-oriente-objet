package segments;

import Coords.Coords;

public class Segment {
	private Coords origine;
	private Coords extremite;
	
	
	
	public Segment(Coords debut, Coords fin) throws RuntimeException {
		if (debut.equals(fin) == true) 
			throw new RuntimeException("Points confondus");
			origine = new Coords(debut);
			extremite = new Coords(fin);
	}
	
	public Coords getOrigine() {
		return this.origine;
	}
	
	
	public Coords getExtremite() {
		return this.extremite;
	}
	
	public double length() {
		return this.origine.getDistance(this.extremite);
	}
	
	public Segment projX() {
		Segment projetX = new Segment(this.origine.projx(), this.extremite.projx());
		return projetX;
	}
	
	public Segment projY() {
		Segment projetY = new Segment(this.origine.projY(), this.extremite.projY());
		return projetY;
	}
	
	
	public boolean equals(Segment deux) {
		if (this.origine.equals(deux.origine) && this.extremite.equals(deux.extremite)) {
			return true;
		} else if (this.origine.equals(deux.extremite) && this.extremite.equals(deux.origine)){ 
			return true;
		} else {
			return false;
		}
	}
	
	public Segment clone() {
		Segment clonage = new Segment(this.origine, this.extremite);
		return clonage; 
	}
	
	public String toString() {
		return "Le point d'origine à pour coordonnées "+this.origine.toString()+" et le point d'extremite à pour coordonnées "+this.extremite.toString();
	}
	
	
}


