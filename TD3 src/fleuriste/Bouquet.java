package fleuriste;

public class Bouquet {
	private LotFleurs lot1;
	private LotFleurs lot2; 
	private LotFleurs lot3;
	
	public Bouquet(LotFleurs un, LotFleurs deux, LotFleurs trois) {
		if (un.fleur.getNom() == deux.fleur.getNom() || un.fleur.getNom() == trois.fleur.getNom() || deux.fleur.getNom() == trois.fleur.getNom())
			throw new RuntimeException("Même fleurs");
		lot1 = un;
		lot2 = deux;
		lot3 = trois;
	}
	
	public double prix() {
		double prix = lot1.fleur.prix*lot1.nombre+lot2.fleur.prix*lot2.nombre+lot3.fleur.prix*lot3.nombre;
		return prix += prix*15/100;
	}

	public LotFleurs getLot1() {
		return lot1;
	}

	public LotFleurs getLot2() {
		return lot2;
	}

	public LotFleurs getLot3() {
		return lot3;
	}
	
}
