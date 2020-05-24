package TD3.fleuriste;

public class Bouquet {
	private LotFleur lot0;
	private LotFleur lot1; 
	private LotFleur lot2;
	
	public Bouquet(LotFleur un, LotFleur deux, LotFleur trois) {
		if (un.getFleur().getNom() == deux.getFleur().getNom() || un.getFleur().getNom() == trois.getFleur().getNom() || deux.getFleur().getNom() == trois.getFleur().getNom())
			throw new RuntimeException("Même fleurs");
		this.lot0 = un;
		this.lot1 = deux;
		this.lot2 = trois;
	}
	
	public double prix() {
		return (lot0.getPrix() + lot1.getPrix() + lot2.getPrix());
	}

	public LotFleur getLot0() {
		return this.lot0;
	}
	
	public LotFleur getLot1() {
		return this.lot1;
	}

	public LotFleur getLot2() {
		return this.lot2;
	}
	
	@Override
	public String toString() {
		return "Le bouquet est composé de " + lot0.getQuantite() + " " + lot0.getFleur().getNom() + "s, " + lot1.getQuantite() + " " + lot1.getFleur().getNom() + "s et " + lot2.getQuantite() + " " + lot2.getFleur().getNom() + ". " + lot0.toString() + " " + lot1.toString() + " " + lot2.toString() + ". Le bouquet a donc un prix de " + this.prix();
	}
	
}
