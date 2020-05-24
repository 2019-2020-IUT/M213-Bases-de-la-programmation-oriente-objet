package TD3.fleuriste;

public class Stock {
	
	//roses = 0, tulipes = 1, œillets = 2
	
	private Fleur[] fleurs = new Fleur[3];
	private int quantite[] = {0, 0, 0};
	
	public Stock() {
		this(null, null, null);
	}
	
	public Stock(Fleur r, Fleur t, Fleur o) {
		this.fleurs[0] = r;
		this.fleurs[1] = t;
		this.fleurs[2] = o;
	}
	
	public void ajouteFleur(Fleur f, int q) {
		switch (f.getNom().toLowerCase()) {
		case "rose":
			this.setQuantite(0, this.getFleurQuantity(f.getNom()) + q);
			break;
		case "tulipe":
			this.setQuantite(1, this.getFleurQuantity(f.getNom()) + q);
			break;
		case "oeillet":
			this.setQuantite(2, this.getFleurQuantity(f.getNom()) + q);
			break;
		default:
			System.err.println("Aucune fleur n'a été ajoutée");
			break;
		}
	}
	
	public boolean bouquetFaisable(Bouquet b) {
		return (this.quantite[0] > b.getLot0().getQuantite() || this.quantite[1] > b.getLot1().getQuantite() || this.quantite[2] > b.getLot2().getQuantite());
	}
	
	@Override
	public String toString() {
		return "Il y a en stock " + this.getFleurQuantity("rose") + " roses, " + this.getFleurQuantity("tulipe") + " tulipes et " + this.getFleurQuantity("oeillet") + " oeillets. ";
	}

	public int getFleurQuantity(String s) {
		switch (s.toLowerCase()) {
		case "rose":
			return this.getQuantite(0);
		case "tulipe":
			return this.getQuantite(1);
		case "oeillet":
			return this.getQuantite(2);
		default:
			System.err.println("Aucune fleur n'a été ajoutée");
			return 0;
		}
	}

	public void setFleurQuantity(String f, int q) {
		switch (f.toLowerCase()) {
		case "rose":
			this.setQuantite(0, q);
			break;
		case "tulipe":
			this.setQuantite(1, q);
			break;
		case "oeillet":
			this.setQuantite(2, q);
			break;
		default:
			System.err.println("Aucune fleur n'a été ajoutée");
			break;
		}
	}
	
	private void setQuantite(int index, int i) {
		this.quantite[index] = i;
	}
	
	private int getQuantite(int i) {
		return this.quantite[i];
	}
	
}
