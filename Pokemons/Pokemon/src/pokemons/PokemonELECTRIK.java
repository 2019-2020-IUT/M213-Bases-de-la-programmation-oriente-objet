package pokemons;

public class PokemonELECTRIK extends Pokemon {
	//attributs
	private int nb_pattes;
	private int nb_ailes;
	private double intensite;
	
	//constructeur
	public PokemonELECTRIK(String n, double t, double p, int v, int c, int g, int a, double i) {
		super (n, t, p, v, c);
		nb_pattes = g;
		nb_ailes = a;
		intensite = i;
		type = Type.ELECTRIK;
	}
		
	//getters
	public int getPattes() {
		return nb_pattes;
	}	
	public int getAiles() {
		return nb_ailes;
	}	
	public double getIntensite() {
		return intensite;
	}
	
	//méthodes
	@Override
	public double calculerVitesse() {
		return (nb_ailes+nb_pattes) * intensite * 0.05;
	}
	
	@Override
	public String affiche() {
		return this.toString()+ ", " +nb_pattes+" pattes, "+nb_ailes+" ailes, "+intensite+" mA)";
	}
	
	@Override
	public void attaque(Pokemon p) {
		System.out.println(this.getNom() + " attaque " + p.getNom());
		if (p.getType() == Type.EAU) 
			p.changePv(super.getPc()*2);
		else if (p.getType() == Type.ELECTRIK || p.getType() == Type.PLANTE)
			p.changePv( (int) Math.round(super.getPc()*0.5));
		else p.changePv(super.getPc());	
	}
}
