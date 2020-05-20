package TDPokemons;

public abstract class Pokemon implements IAttaque, Comparable<Pokemon> {
	//attributs
	private String nom;
	private double taille; // en m
	private double poids; // en kg
	private int pv;
	private int pc;
	Type type;

	//constructeurs
	public Pokemon(String n, double t, double p, int v, int c) {
		nom = n;
		taille = t;
		poids = p;
		pv = v;
		pc = c;
	}

	//getters
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

	 //M�thodes
	public String toString() {
		return "Pokemon "+nom
				+" de type "+ type.getDescription()
				+" ("+poids+" kg, "
				+taille+" m, "
				+pv+" pts de vie, "
				+pc+" force de combat";
	}
	
	public void changePv(int modif) {
		pv = Math.max(0, pv-modif);
		System.out.println(this.nom + " perd " + modif + " pv");
	}
	
	public abstract void attaque(Pokemon p);
	
	public abstract double calculerVitesse();
	
	public abstract String affiche();
	
	public int compareTo(Pokemon p)
    {
    	int n = this.getType().getDescription().compareTo(p.getType().getDescription());
    	if (n == 0)
    		return this.getPv() - p.getPv();
    	else return n;
    }
}
