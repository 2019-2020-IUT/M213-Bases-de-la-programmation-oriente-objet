package pkmA;

public class PokemonFEU extends Pokemon{
	private String nom;
	private double taille; // en m
	private double poids; // en kg
	private int pv;
	private int pc;
	Type type;
	private int nb_pattes;
	
	public PokemonFEU() {
		type = Type.FEU;
	}

	public PokemonFEU(String n, double t, double p, int v, int c, int g) {
		super(n, t, p, v, c, Type.FEU);
		this.nom = n;
		this.type = Type.FEU;
		nb_pattes = g;
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

	public int getPattes() {
		return nb_pattes;
	}
	
	public void changePv(int modif) {
		pv = Math.max(0, pv-modif);
	}
	
	public double calculerVitesse() {
		return this.getPoids()*nb_pattes* 0.03;
	}
	
	public void attaquer(Pokemon adv) {
		if (adv.getType() == Type.EAU || adv.getType() == Type.ELECTRIK) {
			adv.changePv(Math.round(super.getPc()/2));
			System.out.println(""+this.getNom()+" inflige "+""+Math.round(super.getPc()/2)+" a "+adv.getNom());
		} else if (adv.getType() == Type.FEU) {
			adv.changePv(super.getPc());
			System.out.println(""+this.getNom()+" inflige "+""+super.getPc()+" a "+adv.getNom());
		} else {
			adv.changePv(2*super.getPc());
			System.out.println(""+this.getNom()+" inflige "+""+2*super.getPc()+" a "+adv.getNom());
		}
	}
	
	public String toString() {
		return "Pokemon "+super.getNom()+" de type "+type.getDescription()+" ("+super.getPoids()+" kg, "+super.getTaille()+" m, "+super.getPv()+" pts de vie, "+super.getPc()+" force de combat), "+nb_pattes+" pattes)";
	}

}
