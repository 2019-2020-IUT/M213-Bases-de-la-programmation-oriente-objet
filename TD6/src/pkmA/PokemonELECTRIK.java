package pkmA;

public class PokemonELECTRIK extends Pokemon{
	private String nom;
	private double taille; // en m
	private double poids; // en kg
	private int pv;
	private int pc;
	Type type;
	private int nb_pattes;
	private int nb_ailes;
	private double intensite;
	
	public PokemonELECTRIK() {
		type = Type.ELECTRIK;
	}

	public PokemonELECTRIK(String n, double t, double p, int v, int c, int g, int a, double i) {
		super(n, t, p, v, c, Type.ELECTRIK);
		this.nom = n;
		this.type = Type.ELECTRIK;
		nb_pattes = g;
		nb_ailes = a;
		intensite = i;
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
	
	public int getAiles() {
		return nb_ailes;
	}
	
	public double getIntensite() {
		return intensite;
	}
	
	public void changePv(int modif) {
		pv = Math.max(0, pv-modif);
	}

	public double calculerVitesse() {
		return (nb_ailes+nb_pattes) * intensite * 0.05;
	}
	
	public void attaquer(Pokemon adv) {
		if (adv.getType() == Type.ELECTRIK || adv.getType() == Type.PLANTE) {
			adv.changePv(Math.round(super.getPc()/2));
			System.out.println(""+this.getNom()+" inflige "+""+Math.round(super.getPc()/2)+" a "+adv.getNom());
		} else if (adv.getType() == Type.FEU) {
			adv.changePv(super.getPc());
			System.out.println(""+this.getNom()+" inflige "+""+super.getPc()+" a "+adv.getNom());
		} else {
			adv.changePv(2*super.getPc());
			System.out.println(""+this.getNom()+" inflige "+""+super.getPc()+" a "+adv.getNom());
		}
	}
	
	public String toString() {
		return "Pokemon "+super.getNom()+" de type "+type.getDescription()+" ("+super.getPoids()+" kg, "+super.getTaille()+" m, "+super.getPv()+" pts de vie, "+super.getPc()+" force de combat), "+nb_pattes+" pattes, "+nb_ailes+" ailes, "+intensite+" mA)";
	}
}
