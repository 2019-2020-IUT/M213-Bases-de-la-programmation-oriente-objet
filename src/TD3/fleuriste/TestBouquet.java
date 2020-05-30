package TD3.fleuriste;

public class TestBouquet {
	public static void main( String[] args) {
		Fleur rose = new Fleur("rose",2.6);
		Fleur tulipe = new Fleur("tulipe",0.4);
		Fleur oeillet = new Fleur("oeillet",1.8);
		
		LotFleur lotroses = new LotFleur(rose,5);
		LotFleur lottulipes = new LotFleur(tulipe,7);
		LotFleur lotoeillets = new LotFleur(oeillet,3);
		
		Bouquet b = new Bouquet(lotroses, lottulipes, lotoeillets);
		System.out.println(b.toString());
		
		Stock magasin = new Stock(rose,tulipe,oeillet);
		System.out.println(magasin.toString());
		magasin.ajouteFleur(rose, 100);
		magasin.ajouteFleur(tulipe, 150);
		magasin.ajouteFleur(oeillet, 200);
		System.out.println(magasin.toString());
		// Est-ce que le stock permet de produire le bouquet b ?
		boolean orderBouquet = magasin.bouquetFaisable(b);
		System.out.println("Est-ce que le stock permet de produire le bouquet ? " + orderBouquet);
	}
}
