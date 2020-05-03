package pkmA;

public class PokemonPLANTE extends Pokemon{
	private String nom;
	private double taille; // en m
	private double poids; // en kg
	private int pv;
	private int pc;
	Type type;
	
	public PokemonPLANTE() {
		type = Type.PLANTE;
	}

	public PokemonPLANTE(String n, double t, double p, int v, int c) {
		super(n, t, p, v, c, Type.PLANTE);
		this.nom = n;
		this.type = Type.PLANTE;
	}
	
	public String getNom() {
		return nom;
	}

	public double getTaille() {
		return taille;
	}

	public double getPoids() {
		return poids;
	}

	public int getPv() {
		return pv;
	}

	public int getPc() {
		return pc;
	}

	public Type getType() {
		return type;
	}

	public void changePv(int modif) {
		pv = Math.max(0, pv-modif);
	}

	public double calculerVitesse() {
		return 10.0 / (this.getPoids()*this.getTaille());
	}
	
	public void attaquer(Pokemon adv) {
		if (adv.getType() == Type.FEU || adv.getType() == Type.PLANTE) {
			adv.changePv(Math.round(super.getPc()/2));
			System.out.println(""+this.getNom()+" inflige "+""+Math.round(super.getPc()/2)+" a "+adv.getNom());
		} else if (adv.getType() == Type.EAU) {
			adv.changePv(super.getPc());
			System.out.println(""+this.getNom()+" inflige "+""+super.getPc()+" a "+adv.getNom());
		} else {
			adv.changePv(2*super.getPc());
			System.out.println(""+this.getNom()+" inflige "+""+2*super.getPc()+" a "+adv.getNom());
		}
	}
	
	public String toString() {
		return "Pokemon "+super.getNom()+" de type "+type.getDescription()+" ("+super.getPoids()+" kg, "+super.getTaille()+" m, "+super.getPv()+" pts de vie, "+super.getPc()+" force de combat),";
	}

}
