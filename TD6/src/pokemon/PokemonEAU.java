package pokemon;

public class PokemonEAU extends Pokemon{
	private int nb_nageoires;

	public PokemonEAU(String n, double t, double p, int pv, int pc, int g) {
		super.setNom(n);
		super.setTaille(t);
		super.setPoids(p);
		super.setPv(pv);
		super.setPc(pc);
		this.type = Type.EAU;
		nb_nageoires = g;
	}
	public int getNb_nageoires() {
		return nb_nageoires;
	}

	public void changePv(int modif) {
		this.setPv(Math.max(0, this.getPv() - modif));
	}

	@Override
	public double calculerVitesse() {
		return (this.getPoids() * nb_nageoires) / 25.0;
	}

	public String toString() {
		return "Statistiques du Pokemon \"" + this.getNom() + "\" de type " + type.getDescription() + " : (" + this.getPoids() + " kg, "
				+ this.getTaille() + " m, " + this.getPv() + " pts de vie, " + this.getPc() + " force de combat, " + nb_nageoires + " nageoires)";
	}

	@Override
	public double attack(Pokemon p2) {
		if(p2.type == Type.ELECTRIK) {
			p2.setPv(p2.getPv()-this.getPc());
		}
		else if(p2.type == Type.FEU) {
			p2.setPv((p2.getPv()-this.getPc()*2));
		}
		else {
			p2.setPv((p2.getPv()-this.getPc()/2));
		}
		return 0;
	}



}
