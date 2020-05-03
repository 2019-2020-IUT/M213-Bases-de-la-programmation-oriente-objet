package fleuriste;

public class Stock {
	Fleur roses;
	Fleur tulipes;
	Fleur oeillet;
	int nbr;
	int nbt;
	int nbo;
	
	public Stock(Fleur r, Fleur t, Fleur o) {
		roses = r;
		tulipes = t;
		oeillet = o;
		nbr = 0;
		nbt = 0;
		nbo = 0;
	}
	
	public void ajouteRose(int nb) {
		nbr += nb;
	}
	
	public void ajouteOeillet(int nb) {
		nbo = nb;
	}
	
	public void ajouteTulipe(int nb) {
		nbt = nb;
	}
	
	public boolean bouquetFaisable(Bouquet b) {
		boolean faisable = true;
		if (b.getLot1().nombre > nbr || b.getLot2().nombre > nbt || b.getLot3().nombre > nbo) {
			faisable = false;
		}
		return faisable;
	}
}
