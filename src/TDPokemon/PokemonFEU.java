package pokemons;

public class PokemonFEU extends Pokemon {
	//attributs
	private int nb_pattes;
	
	//constructeurs
	public PokemonFEU(String n, double t, double p, int v, int c, int g) {
		super (n, t, p, v, c);
		nb_pattes = g;
		type = Type.FEU;
	}
	
	//getters

	public int getPattes() {
		return nb_pattes;
	}
	
	//méthodes
	@Override
	public double calculerVitesse() {
		return this.getPoids()*nb_pattes* 0.03;
	}
	
	@Override
	public String affiche() {
		return this.toString() + ", " +super.getPoids()+" kg, "+super.getTaille()+" m, "+super.getPv()+" pts de vie, "+super.getPc()+" force de combat, "+nb_pattes+" pattes)";
	}
	
	@Override
	public void attaque(Pokemon p) {
		System.out.println(this.getNom() + " attaque " + p.getNom());
		if (p.getType() == Type.PLANTE) 
			p.changePv(super.getPc()*2);
		else if (p.getType() == Type.EAU || p.getType() == Type.ELECTRIK)
			p.changePv( (int) Math.round(super.getPc()*0.5));
		else p.changePv(super.getPc());	
	}


}
