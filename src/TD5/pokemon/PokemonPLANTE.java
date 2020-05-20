package pokemon;

public class PokemonPLANTE extends Pokemon{

	public PokemonPLANTE(String n, double t, double p, int pv, int pc) {
		super.setNom(n);
		super.setTaille(t);
		super.setPoids(p);
		super.setPv(pv);
		super.setPc(pc);
		this.type = Type.PLANTE;
	}

	public void changePv(int modif) {
		this.setPv(Math.max(0, this.getPv() - modif));
	}

	@Override
	public double calculerVitesse() {
		return 10.0 / (this.getPoids() * this.getTaille());
	}

	public String toString() {
		return "Statistiques du Pokemon \"" + this.getNom() + "\" de type " + type.getDescription() + " : (" + this.getPoids() + " kg, "
				+ this.getTaille() + " m, " + this.getPv() + " pts de vie, " + this.getPc() + " force de combat)";
	}

	@Override
	public double attack(Pokemon p2) {
		if(p2.type == Type.EAU) {
			p2.setPv(p2.getPv()-this.getPc());
		}
		else if(p2.type == Type.ELECTRIK) {
			p2.setPv((p2.getPv()-this.getPc()*2));
		}
		else {
			p2.setPv((p2.getPv()-this.getPc()/2));
		}
		return 0;
	}

}