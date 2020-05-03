package fleuriste;

public class TestBouquet {
	public static void main( String[] args) {
//            nom               str		           nom = nom objet (ex :Tartampion)
		Fleur rose = new Fleur("rose",2.6);
		Fleur tulipe = new Fleur("tulipe",0.4);
		Fleur oeillet = new Fleur("oeillet",1.8);
		
		LotFleur lotroses = new LotFleur(rose,5);
		LotFleur lottulipes = new LotFleur(tulipe,7);
		LotFleur lotoeillets = new LotFleur(oeillet,3);
		
		Bouquet b = new Bouquet(lotroses, lottulipes, lotoeillets);
		double prixb = b.prix(); //calcule le prix d'un bouquet
		System.out.println(b+" : "+prixb+" euros");
		
		Stock magasin = new Stock(rose,tulipe,oeillet);
		System.out.println(magasin);
		magasin.ajouteFleur(0, 100);
		magasin.ajouteFleur(1, 150);
		magasin.ajouteFleur(2, 200);
		System.out.println(magasin);
		// Est-ce que le stock permet de produire le bouquet b ?
		boolean orderBouquet = magasin.bouquetFaisable(b);
		System.out.println(orderBouquet);
	}
}
