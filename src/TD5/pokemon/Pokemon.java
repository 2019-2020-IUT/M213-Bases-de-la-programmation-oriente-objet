package pokemon;

public class Pokemon {

    private String nom;
	private double taille; // en m
	private double poids; // en kg
	private int pv;
	private int pc;
    Type type;
    
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

    //setters
    public void setNom(String nom) {
		this.nom = nom;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public void setPc(int pc) {
		this.pc = pc;
	}

	public void setType(Type type) {
		this.type = type;
	}

    public Pokemon() {
        nom = null;
        taille = 0.;
        poids = 0.;
        pv = 0;
        pc = 0;
    }    

	public Pokemon(String n, double t, double p, int pv, int pc) {
    this.nom = n;
    this.taille = t;
    this.poids = p;
    this.pv = pv;
    this.pc = pc;
    this.type = null;
    }

    public double calculerVitesse() {
        return 0.;
    }

    public double attack(Pokemon p2) {
        return 0;
    }

}
