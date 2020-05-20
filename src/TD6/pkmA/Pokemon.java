package pkmA;

public abstract class Pokemon{
	private String nom;
	private double taille;
	private double poids;
	private int pv; 
	private int pc;
	Type type;
	
	public Pokemon() {
		
	}
	
	public Pokemon(String nom, double taille, double poids, int pv, int pc, Type type) {
		if (type != Type.ELECTRIK && type != Type.EAU && type != Type.FEU && type != Type.PLANTE) 
			throw new RuntimeException("Ce type : "+type.getDescription()+" n'existe pas");
		
		try {
			this.nom = nom;
			this.taille = taille;
			this.poids = poids;
			this.pv = pv;
			this.pc = pc;
			this.type = type;
		} catch (Exception e) {
			e.getMessage();
		}
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
	
	public abstract void changePv(int modif);
	
	public abstract void attaquer(Pokemon adv);
}
