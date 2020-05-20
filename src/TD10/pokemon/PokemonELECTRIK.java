package TD10.pokemon;

public class PokemonELECTRIK extends Pokemon {
	private int nb_pattes;
	private int nb_ailes;
	private double intensite;

	public PokemonELECTRIK(String n, double t, double p, int pv, int pc, int g, int a, double i) {
		super.setNom(n);
		super.setTaille(t);
		super.setPoids(p);
		super.setPv(pv);
		super.setPc(pc);
		this.type = Type.ELECTRIK;
		nb_pattes = g;
		nb_ailes = a;
		intensite = i;
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
		this.setPv(Math.max(0, this.getPv() - modif));
	}

	@Override
	public double calculerVitesse() {
		return (nb_ailes + nb_pattes) * intensite * 0.05;
	}

    public String toString() {
		return this.getNom();
	}

	@Override
	public double attack(Pokemon p2) {
		if (p2.type == Type.FEU) {
			p2.setPv(p2.getPv() - this.getPc());
		} else if (p2.type == Type.EAU) {
			p2.setPv((p2.getPv() - this.getPc() * 2));
		} else {
			p2.setPv((p2.getPv() - this.getPc() / 2));
		}
		return 0;
	}
}
