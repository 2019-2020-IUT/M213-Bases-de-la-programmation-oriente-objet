package TDPokemons;

public class PokemonEAU extends Pokemon {
	//attribut
	private int nb_nageoires;
	
	//Constructeurs
	public PokemonEAU(String n, double t, double p, int v, int c, int g) {
		super (n, t, p, v, c);
		nb_nageoires = g;
		type = Type.EAU;
	}
	
	//Getters
	public int getNb_nageoires() {
		return nb_nageoires;
	}

	//m�thodes
	@Override
	public double calculerVitesse() {
		return (super.getPoids()*nb_nageoires)/25.0;
	}
	
	@Override
	public String affiche() {
		return this.toString() + ", " + nb_nageoires + " nageoires)";
	}
	
	@Override
	public void attaque(Pokemon p) {
		System.out.println(this.getNom() + " attaque " + p.getNom());
		if (p.getType() == Type.FEU) 
			p.changePv(super.getPc()*2);
		else if (p.getType() == Type.EAU|| p.getType() == Type.PLANTE)
			p.changePv( (int) Math.round(super.getPc()*0.5));
		else p.changePv(super.getPc());
	}
}
