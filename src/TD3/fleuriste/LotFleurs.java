package fleuriste;

public class LotFleurs {
	Fleur fleur;
	int nombre;
	
	public LotFleurs(Fleur f, int nb) {
		fleur = f.clone();
		nombre = nb;
	}
	
	public int getNombre() {
		return this.nombre;
	}
	
	
}
