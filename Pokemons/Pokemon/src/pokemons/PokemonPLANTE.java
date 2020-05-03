package pokemons;

public class PokemonPLANTE extends Pokemon {

	//Constructeur
	public PokemonPLANTE(String n, double t, double p, int v, int c) {
		super (n, t, p, v, c);
		type = Type.PLANTE;
	}
	
	//méthodes
	@Override
	public double calculerVitesse() {
		return 10.0 / (this.getPoids()*this.getTaille());
	}
	
	@Override
	public String affiche() {
		return this.toString() + ")";
	}
	
	@Override
	public void attaque(Pokemon p) {
		System.out.println(this.getNom() + " attaque " + p.getNom());
		if (p.getType() == Type.ELECTRIK) 
			p.changePv(super.getPc()*2);
		else if (p.getType() == Type.FEU || p.getType() == Type.PLANTE)
			p.changePv( (int) Math.round(super.getPc()*0.5));
		else p.changePv(super.getPc());	
	}

}
