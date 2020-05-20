package pokemon;

public class PokemonFEU extends Pokemon {
	private int nb_pattes;

	public PokemonFEU(String n, double t, double p, int pv, int pc, int g) {
		super.setNom(n);
		super.setTaille(t);
		super.setPoids(p);
		super.setPv(pv);
		super.setPc(pc);
		this.type = Type.FEU;
		nb_pattes = g;
	}

	public int getPattes() {
		return nb_pattes;
	}

	public void changePv(int modif) {
		this.setPv(Math.max(0, this.getPv() - modif));
	}

	@Override
	public double calculerVitesse() {
		return this.getPoids() * nb_pattes * 0.03;
	}

	public String toString() {
		return "Statistiques du Pokemon \"" + this.getNom() + "\" de type " + type.getDescription() + " : (" + this.getPoids() + " kg, "
				+ this.getTaille() + " m, " + this.getPv() + " pts de vie, " + this.getPc() + " force de combat, "
				+ nb_pattes + " pattes)";
	}

	@Override
	public double attack(Pokemon p2) {
		if(p2.type == Type.FEU) {
			p2.setPv(p2.getPv()-this.getPc());
		}
		else if(p2.type == Type.PLANTE) {
			p2.setPv((p2.getPv()-this.getPc()*2));
		}
		else {
			p2.setPv((p2.getPv()-this.getPc()/2));
		}
		return 0;
	}

}
